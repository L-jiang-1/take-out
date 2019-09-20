package com.mr.shopsfeign.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShopController {

    @GetMapping("hi")
    public String hi(){

        return "OK";
    }
}
