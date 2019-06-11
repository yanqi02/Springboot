package com.example.recommend.service;

import com.example.recommend.bean.recommend;
import com.example.recommend.bean.score;
import com.example.recommend.repository.commRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
@Service
public class RecommendService {
   private List<score> scores=new ArrayList<score>();
    @Autowired
    commRepository comm;
    public List<score> reco(String username)
    {
       recommend re = comm.findByUsername(username);
        List<recommend> res=comm.findAll();
        for(recommend r:res)
        {
       double score= Math.sqrt (Math.pow(re.getFirst()-r.getFirst(),2)+Math.pow(re.getSecond()-r.getSecond(),2)
                           +Math.pow(re.getThird()-r.getThird(),2));
//      System.out.println(Math.sqrt(Math.pow(re.getFirst()-r.getFirst(),2))+r.getUsername());
//System.out.println(score);
           double sim=score/(1+score);
       score se=new score(r.getUsername(),score);
scores.add(se);

        }

        Collections.sort(scores);
        for(score s:scores)
        {

            System.out.println(s.getUsername()+"    "+s.getScore());

        }
return scores;
    }


}
