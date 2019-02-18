package br.com.bruno96dantas.madera_burguer.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Table
public class Sandwich {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Double price;

    private List<QuantityIngredient> ingredients;

    void calculatePrice() {

        Double maybePrice = 0.0;

        for (QuantityIngredient ingredient : ingredients) {

            ingredient.calculateValue();
            maybePrice += ingredient.getValue();
        }

        setPrice(maybePrice);
    }

}
