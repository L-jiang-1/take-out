package com.mr.collectionfeign.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CollectionController {

    @GetMapping("hi")
    public String hi(){

        return "OK";
    }
}
