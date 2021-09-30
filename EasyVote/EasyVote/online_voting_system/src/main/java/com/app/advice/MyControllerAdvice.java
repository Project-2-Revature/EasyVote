package com.app.advice;

import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.app.exception.ContestantNameNotFound;
import com.app.exception.NameNotFoundException;
import com.app.exception.PartyNamenotfound;
import com.app.exception.VoterAddException;
import com.app.exception.VoterAgeNotFoundException;

@ControllerAdvice
public class MyControllerAdvice {
	
	@ExceptionHandler(VoterAddException.class)
	public ResponseEntity<String> handlingVoterAddException(VoterAddException exception)
	{
		return new ResponseEntity<String>("Invalid input to add a Voter",HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(NoSuchElementException.class)
	public ResponseEntity<String>  hanldeNoSuchElementException(NoSuchElementException elementException)
	{
		return new ResponseEntity<String>("Given Data is not valid..  Please try again..", HttpStatus.NOT_FOUND);
	}
	
//	VoterAgeNotFoundException
	@ExceptionHandler(VoterAgeNotFoundException.class)
	public ResponseEntity<String>  hanldeVoterAgeNotFoundException(VoterAgeNotFoundException elementException)
	{
		return new ResponseEntity<String>("Given Age is not valid..  Please try again..", HttpStatus.NOT_FOUND);
	}
	
//	VoterNameNotFoundException
	@ExceptionHandler(NameNotFoundException.class)
	public ResponseEntity<String>  hanldeNameNotFoundException(NameNotFoundException elementException)
	{
		return new ResponseEntity<String>("Given Name is not valid..  Please try again..", HttpStatus.NOT_FOUND);
	}
	//ContestantNameNotFound
	@ExceptionHandler(ContestantNameNotFound.class)
	public ResponseEntity<String>  hanldeContestantNameNotFoundException(NameNotFoundException elementException)
	{
		return new ResponseEntity<String>("Given Name is not valid..  Please try again..", HttpStatus.NOT_FOUND);

	}
	//PartyNamenotfound
	@ExceptionHandler(PartyNamenotfound.class)
	public ResponseEntity<String>  hanldePartyNameNotFoundException(NameNotFoundException elementException)
	{
		return new ResponseEntity<String>("Given Name is not valid..  Please try again..", HttpStatus.NOT_FOUND);

	}


	

	

//	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> handlingAllException(Exception exception)
	{
		return new ResponseEntity<String>("Exception Haldled",HttpStatus.BAD_REQUEST);
	}

}
