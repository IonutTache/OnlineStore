package main.mappers;


import main.controllers.dto.BuyerResponseDto;
import main.repository.entity.Buyer;
import org.springframework.stereotype.Component;

@Component
public class BuyerResponseMapper {

    public BuyerResponseDto map(Buyer buyer){

        return BuyerResponseDto.builder()
                .id(buyer.getId())
                .firstName(buyer.getFirstName())
                .secondName(buyer.getSecondName())
                .email(buyer.getEmail())
                .password(buyer.getPassword())
                .build();
    }
}
