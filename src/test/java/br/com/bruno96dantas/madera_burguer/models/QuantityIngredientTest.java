package br.com.bruno96dantas.madera_burguer.models;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class QuantityIngredientTest {

    @Test
    public void shouldCalculateValue() {

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

        QuantityIngredient quantityIngredient1 = QuantityIngredient.builder()
                .ingredient(alface)
                .quantity(3)
                .build();

        QuantityIngredient quantityIngredient2 = QuantityIngredient.builder()
                .ingredient(carne)
                .quantity(2)
                .build();

        QuantityIngredient quantityIngredient3 = QuantityIngredient.builder()
                .ingredient(queijo)
                .quantity(2)
                .build();

        quantityIngredient1.getValue();
        quantityIngredient2.getValue();
        quantityIngredient3.getValue();

        assertThat(quantityIngredient1.getValue()).isEqualTo(3.0);
        assertThat(quantityIngredient2.getValue()).isEqualTo(6.0);
        assertThat(quantityIngredient3.getValue()).isEqualTo(3.0);
    }
}
