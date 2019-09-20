package com.mr.shopsfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ShopsfeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopsfeignApplication.class, args);
    }

}
