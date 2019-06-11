package com.example.rabbitmq.controller;

import com.example.rabbitmq.Service.InterestService;
import com.example.rabbitmq.entity.Interest;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mqcontroller {
    @Autowired
    RabbitTemplate rabbitTemplate;
@Autowired
    InterestService interestService;
    //向消息队列存消息
    @GetMapping("/mqput/{mes}")
    public void mqput(@PathVariable("mes") String mes) {
        rabbitTemplate.convertAndSend("amqpadmin.direct", "amqp.haha", mes);

    }


    //向消息队列存注册信息消息
    @GetMapping("/mqput1/{username}/{mes}")
    public void mqputre(@PathVariable("username") String username, @PathVariable("mes") String mes) {
        Interest interest=new Interest();
        interest.setUsername(username);
        interest.setMes(mes);
        rabbitTemplate.convertAndSend("amqpadmin.direct", "amqp.haha", interest);

    }


    //取注册信息消息
    @GetMapping("/mqget1")
    public Interest mqget1() {
        Interest s = (Interest) rabbitTemplate.receiveAndConvert("amqpadmin.queue");
        System.out.println(s);
        if (s != null) {
            return s;
        } else {
            return null;
        }

    }

//    //存注册信息到数据库
//    @GetMapping("/mqget1")
//    public Interest mqget2() {
//
//
//        Interest s = (Interest) rabbitTemplate.receiveAndConvert("amqpadmin.queue");
//        System.out.println(s);
//        if (s != null) {
//            return s;
//        } else {
//            return null;
//        }
//
//    }
    //取消息
    @GetMapping("/mqget")
    public String mqget() {
        Object s = rabbitTemplate.receiveAndConvert("amqpadmin.queue");
        System.out.println(s);
        if (s != null) {
            return s.toString();
        } else {
            return "null";
        }

    }


}
