//package com.etalk.ym.controller;
//
//import com.etalk.ym.entity.Etalks;
//import com.etalk.ym.repository.TalkRespository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//
//@RestController
//public class etalkController {
//
//    @Autowired
//    TalkRespository talkRespository;
//
//
//    @GetMapping("/talk/all")
//    public List<Etalks> gettalk(){
//
//        return  talkRespository.findAll();
//    }
//
//    @PostMapping("/commit/{username}")
//    public void ge1ttalk(@PathVariable String username ){
//        Etalks etalks=new Etalks();
//        etalks.setUsername(username);
//
//        talkRespository.save(etalks);
//
//    }
//
//    @GetMapping("/commit")
//    public void gettalk(Etalks etalks){
//Etalks etalks1= talkRespository.save(etalks);
//
//    }
//
//
//}
