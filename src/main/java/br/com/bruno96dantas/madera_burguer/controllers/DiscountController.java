package br.com.bruno96dantas.madera_burguer.controllers;

import br.com.bruno96dantas.madera_burguer.dto.DiscountDto;
import br.com.bruno96dantas.madera_burguer.dto.SandwichDto;
import br.com.bruno96dantas.madera_burguer.services.DiscountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sandwich")
public class DiscountController {

    @Autowired
    private DiscountService discountService;

    @CrossOrigin
    @PostMapping
    public ResponseEntity priceWithDiscount(@RequestBody SandwichDto sandwichDto) {

        DiscountDto discountDto= discountService.getPriceWithDiscount(sandwichDto);

        return ResponseEntity.ok(discountDto);
    }
}
