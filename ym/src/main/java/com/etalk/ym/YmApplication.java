package com.etalk.ym;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.stereotype.Service;

import java.sql.DatabaseMetaData;


@SpringBootApplication
public class YmApplication {

    public static void main(String[] args) {
        SpringApplication.run(YmApplication.class, args);
    }

}
