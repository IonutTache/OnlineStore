package main.controllers;

import lombok.RequiredArgsConstructor;
import main.controllers.dto.VanzatorRequestDto;
import main.controllers.dto.VanzatorResponseDto;
import main.services.VanzatorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("vanzator")
@RequiredArgsConstructor
public class VanzatorController {

   private final VanzatorService vanzatorService;

    @GetMapping(value = "all")
    public List<VanzatorResponseDto> findAll(){
        return vanzatorService.findAll();
    }

    @DeleteMapping(value = "{nume}")
    public void delete(@PathVariable(value = "nume") Integer id){
        vanzatorService.delete(id);
    }

    //swager
    // POST dau ca pararametru fn ln e-mail, pass si trebuie sa il si returneze
    // nu stiu daca am facut corect
    @PostMapping
    public VanzatorResponseDto save(@RequestBody VanzatorRequestDto vanzatorRequestDto){
        return vanzatorService.save(vanzatorRequestDto);

    }
}
