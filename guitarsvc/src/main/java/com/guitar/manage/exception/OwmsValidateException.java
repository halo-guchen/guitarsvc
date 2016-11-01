package com.guitar.manage.exception;

import java.util.List;
import java.util.Map;

public class OwmsValidateException extends Exception {
	private static final long serialVersionUID = -7141437974416648157L;
	private List<Map<String, String>> msgList;
	public OwmsValidateException(){
		super();
	}
	public OwmsValidateException(List<Map<String, String>> msgList){
		this.msgList = msgList;
	}
	public List<Map<String, String>> getMsgList() {
		return msgList;
	}
	public void setMsgList(List<Map<String, String>> msgList) {
		this.msgList = msgList;
	}
	
}
