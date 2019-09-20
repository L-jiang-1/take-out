package com.mr.commodityfeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "commodity")
public interface CommodityService {

    @GetMapping("hi")
    String hi();
}
