package main.controllers.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import main.repository.entity.Vanzator;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProdusRequestDto {

    private String numeProdus;

    private Double pretProdus;

    private Vanzator vanzator;
}
