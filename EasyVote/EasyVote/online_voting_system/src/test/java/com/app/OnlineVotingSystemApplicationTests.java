package com.app;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.app.model.Contestant;
import com.app.model.Voter;
import com.app.repository.VoterRepository;
import com.app.service.ContestantSearchService;
import com.app.service.VoterCRUDService;
import com.app.service.VoterSearchService;


@RunWith(SpringRunner.class)

@SpringBootTest
class OnlineVotingSystemApplicationTests {
	@Autowired
	private VoterCRUDService service;

	@Autowired
	private VoterSearchService vsservice;
	
	
	@MockBean
	private VoterRepository repository;
	@Test
	public void addVoter() {
		Voter voter1=new Voter(200,"lakshmi",23,784568234517L,false,"Orisha");
		when(repository.save(voter1)).thenReturn(voter1);
	assertEquals(voter1,service.addVoter(voter1));
	}
	
	@Test
	public void updateVoter() {
		Voter voter1=new Voter(200,"Lucky",23,784568234517L,false,"Orissa");
		when(repository.save(voter1)).thenReturn(voter1);
	assertEquals(voter1,service.updateVoter(voter1));
	}
	
	@Test
	public void deleteVoterTest() {
	Voter c=new Voter();
	c.setId(100);
	service.deleteVoter(c.getId());
	verify(repository,times(1)).deleteById(c.getId());
	}
	@Test
	public void getAllVoters() {
		when(repository.findAll()).thenReturn(Stream.of(new Voter(12, "anshu", 21, 789456124785L, false,"Hyd")).collect(Collectors.toList() ));
		assertEquals(1,vsservice.getAllVoters().size());
	}
	@Test
	public void getVotersByName() {
		String name="anshu";

		when(repository.findByName(name)).thenReturn(Stream.of(new Voter(12, "anshu", 21, 789456124785L, false,"Hyd")).collect(Collectors.toList() ));
		assertEquals(1,vsservice.getVotersByName(name).size());
	}
	@Test
	public void getVotersByAge() {
		int age1=21;

		when(repository.findByAge(age1)).thenReturn(Stream.of(new Voter(12, "anshu", 21, 789456124785L, false,"Hyd")).collect(Collectors.toList() ));
		assertEquals(1,vsservice.getVotersByAge(age1).size());
	}
	
	

}
