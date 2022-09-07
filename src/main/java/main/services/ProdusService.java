package main.services;


import lombok.RequiredArgsConstructor;
import main.controllers.dto.ProdusRequestDto;
import main.controllers.dto.ProdusResponseDto;
import main.mappers.ProdusRequestMapper;
import main.mappers.ProdusResponseMapper;
import main.repository.ProdusRepository;
import main.repository.entity.Produs;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProdusService {

    private final ProdusRepository produsRepository;

    private final ProdusResponseMapper mapper;

    private final ProdusRequestMapper produsRequestMapper;

    public List<ProdusResponseDto> findAll (){
        return produsRepository.findAll().stream()
                .map(mapper::map)
                .collect(Collectors.toList());
    }

    public ProdusResponseDto save(ProdusRequestDto produsRequestDto) {
        Produs produs =  produsRequestMapper.map(produsRequestDto);
        produsRepository.save(produs);
        return mapper.map(produs);
    }

    public void delete(Integer id){
        produsRepository.deleteById(id);
    }
}
