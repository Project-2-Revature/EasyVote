package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Contestant;
import com.app.repository.ContestantRepository;
import com.app.service.ContestantSearchService;

@Service
public class ContestantSearchServiceImpl implements ContestantSearchService {
	@Autowired
	public ContestantRepository repository;

	@Override
	public List<Contestant> getAllContestants() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public List<Contestant> getContestantsByName(String name) {
		// TODO Auto-generated method stub
		return repository.findByName(name);
	}

	@Override
	public List<Contestant> getContestantsByPartyName(String partyName) {
		// TODO Auto-generated method stub
		return repository.findByPartyName(partyName);
	}

//	@Override
//	public Contestant getContestantsById(int id) {
//		// TODO Auto-generated method stub
//		return repository.findById(id).get();
//	}

}
