package br.com.bruno96dantas.madera_burguer.models.promotion;

import br.com.bruno96dantas.madera_burguer.models.Ingredient;
import br.com.bruno96dantas.madera_burguer.models.IngredientType;
import br.com.bruno96dantas.madera_burguer.models.QuantityIngredient;
import br.com.bruno96dantas.madera_burguer.models.Sandwich;

import java.util.List;
import java.util.stream.Collectors;

public class RuleLight extends Rule {


    @Override
    public boolean validate(Sandwich sandwich) {

        List<IngredientType> ingredientTypes = sandwich.getIngredients().stream()
                .map(QuantityIngredient::getIngredient)
                .map(Ingredient::getIngredientType)
                .collect(Collectors.toList());

        return ingredientTypes.contains(IngredientType.ALFACE) && !ingredientTypes.contains(IngredientType.BACON);

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
