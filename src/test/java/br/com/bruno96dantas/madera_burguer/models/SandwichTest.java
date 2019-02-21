package br.com.bruno96dantas.madera_burguer.models;

import org.assertj.core.data.Percentage;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class SandwichTest {


    @Test
    public void shouldCalculatePrice(){

        List<QuantityIngredient> ingredients = new ArrayList<>();


        QuantityIngredient ingredient1 = QuantityIngredient.builder()
                .ingredient(IngredientType.ALFACE)
                .quantity(3)
                .build();

        QuantityIngredient ingredient2 = QuantityIngredient.builder()
                .ingredient(IngredientType.CARNE)
                .quantity(2)
                .build();

        QuantityIngredient ingredient3 = QuantityIngredient.builder()
                .ingredient(IngredientType.QUEIJO)
                .quantity(2)
                .build();

        ingredients.add(ingredient1);
        ingredients.add(ingredient2);
        ingredients.add(ingredient3);

        Sandwich sandwich = Sandwich.builder()
                .name("X-Salada")
                .ingredients(ingredients)
                .build();

        sandwich.getPrice();

        assertThat(sandwich.getPrice()).isCloseTo(10.2, Percentage.withPercentage(0.01));

    }
}
