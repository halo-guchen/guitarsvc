package com.guitar.manage.msg.sender;

import com.guitar.manage.entity.MessageEntity;


public interface MessageSender {

	public void send(MessageEntity scMessageEntity) throws Exception;

	public void send(MessageEntity scMessageEntity, boolean deliverMode) throws Exception;

	public void sendWithRoutingKey(String routingKey, MessageEntity scMessageEntity) throws Exception;

	public void sendWithRoutingKey(String routingKey, MessageEntity scMessageEntity, boolean deliverMode)
			throws Exception;

}
