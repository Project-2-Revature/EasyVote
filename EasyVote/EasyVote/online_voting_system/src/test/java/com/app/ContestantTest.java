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

import com.app.repository.ContestantRepository;

import com.app.service.ContestantCRUDService;
import com.app.service.ContestantSearchService;


@RunWith(SpringRunner.class)

@SpringBootTest
 class ContestantTest {

	@Autowired
	private ContestantCRUDService service;
	
	@Autowired
	private ContestantSearchService sservice;
	
	@MockBean
	private ContestantRepository repository;
	
	@Test
	public void addContestant() {
		Contestant contestant= new Contestant(2, "ram", 21, "BJP", 789654123258L, "Mumbai", 2, "null", "null");
		when(repository.save(contestant)).thenReturn(contestant);
	assertEquals(contestant,service.addContestant(contestant));
	}
	@Test
	public void updateContestant() {
		Contestant contestant= new Contestant(2, "sita", 21, "BJP", 789654123258L, "Mumbai", 2, "null", "null");
		when(repository.save(contestant)).thenReturn(contestant);
	assertEquals(contestant,service.updateContestant(contestant));
		
	}
	@Test
	public void deleteContestant() {
		Contestant contestant = new Contestant();
		contestant.setId(100);
		service.deleteContestant(contestant.getId());
		verify(repository,times(1)).deleteById(contestant.getId());
		}
	
	

	@Test
	public void getAllContestants() {
		when(repository.findAll()).thenReturn(Stream.of(new Contestant(101, "sai", 23, "YSRCP",127894563212L , "vizag", 5, "null", "null"),new Contestant(102, "devi", 23, "YSRCP",127894563212L , "vizag", 5, "null", "null")).collect(Collectors.toList() ));
		assertEquals(2,sservice.getAllContestants().size());
	}
	@Test
	public void getContestantsByName() {
		String name="rama";
		when(repository.findByName(name)).thenReturn(Stream.of(new Contestant(101, "sai", 23, "YSRCP",127894563212L , "vizag", 5, "null", "null")).collect(Collectors.toList() ));
		assertEquals(1,sservice.getContestantsByName(name).size());

	}
	@Test
	public void getContestantsByPartyName() {
		String partyName="YSRCP";
		when(repository.findByPartyName(partyName)).thenReturn(Stream.of(new Contestant(101, "sai", 23, "YSRCP",127894563212L , "vizag", 5, "null", "null")).collect(Collectors.toList() ));
		assertEquals(1,sservice.getContestantsByPartyName(partyName).size());
	}

		
	}


