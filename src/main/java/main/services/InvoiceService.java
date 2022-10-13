package main.services;

import lombok.RequiredArgsConstructor;
import main.controllers.dto.InvoiceRequestDto;
import main.controllers.dto.InvoiceResponseDto;
import main.mappers.InvoiceRequestMapper;
import main.mappers.InvoiceResponseMapper;
import main.repository.InvoiceRepository;
import main.repository.entity.Invoice;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class InvoiceService {

    private final InvoiceRepository invoiceRepository;

    private final InvoiceResponseMapper mapper;

    private final InvoiceRequestMapper invoiceRequestMapper;



    public List<InvoiceResponseDto> findAll(){
        return  invoiceRepository.findAll().stream()
                .map(mapper::map)
                .collect(Collectors.toList());
    }

    public InvoiceResponseDto save(InvoiceRequestDto invoiceRequestDto){
        Invoice invoice = invoiceRequestMapper.map(invoiceRequestDto);
        invoiceRepository.save(invoice);
        return mapper.map(invoice);

    }

    public void delete(Integer id){
        invoiceRepository.deleteById(id);
    }
}
