package com.jesusfc.test.database.dao;

import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

public abstract class AbstractDao<B, I> implements JpaRepository<B, I> {

	private static Logger logger = Logger.getLogger(AbstractDao.class.getName());
	private Class<B> businessBeanClass;
	CriteriaQuery<B> queryObj = null;
	Root<B> root = null;

	@Autowired
	private EntityManagerFactory emf;

	@SuppressWarnings("unchecked")
	public AbstractDao() {
		ParameterizedType parameterizedType = (ParameterizedType) getClass().getGenericSuperclass();
		businessBeanClass = (Class<B>) parameterizedType.getActualTypeArguments()[0];
	}

	private EntityManager getEntityManager() {
		return emf.createEntityManager();
	}

	protected Class<B> getBusinessBeanClass() {
		return businessBeanClass;
	}

	private void beforeOperationPrepare() {
		queryObj = emf.getCriteriaBuilder().createQuery(businessBeanClass);
		root = queryObj.from(businessBeanClass);
		queryObj.select(root);
	}

	@Override
	public Optional<B> findById(I id) {

		try {

			// Prepare operation
			beforeOperationPrepare();

			queryObj.where(emf.getCriteriaBuilder().equal(root.get("id"), id));
			B listOne = getEntityManager().createQuery(queryObj).getSingleResult();

			return Optional.of(listOne);

		} catch (Exception e) {
			logger.error("Error en findById - AbstractDao.", e);
		}
		return null;
	}

	@Override
	public List<B> findAll() {

		try {
			// Prepare operation
			beforeOperationPrepare();

			return getEntityManager().createQuery(queryObj).getResultList();
			
		} catch (Exception e) {
			logger.error("Error en findAll - AbstractDao.", e);
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
		throw new RuntimeException("No implementado");
	}

	@Override
	public boolean existsById(I id) {
		return false;
	}

	@Override
	public long count() {
		return 0;
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
		return 0;
	}

	@Override
	public <S extends B> boolean exists(Example<S> example) {
		return false;
	}

}
