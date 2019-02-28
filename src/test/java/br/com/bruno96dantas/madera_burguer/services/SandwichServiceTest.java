//package br.com.bruno96dantas.madera_burguer.services;
//
//import br.com.bruno96dantas.madera_burguer.models.IngredientType;
//import br.com.bruno96dantas.madera_burguer.models.QuantityIngredient;
//import br.com.bruno96dantas.madera_burguer.models.sandwich.Sandwich;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.junit.MockitoJUnitRunner;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@RunWith(MockitoJUnitRunner.class)
//public class SandwichServiceTest {
//
//    private List<Sandwich> sandwiches;
//
//    @Test
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
//        Sandwich sandwich1 = Sandwich.builder()
//                .name("X-Salada")
//                .ingredients(xSalada)
//                .build();
//
//        Sandwich sandwich2 = Sandwich.builder()
//                .name("X-Bacon")
//                .ingredients(xBacon)
//                .build();
//
//        sandwiches.add(sandwich1);
//        sandwiches.add(sandwich2);
//
//    }
//
//    @Test
//    public void shouldReturnAListOfSandwich() {
//
//
//    }
//}
