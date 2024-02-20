package de.neuefische.springexceptionhandlingtask.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(CarBrandNotPorscheException.class)
    public ResponseEntity<String> handleCarBrandNotPorscheException(CarBrandNotPorscheException ex){
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(AnimalSpeciesNotDogException.class)
    public ResponseEntity<String> handleAnimalSpeciesNotDogException(AnimalSpeciesNotDogException ex){
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }
}