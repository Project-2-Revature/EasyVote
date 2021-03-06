package com.app.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.app.exception.NameNotFoundException;
import com.app.exception.VoterAgeNotFoundException;
import com.app.model.Voter;
import com.app.service.VoterSearchService;




@RestController
@CrossOrigin
public class VoterSearchController {
	

		@Autowired
		private VoterSearchService service;
		
		@GetMapping("/voters")
		public List<Voter> getAllVoters() {
			// TODO Auto-generated method stub
			return service.getAllVoters();
		}

		@GetMapping("/voters/name/{name}")
		public List<Voter> getVotersByName(@PathVariable String name) throws Exception {
			// TODO Auto-generated method stub
			List<Voter> voters=service.getVotersByName(name);
			if(voters.size()==0){
				System.out.println("No element Found");
				throw new NameNotFoundException();
			}
			return voters;
		}

		@GetMapping("/voters/age/{age}")
		public List<Voter> getVotersByAge(@PathVariable int age) {
			// TODO Auto-generated method stub
			List<Voter> voters=service.getVotersByAge(age);
			if(voters.size()==0) {
				throw new VoterAgeNotFoundException();
			}
			return voters;
		}
//		@GetMapping("/voters/id/{id}")
//		public List<Voter> getVotersById(@PathVariable int id) {
//			// TODO Auto-generated method stub
//			return service.getVotersById(id);
//		}
//		
		

}
