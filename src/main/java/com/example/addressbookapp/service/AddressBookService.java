package com.example.addressbookapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.addressbookapp.dto.AddressBookDTO;
import com.example.addressbookapp.dto.ResponseDTO;
import com.example.addressbookapp.model.AddressBookData;

@Service
public class AddressBookService implements IAddressBookService {
	
	private List<AddressBookData> addressBookList =new ArrayList<>();
	
	@Override
	public List<AddressBookData> getAddressBookData() {
		return addressBookList;
	}

	@Override
	public AddressBookData getAddressBookDataById(int addId) {
		return addressBookList.get(addId-1);
	}

	@Override
	public AddressBookData createAddressBookData(AddressBookDTO addressBookDTO) {
		AddressBookData addressBookData =  null;
		addressBookData = new AddressBookData(addressBookList.size()+1,addressBookDTO);
		addressBookList.add(addressBookData);
		return addressBookData;
	}

	@Override
	public AddressBookData updateAddressBookData(int addId, AddressBookDTO addressBookDTO) {
		AddressBookData addressBookData = this.getAddressBookDataById(addId);
		addressBookData.setName(addressBookDTO.name);
		addressBookData.setMobileNumber(addressBookDTO.moNumber);
		addressBookData.setCity(addressBookDTO.city);
		addressBookData.setState(addressBookDTO.state);
		addressBookData.setEmail(addressBookDTO.email);
		addressBookData.setZip(addressBookDTO.zip);
		addressBookList.set(addId-1, addressBookData);
		return addressBookData;
	}

	@Override
	public void deleteAddressBookData(int addId) {
		addressBookList.remove(addId-1);
		
	}

}
