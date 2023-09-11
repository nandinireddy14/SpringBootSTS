package cgg.spring.problemdetails.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cgg.spring.problemdetails.exceptions.AgeNotValidException;
import cgg.spring.problemdetails.services.VoteService;

@RestController
@RequestMapping("/vote")
public class VoteController {

	@Autowired
	private VoteService voteService;
	
	@PostMapping
	public ResponseEntity<?> vote(@RequestParam("age") int age){
		
		if(age<18) {
			throw new AgeNotValidException("Age not valid");
			
		}
		this.voteService.vote(age);
		return ResponseEntity.ok("voted");
		
		
	}
}
