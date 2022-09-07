package main.mappers;


import main.controllers.dto.CumparatorResponseDto;
import main.repository.entity.Cumparator;
import org.springframework.stereotype.Component;

@Component
public class CumparatorResponseMapper {

    public CumparatorResponseDto map(Cumparator cumparator){

        return CumparatorResponseDto.builder()
                .id(cumparator.getId())
                .firstName(cumparator.getFirstName())
                .secondName(cumparator.getSecondName())
                .email(cumparator.getEmail())
                .password(cumparator.getPassword())
                .build();
    }
}
