package com.example.addressbookapp.Controllers;

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

@RestController
@RequestMapping("/addressbookappservice")
public class Controllers {
	@RequestMapping(value= {"","/","/get"})
	public ResponseEntity<String>gerAddressBookData(){
		return new ResponseEntity<String>("Get call Successfull",HttpStatus.OK);
	}
	@GetMapping("/get/{addId}")
	public ResponseEntity<String>getAddressBookData(@PathVariable("addId") int addId){
		return new ResponseEntity<String>("Create Address Book Data for:"+addId,HttpStatus.OK);
	}
	@PostMapping("/create")
	public ResponseEntity<String>addAddressBookData(@RequestBody AddressBookDTO addressBookDTO){
		return new ResponseEntity<String>("Create AddressBookData for:"+addressBookDTO,HttpStatus.OK);
	}
	@PutMapping("/update")
	public ResponseEntity<String>updateAddressBookData(@RequestBody AddressBookDTO  addressBookDTO){
		return new ResponseEntity<String>("Update AddressBook Data for:"+addressBookDTO,HttpStatus.OK);
	}
	@DeleteMapping("/delete/{addId}")
	public ResponseEntity<String>updateAddressBookData(@PathVariable("addId") int addId){
		return new ResponseEntity<String>("Delete Call Success for Id:"+addId,HttpStatus.OK);
	}
}
