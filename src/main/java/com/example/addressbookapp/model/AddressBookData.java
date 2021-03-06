package com.example.addressbookapp.model;

import com.example.addressbookapp.dto.AddressBookDTO;

public class AddressBookData {
	private int addressBookId;
	private String name;
	private String moNumber;
	private String city;
	private String zip;
	private String email;
	private String state;
	
	public AddressBookData() {}
	
	public AddressBookData(int addressBookId,AddressBookDTO addressBookDTO) {
		this.addressBookId = addressBookId;
		this.name = addressBookDTO.name;
		this.moNumber = addressBookDTO.moNumber;
		this.city = addressBookDTO.city;
		this.state = addressBookDTO.state;
		this.email = addressBookDTO.email;
		this.zip = addressBookDTO.zip;
	}
	
	public int getAddressBookId() {
		return addressBookId;
	}
	public void setAddressBookId(int AddressBookId) {
		this.addressBookId = addressBookId;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name= name;
	}
	public String getMobileNumber() {
		return moNumber;
	}
	public void setMobileNumber(String moNumber) {
		this.moNumber = moNumber;
	}
	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return this.state;
	}
	public void setState(String state) {
		this.state=state;
	}
	public String getZip() {
		return this.zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
