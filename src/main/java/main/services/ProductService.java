package main.services;


import lombok.RequiredArgsConstructor;
import main.controllers.dto.ProductRequestDto;
import main.controllers.dto.ProductResponseDto;
import main.mappers.ProductRequestMapper;
import main.mappers.ProductResponseMapper;
import main.repository.ProductRepository;
import main.repository.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    private final ProductResponseMapper mapper;

    private final ProductRequestMapper productRequestMapper;

    public List<ProductResponseDto> findAll (){
        return productRepository.findAll().stream()
                .map(mapper::map)
                .collect(Collectors.toList());
    }

    public ProductResponseDto save(ProductRequestDto productRequestDto) {
        Product product =  productRequestMapper.map(productRequestDto);
        productRepository.save(product);
        return mapper.map(product);
    }

    public void delete(Integer id){
        productRepository.deleteById(id);
    }
}
