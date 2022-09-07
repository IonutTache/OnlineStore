package main.services;

import lombok.RequiredArgsConstructor;
import main.controllers.dto.CumparatorRequestDto;
import main.controllers.dto.CumparatorResponseDto;
import main.mappers.CumparatorRequestMapper;
import main.mappers.CumparatorResponseMapper;
import main.repository.entity.Cumparator;
import main.repository.CumparatorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CumparatorService {

    private final CumparatorRepository cumparatorRepository;
    private final CumparatorResponseMapper mapper;
    private final CumparatorRequestMapper cumparatorRequestMapper;


    public List<CumparatorResponseDto> findAll(){
        return cumparatorRepository.findAll().stream()
                .map(mapper::map)
                .collect(Collectors.toList());

    }

    public CumparatorResponseDto save(CumparatorRequestDto cumparatorRequestDto){
        Cumparator cumparator = cumparatorRequestMapper.map(cumparatorRequestDto);
        cumparatorRepository.save(cumparator);
        return mapper.map(cumparator);
    }

    public void delete(Integer id){
        cumparatorRepository.deleteById(id);
    }

}
