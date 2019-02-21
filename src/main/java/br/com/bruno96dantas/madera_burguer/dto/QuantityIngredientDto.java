package br.com.bruno96dantas.madera_burguer.dto;

import br.com.bruno96dantas.madera_burguer.models.IngredientType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class QuantityIngredientDto {

    private Long id;

    private IngredientType ingredient;
    private int quantity;
}
