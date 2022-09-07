package main.controllers;

import lombok.RequiredArgsConstructor;
import main.controllers.dto.VanzatorResponseDto;
import main.services.VanzatorService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("vanzator")
@RequiredArgsConstructor
public class VanzatorController {

    VanzatorService vanzatorService;

    @GetMapping(value = "all")
    public List<VanzatorResponseDto> findAll(){
        return vanzatorService.findAll();
    }

    @DeleteMapping(value = "{nume}")
    public void delete(@PathVariable(value = "nume") Integer id){
        vanzatorService.delete(id);
    }
}
