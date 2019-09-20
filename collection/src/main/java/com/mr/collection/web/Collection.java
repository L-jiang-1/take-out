package com.mr.collection.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Collection {

    @GetMapping("hi")
    public String hi(){

        return "OK";
    }
}
