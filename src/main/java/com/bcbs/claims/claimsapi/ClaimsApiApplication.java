package com.bcbs.claims.claimsapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = "com.bcbs.claims.claimsapi")
public class ClaimsApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClaimsApiApplication.class, args);
    }

}
