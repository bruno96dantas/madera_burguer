package br.com.bruno96dantas.madera_burguer.models.ingredient;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Optional;

@AllArgsConstructor
@Data
@Builder
public class QuantityIngredient {

    private IngredientType ingredient;

    private int quantity;

    public double getValue(){

        return Optional.ofNullable(ingredient)
                .map(ingredient -> ingredient.getPrice() * quantity)
                .orElseThrow(() -> new RuntimeException("Ingrediente não pode ser null"));

//        return ingredient == null ? 0.0 : ingredient.getPrice() * quantity;
    }
}
