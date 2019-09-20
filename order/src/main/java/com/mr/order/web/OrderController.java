package com.mr.order.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {


    @GetMapping("hi")
    public String hi(){

        return "OKOK";
    }
}
