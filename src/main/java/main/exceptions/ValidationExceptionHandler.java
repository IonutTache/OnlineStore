package main.exceptions;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.validation.ConstraintViolationException;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.http.HttpStatus.BAD_REQUEST;

@Slf4j //nu raporteaza eroarea la client direct
@RestControllerAdvice //asta proceseaza exceptii
public class ValidationExceptionHandler extends ResponseEntityExceptionHandler {

//   Exceptii custom pe care le raportez la client
//    @ExceptionHandler(MyCustomException.class)
//    public ResponseEntity<Object> handleCustomBusinessException(ConstraintViolationException e) {
//        return new ResponseEntity<>(e.getMessage(), BAD_REQUEST);
//    }



    //meacanismul default ala springului de a da detalii la erori catre clienti(la intrarea datelor)
@Override
protected ResponseEntity<Object> handleMethodArgumentNotValid  (
        MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
    log.error("eroare de validare",ex);
    List<String> details = new ArrayList<>();
    for(ObjectError error : ex.getBindingResult().getAllErrors()) {
        details.add(error.toString());
    }
    ErrorResponse error = new ErrorResponse("Validation Failed", details);
    return new ResponseEntity(error, HttpStatus.BAD_REQUEST);
}


}
