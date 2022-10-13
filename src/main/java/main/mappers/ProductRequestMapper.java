package main.mappers;

import main.controllers.dto.ProductRequestDto;
import main.repository.entity.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductRequestMapper {

    public Product map(ProductRequestDto product){
        return Product.builder()
                .productName(product.getProductName())
                .productPrice(product.getProductPrice())
                .seller(product.getSeller())
                .build();
    }
}

