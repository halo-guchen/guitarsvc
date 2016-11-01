package com.guitar.manage.msg.processor;

import com.guitar.manage.entity.MessageEntity;

public interface MessageProcessor {
	public void process(MessageEntity messageEntities);
	public void process(String message);
}
