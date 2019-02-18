package br.com.bruno96dantas.madera_burguer.models.promotion;

import br.com.bruno96dantas.madera_burguer.models.Sandwich;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Table
public class Discount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Rule rule;
    private Sandwich sandwich;

    private Double priceWithDiscount;


}
