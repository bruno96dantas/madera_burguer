package br.com.bruno96dantas.madera_burguer.models.promotion;

import br.com.bruno96dantas.madera_burguer.models.IngredientType;
import br.com.bruno96dantas.madera_burguer.models.Sandwich;

import java.util.Map;

public class RuleLight extends Rule {


    @Override
    public boolean validate(Sandwich sandwich) {

        Map<IngredientType, Integer> sandwichContext = sandwich.getContext();

        return sandwichContext.containsKey(IngredientType.ALFACE) && !sandwichContext.containsKey(IngredientType.BACON);

    }

    @Override
    public double valueOfDiscount(Sandwich sandwich) {

        if (validate(sandwich)) {

            double sandwichPrice = sandwich.getPrice();

            return sandwichPrice * 0.10;
        }

        return  0.0;
    }
}
