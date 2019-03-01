package br.com.bruno96dantas.madera_burguer.models;

import br.com.bruno96dantas.madera_burguer.models.ingredient.IngredientType;
import br.com.bruno96dantas.madera_burguer.models.ingredient.QuantityIngredient;
import org.assertj.core.data.Percentage;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class QuantityIngredientTest {

    @Test
    public void shouldCalculateValue() {


        QuantityIngredient quantityIngredient1 = QuantityIngredient.builder()
                .ingredient(IngredientType.ALFACE)
                .quantity(3)
                .build();

        QuantityIngredient quantityIngredient2 = QuantityIngredient.builder()
                .ingredient(IngredientType.CARNE)
                .quantity(2)
                .build();

        QuantityIngredient quantityIngredient3 = QuantityIngredient.builder()
                .ingredient(IngredientType.QUEIJO)
                .quantity(2)
                .build();

        quantityIngredient1.getValue();
        quantityIngredient2.getValue();
        quantityIngredient3.getValue();

        assertThat(quantityIngredient1.getValue()).isCloseTo(1.2, Percentage.withPercentage(0.01));
        assertThat(quantityIngredient2.getValue()).isCloseTo(6.0, Percentage.withPercentage(0.01));
        assertThat(quantityIngredient3.getValue()).isCloseTo(3.0, Percentage.withPercentage(0.01));
    }
}
