package br.com.bruno96dantas.madera_burguer.dto;

import br.com.bruno96dantas.madera_burguer.models.QuantityIngredient;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
@Builder
public class SandwichDto {

    private Long id;

    private String name;

    private List<QuantityIngredient> ingredients;
}
