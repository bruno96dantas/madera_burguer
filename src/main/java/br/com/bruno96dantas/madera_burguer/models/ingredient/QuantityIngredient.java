package br.com.bruno96dantas.madera_burguer.models.ingredient;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Optional;

@AllArgsConstructor
@Builder
public class QuantityIngredient {

    private IngredientType ingredient;

    private int quantity;

    public IngredientType getIngredient() {
        return ingredient;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getValue() {
        return Optional.ofNullable(ingredient)
                .map(ingredient -> ingredient.getPrice() * quantity)
                .orElseThrow(() -> new RuntimeException("Ingredient can not be null."));
    }
}
