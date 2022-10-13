package main.controllers;


import lombok.RequiredArgsConstructor;
import main.controllers.dto.InvoiceRequestDto;
import main.controllers.dto.InvoiceResponseDto;
import main.services.InvoiceService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("factura")
@RequiredArgsConstructor
public class InvoiceController {

    private final InvoiceService invoiceService;


    @GetMapping("all")
    public List<InvoiceResponseDto> findAll(){
        return invoiceService.findAll();
    }

    @PostMapping
    public InvoiceResponseDto save(@RequestBody InvoiceRequestDto invoiceRequestDto){
        return invoiceService.save(invoiceRequestDto);
    }

    @DeleteMapping(value = "nume")
    public void delete(@PathVariable(value = "nume") Integer id){
        invoiceService.delete(id);
    }
}
