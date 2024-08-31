package com.example.cruddemo.controller;

import com.example.cruddemo.dto.ProductDTO;
import com.example.cruddemo.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class ProductController {
    private final ProductService service;

    @GetMapping("/all-product")
    public HttpEntity<List<ProductDTO>> findAll() {
        HttpHeaders headers = new HttpHeaders();
        List<ProductDTO> products = service.findAll();

        headers.add("Accept", "application/json");

        if (products.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(products, headers, HttpStatus.OK);
        }
    }

    @PostMapping("/product")
    public void create(@RequestBody ProductDTO dto) {
        service.create(dto);
    }
}
