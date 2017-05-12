package com.hewe.sys.dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.hewe.sys.dao.BasicDao;
import com.hewe.sys.domain.BasicDomain;

/**
 * 基础类
 * 
 * @author harvey 2017年2月27日<br>
 *         version: 1.0.0
 */
public abstract class BasicDaoImpl<M extends BasicDomain, K extends Serializable> implements BasicDao<M, K> {
	protected final Logger log = LoggerFactory.getLogger(getClass());
	private SessionFactory sessionFactory;
	private JdbcTemplate jdbcTemplate;
	protected Class<M> entityClass;

	public BasicDaoImpl() {
		entityClass = (Class<M>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}

	// 获取实体的类
	public Class<M> getEntity() {
		return entityClass;
	}

	public Session getSession() {

		if (sessionFactory != null) {

			return sessionFactory.getCurrentSession();
		}
		return null;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	@Autowired(required = true)
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Autowired(required = true)
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void create(M t) {
		// web
		getSession().save(t);
	}

	@Override
	public M findById(K k) {
		return getSession().get(entityClass, k);
	}

	@Override
	public void update(M t) {
		getSession().update(t);
	}

	/**
	 * 总数,无参数
	 */
	@Override
	public int totalCount() {
		String hql = "select count(*) from " + getEntity().getSimpleName();
		Long result = (Long) getSession().createQuery(hql).uniqueResult();
		int count = result.intValue();
		log.debug("总数量为:" + count);
		return count;
	}

	@Override
	public void deleteById(K k) {
		String hql = "update " + getEntity().getSimpleName() + " set available=false where id=:id";
		getSession().createQuery(hql).setParameter("id", k).executeUpdate();
	}

}
