package br.com.bruno96dantas.madera_burguer.controllers;

import br.com.bruno96dantas.madera_burguer.services.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    private MenuService menuService;

    @CrossOrigin
    @GetMapping
    public ResponseEntity getMenu() {

        return ResponseEntity.ok(menuService.getMenu());
    }
}
