package com.mr.commodity.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommodityController {


    @GetMapping("hi")
    public String hi(){

        return "OK";
    }
}
