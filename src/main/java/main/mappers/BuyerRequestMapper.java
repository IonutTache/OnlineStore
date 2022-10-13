package main.mappers;

import main.controllers.dto.BuyerRequestDto;
import main.repository.entity.Buyer;
import org.springframework.stereotype.Component;

@Component
public class BuyerRequestMapper {

    public Buyer map(BuyerRequestDto buyerRequestDto){
        return Buyer.builder()
                .firstName(buyerRequestDto.getFirstName())
                .secondName(buyerRequestDto.getSecondName())
                .build();
    }
}
