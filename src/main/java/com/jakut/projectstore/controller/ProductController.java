package com.jakut.projectstore.controller;


import com.jakut.projectstore.dto.ProductDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("products")
public class ProductController {

    @GetMapping
    public ResponseEntity<List<ProductDto>> getProducts() {
        ProductDto product = ProductDto.builder()
                .title("Pirmas produktas")
                .build();

        List<ProductDto> products = new ArrayList<>();
        products.add(product);
        return ResponseEntity.ok(products);

    }
}
