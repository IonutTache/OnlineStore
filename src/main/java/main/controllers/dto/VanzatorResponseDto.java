package main.controllers.dto;

import lombok.Builder;
import lombok.Data;
import main.repository.entity.Produs;

import java.util.List;

@Data
@Builder
public class VanzatorResponseDto {

    private Integer id;

    private String firstName;

    private String lastName;

    private List<Produs> produs;

    private String email;

    private String password;

}
