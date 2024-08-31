package com.example.cruddemo.dto;


import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ProductDTO {
    private int id;
    private String name;
    private double price;
}
