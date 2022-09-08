package main.services;

import lombok.RequiredArgsConstructor;
import main.controllers.dto.VanzatorRequestDto;
import main.controllers.dto.VanzatorResponseDto;
import main.mappers.VanzatorRequestMapper;
import main.mappers.VanzatorResponseMapper;
import main.repository.entity.Vanzator;
import main.repository.VanzatorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class VanzatorService {

    private final VanzatorRepository vanzatorRepository;

    private final VanzatorResponseMapper mapper;

    private final VanzatorRequestMapper vanzatorRequestMapper;


    public List<VanzatorResponseDto> findAll(){
        return vanzatorRepository.findAll().stream()
                .map(mapper:: map)
                .collect(Collectors.toList());
    }

    public VanzatorResponseDto save(VanzatorRequestDto vanzatorRequestDto){
        Vanzator vanzator = vanzatorRequestMapper.map(vanzatorRequestDto);
        vanzatorRepository.save(vanzator);
        return mapper.map(vanzator);
    }

    public void delete(Integer id){
        vanzatorRepository.deleteById(id);
    }
}
