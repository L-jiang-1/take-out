package com.mr.commodityfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CommodityfeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommodityfeignApplication.class, args);
    }

}
