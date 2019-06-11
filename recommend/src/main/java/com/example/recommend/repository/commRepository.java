package com.example.recommend.repository;

import com.example.recommend.bean.recommend;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

public interface commRepository  extends JpaRepository<recommend,Integer> {

    public recommend findByUsername(String username);
}
