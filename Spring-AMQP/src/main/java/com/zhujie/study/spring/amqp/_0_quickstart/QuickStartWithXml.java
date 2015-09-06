package com.zhujie.study.spring.amqp._0_quickstart;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zhujie on 15/8/6.
 */
public class QuickStartWithXml {
    public static void main(final String... args) throws Exception {

        AbstractApplicationContext ctx =
                new ClassPathXmlApplicationContext("context.xml");
        RabbitTemplate template = ctx.getBean(RabbitTemplate.class);
        template.convertAndSend("Hello, world!");
        Thread.sleep(1000);
        ctx.destroy();
    }

}
