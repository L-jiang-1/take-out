package com.mr.shopsfeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("shops")
public interface ShopsService {


    @GetMapping("hi")
    String hi();
}
