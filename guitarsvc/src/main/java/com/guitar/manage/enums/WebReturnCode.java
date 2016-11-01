package com.guitar.manage.enums;

import java.util.HashMap;
import java.util.Map;

public enum WebReturnCode {
	SUCCEED(0), FAILURE(1), SYS_ERR(99999),
	
	//common
	INVALID_PARAMS(1000), MISSING_PARAMS(1001), UNAUTH_REQUEST(1002),TARGET_NOT_FOUND(1004),TARGET_EXISTS(1005),OPERATOR_FORBBID(1006),
	
	AUTHROIZATION_FAILED(2002),
	
	
	EXIST_CHILD_CATEGORY(1010), EXIST_CHILD_GOODS(1011), DUPLICATE_CODE(1020),
	NOT_EXIST_GDCODE(1030);
	
	private int value;

	private WebReturnCode(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public static String returnCodeMsg(WebReturnCode rt) {
		return map.get(rt);
	}

	public static WebReturnCode getWebReturnCode(int value) {
		for (WebReturnCode code : WebReturnCode.values()) {
			if (value == code.getValue()) {
				return code;
			}
		}

		return null;
	}

	private static Map<WebReturnCode, String> map = new HashMap<WebReturnCode, String>();
	static {
		map.put(SUCCEED, "成功");
		map.put(FAILURE, "失败");
		map.put(INVALID_PARAMS, "输入参数有错");
		map.put(MISSING_PARAMS, "缺少参数");
		map.put(SYS_ERR, "系统错误");
		map.put(OPERATOR_FORBBID, "无权操作");
		map.put(TARGET_NOT_FOUND, "目标不存在");
		map.put(TARGET_EXISTS, "目标已存在");
		map.put(EXIST_CHILD_CATEGORY, "存在子目录无法删除");
		map.put(EXIST_CHILD_GOODS, "存在子商品无法删除");
		map.put(DUPLICATE_CODE, "代码重复");
	}

}
