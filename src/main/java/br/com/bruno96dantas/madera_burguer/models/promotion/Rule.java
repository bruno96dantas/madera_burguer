package br.com.bruno96dantas.madera_burguer.models.promotion;

import br.com.bruno96dantas.madera_burguer.models.Sandwich;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;

@Entity
@AllArgsConstructor
@Data
public abstract class Rule {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;

//    private String name;
//    private RuleType ruleType;

    public abstract boolean validate(Sandwich sandwich);

    public abstract double valueOfDiscount(Sandwich sandwich);
}
