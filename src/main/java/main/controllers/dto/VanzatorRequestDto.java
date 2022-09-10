package main.controllers.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import main.repository.entity.Produs;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class VanzatorRequestDto {

    private String firstName;

    private String lastName;

    //private List<Produs> produs;



}
