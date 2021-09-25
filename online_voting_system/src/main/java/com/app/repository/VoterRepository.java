package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.app.model.Voter;

@Repository
public interface VoterRepository  extends JpaRepository <Voter , Integer>{
	
	List<Voter> findByName(String name);
	List<Voter> findByAge(int age);
//	List<Voter> findById(int id);
	//Voter updateById(int id);
	
	




}
