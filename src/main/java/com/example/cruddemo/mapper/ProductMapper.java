package com.example.cruddemo.mapper;

import com.example.cruddemo.dto.ProductDTO;
import com.example.cruddemo.entities.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    @Mapping(target = "id", ignore = true)
    Product dtoToEntity(ProductDTO dto);

    ProductDTO entityToDto(Product product);

    List<ProductDTO> entityToDto(List<Product> products);
}
