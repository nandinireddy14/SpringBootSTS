package cgg.spring.problemdetails.exceptions;

import java.net.URI;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	//handler for 
	@ExceptionHandler(AgeNotValidException.class)
	public ResponseEntity<ProblemDetail> handleAgeNotValidException(AgeNotValidException e){
		ProblemDetail details =  ProblemDetail.forStatus(HttpStatus.INTERNAL_SERVER_ERROR);
		details.setTitle(e.getMessage());
		details.setDetail("age is not valid to cast vote");
		details.setType(URI.create("http:/localhost:8080/errors"));
		details.setProperty("host", "localhost");
		details.setProperty("port",8080);
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(details);
	}
}
