package com.hewe.user.dao;

import com.hewe.sys.dao.BasicUserDao;
import com.hewe.user.domain.User;

/**
 * @author hewe
 *
 */
public interface UserDao extends BasicUserDao<User> {

	/**
	 * 获取验证码
	 * 
	 * @param identity
	 *            手机号或者邮箱号
	 * @return
	 */
	public int getVerificationCode(String identity);

	/**
	 * 通过邮箱或手机号验证用户是否存在
	 * 
	 * @param email
	 * @return
	 */
	public boolean userExistByEmailOrPhone(String email);

	/**
	 * 检验验证码是否可用,正确
	 * 
	 * @param identity
	 * @param code
	 * @return
	 */
	public boolean checkCode(String identity, int code);

	/**
	 * 通过手机号或邮箱注册用户
	 * 
	 * @param identity
	 *            手机号或邮箱
	 * @param password
	 *            密码
	 * @return 生成的用户id
	 */
	public String register(String identity, String password);

}
