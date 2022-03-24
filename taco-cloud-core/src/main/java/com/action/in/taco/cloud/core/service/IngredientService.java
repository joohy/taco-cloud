package com.action.in.taco.cloud.core.service;

import com.action.in.taco.cloud.core.domain.Ingredient;
import com.action.in.taco.cloud.core.repository.IngredientRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class IngredientService {

    public Optional<Ingredient> findById(String id) {
        return Optional.empty();
    }
}
