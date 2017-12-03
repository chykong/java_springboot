package com.critc.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by 孔垂云 on 2017/12/3.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestRabbitmq {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Test
    public void testSend() {
        rabbitTemplate.convertAndSend("test_mq", "SpringBoot发送消息");
    }
}
