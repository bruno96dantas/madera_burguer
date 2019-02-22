package br.com.bruno96dantas.madera_burguer.services;

import br.com.bruno96dantas.madera_burguer.converters.SandwichConvert;
import br.com.bruno96dantas.madera_burguer.dto.DiscountDto;
import br.com.bruno96dantas.madera_burguer.dto.SandwichDto;
import br.com.bruno96dantas.madera_burguer.models.IngredientType;
import br.com.bruno96dantas.madera_burguer.models.QuantityIngredient;
import br.com.bruno96dantas.madera_burguer.models.Sandwich;
import br.com.bruno96dantas.madera_burguer.models.promotion.RuleType;
import org.assertj.core.data.Percentage;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class DiscountServiceTest {

    private Sandwich sandwich1;

    @InjectMocks
    private DiscountService discountService;

    @Mock
    private SandwichConvert sandwichConvert;

    @Before
    public void setUp() {

        List<QuantityIngredient> xSalada = new ArrayList<>();

        QuantityIngredient ingredient1 = QuantityIngredient.builder()
                .ingredient(IngredientType.ALFACE)
                .quantity(3)
                .build();

        QuantityIngredient ingredient2 = QuantityIngredient.builder()
                .ingredient(IngredientType.CARNE)
                .quantity(2)
                .build();

        QuantityIngredient ingredient3 = QuantityIngredient.builder()
                .ingredient(IngredientType.QUEIJO)
                .quantity(2)
                .build();

        xSalada.add(ingredient1);
        xSalada.add(ingredient2);
        xSalada.add(ingredient3);

        sandwich1 = Sandwich.builder()
                .name("X-Salada")
                .ingredients(xSalada)
                .build();
    }

    @Test
    public void shouldGetPriceWithDiscount() {

        SandwichDto sandwichDto = sandwichConvert.unConvert(sandwich1);

        DiscountDto discountDto = discountService.getPriceWithDiscount(sandwichDto);

        assertThat(discountDto.getSandwich().getName()).isGreaterThanOrEqualTo("X-Salada");
        assertThat(discountDto.getRule().getRuleType()).isEqualByComparingTo(RuleType.LIGHT);
        assertThat(discountDto.getValueWithDiscount()).isCloseTo(9.18, Percentage.withPercentage(0.01));
    }
}
