package com.example.zcenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ZcenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZcenterApplication.class, args);
    }

}
