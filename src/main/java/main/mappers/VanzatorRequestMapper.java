package main.mappers;

import main.controllers.dto.VanzatorRequestDto;
import main.repository.entity.Vanzator;
import org.springframework.stereotype.Component;

@Component
public class VanzatorRequestMapper {
    //creeaza vanzator

    public Vanzator map(VanzatorRequestDto vanzator){

        return Vanzator.builder()
                .firstName(vanzator.getFirstName())
                .lastName(vanzator.getLastName())
                //.produs(vanzator.getProdus())
                .build();

// Daca nu comnetez linia 15 imi da eroare dar nu stiu de ce


    }
}
