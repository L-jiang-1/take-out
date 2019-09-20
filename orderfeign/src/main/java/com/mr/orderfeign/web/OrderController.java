package com.mr.orderfeign.web;

import com.mr.orderfeign.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    private OrderService ser;

    @GetMapping("hi")
    public String hi(){

        return ser.hi();
    }
}
