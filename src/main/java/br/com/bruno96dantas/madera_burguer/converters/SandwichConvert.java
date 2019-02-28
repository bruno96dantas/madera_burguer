package br.com.bruno96dantas.madera_burguer.converters;

import br.com.bruno96dantas.madera_burguer.dto.SandwichDto;
import br.com.bruno96dantas.madera_burguer.models.sandwich.Sandwich;
import org.springframework.stereotype.Component;

@Component
public class SandwichConvert implements Converter<Sandwich, SandwichDto> {

    @Override
    public Sandwich convert(SandwichDto sandwichDto) {
        return Sandwich.builder()
                .ingredients(sandwichDto.getIngredients())
                .build();
    }

    @Override
    public SandwichDto unConvert(Sandwich sandwich) {
        return SandwichDto.builder()
                .ingredients(sandwich.getIngredients())
                .build();
    }
}
