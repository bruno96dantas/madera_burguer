package br.com.bruno96dantas.madera_burguer.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class IngredientDto {

    private Long id;

    private String name;
    private Double price;
    private Integer quantity;
}
