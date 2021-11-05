package com.example.addressbookapp.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.addressbookapp.dto.AddressBookDTO;
import com.example.addressbookapp.dto.ResponseDTO;
import com.example.addressbookapp.model.AddressBookData;
import com.example.addressbookapp.service.IAddressBookService;

@RestController
@RequestMapping("/addressbookappservice")
public class Controllers {
	@Autowired
	private IAddressBookService addressBookService;
	
	@RequestMapping(value= {"","/","/get"})
	public ResponseEntity<ResponseDTO> getAddressBookData(){
		List<AddressBookData> addressBookList = null;
		addressBookList = addressBookService.getAddressBookData();
		ResponseDTO respDTO = new ResponseDTO("Get call succes",addressBookList);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}
	@GetMapping("/get/{addId}")
	public ResponseEntity<ResponseDTO> getAddressBookData(@PathVariable("addId") int addId){
		AddressBookData addressBookData =  null;
		addressBookData = addressBookService.getAddressBookDataById(addId);
		ResponseDTO respDTO = new ResponseDTO("GET call for ID Successfull",addressBookData);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}
	@PostMapping("/create")
	public ResponseEntity<ResponseDTO> addAddressBookData(@RequestBody AddressBookDTO addressBookDTO){
		AddressBookData addressBookData = null;
		addressBookData = addressBookService.createAddressBookData(addressBookDTO);
		ResponseDTO respDTO = new ResponseDTO("Created AddressBook Data SuccessFull",addressBookData);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}
	@PutMapping("/update/{addId}")
	public ResponseEntity<ResponseDTO> updateAddressBookData(@PathVariable("addId") int addId,@RequestBody AddressBookDTO addressBookDTO){
		AddressBookData addressBookData = addressBookService.updateAddressBookData(addId,addressBookDTO);
		ResponseDTO respDTO = new ResponseDTO("Update AddressBook Data successful:",addressBookData);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}
	@DeleteMapping("/delete/{addId}")
	public ResponseEntity<ResponseDTO>deleteAddressBookData(@PathVariable("addId") int addId){
		addressBookService.deleteAddressBookData(addId);
		ResponseDTO respDTO = new ResponseDTO("Delete AddressBook Data by Id:",addId);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}
}
