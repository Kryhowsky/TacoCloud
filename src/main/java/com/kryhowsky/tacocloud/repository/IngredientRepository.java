package com.kryhowsky.tacocloud.repository;

import com.kryhowsky.tacocloud.model.Ingredient;
import org.springframework.data.repository.CrudRepository;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {
}
