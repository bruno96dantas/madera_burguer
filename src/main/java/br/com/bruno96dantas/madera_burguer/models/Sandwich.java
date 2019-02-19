package br.com.bruno96dantas.madera_burguer.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@Data
@Builder
@Table
public class Sandwich {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private List<QuantityIngredient> ingredients;

    public double getPrice() {
        return ingredients.stream()
                .map(QuantityIngredient::getValue)
                .reduce(Double::sum)
                .orElse(0.0d);

    }

}
