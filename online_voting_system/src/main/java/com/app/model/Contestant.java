package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table
public class Contestant {
	private int id;
	private String name;
	private String partyName ;
	private long aadhaarNumber ;
	private String location ;
	
	@Lob
	@Column(columnDefinition = "CLOB")
	private String partyLogo;
	private String contestantImage ;

}
