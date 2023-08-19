package com.example.demo.Controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Address;

@RestController
public class ApiController2 {
	
	@GetMapping("/address")
	public List<Address> getAddress()
	{
		return Arrays.asList(
				new Address("sana",314,"Davisdale",643001,"ATC","Nilgiris","TamilNadu","India"),
				new Address("zara",314,"BombayCastle",643001,"ATC","Nilgiris","TamilNadu","India")
				);
	}

}
