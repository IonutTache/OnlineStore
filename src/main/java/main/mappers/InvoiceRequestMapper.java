package main.mappers;

import main.controllers.dto.InvoiceRequestDto;
import main.repository.entity.Invoice;
import org.springframework.stereotype.Component;

@Component
public class InvoiceRequestMapper {

    public Invoice map(InvoiceRequestDto invoiceRequestDto){
        return Invoice.builder()
                .localDateTime(invoiceRequestDto.getLocalDateTime())
                .invoiceAmount(invoiceRequestDto.getInvoiceAmount())
                .buyer(invoiceRequestDto.getBuyer())
                .seller(invoiceRequestDto.getSeller())
                .product(invoiceRequestDto.getProducts())
                .build();
    }
}
