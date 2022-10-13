package main.controllers;

import lombok.RequiredArgsConstructor;
import main.controllers.dto.SellerRequestDto;
import main.controllers.dto.SellerResponseDto;
import main.services.SellerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("vanzator")
@RequiredArgsConstructor
public class SellerController {

   private final SellerService sellerService;

    @GetMapping(value = "all")
    public List<SellerResponseDto> findAll(){
        return sellerService.findAll();
    }

    @DeleteMapping(value = "{nume}")
    public void delete(@PathVariable(value = "nume") Integer id){
        sellerService.delete(id);
    }

    //swager
    // POST dau ca pararametru fn ln e-mail, pass si trebuie sa il si returneze
    // nu stiu daca am facut corect
    @PostMapping
    public SellerResponseDto save(@RequestBody SellerRequestDto sellerRequestDto){
        return sellerService.save(sellerRequestDto);

    }
}
