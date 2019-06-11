package com.example.elasticsearch0.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "user",type="interest")
public class Interest {
    @Id
    private String username;
    private String mes;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public Interest() {
        super();
    }

    @Override
    public String toString() {
        return "Interest{" +
                "username='" + username + '\'' +
                ", mes='" + mes + '\'' +
                '}';
    }
}
