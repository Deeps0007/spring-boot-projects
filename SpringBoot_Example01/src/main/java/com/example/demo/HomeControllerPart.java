package com.example.demo;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeControllerPart {

	
	@GetMapping("/")
	public String view()
	{
		return "Welcome to the Home page !! ";
	}
	
	@GetMapping("/info")
	public Information view2()
	{
		Information i=new Information();
		i.setName("Rest Api");
		i.setEmail("info@api.com");
		i.setDob(new Date());
	
		Address a=new Address();
		a.setStreetNumber("23A");
		a.setCity("Noida");
		a.setCountry("India");
		a.setZipCode("201010");
		i.setAddress(a);
		return i;
	}
	
	
}
