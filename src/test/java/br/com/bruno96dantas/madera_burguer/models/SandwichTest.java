package br.com.bruno96dantas.madera_burguer.models;

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

        Ingredient alface = Ingredient.builder()
                .name("Alface")
                .price(1.00)
                .build();

        Ingredient carne = Ingredient.builder()
                .name("Hamburguer")
                .price(3.0)
                .build();

        Ingredient queijo = Ingredient.builder()
                .name("Queijo")
                .price(1.50)
                .build();

        QuantityIngredient ingredient1 = QuantityIngredient.builder()
                .ingredient(alface)
                .quantity(3)
                .build();

        QuantityIngredient ingredient2 = QuantityIngredient.builder()
                .ingredient(carne)
                .quantity(2)
                .build();

        QuantityIngredient ingredient3 = QuantityIngredient.builder()
                .ingredient(queijo)
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

        assertThat(sandwich.getPrice()).isEqualTo(12.0);

    }
}
