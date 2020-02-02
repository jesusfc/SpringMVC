package com.jesusfc.test.database;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.apache.log4j.Logger;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;

import com.jesusfc.test.business.model.user.User;

//public abstract class AbstractDao<B, I> extends DataBaseAccess implements CrudRepository<B, I> {
public abstract class AbstractDao<B, I> extends DataBaseAccess implements JpaRepository<B, I> {

	private static Logger logger = Logger.getLogger(AbstractDao.class.getName());

	protected abstract String getBussinessObjTable();

	protected abstract RowMapper<B> getBussinessObjTableMapper();

	@Override
	public Optional<B> findById(I id) {

		final String selectById = "select * from " + getBussinessObjTable() + " where id = :id";
		Optional<B> b = null;
		try {
			b = Optional.of(getNamedParameterJdbcTemplate().queryForObject(selectById,
					new MapSqlParameterSource("id", id), getBussinessObjTableMapper()));
		} catch (Exception e) {
			logger.error("Error AbstractDao findById:", e);
		}

		return b;
	}

	@Override
	public List<B> findAll() {		
		final String query = "select * from " + getBussinessObjTable();		
		try {
			return getNamedParameterJdbcTemplate().query(query, new MapSqlParameterSource(), getBussinessObjTableMapper());
		} catch (Exception e) {
			logger.error("Error AbstractDao findAll:", e);
		}

		return null;
	}

	@Override
	public List<B> findAll(Sort sort) {
		throw new RuntimeException("No implementado");

	}

	@Override
	public List<B> findAllById(Iterable<I> ids) {
		throw new RuntimeException("No implementado");

	}

	@Override
	public <S extends B> List<S> saveAll(Iterable<S> entities) {
		throw new RuntimeException("No implementado");

	}

	@Override
	public void flush() {
		throw new RuntimeException("No implementado");
	}

	@Override
	public <S extends B> S saveAndFlush(S entity) {
		throw new RuntimeException("No implementado");
	}

	@Override
	public void deleteInBatch(Iterable<B> entities) {
		throw new RuntimeException("No implementado");

	}

	@Override
	public void deleteAllInBatch() {
		throw new RuntimeException("No implementado");

	}

	@Override
	public B getOne(I id) {
		throw new RuntimeException("No implementado");

	}

	@Override
	public <S extends B> List<S> findAll(Example<S> example) {
		throw new RuntimeException("No implementado");

	}

	@Override
	public <S extends B> List<S> findAll(Example<S> example, Sort sort) {
		throw new RuntimeException("No implementado");

	}

	@Override
	public Page<B> findAll(Pageable pageable) {
		throw new RuntimeException("No implementado");

	}

	@Override
	public <S extends B> S save(S entity) {

		try {

			Map<String, Object> namedParameters = new HashMap<String, Object>();
			String fields = "";
			String fieldsValues = "";
			Class<?> clazz = entity.getClass();
			for (Method method : clazz.getDeclaredMethods()) {

				if (method.getName().startsWith("get")) {
					try {
						if (null != method.invoke(entity)) {
							String attr = method.getName().substring(3).toLowerCase();
							namedParameters.put(attr, method.invoke(entity));
							if (!fields.isEmpty()) {
								fields = fields + ", ";
								fieldsValues = fieldsValues + ", ";
							}
							fields = fields + attr;
							fieldsValues = fieldsValues + " :" + attr;
						}

					} catch (ReflectiveOperationException e) {
						logger.error("Error AbstractDao Save - ReflectiveOperationException:", e);
					}
				}
			}

			String persistBussinessObj = "insert into " + getBussinessObjTable() + " (" + fields + ") values ("
					+ fieldsValues + ")";
			getNamedParameterJdbcTemplate().update(persistBussinessObj, namedParameters);

			return entity;

		} catch (Exception e) {
			logger.error("Error AbstractDao Save Entity: ", e);
		}

		return null;
	}

	@Override
	public boolean existsById(I id) {
		throw new RuntimeException("No implementado");
		// return false;
	}

	@Override
	public long count() {
		throw new RuntimeException("No implementado");
		// return 0;
	}

	@Override
	public void deleteById(I id) {
		throw new RuntimeException("No implementado");

	}

	@Override
	public void delete(B entity) {
		throw new RuntimeException("No implementado");

	}

	@Override
	public void deleteAll(Iterable<? extends B> entities) {
		throw new RuntimeException("No implementado");

	}

	@Override
	public void deleteAll() {
		throw new RuntimeException("No implementado");

	}

	@Override
	public <S extends B> Optional<S> findOne(Example<S> example) {
		throw new RuntimeException("No implementado");

	}

	@Override
	public <S extends B> Page<S> findAll(Example<S> example, Pageable pageable) {
		throw new RuntimeException("No implementado");

	}

	@Override
	public <S extends B> long count(Example<S> example) {
		throw new RuntimeException("No implementado");
		// return 0;
	}

	@Override
	public <S extends B> boolean exists(Example<S> example) {
		throw new RuntimeException("No implementado");
		// return false;
	}

}
