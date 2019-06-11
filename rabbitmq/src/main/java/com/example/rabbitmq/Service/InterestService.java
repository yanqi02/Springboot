package com.example.rabbitmq.Service;

import com.example.rabbitmq.entity.Interest;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.awt.*;
import java.awt.print.Book;

@Service
public class InterestService {

    @Autowired
    RestTemplate restTemplate;
    @RabbitListener(queues = "amqpadmin.queue")
    public void receive(Interest interest){
        System.out.println(interest);

        String username=interest.getUsername();
        String mes=interest.getMes();
        restTemplate.getForObject("http://localhost:8087/ins/"+username+"/"+mes+"/", List.class);
        System.out.println(username+"  "+mes);

    }

}
