package com.hewe.sys.constant;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * @author hewe
 *
 */
/**
 * @author hewe
 *
 */
public enum ResultCode {

	/**
	 * 成功
	 */
	SUCCESS(2000),
	/**
	 * 错误
	 */
	ERROR(3000),
	/**
	 * 已经存在
	 */
	ERROR_EXISTS(3001),
	/**
	 * 参数不正确
	 */
	ERROR_ILLEGAL(3002),
	/**
	 * 验正码错误
	 */
	ERROR_CODE(3003),;

	private final Integer code;

	private ResultCode(int code) {
		this.code = code;
	}

	@JsonValue
	public Integer getCode() {
		return code;
	}
}
