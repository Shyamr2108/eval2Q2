package com.masai.webapp.example.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class User {

	@Id
	private int id;
	private String name;
	private String phoneNo;
	private String dateOfBirth;
	@OneToOne(cascade=CascadeType.ALL)
	@JsonManagedReference
	private Email email;
	
	public User() {}

	public User(int id, String name, String phoneNo, String dateOfBirth, Email email) {
		super();
		this.id = id;
		this.name = name;
		this.phoneNo = phoneNo;
		this.dateOfBirth = dateOfBirth;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Email getEmail() {
		return email;
	}

	public void setEmail(Email email) {
		this.email = email;
	}
	
	
}
