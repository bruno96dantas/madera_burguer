package br.com.bruno96dantas.madera_burguer.dto;

import br.com.bruno96dantas.madera_burguer.models.ingredient.IngredientType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class IngredientDto {

    private Long id;

    private String name;
    private IngredientType ingredientType;
    private double price;
}
