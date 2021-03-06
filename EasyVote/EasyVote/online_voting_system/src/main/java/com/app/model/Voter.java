package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table
public class Voter {
	@Id
	@GeneratedValue
	private int id ;
	private String name;
	private int age;
	
	private long aadhaarNumber;
	private boolean status;
	private String location;
}
