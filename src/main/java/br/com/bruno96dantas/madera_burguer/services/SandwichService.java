package br.com.bruno96dantas.madera_burguer.services;

import br.com.bruno96dantas.madera_burguer.dto.QuantityIngredientDto;
import br.com.bruno96dantas.madera_burguer.dto.SandwichDto;
import br.com.bruno96dantas.madera_burguer.models.sandwich.StaticSandwiches;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SandwichService {


    public StaticSandwiches getSandwichIngredients(StaticSandwiches sandwichType) {

        return sandwichType;
    }

    public SandwichDto createSandwich(List<QuantityIngredientDto> ingredientTypes) {

        return SandwichDto.builder()
                .ingredients(ingredientTypes)
                .build();
    }

}
