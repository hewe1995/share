package com.hewe.sys.utils;

import java.io.Serializable;

import com.hewe.sys.constant.ResultCode;

/**
 * 返回结果封装
 * 
 * @author hewe
 *
 * @param <T>
 */
public class Content<T> implements Serializable {
	private ResultCode code = ResultCode.SUCCESS;
	private T body;

	public Content(ResultCode code, T body) {
		this.code = code;
		this.body = body;
	}

	public Content(ResultCode code) {
		this.code = code;
		this.body = null;
	}

	public static <B> Content ok(B b) {
		return new Content(ResultCode.SUCCESS, b);
	}

	public static <B> Content status(ResultCode code) {
		return new Content(code);
	}

	public ResultCode getCode() {
		return code;
	}

	public void setCode(ResultCode code) {
		this.code = code;
	}

	public T getBody() {
		return body;
	}

	public void setBody(T body) {
		this.body = body;
	}

}
