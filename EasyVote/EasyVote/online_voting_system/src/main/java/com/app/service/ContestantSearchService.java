package com.app.service;

import java.util.List;

import com.app.model.Contestant;

public interface ContestantSearchService {
	List<Contestant>getAllContestants();
	List<Contestant>getContestantsByName(String name);
	List<Contestant>getContestantsByPartyName(String partyName);
	//Contestant getContestantsById(int id);
	

}
