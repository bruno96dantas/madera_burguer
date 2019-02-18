package br.com.bruno96dantas.madera_burguer.dto;

import br.com.bruno96dantas.madera_burguer.models.QuantityIngredient;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class SandwichDto {

    private Long id;

    private String name;
    private Double price;

    private List<QuantityIngredient> ingredients;
}
