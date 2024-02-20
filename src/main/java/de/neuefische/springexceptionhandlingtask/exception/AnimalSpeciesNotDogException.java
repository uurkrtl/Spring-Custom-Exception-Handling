package de.neuefische.springexceptionhandlingtask.exception;

public class AnimalSpeciesNotDogException extends RuntimeException{
    public AnimalSpeciesNotDogException(String message){
        super(message);
    }
}