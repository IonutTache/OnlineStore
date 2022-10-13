package main.controllers;

import lombok.RequiredArgsConstructor;
import main.controllers.dto.ProductRequestDto;
import main.controllers.dto.ProductResponseDto;
import main.services.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("produs")
@RequiredArgsConstructor
public class ProductController {

    private  final ProductService productService;

    @GetMapping("all")
    public List<ProductResponseDto> findAll(){
        return productService.findAll();
    }

    @DeleteMapping(value = "nume")
    public void delete(@PathVariable(value = "nume") Integer id){
        productService.delete(id);
    }
    @PostMapping
    public ProductResponseDto save(@RequestParam ProductRequestDto productRequestDto){
       return productService.save(productRequestDto);
    }
}
