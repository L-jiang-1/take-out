package com.mr.userfeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "user")
public interface UserService {

    @GetMapping("hi")
    String hi();
}
