package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Contestant;

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
	public List<Contestant>getContestantsByName(@PathVariable String name){
		return service.getContestantsByName(name);
	}
	@GetMapping("/contestants/partyName/{partyName}")
	public List<Contestant>getContestantsByPartyName(@PathVariable String name){
		return service.getContestantsByPartyName(name);
	}
//	@GetMapping("/contestant/id/{id}")
//	public List<Contestant>getContestantsById(@PathVariable int id){
//		return service.getContestantsById(id);
//	}
	

}
