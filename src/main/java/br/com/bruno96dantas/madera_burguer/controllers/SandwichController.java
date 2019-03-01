package br.com.bruno96dantas.madera_burguer.controllers;

import br.com.bruno96dantas.madera_burguer.dto.QuantityIngredientDto;
import br.com.bruno96dantas.madera_burguer.models.sandwich.StaticSandwiches;
import br.com.bruno96dantas.madera_burguer.services.SandwichService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sandwich")
public class SandwichController {

    @Autowired
    private SandwichService sandwichService;

    @PostMapping
    public ResponseEntity createSandwich(@RequestBody List<QuantityIngredientDto> sandwich) {

        sandwichService.createSandwich(sandwich);

        return ResponseEntity.ok(sandwich);
    }

    @GetMapping("/{sandwichName}")
    public ResponseEntity selectAll(@PathVariable("sandwichName") StaticSandwiches sandwichType) {

        return ResponseEntity.ok(sandwichService.getSandwichIngredients(sandwichType));
    }
}
