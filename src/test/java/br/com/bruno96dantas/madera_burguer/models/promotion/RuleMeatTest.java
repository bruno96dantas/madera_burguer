package br.com.bruno96dantas.madera_burguer.models.promotion;

import br.com.bruno96dantas.madera_burguer.models.IngredientType;
import br.com.bruno96dantas.madera_burguer.models.QuantityIngredient;
import br.com.bruno96dantas.madera_burguer.models.Sandwich;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


@RunWith(MockitoJUnitRunner.class)
public class RuleMeatTest {

    private Sandwich sandwich1;
    private Sandwich sandwich2;

    @Before
    public void setUp() {

        List<QuantityIngredient> triploBurguer = new ArrayList<>();
        List<QuantityIngredient> hexaBurguer = new ArrayList<>();


        QuantityIngredient hamburguer1 = QuantityIngredient.builder()
                .ingredient(IngredientType.CARNE)
                .quantity(3)
                .build();

        QuantityIngredient hamburguer2 = QuantityIngredient.builder()
                .ingredient(IngredientType.CARNE)
                .quantity(6)
                .build();

        triploBurguer.add(hamburguer1);
        hexaBurguer.add(hamburguer2);

        sandwich1 = Sandwich.builder()
                .name("Triplo Burguer")
                .ingredients(triploBurguer)
                .build();

        sandwich2 = Sandwich.builder()
                .name("Hexa Burguer")
                .ingredients(hexaBurguer)
                .build();

    }

    @Test
    public void shouldValidate() {

        RuleMeat ruleMeat = new RuleMeat();

        assertThat(ruleMeat.validate(sandwich1)).isTrue();
        assertThat(ruleMeat.validate(sandwich2)).isTrue();
    }

    @Test
    public void shouldReturnTheValueOfDiscount() {

        RuleMeat ruleMeat = new RuleMeat();

        assertThat(ruleMeat.valueOfDiscount(sandwich1)).isEqualTo(3.0);
        assertThat(ruleMeat.valueOfDiscount(sandwich2)).isEqualTo(6.0);
    }

}
