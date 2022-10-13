package main.mappers;


import main.controllers.dto.SellerResponseDto;
import main.repository.entity.Seller;
import org.springframework.stereotype.Component;

@Component
public class SellerResponseMapper {

    public SellerResponseDto map(Seller seller){
        return SellerResponseDto.builder()
                .id(seller.getId())
                .firstName(seller.getFirstName())
                .lastName(seller.getLastName())
                .products(seller.getProduct())
                .email(seller.getEmail())
                .password(seller.getPassword())
                .build();
    }
}
