package com.action.in.taco.cloud.core.repository;

import com.action.in.taco.cloud.core.domain.Ingredient;

public interface IngredientRepository {
    Iterable<Ingredient> findAll();
    Ingredient findById(String id);
    Ingredient save(Ingredient ingredient);
}
