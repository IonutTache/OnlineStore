package main.mappers;

import main.controllers.dto.ItemRequestDto;
import main.repository.entity.Item;
import org.springframework.stereotype.Component;

@Component
public class ItemRequestItemMapper {

    public Item map(ItemRequestDto item){
        return Item.builder()
                .age(item.getAge())
                .name(item.getName())
                .build();
    }
}
