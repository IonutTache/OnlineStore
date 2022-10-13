package main.services;

import lombok.RequiredArgsConstructor;
import main.controllers.dto.BuyerRequestDto;
import main.controllers.dto.BuyerResponseDto;
import main.mappers.BuyerRequestMapper;
import main.mappers.BuyerResponseMapper;
import main.repository.entity.Buyer;
import main.repository.BuyerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BuyerService {

    private final BuyerRepository buyerRepository;
    private final BuyerResponseMapper mapper;
    private final BuyerRequestMapper buyerRequestMapper;


    public List<BuyerResponseDto> findAll(){
        return buyerRepository.findAll().stream()
                .map(mapper::map)
                .collect(Collectors.toList());

    }

    public BuyerResponseDto save(BuyerRequestDto buyerRequestDto){
        Buyer buyer = buyerRequestMapper.map(buyerRequestDto);
        buyerRepository.save(buyer);
        return mapper.map(buyer);
    }

    public void delete(Integer id){
        buyerRepository.deleteById(id);
    }

}
