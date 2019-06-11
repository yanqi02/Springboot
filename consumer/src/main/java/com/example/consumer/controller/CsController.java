package com.example.consumer.controller;

import com.example.consumer.entity.Interest;
import com.example.consumer.entity.books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CsController {
    @Autowired
    RestTemplate restTemplate;


    //获取全部图书
    @GetMapping("/books")
    public List<books> listbooks() {
        return restTemplate.getForObject("http://GBOOKS/gbooks", List.class);

    }

    //插入一个用户兴趣
    @GetMapping("/ins/{username}/{mes}")
    public boolean insertInterest(@PathVariable("username") String username, @PathVariable("mes") String mes) {
        return restTemplate.getForObject("http://ES/ins/" + username + "/" + mes + "/", Boolean.class);
    }

    //根据用户名获取用户兴趣
    @GetMapping("getmes/{username}")
    private List<Interest> getmes(@PathVariable String username) {
        return restTemplate.getForObject("http://ES/getmes/" + username + "/", List.class);
    }

    //查询用户是否存在
    @GetMapping("/findu/{username}")
    private Boolean isexit(@PathVariable("username") String username) {
        return restTemplate.getForObject("http://ES/findu/" + username, Boolean.class);
    }

    //根据兴趣查询推荐
    @GetMapping("/inte/{interest}")
    public List<Interest> gt(@PathVariable("interest") String mes) {
        return restTemplate.getForObject("http:ES/inte/" + mes, List.class);
    }

}
