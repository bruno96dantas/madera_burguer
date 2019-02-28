//package br.com.bruno96dantas.madera_burguer.models.rule;
//
//import br.com.bruno96dantas.madera_burguer.models.IngredientType;
//import br.com.bruno96dantas.madera_burguer.models.sandwich.Sandwich;
//
//import java.util.Map;
//
//public class RuleMeat extends Rule {
//
//    @Override
//    public boolean validate(Sandwich sandwich) {
//
//        Map<IngredientType, Integer> sandwichContext = sandwich.getContext();
//
//        return sandwichContext.getOrDefault(IngredientType.CARNE, 0) >= 3;
//    }
//
//    @Override
//    public double valueOfDiscount(Sandwich sandwich) {
//
//        if (validate(sandwich)) {
//
//            Map<IngredientType, Integer> sandwichContext = sandwich.getContext();
//
//            Integer quantityMeat = sandwichContext.get(IngredientType.CARNE);
//
//            return (quantityMeat / 3) * IngredientType.CARNE.getPrice();
//        }
//
//        return 0.0;
//    }
//}
