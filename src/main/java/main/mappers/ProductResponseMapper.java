package main.mappers;

import main.controllers.dto.ProductResponseDto;
import main.repository.entity.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductResponseMapper {

    public ProductResponseDto map(Product product){

        return ProductResponseDto.builder()
                .id(product.getId())
                .productName(product.getProductName())
                .productPrice(product.getProductPrice())
                .seller(product.getSeller())
                .build();
    }
}
