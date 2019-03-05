package br.com.bruno96dantas.madera_burguer.models.sandwich;

import br.com.bruno96dantas.madera_burguer.models.ingredient.IngredientType;
import br.com.bruno96dantas.madera_burguer.models.ingredient.QuantityIngredient;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

@AllArgsConstructor
@Getter
public class Sandwich {

    private List<QuantityIngredient> ingredients;
    private double price;

    @Builder
    public Sandwich(List<QuantityIngredient> ingredients) {
        this.ingredients = ingredients;
        this.price = getPrice();
    }

    public List<QuantityIngredient> getIngredients() {
        return ingredients;
    }

    public double getPrice() {
        return ingredients.stream()
                .map(QuantityIngredient::getValue)
                .reduce(Double::sum)
                .orElse(0.0d);
    }

    public Map<IngredientType, Integer> getContext() {
        return getIngredients().stream()
                .collect(toMap(QuantityIngredient::getIngredient, QuantityIngredient::getQuantity));
    }

    @Override
    public String toString() {
        return "Sandwich{" +
                "ingredients=" + ingredients +
                ", price=" + price +
                '}';
    }
}
