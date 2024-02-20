package de.neuefische.springexceptionhandlingtask.exception;

public class CarBrandNotPorscheException extends RuntimeException{
    public CarBrandNotPorscheException(String message){
        super(message);
    }
}