package main.services;

import lombok.RequiredArgsConstructor;
import main.controllers.dto.SellerRequestDto;
import main.controllers.dto.SellerResponseDto;
import main.mappers.SellerRequestMapper;
import main.mappers.SellerResponseMapper;
import main.repository.entity.Seller;
import main.repository.SellerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SellerService {

    private final SellerRepository sellerRepository;

    private final SellerResponseMapper mapper;

    private final SellerRequestMapper sellerRequestMapper;


    public List<SellerResponseDto> findAll(){
        return sellerRepository.findAll().stream()
                .map(mapper:: map)
                .collect(Collectors.toList());
    }

    public SellerResponseDto save(SellerRequestDto sellerRequestDto){
        Seller seller = sellerRequestMapper.map(sellerRequestDto);
        sellerRepository.save(seller);
        return mapper.map(seller);
    }

    public void delete(Integer id){
        sellerRepository.deleteById(id);
    }
}
