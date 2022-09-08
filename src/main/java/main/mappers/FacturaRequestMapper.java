package main.mappers;

import main.controllers.dto.FacturaRequestDto;
import main.repository.entity.Factura;
import org.springframework.stereotype.Component;

@Component
public class FacturaRequestMapper {

    public Factura map(FacturaRequestDto facturaRequestDto){
        return Factura.builder()
                .localDateTime(facturaRequestDto.getLocalDateTime())
                .pretFactura(facturaRequestDto.getPretFactura())
                .cumparator(facturaRequestDto.getCumparator())
                .vanzator(facturaRequestDto.getVanzator())
                .produs(facturaRequestDto.getProdus())
                .build();
    }
}
