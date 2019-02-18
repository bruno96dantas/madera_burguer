package br.com.bruno96dantas.madera_burguer.models;

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
public class QuantityIngredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Ingredient ingredient;
    private Integer quantity;

    private Double value;

     void calculateValue() {

        this.setValue(this.ingredient.getPrice() * this.quantity);
    }
}
