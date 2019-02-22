package br.com.bruno96dantas.madera_burguer.dto;

import br.com.bruno96dantas.madera_burguer.models.Sandwich;
import br.com.bruno96dantas.madera_burguer.models.promotion.Rule;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Builder
@Data
public class DiscountDto {

    private Sandwich sandwich;
    private Rule rule;
    private double valueWithDiscount;
}
