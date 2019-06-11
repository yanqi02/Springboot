package com.example.gbooks.controller;

import com.example.gbooks.entity.books;
import com.example.gbooks.repository.bookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class bookController {
    @Autowired
    bookRepository book;

    @GetMapping("/gbooks")
    public List<books> gbooks(){
        return  book.findAll();
    }
    @GetMapping("/gbook")
    public String gbook(){


        return  "book";
    }

}
