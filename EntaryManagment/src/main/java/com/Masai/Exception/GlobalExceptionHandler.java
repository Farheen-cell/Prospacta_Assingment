package com.Masai.Exception;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(EntaryException.class)
	public ResponseEntity<ExceptionDetails> customeExceptionHandler(EntaryException e,WebRequest w){
		
		ExceptionDetails ditale=new ExceptionDetails();
		ditale.setDate(LocalDate.now());
		ditale.setMessage(e.getMessage());
		ditale.setDetail(w.toString());
		
		return new ResponseEntity<ExceptionDetails>(ditale,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ExceptionDetails> validationExceptionExceptionHandler(MethodArgumentNotValidException e,WebRequest w){
		ExceptionDetails ditale=new ExceptionDetails();
		ditale.setDate(LocalDate.now());
		ditale.setMessage(e.getFieldError().getDefaultMessage());
		ditale.setDetail(w.toString());
		
		return new ResponseEntity<ExceptionDetails>(ditale,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ExceptionDetails> anyExceptionHandler(Exception e,WebRequest w){
		ExceptionDetails ditale=new ExceptionDetails();
		ditale.setDate(LocalDate.now());
		ditale.setMessage(e.getMessage());
		ditale.setDetail(w.toString());
		
	return new	ResponseEntity<ExceptionDetails>(ditale,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(NoHandlerFoundException.class)
	public ResponseEntity<ExceptionDetails> NoHandlerFoundExceptionExceptionHandler(NoHandlerFoundException e,WebRequest w){
		ExceptionDetails ditale=new ExceptionDetails();
		ditale.setDate(LocalDate.now());
		ditale.setMessage(e.getMessage());
		ditale.setDetail(w.toString());
		
	return new	ResponseEntity<ExceptionDetails>(ditale,HttpStatus.BAD_REQUEST);
	
	}
}
