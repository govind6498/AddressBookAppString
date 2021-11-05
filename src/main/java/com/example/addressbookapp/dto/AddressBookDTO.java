package com.example.addressbookapp.dto;

public class AddressBookDTO {
	public String name;
	public long moNumber;
	public String email;
	public String city;
	public String state;
	public long zip;
	
	public AddressBookDTO(String name,long moNumber,String email,String city,String state,long zip) {
		this.name= name;
		this.city = city;
		this.state =state;
		this.email = email;
		this.moNumber = moNumber;
		this.zip = zip;
	}
	public String toString() {
		return "Name="+name+" MONumber="+moNumber+" city="+city+" state="+state+" zip="+zip;
	}
}
