package main.controllers;

import lombok.RequiredArgsConstructor;
import main.controllers.dto.ItemRequest;
import main.controllers.dto.ItemResponse;
import main.repository.entity.Item;
import main.services.ItemService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("item")
@RequiredArgsConstructor
@Validated
public class ItemController {

    private final ItemService itemService;

    @GetMapping(value = "all")
    public List<ItemResponse> findAll(){
        return itemService.findAll();
    }

    @PostMapping
  //  @PatchMapping //clientul este responsabil sa trimita un json(payload) la server.tre' sa specifice id-ul,noul continut care rescrie pe cel precedent; folosit exclusiv ptr UPDATE
    public ItemResponse save (@RequestBody @Valid ItemRequest itemRequest){
        return itemService.save(itemRequest);
    }

    @DeleteMapping(value = "{nume}")
    public void delete(@PathVariable(value = "nume") Integer id){
        itemService.delete(id);
    }
}
