package br.com.bruno96dantas.madera_burguer.models;

import lombok.Getter;

public enum IngredientType {

    ALFACE("alface", 0.40),
    BACON ("bacon", 2.00),
    CARNE ("hambúrguer", 3.00),
    OVO ("ovo", 0.80),
    QUEIJO("queijo", 1.50);

    @Getter
    private String name;

    @Getter
    private double price;

    IngredientType(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
