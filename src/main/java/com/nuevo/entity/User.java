package com.nuevo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class User {
	@Id
	@GeneratedValue
	private int id;
	
	private String name;
	
	private String passwd;
	
	private String email;	

}
