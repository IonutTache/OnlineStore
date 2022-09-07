package main.controllers;

import lombok.RequiredArgsConstructor;
import main.controllers.dto.ProdusResponseDto;
import main.services.ProdusService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("produs")
@RequiredArgsConstructor
public class ProdusController {

    ProdusService produsService;

    @GetMapping("all")
    public List<ProdusResponseDto> findAll(){
        return produsService.findAll();
    }

    @DeleteMapping(value = "nume")
    public void delete(@PathVariable(value = "nume") Integer id){
        produsService.delete(id);

    }
}
