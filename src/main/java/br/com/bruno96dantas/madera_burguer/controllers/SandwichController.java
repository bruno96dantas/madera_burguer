package br.com.bruno96dantas.madera_burguer.controllers;

import br.com.bruno96dantas.madera_burguer.services.SandwichService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sandwiches")
public class SandwichController {

    @Autowired
    private SandwichService sandwichService;

    @GetMapping
    public ResponseEntity selectAll() {

        return ResponseEntity.ok(sandwichService.selectAll());
    }
}
