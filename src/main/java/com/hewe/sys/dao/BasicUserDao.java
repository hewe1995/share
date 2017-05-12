package com.hewe.sys.dao;

import com.hewe.sys.domain.BasicUser;

public interface BasicUserDao<M extends BasicUser> extends BasicDao<M, String> {

	/**
	 * 禁用用户,锁定
	 * 
	 * @param userId
	 */
	public void lockUser(String userId);

}
