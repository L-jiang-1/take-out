package com.mr.orderfeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "ORDER")
public interface OrderService {

    @GetMapping("hi")
    String hi();
}
