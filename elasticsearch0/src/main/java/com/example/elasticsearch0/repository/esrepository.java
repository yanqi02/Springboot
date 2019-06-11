package com.example.elasticsearch0.repository;

import com.example.elasticsearch0.entity.Interest;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface esrepository extends ElasticsearchRepository<Interest,String> {
    //自定义查询方法
    public List<Interest> findByMesLike(String mes);
    public List<Interest> findByUsernameLike(String username);
    public  List<Interest> findByUsername(String username);
}
