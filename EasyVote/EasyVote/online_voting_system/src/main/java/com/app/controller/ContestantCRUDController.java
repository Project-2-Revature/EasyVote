package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Contestant;
import com.app.service.ContestantCRUDService;

@RestController
@CrossOrigin
public class ContestantCRUDController {
	@Autowired
	public ContestantCRUDService service;
	
	@PostMapping("/contestant")
	public Contestant addContestant(@RequestBody Contestant contestant) {
		return service.addContestant(contestant);
		
	}
	@PutMapping("/contestant")
	public Contestant updateContestant(@RequestBody Contestant contestant){
		return service.updateContestant(contestant);
		
	}
	@DeleteMapping("/contestant/{id}")
	public void deleteContestant(@PathVariable int id){
		 service.deleteContestant(id);
		
	}
	@PostMapping("/contestant/{id}")
	public void addVote(@PathVariable int id) {
		service.addvote(id);
	}
	

	

}
