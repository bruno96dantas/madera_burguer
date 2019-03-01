package br.com.bruno96dantas.madera_burguer.models.sandwich;

import br.com.bruno96dantas.madera_burguer.models.ingredient.IngredientType;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;

import java.util.List;

import static br.com.bruno96dantas.madera_burguer.models.ingredient.IngredientType.*;
import static java.util.Arrays.asList;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum StaticSandwiches {

    XBACON("XBACON", asList(CARNE, QUEIJO, BACON)),
    XBURGUER("XBURGUER", asList(CARNE, QUEIJO)),
    XEGG("XEGG", asList(CARNE, QUEIJO, OVO)),
    XEGGBACON("XEGGBACON", asList(CARNE, QUEIJO, OVO, BACON)),
    XSALADA("XSALADA", asList(CARNE, QUEIJO, ALFACE)),
    XBURGUERDUPLO("XBURGUERDUPLO", asList(CARNE, CARNE, QUEIJO));

    @Getter
    private String name;

    @Getter
    private List<IngredientType> ingredientTypes;

    StaticSandwiches(String name, List<IngredientType> ingredientTypes) {
        this.name = name;
        this.ingredientTypes = ingredientTypes;
    }

    public double getPrice() {

        return ingredientTypes.stream()
                .map(IngredientType::getPrice)
                .reduce(Double::sum)
                .orElse(0.0d);
    }
}
