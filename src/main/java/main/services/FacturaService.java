package main.services;

import lombok.RequiredArgsConstructor;
import main.controllers.dto.FacturaRequestDto;
import main.controllers.dto.FacturaResponseDto;
import main.mappers.FacturaRequestMapper;
import main.mappers.FacturaResponseMapper;
import main.repository.FacturaRepository;
import main.repository.entity.Factura;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class FacturaService {

    private final FacturaRepository facturaRepository;

    private final FacturaResponseMapper mapper;

    private final FacturaRequestMapper facturaRequestMapper;



    public List<FacturaResponseDto> findAll(){
        return  facturaRepository.findAll().stream()
                .map(mapper::map)
                .collect(Collectors.toList());
    }

    public FacturaResponseDto save(FacturaRequestDto facturaRequestDto){
        Factura factura = facturaRequestMapper.map(facturaRequestDto);
        facturaRepository.save(factura);
        return mapper.map(factura);

    }

    public void delete(Integer id){
        facturaRepository.deleteById(id);
    }
}
