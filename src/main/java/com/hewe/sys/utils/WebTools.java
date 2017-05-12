package com.hewe.sys.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 一些通用的方法
 * 
 * @author hewe
 *
 */
public class WebTools {

	private static final int EMAIL_MAX_LENGTH = 30;
	private static final int PASSWORD_MAX_LENGTH = 16;
	private static final int PHONE_MAX_LENGTH = 12;

	/**
	 * 判断字符串是否是email
	 * 
	 * @param value
	 * @return
	 */
	public static boolean isEmail(String value) {

		if (value == null || "".equals(value.trim()))
			return false;
		if (value.length() > EMAIL_MAX_LENGTH)
			return false;

		Pattern pattern = Pattern
				.compile("^\\w+((-\\w+)|(\\.\\w+))*\\@[A-Za-z0-9]+((\\.|-)[A-Za-z0-9]+)*\\.[A-Za-z0-9]+$");
		Matcher m = pattern.matcher(value);

		return m.matches();
	}

	/**
	 * 是否是手机号
	 * 
	 * @param value
	 * @return
	 */
	public static boolean isPhone(String value) {

		if (value == null || "".equals(value.trim()))
			return false;
		if (value.length() > PHONE_MAX_LENGTH)
			return false;
		Pattern pattern = Pattern.compile("[0-9]{11}");
		Matcher m = pattern.matcher(value);

		return m.matches();
	}

	public static boolean isPasswrod(String value) {
		if (value == null || "".equals(value.trim()))
			return false;

		if (value.length() > PASSWORD_MAX_LENGTH)
			return false;

		Pattern pattern = Pattern.compile("^[a-zA-Z][a-zA-Z0-9_\\*\\?\\.\\#\\@\\!]{6,16}");
		Matcher m = pattern.matcher(value);

		return m.matches();
	}
}
