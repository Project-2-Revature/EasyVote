package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.app.exception.NameNotFoundException;
import com.app.model.Contestant;
import com.app.model.Voter;
import com.app.service.ContestantSearchService;

@RestController
@CrossOrigin
public class ContestantSearchController {
	@Autowired
	public ContestantSearchService service;
	
	@GetMapping("/contestants")
	List<Contestant>getAllContestants(){
		return service.getAllContestants();
	}
	@GetMapping("/contestants/name/{name}")
	public List<Contestant>getContestantsByName(@PathVariable String name) throws Exception{
		List<Contestant> contestants=service.getContestantsByName(name);
		if(contestants.size()==0){
			System.out.println("No element Found");
			throw new NameNotFoundException();
		}
		return contestants;
		
	}
	@GetMapping("/contestants/partyName/{partyName}")
	public List<Contestant>getContestantsByPartyName(@PathVariable String partyName ) throws Exception{
		List<Contestant> contestants=service.getContestantsByPartyName(partyName);
		if(contestants.size()==0){
			System.out.println("No element Found");
			throw new NameNotFoundException();
		}
		return contestants;
	}
//	@GetMapping("/contestant/id/{id}")
//	public List<Contestant>getContestantsById(@PathVariable int id){
//		return service.getContestantsById(id);
//	}
	
}
