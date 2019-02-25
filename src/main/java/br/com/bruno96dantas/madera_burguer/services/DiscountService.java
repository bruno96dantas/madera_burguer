package br.com.bruno96dantas.madera_burguer.services;

import br.com.bruno96dantas.madera_burguer.converters.SandwichConvert;
import br.com.bruno96dantas.madera_burguer.dto.DiscountDto;
import br.com.bruno96dantas.madera_burguer.dto.SandwichDto;
import br.com.bruno96dantas.madera_burguer.models.Sandwich;
import br.com.bruno96dantas.madera_burguer.models.promotion.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toSet;

@Service
public class DiscountService {

    @Autowired
    private SandwichConvert sandwichConverter;

    private List<Rule> availableRules = asList(new RuleCheese(), new RuleLight(), new RuleMeat());


    private Set<Discount> getAllAvailableDiscount(Sandwich sandwich) {

        return availableRules.stream()
                .filter(rule -> rule.validate(sandwich))
                .map(rule -> Discount.builder().rule(rule).sandwich(sandwich).build())
                .collect(toSet());
    }

    private double sumDiscount(Set<Discount> discounts) {

        return discounts.stream()
                .map(Discount::getDiscount)
                .mapToDouble(Double::doubleValue)
                .sum();

    }

    public DiscountDto getPriceWithDiscount(SandwichDto sandwichDto) {

        Sandwich sandwich = sandwichConverter.convert(sandwichDto);

        return DiscountDto.builder()
                .sandwich(sandwich)
                .valueWithDiscount(sandwich.getPrice() - sumDiscount(getAllAvailableDiscount(sandwich)))
                .build();
    }


}
