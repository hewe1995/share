package com.hewe.sys.dao.impl;

import com.hewe.sys.dao.BasicUserDao;
import com.hewe.sys.domain.BasicUser;

/**
 * 
 * @author harvey 2017年2月27日<br>
 *         version: 1.0.0
 */
public abstract class BasicUserDaoImpl<T extends BasicUser> extends BasicDaoImpl<T, String> implements BasicUserDao<T> {

	@Override
	public void lockUser(String userId) {
		String sql = "update " + getEntity().getSimpleName() + " set locked=1 where id=?";
		getJdbcTemplate().update(sql, userId);
	}
}
