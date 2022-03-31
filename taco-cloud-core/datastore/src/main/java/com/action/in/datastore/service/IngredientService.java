package com.action.in.datastore.service;

import com.action.in.datastore.domain.Ingredient;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class IngredientService {

    public Optional<Ingredient> findById(String id) {
        return Optional.empty();
    }
}
