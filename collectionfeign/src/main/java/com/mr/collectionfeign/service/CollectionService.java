package com.mr.collectionfeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "collection")
public interface CollectionService {

    @GetMapping("hi")
    String hi();
}
