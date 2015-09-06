package com.zhujie.study.spring.amqp._1_introduction;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by zhujie on 15/8/6.
 */
public class QuickStartWithConfiguration {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(RabbitConfiguration.class);
        AmqpTemplate template = context.getBean(AmqpTemplate.class);

        template.convertAndSend("myqueue", "foo");

        String foo = (String) template.receiveAndConvert("myqueue");
    }
}
