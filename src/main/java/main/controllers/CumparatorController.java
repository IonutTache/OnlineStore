package main.controllers;

import lombok.RequiredArgsConstructor;
import main.controllers.dto.CumparatorResponseDto;
import main.services.CumparatorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cumparator")
@RequiredArgsConstructor
public class CumparatorController {

    CumparatorService cumparatorService;

    @GetMapping("all")
    public List<CumparatorResponseDto> findAll(){
        return cumparatorService.findAll();
    }

    @DeleteMapping(value = "nume")
    public void delete(@PathVariable(value = "nume" ) Integer id){
        cumparatorService.delete(id);
    }
}