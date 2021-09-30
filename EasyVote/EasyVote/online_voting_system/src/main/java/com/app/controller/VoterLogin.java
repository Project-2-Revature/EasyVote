package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Voter;
import com.app.repository.VoterRepository;

@RestController
@CrossOrigin
public class VoterLogin {

		@Autowired
		private VoterRepository service;
		
		@PostMapping("/voterlogin")
		public Voter loginValidation(@RequestBody Voter voter){
//			Voter c = new Voter();
//		 boolean flag = false;
//			c = service.findById(voter.getId());
//			if (c.getAadhaarNumber()==(voter.getAadhaarNumber())) {
//				flag = true;
//			}
////			if (flag) {
//		return c;
////			} else {
////				throw new Exception();
////			}
			
			Voter voter2=service.findVoterByIdAndAadhaarNumber(voter.getId(),voter.getAadhaarNumber());
			if(voter2==null)
			{
//				throw new 				
			}
			return voter2;
		}
}

	
