package main.mappers;


import main.controllers.dto.VanzatorResponseDto;
import main.repository.entity.Vanzator;
import org.springframework.stereotype.Component;

@Component
public class VanzatorResponseMapper {

    public VanzatorResponseDto map(Vanzator vanzator){
        return VanzatorResponseDto.builder()
                .id(vanzator.getId())
                .firstName(vanzator.getFirstName())
                .lastName(vanzator.getLastName())
                .produs(vanzator.getProdus())
                .email(vanzator.getEmail())
                .password(vanzator.getPassword())
                .build();
    }
}
