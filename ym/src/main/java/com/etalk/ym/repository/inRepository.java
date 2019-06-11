package com.etalk.ym.repository;

import com.etalk.ym.bean.Interest;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.repository.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

public interface inRepository extends ElasticsearchRepository<Interest,String> {
    //自定义查询方法
    public  List<Interest> findByMesLike(String mes);
    public List<Interest> findByUsernameLike(String username);
public  List<Interest> findByUsername(String username);

}