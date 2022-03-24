package com.action.in.taco.cloud.app;

import com.action.in.taco.cloud.core.domain.Ingredient;
import com.action.in.taco.cloud.core.domain.Type;
import com.action.in.taco.cloud.core.repository.IngredientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(scanBasePackages = "com.action.in")
public class TacoCloudAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(TacoCloudAppApplication.class, args);
    }



}
