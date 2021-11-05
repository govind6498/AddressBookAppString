package com.example.addressbookapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.addressbookapp.dto.AddressBookDTO;
import com.example.addressbookapp.model.AddressBookData;

@Service
public interface IAddressBookService {
	List<AddressBookData> getAddressBookData();
	AddressBookData getAddressBookDataById(int addId);
	AddressBookData createAddressBookData(AddressBookDTO addresBookDTO);
	AddressBookData updateAddressBookData(int addId,AddressBookDTO addressBookDTO);
	void deleteAddressBookData(int addId);
}
