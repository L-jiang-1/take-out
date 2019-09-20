package com.mr.userfeign.web;

import com.mr.userfeign.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService ser;
    @GetMapping("hi")
    public String hi(){

        return ser.hi();
    }
}
