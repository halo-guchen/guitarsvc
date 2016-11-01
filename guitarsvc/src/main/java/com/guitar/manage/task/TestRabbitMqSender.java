package com.guitar.manage.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.guitar.manage.entity.TestMsgEntity;
import com.guitar.manage.msg.sender.MessageSender;

@Component
public class TestRabbitMqSender {

    @Autowired
    private MessageSender TestSender;

    public void test() {
        try {
            TestMsgEntity t = new TestMsgEntity();
            t.setAddr("上海");
            t.setName("嘿嘿");
            TestSender.send(t);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
