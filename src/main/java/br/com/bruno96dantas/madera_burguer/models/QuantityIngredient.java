package br.com.bruno96dantas.madera_burguer.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.util.Optional;

@Entity
@AllArgsConstructor
@Data
@Builder
@Table(name = "ingredients")
public class QuantityIngredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private IngredientType ingredient;

    private int quantity;

    public double getValue(){

        return Optional.ofNullable(ingredient)
                .map(ingredient -> ingredient.getPrice() * quantity)
                .orElseThrow(() -> new RuntimeException("Ingrediente não pode ser null"));

//        return ingredient == null ? 0.0 : ingredient.getPrice() * quantity;
    }
}
