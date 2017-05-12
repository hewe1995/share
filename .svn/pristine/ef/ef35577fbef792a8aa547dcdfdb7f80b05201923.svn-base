package com.hewe.user.dao.impl;

import java.util.Date;

import org.springframework.stereotype.Repository;

import com.hewe.sys.dao.impl.BasicUserDaoImpl;
import com.hewe.sys.utils.WebTools;
import com.hewe.user.dao.UserDao;
import com.hewe.user.domain.User;

@Repository
public class UserDaoImpl extends BasicUserDaoImpl<User> implements UserDao {

	@Override
	public int getVerificationCode(String identity) {

		int code = 23231;

		return code;
	}

	@Override
	public boolean userExistByEmailOrPhone(String email) {
		return false;
	}

	@Override
	public boolean checkCode(String identity, int code) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public String register(String identity, String password) {
		User user = new User();
		if (WebTools.isEmail(identity)) {
			user.setEmail(identity);
		}
		if (WebTools.isPhone(identity)) {
			user.setPhone(identity);
		}
		user.setPassword(password);
		user.setName(identity);
		user.setCreatetime(new Date());
		user.setUpdatetime(new Date());
		user.setGender(1);
		log.debug("注册生成用户:" + user.toString());
		return "harveyid";
	}

}
