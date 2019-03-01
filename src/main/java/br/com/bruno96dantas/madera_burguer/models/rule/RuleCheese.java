//package br.com.bruno96dantas.madera_burguer.models.rule;
//
//import br.com.bruno96dantas.madera_burguer.models.ingredient.IngredientType;
//import br.com.bruno96dantas.madera_burguer.models.sandwich.Sandwich;
//
//import java.util.Map;
//
//public class RuleCheese extends Rule {
//
//    @Override
//    public boolean validate(Sandwich sandwich) {
//        Map<IngredientType, Integer> sandwichContext = sandwich.getContext();
//
//        return sandwichContext.getOrDefault(IngredientType.QUEIJO, 0) >= 3;
//    }
//
//    @Override
//    public double valueOfDiscount(Sandwich sandwich) {
//
//        if (validate(sandwich)) {
//
//            Map<IngredientType, Integer> sandwichContext = sandwich.getContext();
//
//            Integer quantityCheese = sandwichContext.get(IngredientType.QUEIJO);
//
//            return (quantityCheese / 3) * IngredientType.QUEIJO.getPrice();
//        }
//
//        return 0.0;
//    }
//}
