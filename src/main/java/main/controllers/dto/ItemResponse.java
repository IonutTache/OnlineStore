package main.controllers.dto;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class ItemResponse {

    private Integer id;
    private String name;
    private Integer age;
}
