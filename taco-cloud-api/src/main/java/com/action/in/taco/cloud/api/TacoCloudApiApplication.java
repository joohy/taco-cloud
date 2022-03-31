package com.action.in.taco.cloud.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication(scanBasePackages = "com.action.in")
public class TacoCloudApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(TacoCloudApiApplication.class, args);
    }

}
