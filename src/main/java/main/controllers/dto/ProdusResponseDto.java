package main.controllers.dto;

import lombok.Builder;
import lombok.Data;
import main.repository.entity.Vanzator;

@Data
@Builder
public class ProdusResponseDto {

    private Integer id;

    private String numeProdus;

    private Double pretProdus;

    private Vanzator vanzator;
}
