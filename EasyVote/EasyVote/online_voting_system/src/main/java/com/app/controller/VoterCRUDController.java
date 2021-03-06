package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.exception.VoterAddException;
import com.app.model.Voter;
import com.app.service.VoterCRUDService;

@RestController
@CrossOrigin
public class VoterCRUDController {



	@Autowired
	private VoterCRUDService service;
	
	@PostMapping("/voter")
	public Voter addVoter(@RequestBody Voter voter) throws Exception{
		
		Voter voter2=service.addVoter(voter);
		if(voter2==null) {
			throw new VoterAddException();
		} 
		return voter2;
	}

	@PutMapping("/voter")
	public Voter updateVoter(@RequestBody Voter voter) {
		// TODO Auto-generated method stub
		return service.updateVoter(voter);
	}

//	@GetMapping("/voter/{id}")
//	public Voter getPlayerById(@PathVariable int id) {
//		// TODO Auto-generated method stub
//		return service.getVoterById(id);
//	}

	@DeleteMapping("/voter/{id}")
	public void deleteVoter(@PathVariable int id) {
		// TODO Auto-generated method stub
		service.deleteVoter(id);
	}


	

}
