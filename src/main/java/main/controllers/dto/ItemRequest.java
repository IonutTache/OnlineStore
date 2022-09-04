package main.controllers.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ItemRequest {

    @NotBlank
    private String name;

    @NotNull
    @Min(10)
    @Schema(description = "Name of the input Model", example = "abc", required = true)
    private Integer age;
}
