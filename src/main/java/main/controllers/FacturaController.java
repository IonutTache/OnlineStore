package main.controllers;


import lombok.RequiredArgsConstructor;
import main.controllers.dto.FacturaRequestDto;
import main.controllers.dto.FacturaResponseDto;
import main.services.FacturaService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("factura")
@RequiredArgsConstructor
public class FacturaController {

    private final FacturaService facturaService;


    @GetMapping("all")
    public List<FacturaResponseDto> findAll(){
        return facturaService.findAll();
    }


    //Te rog sa-mi spui daca controllerul asta este ok
    @PostMapping
    public FacturaResponseDto save(@RequestBody FacturaRequestDto facturaRequestDto){
        return facturaService.save(facturaRequestDto);
    }

    @DeleteMapping(value = "nume")
    public void delete(@PathVariable(value = "nume") Integer id){
        facturaService.delete(id);
    }
}
