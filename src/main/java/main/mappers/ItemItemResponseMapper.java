package main.mappers;

import main.controllers.dto.ItemResponseDto;
import main.repository.entity.Item;
import org.springframework.stereotype.Component;

@Component
public class ItemItemResponseMapper {

    public ItemResponseDto map(Item item){
        return ItemResponseDto.builder()
                .id(item.getId())
                .age(item.getAge())
                .name(item.getName())
                .build();
    }
}
