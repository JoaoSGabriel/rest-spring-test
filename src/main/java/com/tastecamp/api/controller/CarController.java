package com.tastecamp.api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tastecamp.api.dto.CarDTO;

@RestController
@RequestMapping("/api/car")
public class CarController {
    
    @PostMapping
    public void create(@RequestBody CarDTO req) {
        String text = "O carro a venda é um modelo " + req.modelo() + ", fabricado pela " + req.fabricante() + ", está custando por volta de R$ " + req.valor();

        System.out.println(text);
    }
}
