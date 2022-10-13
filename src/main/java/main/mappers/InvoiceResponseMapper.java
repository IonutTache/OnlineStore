package main.mappers;

import main.controllers.dto.InvoiceResponseDto;
import main.repository.entity.Invoice;
import org.springframework.stereotype.Component;

@Component
public class InvoiceResponseMapper {

    public InvoiceResponseDto map(Invoice invoice){
        return InvoiceResponseDto.builder()
                .id(invoice.getId())
                .localDateTime(invoice.getLocalDateTime())
                .invoiceAmount(invoice.getInvoiceAmount())
                .buyer(invoice.getBuyer())
                .seller(invoice.getSeller())
                .products(invoice.getProduct())
                .build();
    }
}
