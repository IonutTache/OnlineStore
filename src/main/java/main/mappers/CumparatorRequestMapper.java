package main.mappers;

import main.controllers.dto.CumparatorRequestDto;
import main.repository.entity.Cumparator;
import org.springframework.stereotype.Component;

@Component
public class CumparatorRequestMapper {

    public Cumparator map(CumparatorRequestDto cumparator){
        return Cumparator.builder()
                .firstName(cumparator.getFirstName())
                .secondName(cumparator.getSecondName())
                .build();
    }
}
