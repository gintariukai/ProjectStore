package com.jakut.projectstore.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController //funkcija kuri grazins saraso laukeli
public class ProductController {

    public ResponseEntity<List<ProductDto>> getProducts() {

    }
}
