package com.zhujie.study.spring.amqp._3_Using;

import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.Connection;

/**
 * Created by zhujie on 15/8/24.
 */
public class ConnectionSample {
    public static void main(String[] args) {
        CachingConnectionFactory connectionFactory = new CachingConnectionFactory("localhost");
        connectionFactory.setUsername("root");
        connectionFactory.setPassword("root");
        Connection connection = connectionFactory.createConnection();
    }
}
