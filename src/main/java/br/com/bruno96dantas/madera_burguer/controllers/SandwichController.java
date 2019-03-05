package br.com.bruno96dantas.madera_burguer.controllers;

import br.com.bruno96dantas.madera_burguer.dto.QuantityIngredientDto;
import br.com.bruno96dantas.madera_burguer.models.sandwich.SandwichType;
import br.com.bruno96dantas.madera_burguer.services.SandwichService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sandwiches")
public class SandwichController {

    @Autowired
    private SandwichService sandwichService;

    @CrossOrigin
    @GetMapping("/{sandwichName}")
    public ResponseEntity selectAll(@PathVariable("sandwichName") SandwichType sandwichType) {

        return ResponseEntity.ok(sandwichService.getSandwichIngredients(sandwichType));
    }
}
