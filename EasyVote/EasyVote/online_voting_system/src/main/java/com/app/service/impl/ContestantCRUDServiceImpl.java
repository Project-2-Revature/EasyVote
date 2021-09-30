package com.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Contestant;
import com.app.repository.ContestantRepository;

import com.app.service.ContestantCRUDService;

@Service
public class ContestantCRUDServiceImpl implements ContestantCRUDService {
	@Autowired
	private ContestantRepository repository;


	@Override
	public Contestant addContestant(Contestant contestant) {
		// TODO Auto-generated method stub
		return repository.save(contestant);
	}

	@Override
	public Contestant updateContestant(Contestant contestant) {
		// TODO Auto-generated method stub
		return repository.save(contestant);
	}

	@Override
	public void deleteContestant(int id) {
		// TODO Auto-generated method stub
		  repository.deleteById(id);
	}

	@Override
	public void addvote(int id) {
		// TODO Auto-generated method stub
		Contestant c=new Contestant();
		c=repository.findById(id).get();
		c.setVoteCount(c.getVoteCount() + 1 );
		repository.save(c);
		
	}

}
