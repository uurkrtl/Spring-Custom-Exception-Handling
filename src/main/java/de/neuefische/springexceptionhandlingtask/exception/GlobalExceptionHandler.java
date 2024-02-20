package de.neuefische.springexceptionhandlingtask.exception;

import de.neuefische.springexceptionhandlingtask.model.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;

@ControllerAdvice
public class GlobalExceptionHandler {

    //Local Exceptions
    /*
    @ExceptionHandler(CarBrandNotPorscheException.class)
    public ResponseEntity<String> handleCarBrandNotPorscheException(CarBrandNotPorscheException ex){
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(AnimalSpeciesNotDogException.class)
    public ResponseEntity<String> handleAnimalSpeciesNotDogException(AnimalSpeciesNotDogException ex){
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }
     */


    @ExceptionHandler(CarBrandNotPorscheException.class)
    public ResponseEntity<ErrorMessage> handleCarBrandNotPorscheException (CarBrandNotPorscheException ex, WebRequest webRequest){
        ErrorMessage errorMessage = new ErrorMessage(
                webRequest.getDescription(false),
                HttpStatus.BAD_REQUEST,
                ex.getMessage(),
                LocalDateTime.now()
        );
        return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(AnimalSpeciesNotDogException.class)
    public ResponseEntity<ErrorMessage> handleAnimalSpeciesNotDogException (AnimalSpeciesNotDogException ex, WebRequest webRequest){
        ErrorMessage errorMessage = new ErrorMessage(
                webRequest.getDescription(false),
                HttpStatus.BAD_REQUEST,
                ex.getMessage(),
                LocalDateTime.now()
        );
        return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<String> handleRuntimeException(RuntimeException exception){
        return new ResponseEntity<>(exception.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}