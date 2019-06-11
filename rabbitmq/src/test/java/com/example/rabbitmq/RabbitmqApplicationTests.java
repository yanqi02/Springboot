package com.example.rabbitmq;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitmqApplicationTests {
@Autowired
    AmqpAdmin amqpAdmin;
    @Test
    public void contextLoads() {
    }
    @Test
    public void createExchange(){
        //创建Exchange
        amqpAdmin.declareExchange(new DirectExchange("amqpadmin.direct"));
        System.out.println("Create Finish");
        //创建Queue
        amqpAdmin.declareQueue(new Queue("amqpadmin.queue",true));
        System.out.println("Create Queue Finish");
        //创建Bind规则
        amqpAdmin.declareBinding(new Binding("amqpadmin.queue",Binding.DestinationType.QUEUE , "amqpadmin.direct", "amqp.haha", null));

    }
}
