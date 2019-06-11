package com.etalk.ym;


import com.etalk.ym.bean.Interest;
import com.etalk.ym.repository.inRepository;

import org.elasticsearch.action.ActionFuture;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchRequestBuilder;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.Client;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.aggregations.bucket.filter.Filter;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.query.NativeSearchQuery;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import static org.elasticsearch.index.query.QueryBuilders.matchAllQuery;

@RunWith(SpringRunner.class)
@SpringBootTest
public class YmApplicationTests {
//  @Autowired
//  inRepository inte;
//  @Autowired
//ElasticsearchTemplate est;
    @Test
    public void contextLoads() {
//        Interest interest=new Interest();
//        inte.getEntityClass();
//        System.out.println(inte.getEntityClass());
//        interest.setUsername("大6");
//
//        interest.setMes("我和dsa");
//inte.index(interest);
//
//      for(Interest interest : inte.findByUsernameLike("三")){
//          System.out.println(interest);
//          String json="{\n" +
//                  "    \"query\" : {\n" +
//                  "        \"match\" : {\n" +
//                  "            \"about\" : \"rock climbing\"\n" +
//                  "        }\n" +
//                  "    }\n" +
//                  "}";
//
//      }
   }
@Test
    public void  searchtest() {
    //全文搜索表达式

//
//    String json = "{\n" +
//            "    \"query\" : {\n" +
//            "        \"match\" : {\n" +
//            "            \"about\" : \"rock climbing\"\n" +
//            "        }\n" +
//            "    }\n" +
//            "}";


//
//
//
//    SearchRequest searchRequest = new SearchRequest("user").types("interest");
//    SearchSourceBuilder sourceBuilder = new SearchSourceBuilder();
//    sourceBuilder.query(QueryBuilders.termQuery("mes", "是和"));
//    searchRequest.source(sourceBuilder);
////    ActionFuture<SearchResponse> response =  est.getClient().search(searchRequest);
//
//    System.out.println(response.actionGet());




}
}