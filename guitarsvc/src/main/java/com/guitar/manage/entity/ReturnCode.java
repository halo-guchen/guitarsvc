package com.guitar.manage.entity;

import com.guitar.manage.enums.WebReturnCode;


public class ReturnCode {

	private Integer code;

	private String msg;

	private Object data;

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public ReturnCode() {
	}

	public ReturnCode(WebReturnCode rt, String msg, Object object) {
		this.code = rt.getValue();
		this.msg = msg;
		this.data = object;
	}
}
