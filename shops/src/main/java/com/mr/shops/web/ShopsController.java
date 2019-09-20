package com.mr.shops.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShopsController {

    @GetMapping("hi")
    public String hi(){

        return "OK";
    }
}
