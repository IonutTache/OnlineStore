package main.mappers;

import main.controllers.dto.FacturaRequestDto;
import main.controllers.dto.FacturaResponseDto;
import main.repository.entity.Factura;
import org.springframework.stereotype.Component;

@Component
public class FacturaResponseMapper {

    public FacturaResponseDto map(Factura factura){
        return FacturaResponseDto.builder()
                .id(factura.getId())
                .localDateTime(factura.getLocalDateTime())
                .pretFactura(factura.getPretFactura())
                .cumparator(factura.getCumparator())
                .vanzator(factura.getVanzator())
                .produs(factura.getProdus())
                .build();
    }
}
