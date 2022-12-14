package main.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import main.controllers.dto.ItemRequestDto;
import main.controllers.dto.ItemResponseDto;
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

    // asa creeaza documentatie pentru client;in cazul de fata doar documentatie pentru GET
    @Operation(summary = "GET request documentation", description = "full documentation of this GET request")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "all good on POST"),
            @ApiResponse(responseCode = "400", description = "Bad boy GET request")
    }
    )
    @GetMapping(value = "all")
    public List<ItemResponseDto> findAll(){
        return itemService.findAll();
    }

    @PostMapping
  //  @PatchMapping //clientul este responsabil sa trimita un json(payload) la server.trebuie sa specifice id-ul,noul continut care rescrie pe cel precedent; folosit exclusiv ptr UPDATE
    public ItemResponseDto save (@RequestBody @Valid @Parameter(description =
            "Documented Model used as input for GET") ItemRequestDto itemRequestDto){
        return itemService.save(itemRequestDto);
    }

    @DeleteMapping(value = "{nume}")
    public void delete(@PathVariable(value = "nume") Integer id){
        itemService.delete(id);
    }
}
