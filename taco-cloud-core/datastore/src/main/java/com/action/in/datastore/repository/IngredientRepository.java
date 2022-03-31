package com.action.in.datastore.repository;

import com.action.in.datastore.domain.Ingredient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface IngredientRepository extends CrudRepository<Ingredient, String> {
    Optional<Ingredient> findById(String id);
}
