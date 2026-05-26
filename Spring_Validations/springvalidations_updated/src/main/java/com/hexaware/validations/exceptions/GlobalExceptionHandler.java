package com.hexaware.validations.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

	
	/*
	 * @ExceptionHandler(StudentNotFoundException.class)
	 * 
	 * @ResponseStatus(reason = "student not found" , code = HttpStatus.NOT_FOUND)
	 * public void handler() {
	 * 
	 * log.error("Student Not Found Exp occur");
	 * 
	 * 
	 * }
	 * 
	 * 
	 * @ExceptionHandler(MethodArgumentNotValidException.class)
	 * 
	 * @ResponseStatus(reason = "Input validation failed" , code =
	 * HttpStatus.BAD_REQUEST) public void handleValidations() {
	 * 
	 * 
	 * log.error("validation failed");
	 * 
	 * }
	 */
	
}
