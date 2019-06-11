package com.example.provider.controller;

import com.example.provider.service.MbookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class bookcontroller {
    @Autowired
    MbookService mbook;

    @GetMapping("/book")
    public String getbook() {
        return mbook.getmes();
    }
}
