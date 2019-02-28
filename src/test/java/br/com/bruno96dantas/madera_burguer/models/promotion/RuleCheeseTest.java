//package br.com.bruno96dantas.madera_burguer.models.promotion;
//
//import br.com.bruno96dantas.madera_burguer.models.IngredientType;
//import br.com.bruno96dantas.madera_burguer.models.QuantityIngredient;
//import br.com.bruno96dantas.madera_burguer.models.sandwich.Sandwich;
//import br.com.bruno96dantas.madera_burguer.models.rule.RuleCheese;
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
//@RunWith(MockitoJUnitRunner.class)
//public class RuleCheeseTest {
//
//    private Sandwich sandwich1;
//    private Sandwich sandwich2;
//
//    @Before
//    public void setUp() {
//
//        List<QuantityIngredient> triploCheese = new ArrayList<>();
//        List<QuantityIngredient> hexaCheese = new ArrayList<>();
//
//
//        QuantityIngredient cheese1 = QuantityIngredient.builder()
//                .ingredient(IngredientType.QUEIJO)
//                .quantity(3)
//                .build();
//
//        QuantityIngredient cheese2 = QuantityIngredient.builder()
//                .ingredient(IngredientType.QUEIJO)
//                .quantity(6)
//                .build();
//
//        triploCheese.add(cheese1);
//        hexaCheese.add(cheese2);
//
//        sandwich1 = Sandwich.builder()
//                .name("Triplo Cheese")
//                .ingredients(triploCheese)
//                .build();
//
//        sandwich2 = Sandwich.builder()
//                .name("Hexa Cheese")
//                .ingredients(hexaCheese)
//                .build();
//    }
//
//    @Test
//    public void shouldValidate() {
//
//        RuleCheese ruleCheese = new RuleCheese();
//
//        assertThat(ruleCheese.validate(sandwich1)).isTrue();
//        assertThat(ruleCheese.validate(sandwich2)).isTrue();
//    }
//
//    @Test
//    public void shouldReturnTheValueOfDiscount() {
//
//        RuleCheese ruleCheese = new RuleCheese();
//
//        assertThat(ruleCheese.valueOfDiscount(sandwich1)).isEqualTo(1.5);
//        assertThat(ruleCheese.valueOfDiscount(sandwich2)).isEqualTo(3.0);
//
//    }
//}
