package com.jesusfc.test.database;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;

import com.jesusfc.test.business.model.user.User;

public abstract class AbstractDao<B> extends DataBaseAccess implements ICRUDDao<B> {

	private static Logger logger = Logger.getLogger(AbstractDao.class.getName());

	public abstract String getBussinessObjTable();

	public abstract RowMapper<B> getBussinessObjTableMapper();

	public int save(B obj) {

		int result = 0;

		try {

			Map<String, Object> namedParameters = new HashMap<String, Object>();
			String fields = "";
			String fieldsValues = "";
			Class<?> clazz = obj.getClass();
			for (Method method : clazz.getDeclaredMethods()) {

				if (method.getName().startsWith("get")) {
					try {
						if (null != method.invoke(obj)) {
							String attr = method.getName().substring(3).toLowerCase();
							namedParameters.put(attr, method.invoke(obj));
							if (!fields.isEmpty()) {
								fields = fields + ", ";
								fieldsValues = fieldsValues + ", ";
							}
							fields = fields + attr;
							fieldsValues = fieldsValues + " :" + attr;
						}

					} catch (ReflectiveOperationException e) {
						logger.error("Error AbstractDao Persist - ReflectiveOperationException:", e);
					}
				}
			}

			String persistBussinessObj = "insert into " + getBussinessObjTable() + " (" + fields + ") values ("
					+ fieldsValues + ")";
			result = getNamedParameterJdbcTemplate().update(persistBussinessObj, namedParameters);

		} catch (Exception e) {
			logger.error("Error AbstractDao Persist:", e);
		}

		return result;
	}

	public void persist(List<B> objs) {
		throw new RuntimeException("No implementado");

	}

	public void update(B obj) {
		throw new RuntimeException("No implementado");

	}

	public void update(Collection<B> objs) {
		throw new RuntimeException("No implementado");

	}

	public void delete(String id) {
		throw new RuntimeException("No implementado");

	}

	public void delete(List<B> objs) {
		throw new RuntimeException("No implementado");

	}

	public List<B> findAll() {
		final String selectAll = "select * from ";
		try {
			Map<String, Object> params = new HashMap<String, Object>();
			return getNamedParameterJdbcTemplate().query(selectAll + getBussinessObjTable(), params,
					getBussinessObjTableMapper());
		} catch (Exception e) {
			logger.error("Error AbstractDao getAll:", e);
		}
		return new ArrayList<B>();
	}

	public List<String> getAllIds() {
		throw new RuntimeException("No implementado");

	}

	public List<B> getAll(int depth) {
		throw new RuntimeException("No implementado");

	}

	public int getTotalRows() {
		throw new RuntimeException("No implementado");
	}

	public boolean exists(String id) {
		throw new RuntimeException("No implementado");
	}

	public Optional<B> findById(Integer id) {
		try {
			final String selectById = "select * from " + getBussinessObjTable() + " where id = :id";
			return Optional.of(getNamedParameterJdbcTemplate().queryForObject(selectById,
					new MapSqlParameterSource("id", id), getBussinessObjTableMapper()));
		} catch (Exception e) {
			logger.error("Error en AbstractDao - findById:", e);
		}
		return null;
	}

	public B buildBean(String id) {
		throw new RuntimeException("No implementado");

	}

	public B buildBean(String id, int depth) {
		throw new RuntimeException("No implementado");

	}

	public List<B> buildBeans(Collection<B> beans) {
		throw new RuntimeException("No implementado");

	}

	public List<B> buildBeans(Collection<B> beans, int depth) {
		throw new RuntimeException("No implementado");

	}

	public List<B> executeQueryList(B filterBean) {
		throw new RuntimeException("No implementado");

	}

}
