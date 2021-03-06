package br.com.bruno96dantas.madera_burguer.models.promotion;

import br.com.bruno96dantas.madera_burguer.models.Sandwich;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;

@Entity
@AllArgsConstructor
@Data
@Builder
public class Discount {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;

    private Rule rule;

    private Sandwich sandwich;

    public double getDiscount(){
        return rule.valueOfDiscount(sandwich);
    }

}
