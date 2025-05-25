package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "AreaOffice")
public class AreaOffice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String ShortName;
    private String Address;
    private String gstin;
    private Long pincode;
    private Long ContactNum;
    private String Email;
	public AreaOffice(int id, String name, String shortName, String address, String gstin, Long pincode,
			Long contactNum, String email) {
		super();
		this.id = id;
		this.name = name;
		ShortName = shortName;
		Address = address;
		this.gstin = gstin;
		this.pincode = pincode;
		ContactNum = contactNum;
		Email = email;
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
	public String getShortName() {
		return ShortName;
	}
	public void setShortName(String shortName) {
		ShortName = shortName;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getGstin() {
		return gstin;
	}
	public void setGstin(String gstin) {
		this.gstin = gstin;
	}
	public Long getPincode() {
		return pincode;
	}
	public void setPincode(Long pincode) {
		this.pincode = pincode;
	}
	public Long getContactNum() {
		return ContactNum;
	}
	public void setContactNum(Long contactNum) {
		ContactNum = contactNum;
	}
	public String getEmail() {
		return Email;
	}
	public String setEmail(String email) {
		return Email = email;
	}
	
    
}
