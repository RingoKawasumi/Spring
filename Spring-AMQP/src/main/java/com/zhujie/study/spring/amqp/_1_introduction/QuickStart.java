package com.zhujie.study.spring.amqp._1_introduction;

import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.amqp.rabbit.core.RabbitTemplate;

/**
 * Created by zhujie on 15/8/24.
 */
public class QuickStart {
    public static void main(String[] args) {
        ConnectionFactory connectionFactory = new CachingConnectionFactory();

        AmqpAdmin admin = new RabbitAdmin(connectionFactory);
        admin.declareQueue(new Queue("myqueue"));

        AmqpTemplate template = new RabbitTemplate(connectionFactory);
        template.convertAndSend("myqueue", "foo");

        String foo = (String) template.receiveAndConvert("myqueue");
    }
}
