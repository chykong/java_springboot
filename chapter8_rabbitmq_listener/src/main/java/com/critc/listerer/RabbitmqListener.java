package com.critc.listerer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by 孔垂云 on 2017/12/4.
 */
@Component
public class RabbitmqListener {

    /**
     * 接收消息
     *
     * @param message
     */
    @RabbitListener(queues = "test_mq")
    @RabbitHandler
    public void process(String message) {
        System.out.println("接收到消息：" + message);
    }
}
