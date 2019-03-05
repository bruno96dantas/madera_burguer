package br.com.bruno96dantas.madera_burguer.models.promotion;

import br.com.bruno96dantas.madera_burguer.models.sandwich.Sandwich;
import br.com.bruno96dantas.madera_burguer.models.rule.Rule;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class Discount {


    private Rule rule;

    private Sandwich sandwich;

    public double getDiscount(){
        return rule.valueOfDiscount(sandwich);
    }

}
