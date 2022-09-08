package main.controllers.dto;

import lombok.Builder;
import lombok.Data;
import main.repository.entity.Cumparator;
import main.repository.entity.Produs;
import main.repository.entity.Vanzator;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
public class FacturaResponseDto {

    private Integer id;

    private LocalDateTime localDateTime;

    private Double pretFactura;

    private Cumparator cumparator;

    private Vanzator vanzator;

    private List<Produs> produs;

}
