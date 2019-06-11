package com.example.recommend.bean;

import org.hibernate.boot.archive.scan.spi.ScanParameters;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table
public class recommend implements Serializable {
    @Id
    @GeneratedValue
    Integer id;
    @Column
    String username;
    @Column
   float first;
    @Column
    float second;
    @Column
    float third;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public float getFirst() {
        return first;
    }

    public void setFirst(float first) {
        this.first = first;
    }

    public float getSecond() {
        return second;
    }

    public void setSecond(float second) {
        this.second = second;
    }

    public float getThird() {
        return third;
    }

    public void setThird(float third) {
        this.third = third;
    }

    public recommend(String username, float first, float second, float third) {
        this.username = username;
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public recommend() {
    }

    public recommend(String username) {
        this.username = username;
    }
}
