package main.mappers;

import main.controllers.dto.ProdusRequestDto;
import main.repository.entity.Produs;
import org.springframework.stereotype.Component;

@Component
public class ProdusRequestMapper {

    public Produs map(ProdusRequestDto produs){
        return Produs.builder()
                .numeProdus(produs.getNumeProdus())
                .pretProdus(produs.getPretProdus())
                .vanzator(produs.getVanzator())
                .build();
    }
}

