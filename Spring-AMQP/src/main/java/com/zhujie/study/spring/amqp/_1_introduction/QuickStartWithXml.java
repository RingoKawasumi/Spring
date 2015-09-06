package com.zhujie.study.spring.amqp._1_introduction;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Created by zhujie on 15/8/6.
 */
public class QuickStartWithXml {
    public static void main(String[] args) {
        ApplicationContext context =
                new GenericXmlApplicationContext("classpath:/rabbit-context.xml");
        AmqpTemplate template = context.getBean(AmqpTemplate.class);

        template.convertAndSend("myqueue", "foo");

        String foo = (String) template.receiveAndConvert("myqueue");
    }
}
