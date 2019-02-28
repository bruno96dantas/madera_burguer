package br.com.bruno96dantas.madera_burguer.controllers;

import br.com.bruno96dantas.madera_burguer.dto.SandwichDto;
import br.com.bruno96dantas.madera_burguer.models.sandwich.StaticSandwiches;
import br.com.bruno96dantas.madera_burguer.services.SandwichService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sandwich")
public class SandwichController {

    @Autowired
    private SandwichService sandwichService;

    @PostMapping
    public ResponseEntity createSandwich(@RequestBody SandwichDto sandwichDto) {

        sandwichService.createSandwich(sandwichDto);

        return ResponseEntity.ok(sandwichDto);
    }

    @GetMapping("/{sandwichName}")
    public ResponseEntity selectAll(@PathVariable("sandwichName") StaticSandwiches sandwichType) {

        return ResponseEntity.ok(sandwichService.getSandwichIngredients(sandwichType));
    }
}
