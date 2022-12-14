package main.controllers.dto;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class BuyerResponseDto {

    private Integer id;

    private String firstName;

    private String secondName;

    private String email;

    private String password;
}
