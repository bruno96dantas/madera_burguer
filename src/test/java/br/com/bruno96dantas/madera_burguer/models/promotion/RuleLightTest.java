package br.com.bruno96dantas.madera_burguer.models.promotion;

import br.com.bruno96dantas.madera_burguer.models.Ingredient;
import br.com.bruno96dantas.madera_burguer.models.IngredientType;
import br.com.bruno96dantas.madera_burguer.models.QuantityIngredient;
import br.com.bruno96dantas.madera_burguer.models.Sandwich;
import org.assertj.core.data.Percentage;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


@RunWith(MockitoJUnitRunner.class)
public class RuleLightTest {

    private Sandwich sandwich1;
    private Sandwich sandwich2;

    @Before
    public void setUp() {

        List<QuantityIngredient> xSalada = new ArrayList<>();
        List<QuantityIngredient> xBacon = new ArrayList<>();

        Ingredient alface = Ingredient.builder()
                .name("Alface")
                .price(1.00)
                .ingredientType(IngredientType.ALFACE)
                .build();

        Ingredient carne = Ingredient.builder()
                .name("Hamburguer")
                .price(3.0)
                .ingredientType(IngredientType.CARNE)
                .build();

        Ingredient queijo = Ingredient.builder()
                .name("Queijo")
                .price(1.50)
                .ingredientType(IngredientType.QUEIJO)
                .build();

        Ingredient bacon = Ingredient.builder()
                .name("Bacon")
                .price(2.00)
                .ingredientType(IngredientType.BACON)
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

        QuantityIngredient ingredient4 = QuantityIngredient.builder()
                .ingredient(bacon)
                .quantity(2)
                .build();

        xSalada.add(ingredient1);
        xSalada.add(ingredient2);
        xSalada.add(ingredient3);

        xBacon.add(ingredient1);
        xBacon.add(ingredient2);
        xBacon.add(ingredient3);
        xBacon.add(ingredient4);

        sandwich1 = Sandwich.builder()
                .name("X-Salada")
                .ingredients(xSalada)
                .build();

        sandwich2 = Sandwich.builder()
                .name("X-Bacon")
                .ingredients(xBacon)
                .build();
    }

    @Test
    public void shouldValidate() {

        RuleLight ruleLight = new RuleLight();

        assertThat(ruleLight.validate(sandwich1)).isTrue();
        assertThat(ruleLight.validate(sandwich2)).isFalse();
    }

    @Test
    public void shouldReturnTheValueOfDiscount() {

        RuleLight ruleLight = new RuleLight();

        assertThat(ruleLight.valueOfDiscount(sandwich1)).isCloseTo(1.2, Percentage.withPercentage(0.01));

        assertThat(ruleLight.valueOfDiscount(sandwich2)).isEqualTo(0.0);
    }
}
