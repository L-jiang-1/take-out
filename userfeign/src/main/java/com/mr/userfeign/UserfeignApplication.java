package com.mr.userfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class UserfeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserfeignApplication.class, args);
    }

}
