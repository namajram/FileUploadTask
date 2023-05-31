package com.api.entity;

import org.springframework.stereotype.Component;

@Component
public class User {

	private String name;
	private long phoneNo;
	private String email;
	private String address;
	private String gender;
	private String idproof;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getIdproof() {
		return idproof;
	}
	public void setIdproof(String idproof) {
		this.idproof = idproof;
	}
	public User() {}
	public User(String name, long phoneNo, String email, String address, String gender, String idproof) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		this.email = email;
		this.address = address;
		this.gender = gender;
		this.idproof = idproof;
	}
	
}
