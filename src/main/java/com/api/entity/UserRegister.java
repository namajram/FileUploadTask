package com.api.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity
public class UserRegister {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private long phoneNo;
	private String email;
	private String address;
	private String gender;
	private String idproof;
	

	
	@Lob
	@Column(name = "imagedata")
	private String imageData;
	private String fileName;
	private String fileType;
	
		public String getIdproof() {
		return idproof;
	}
	public void setIdproof(String idproof) {
		this.idproof = idproof;
	}
		public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getFileType() {
		return fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
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

	
	
	public String getImageData() {
		return imageData;
	}
	public void setImageData(String imageData) {
		this.imageData = imageData;
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
	public UserRegister() {}
	public UserRegister(Long id, String name, long phoneNo, String email, String address, String gender, String idproof,
			String imageData, String fileName, String fileType) {
		super();
		this.id = id;
		this.name = name;
		this.phoneNo = phoneNo;
		this.email = email;
		this.address = address;
		this.gender = gender;
		this.idproof = idproof;
		this.imageData = imageData;
		this.fileName = fileName;
		this.fileType = fileType;
	}
	

	

}
