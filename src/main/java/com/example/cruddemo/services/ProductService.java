package com.example.cruddemo.services;

import com.example.cruddemo.dto.ProductDTO;
import com.example.cruddemo.entities.Product;
import com.example.cruddemo.mapper.ProductMapper;
import com.example.cruddemo.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ProductService {
    private final ProductRepository repository;
    private final ProductMapper mapper;

    public List<ProductDTO> findAll(){
        return mapper.entityToDto(repository.findAll());
    }

    public void create(ProductDTO dto) {
        Product entity = mapper.dtoToEntity(dto);
        repository.save(entity);
    }
}
