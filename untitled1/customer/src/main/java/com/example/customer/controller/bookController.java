package com.example.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class bookController {
    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/show")
    public String showbook() {
        String s = restTemplate.getForObject("http://PROVIDER/book", String.class);
        return s;
    }
}


