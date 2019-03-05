package br.com.bruno96dantas.madera_burguer.models.rule;

import br.com.bruno96dantas.madera_burguer.models.ingredient.IngredientType;
import br.com.bruno96dantas.madera_burguer.models.sandwich.Sandwich;

import java.util.Map;

public class RuleMany extends Rule {


    @Override
    public boolean validate(Sandwich sandwich) {

        Map<IngredientType, Integer> sandwichContext = sandwich.getContext();

        return sandwichContext.getOrDefault(IngredientType.CARNE, 0) >=3 || sandwichContext.getOrDefault(IngredientType.QUEIJO, 0) >= 3;
    }

    @Override
    public double valueOfDiscount(Sandwich sandwich) {

        if (validate(sandwich)) {

            Map<IngredientType, Integer> sandwichContext = sandwich.getContext();

            if (sandwichContext.containsKey(IngredientType.CARNE)) {
                Integer quantityMeat = sandwichContext.get(IngredientType.CARNE);

                return (quantityMeat / 3) * IngredientType.CARNE.getPrice();
            }
            else if (sandwichContext.containsKey(IngredientType.QUEIJO)) {
                Integer quantityCheese = sandwichContext.get(IngredientType.QUEIJO);

                return (quantityCheese / 3) * IngredientType.QUEIJO.getPrice();
            }
        }
        return 0.0;
    }
}
