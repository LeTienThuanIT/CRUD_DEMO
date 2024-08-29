package com.example.cruddemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @GetMapping("/all-product")
    public String getAllProducts() {
        return "Hello World";
    }
}
