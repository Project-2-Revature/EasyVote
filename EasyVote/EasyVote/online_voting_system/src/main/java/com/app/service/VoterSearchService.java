package com.app.service;

import java.util.List;

import com.app.model.Voter;

public interface VoterSearchService {
	
	List<Voter> getAllVoters();
	List<Voter> getVotersByName(String name);
	List<Voter> getVotersByAge(int age);
	Voter getVotersById(int id );
	//List<Voter> getVotersByLocation(String location);
	//List<Voter> getVotersByAadhaarNumber(long AadhaarNumber );
	Voter findVoterByIdAndAadhaarNumber(int id,long aadhaarNumber);

}
