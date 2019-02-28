package br.com.bruno96dantas.madera_burguer.models;

import br.com.bruno96dantas.madera_burguer.models.sandwich.StaticSandwiches;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;

import java.util.List;

import static br.com.bruno96dantas.madera_burguer.models.sandwich.StaticSandwiches.*;
import static java.util.Arrays.asList;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public class Menu {

    @Getter
    private List<StaticSandwiches> sandwiches;

    public Menu() {
        this.sandwiches = asList(XBACON, XBURGUER, XEGG, XEGGBACON, XSALADA, XBURGUERDUPLO);
    }
}
