package main.mappers;

import main.controllers.dto.ProdusResponseDto;
import main.repository.entity.Produs;
import org.springframework.stereotype.Component;

@Component
public class ProdusResponseMapper {

    public ProdusResponseDto map(Produs produs){

        return ProdusResponseDto.builder()
                .id(produs.getId())
                .numeProdus(produs.getNumeProdus())
                .pretProdus(produs.getPretProdus())
                .vanzator(produs.getVanzator())
                .build();
    }
}
