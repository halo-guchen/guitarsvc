package com.guitar.manage.msg.processor.impl;

import com.guitar.manage.entity.MessageEntity;
import com.guitar.manage.entity.TestMsgEntity;
import com.guitar.manage.msg.processor.MessageProcessor;

public class TestRabbitMessageProcessorImpl implements MessageProcessor {

    public void process(MessageEntity messageEntities) {
        if (messageEntities == null) {
            return;
        }

        if (messageEntities instanceof TestMsgEntity) {
            try {
                TestMsgEntity test = (TestMsgEntity) messageEntities;
                System.out.println("接收到的消息为=" + test.getName());
            } catch (Exception ex) {
                //logger.error("process business order trace exception", ex);
            }

        }

    }

    public void process(String message) {
        // TODO Auto-generated method stub

    }

}
