//package br.com.bruno96dantas.madera_burguer.controllers;
//
//import br.com.bruno96dantas.madera_burguer.dto.DiscountDto;
//import br.com.bruno96dantas.madera_burguer.dto.SandwichDto;
//import br.com.bruno96dantas.madera_burguer.services.DiscountService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/discount")
//public class DiscountController {
//
//    @Autowired
//    private DiscountService discountService;
//
//    @PostMapping
//    public ResponseEntity priceWithDiscount(@RequestBody SandwichDto sandwichDto) {
//
//        DiscountDto discountDto= discountService.getPriceWithDiscount(sandwichDto);
//
//        return ResponseEntity.ok(discountDto);
//    }
//}
