package com.action.in.taco.cloud.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.action.in")
public class TacoCloudAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(TacoCloudAppApplication.class, args);
    }

}
