package com.example.recommend.controller;

import com.example.recommend.bean.recommend;
import com.example.recommend.bean.score;
import com.example.recommend.repository.commRepository;
import com.example.recommend.service.RecommendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class commController {
@Autowired
commRepository comm;
//查询所有
    @Autowired
    RecommendService recommendService;

    @GetMapping("/comm")
    public List<recommend> getalls(){

        return comm.findAll();
    }

  //插入
    @GetMapping("/insert/{username}/{first}/{second}/{third}")
    public void inserta(@PathVariable("username") String username,@PathVariable("first") float first,@PathVariable("second")float second,@PathVariable("third") float third)
    {
recommend re=new recommend(username,first,second,third);
        comm.save(re);
    }


//通过用户名查询
    @GetMapping("/comm/{username}")
    private  recommend getbyusername(@PathVariable String username)
    {
    return comm.findByUsername(username);
    }

    @GetMapping("/recommend/{username}")
    private  List<score>  getrecommend(@PathVariable String username)
    {
      return   recommendService.reco(username);
    }

}
