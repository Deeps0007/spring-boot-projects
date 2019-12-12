package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Authentication;
import com.example.demo.model.LoginUserObject;
import com.example.demo.model.User;
import com.example.demo.service.LoginServiceInterface;

@RestController
public class LoginController {

	
	@Autowired(required=true)
	private LoginServiceInterface logininterface;
	
/*	
	@GetMapping("/login")
	public User view()
	{
		User u =new User();
		u.setId(07);
		u.setName("Deeps");
		u.setPassword("12345");
		
		return u;
	}
	*/
	
	
	@GetMapping("/login")
	public LoginUserObject getUser()
	{
		return new LoginUserObject();
	}
	
	@PostMapping("/login")
	public Authentication setUser(@RequestBody LoginUserObject lo)
	{	
	
		 return  logininterface.authenticate(lo);
		
	}
	
}
