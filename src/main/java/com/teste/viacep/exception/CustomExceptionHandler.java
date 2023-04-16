package com.teste.viacep.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class ExceptionHandler {

  @org.springframework.web.bind.annotation.ExceptionHandler(AddressNotFoundException.class)
  public ResponseEntity<ErrorResponse> handleCustomException(AddressNotFoundException ex) {
    ErrorResponse error = new ErrorResponse(HttpStatus.BAD_REQUEST.value(), ex.getMessage());
    return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
  }

  @ExceptionHandler(Exception.class)
  public ResponseEntity<ErrorResponse> handleException(Exception ex) {
    ErrorResponse error = new ErrorResponse(HttpStatus.INTERNAL_SERVER_ERROR.value(), "Ocorreu um erro inesperado");
    return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
  }
}
