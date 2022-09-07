package main.services;

import lombok.RequiredArgsConstructor;
import main.controllers.dto.ItemRequestDto;
import main.controllers.dto.ItemResponseDto;
import main.mappers.ItemItemResponseMapper;
import main.mappers.ItemRequestItemMapper;
import main.repository.ItemRepository;
import main.repository.entity.Item;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ItemService {

    private final ItemRepository itemRepository;
    private final ItemItemResponseMapper mapper;
    private final ItemRequestItemMapper itemRequestItemMapper;

    public List<ItemResponseDto> findAll (){
        return itemRepository.findAll().stream()
                .map(mapper::map)
                .collect(Collectors.toList());
    }

    public ItemResponseDto save(ItemRequestDto itemRequestDto) {
        Item item = itemRequestItemMapper.map(itemRequestDto);
        itemRepository.save(item);
        return mapper.map(item);
    }

    public void delete(Integer id) {
        itemRepository.deleteById(id);
    }
}
