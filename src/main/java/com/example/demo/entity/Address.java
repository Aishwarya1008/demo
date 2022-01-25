package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer addressId;
	private String house;
	private String street;
	@OneToOne(mappedBy = "address")
	private User user;
	@OneToOne(mappedBy = "address")
	private Company companyAddress;
	
	public String getHouse() {
		return house;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Company getCompanyAddress() {
		return companyAddress;
	}
	public void setCompanyAddress(Company companyAddress) {
		this.companyAddress = companyAddress;
	}
	public void setHouse(String house) {
		this.house = house;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
}
