package main.controllers.dto;

import lombok.Builder;
import lombok.Data;
import main.repository.entity.Product;

import java.util.List;

@Data
@Builder
public class SellerResponseDto {

    private Integer id;

    private String firstName;

    private String lastName;

    private List<Product> products;

    private String email;

    private String password;

}
