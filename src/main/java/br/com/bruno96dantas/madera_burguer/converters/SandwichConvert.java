package br.com.bruno96dantas.madera_burguer.converters;

import br.com.bruno96dantas.madera_burguer.dto.SandwichDto;
import br.com.bruno96dantas.madera_burguer.models.Sandwich;
import org.springframework.stereotype.Component;

@Component
public class SandwichConvert implements Converter<Sandwich, SandwichDto> {

    @Override
    public Sandwich convert(SandwichDto sandwichDto) {
        return Sandwich.builder()
                .name(sandwichDto.getName())
                .ingredients(sandwichDto.getIngredients())
                .build();
    }

    @Override
    public SandwichDto unConvert(Sandwich sandwich) {
        return SandwichDto.builder()
                .name(sandwich.getName())
                .ingredients(sandwich.getIngredients())
                .build();
    }
}
