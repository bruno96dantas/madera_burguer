package br.com.bruno96dantas.madera_burguer.services;

import br.com.bruno96dantas.madera_burguer.converters.SandwichConvert;
import br.com.bruno96dantas.madera_burguer.dto.SandwichDto;
import br.com.bruno96dantas.madera_burguer.models.sandwich.Sandwich;
import br.com.bruno96dantas.madera_burguer.models.sandwich.StaticSandwiches;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SandwichService {

    @Autowired
    private SandwichConvert sandwichConvert;

    public StaticSandwiches getSandwichIngredients(StaticSandwiches sandwichType) {

        return sandwichType;
    }

    public SandwichDto createSandwich(SandwichDto sandwichDto) {

        Sandwich sandwich = sandwichConvert.convert(sandwichDto);

        return sandwichConvert.unConvert(sandwich);
    }

}
