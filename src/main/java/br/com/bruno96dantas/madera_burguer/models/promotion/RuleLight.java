package br.com.bruno96dantas.madera_burguer.models.promotion;

import br.com.bruno96dantas.madera_burguer.models.QuantityIngredient;
import br.com.bruno96dantas.madera_burguer.models.Sandwich;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@Data
public class RuleLight extends Rule {

    private Double percentage;

    @Override
    public boolean validate(Sandwich sandwich) {

        for (QuantityIngredient ingredient : sandwich.getIngredients()) {

            if ( ingredient.getIngredient().getName().matches("alface") && !ingredient.getIngredient().getName().matches("bacon")) {
                setPercentage(0.10);
                return true;
            }
        }
        setPercentage(0.0);
        return false;
    }

    @Override
    public Double promotionValue() {
        return 0.0;
    }
}
