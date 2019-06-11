package com.example.elasticsearch0.controller;

import com.example.elasticsearch0.entity.Interest;
import com.example.elasticsearch0.repository.esrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EsControlles {
    @Autowired
    esrepository inte;

    //插入一个用户兴趣
    @GetMapping("/ins/{username}/{mes}")
    public boolean getmes(@PathVariable("username") String username, @PathVariable("mes") String mes) {
        Interest interest = new Interest();
        interest.setUsername(username);
        interest.setMes(mes);
        inte.index(interest);
        System.out.println(username + mes);
return true;
    }



    @GetMapping("getmes/{username}")
    private  List<Interest> getmes(@PathVariable String username)
    {

        return  inte.findByUsername(username);

    }


    @GetMapping("/findu/{username}")
    private Boolean isexit(@PathVariable("username") String username) {
        List<Interest> list = inte.findByUsername(username);
        if (list.size() > 0) {
            return true;
        } else {
            return false;
        }
    }

    //根据兴趣查询推荐
    @GetMapping("/inte/{interest}")
    public List<Interest> gt(@PathVariable("interest") String mes) {
        System.out.println(mes);
        List<Interest> list = new ArrayList<>();
        for (Interest interest : inte.findByMesLike(mes)) {
            System.out.println(interest);
            list.add(interest);

        }
        return list;

    }
}
