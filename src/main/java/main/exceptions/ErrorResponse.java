package main.exceptions;

import lombok.Value;

import javax.validation.Valid;
import java.util.List;

@Value
public class ErrorResponse {

    String message;
    List<String> detailes;
}
