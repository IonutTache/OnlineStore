package main.controllers.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import main.repository.entity.Cumparator;
import main.repository.entity.Produs;
import main.repository.entity.Vanzator;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FacturaRequestDto {

    private LocalDateTime localDateTime;

    private Double pretFactura;

    private Cumparator cumparator;

    private Vanzator vanzator;

    private List<Produs> produs;



}
