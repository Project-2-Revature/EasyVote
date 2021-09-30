package com.app.service;

import com.app.model.Contestant;

public interface ContestantCRUDService {
	Contestant addContestant(Contestant contestant );
	Contestant updateContestant(Contestant contestant );
	void deleteContestant(int id );
	void addvote(int id );
}
