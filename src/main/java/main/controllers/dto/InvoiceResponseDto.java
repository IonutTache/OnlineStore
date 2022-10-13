package main.controllers.dto;

import lombok.Builder;
import lombok.Data;
import main.repository.entity.Buyer;
import main.repository.entity.Product;
import main.repository.entity.Seller;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
public class InvoiceResponseDto {

    private Integer id;

    private LocalDateTime localDateTime;

    private Double invoiceAmount;

    private Buyer buyer;

    private Seller seller;

    private List<Product> products;

}
