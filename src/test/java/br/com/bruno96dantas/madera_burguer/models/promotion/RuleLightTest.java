//package br.com.bruno96dantas.madera_burguer.models.promotion;
//
//import br.com.bruno96dantas.madera_burguer.models.ingredient.IngredientType;
//import br.com.bruno96dantas.madera_burguer.models.ingredient.QuantityIngredient;
//import br.com.bruno96dantas.madera_burguer.models.sandwich.Sandwich;
//import br.com.bruno96dantas.madera_burguer.models.rule.RuleLight;
//import org.assertj.core.data.Percentage;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.junit.MockitoJUnitRunner;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//
//@RunWith(MockitoJUnitRunner.class)
//public class RuleLightTest {
//
//    private Sandwich sandwich1;
//    private Sandwich sandwich2;
//
//    @Before
//    public void setUp() {
//
//        List<QuantityIngredient> xSalada = new ArrayList<>();
//        List<QuantityIngredient> xBacon = new ArrayList<>();
//
//        QuantityIngredient ingredient1 = QuantityIngredient.builder()
//                .ingredient(IngredientType.ALFACE)
//                .quantity(3)
//                .build();
//
//        QuantityIngredient ingredient2 = QuantityIngredient.builder()
//                .ingredient(IngredientType.CARNE)
//                .quantity(2)
//                .build();
//
//        QuantityIngredient ingredient3 = QuantityIngredient.builder()
//                .ingredient(IngredientType.QUEIJO)
//                .quantity(2)
//                .build();
//
//        QuantityIngredient ingredient4 = QuantityIngredient.builder()
//                .ingredient(IngredientType.BACON)
//                .quantity(2)
//                .build();
//
//        xSalada.add(ingredient1);
//        xSalada.add(ingredient2);
//        xSalada.add(ingredient3);
//
//        xBacon.add(ingredient1);
//        xBacon.add(ingredient2);
//        xBacon.add(ingredient3);
//        xBacon.add(ingredient4);
//
//        sandwich1 = Sandwich.builder()
//                .name("X-Salada")
//                .ingredients(xSalada)
//                .build();
//
//        sandwich2 = Sandwich.builder()
//                .name("X-Bacon")
//                .ingredients(xBacon)
//                .build();
//    }
//
//    @Test
//    public void shouldValidate() {
//
//        RuleLight ruleLight = new RuleLight();
//
//        assertThat(ruleLight.validate(sandwich1)).isTrue();
//        assertThat(ruleLight.validate(sandwich2)).isFalse();
//    }
//
//    @Test
//    public void shouldReturnTheValueOfDiscount() {
//
//        RuleLight ruleLight = new RuleLight();
//
//        assertThat(ruleLight.valueOfDiscount(sandwich1)).isCloseTo(1.02, Percentage.withPercentage(0.01));
//        assertThat(ruleLight.valueOfDiscount(sandwich2)).isEqualTo(0.0);
//    }
//}
