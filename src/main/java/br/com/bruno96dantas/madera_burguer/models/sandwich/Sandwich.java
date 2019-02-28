package br.com.bruno96dantas.madera_burguer.models.sandwich;

import br.com.bruno96dantas.madera_burguer.models.QuantityIngredient;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
@Builder
public class Sandwich {

    private List<QuantityIngredient> ingredients;

    public double getPrice() {
        return ingredients.stream()
                .map(QuantityIngredient::getValue)
                .reduce(Double::sum)
                .orElse(0.0d);

    }

}
