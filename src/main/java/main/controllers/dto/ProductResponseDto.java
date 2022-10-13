package main.controllers.dto;

import lombok.Builder;
import lombok.Data;
import main.repository.entity.Seller;

@Data
@Builder
public class ProductResponseDto {

    private Integer id;

    private String productName;

    private Double productPrice;

    private Seller seller;
}
