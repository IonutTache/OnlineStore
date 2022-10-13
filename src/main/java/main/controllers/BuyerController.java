package main.controllers;

import lombok.RequiredArgsConstructor;
import main.controllers.dto.BuyerRequestDto;
import main.controllers.dto.BuyerResponseDto;
import main.services.BuyerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cumparator")
@RequiredArgsConstructor
public class BuyerController {

    private final BuyerService buyerService;

    @GetMapping("all")
    public List<BuyerResponseDto> findAll(){
        return buyerService.findAll();
    }

    @DeleteMapping(value = "nume")
    public void delete(@PathVariable(value = "nume" ) Integer id){
        buyerService.delete(id);
    }

    @PostMapping
    public BuyerResponseDto save(@RequestBody BuyerRequestDto buyerRequestDto){
        return buyerService.save(buyerRequestDto);
    }

}
