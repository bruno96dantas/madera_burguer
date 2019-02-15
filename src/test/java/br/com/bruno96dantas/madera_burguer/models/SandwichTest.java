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
    public void shoulCalculatePrice(){

        List<Ingredient> ingredients = new ArrayList<>();

        Ingredient ingredient1 = Ingredient.builder()
                .name("Alface")
                .price(1.00)
                .quantity(3)
                .build();

        Ingredient ingredient2 = Ingredient.builder()
                .name("Hamburguer")
                .price(3.0)
                .quantity(2)
                .build();

        Ingredient ingredient3 = Ingredient.builder()
                .name("Queijo")
                .price(1.50)
                .quantity(4)
                .build();

        ingredients.add(ingredient1);
        ingredients.add(ingredient2);
        ingredients.add(ingredient3);

        Sandwich sandwich = Sandwich.builder()
                .name("X- Salada")
                .ingredients(ingredients)
                .build();

        sandwich.calculatePrice(ingredients);

        assertThat(sandwich.getPrice()).isEqualTo(15.0);
    }
}
