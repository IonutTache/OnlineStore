package main.mappers;

import main.controllers.dto.SellerRequestDto;
import main.repository.entity.Seller;
import org.springframework.stereotype.Component;

@Component
public class SellerRequestMapper {
    //creeaza vanzator

    public Seller map(SellerRequestDto seller){

        return Seller.builder()
                .firstName(seller.getFirstName())
                .lastName(seller.getLastName())
                .build();



    }
}
