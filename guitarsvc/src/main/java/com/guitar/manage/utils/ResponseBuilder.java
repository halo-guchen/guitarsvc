package com.guitar.manage.utils;

import java.util.ArrayList;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.http.ResponseEntity;

import com.guitar.manage.entity.ReturnCode;
import com.guitar.manage.enums.WebReturnCode;


@SuppressWarnings("all")
public class ResponseBuilder {

	private final static Logger logger = Logger.getLogger(ResponseBuilder.class);
	
	
    public static ResponseEntity build(String content) {
		return ResponseEntity.ok(content);
	}

	public static ResponseEntity build(WebReturnCode rt, String msg, Object data) {
		if (StringUtils.isBlank(msg)) {
			try {
				msg = WebReturnCode.returnCodeMsg(rt);
			} catch (Exception e) {
			}
		}
		ReturnCode returnCode = new ReturnCode(rt, msg, data);
		if(returnCode.getCode()!=null&&returnCode.getCode()!=0)
		try {
			logger.info(JsonUtil.getJsonFromObject(returnCode));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResponseEntity.ok(returnCode);
	}
	
	public static ResponseEntity buildPublicResponseEntity(WebReturnCode rt, String msg, Object data) {
		boolean result = true;
		int flag = 1;
		if(rt != WebReturnCode.SUCCEED) {
			result = false;
			flag = 0;
		}
		
		ReturnCode returnCode=new ReturnCode();
		returnCode.setData(data==null?new ArrayList():data);
		return ResponseEntity.ok(returnCode);
	}
	
	public static ResponseEntity build(ReturnCode returnCode) {
		return ResponseEntity.ok(returnCode);
	}

	public static void main(String agrs[]) {
		ReturnCode rtCode = new ReturnCode(WebReturnCode.SUCCEED, "查询成功", null);
		try {
			System.out.println(JsonUtil.getJsonFromObject(rtCode));
		} catch (Exception e) {
		}
	}

}
