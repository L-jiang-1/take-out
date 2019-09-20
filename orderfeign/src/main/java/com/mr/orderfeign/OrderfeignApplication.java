package com.mr.orderfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class OrderfeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderfeignApplication.class, args);
    }

}
