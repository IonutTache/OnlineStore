package main.controllers;

import lombok.RequiredArgsConstructor;
import main.controllers.dto.ProdusRequestDto;
import main.controllers.dto.ProdusResponseDto;
import main.services.ProdusService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("produs")
@RequiredArgsConstructor
public class ProdusController {

    private  final ProdusService produsService;

    @GetMapping("all")
    public List<ProdusResponseDto> findAll(){
        return produsService.findAll();
    }

    @DeleteMapping(value = "nume")
    public void delete(@PathVariable(value = "nume") Integer id){
        produsService.delete(id);
    }
    @PostMapping
    public ProdusResponseDto save(@RequestParam ProdusRequestDto produsRequestDto){
       return produsService.save(produsRequestDto);
    }
}
