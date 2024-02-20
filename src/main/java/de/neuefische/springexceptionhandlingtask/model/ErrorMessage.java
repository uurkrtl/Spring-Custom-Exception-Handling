package de.neuefische.springexceptionhandlingtask.model;

import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

public record ErrorMessage(String apiPath, HttpStatus errorCode, String errorMessage, LocalDateTime errorTime) {
}
