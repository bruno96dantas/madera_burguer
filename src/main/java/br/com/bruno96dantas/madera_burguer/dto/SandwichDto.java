package br.com.bruno96dantas.madera_burguer.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
@Builder
public class SandwichDto {

    @JsonProperty("ingredients")
    private List<QuantityIngredientDto> ingredients;
}
