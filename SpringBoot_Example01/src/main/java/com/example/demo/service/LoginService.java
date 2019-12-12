package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.controller.Authentication;
import com.example.demo.model.LoginUserObject;

@Service
public class LoginService implements LoginServiceInterface{

	@Override
	public Authentication authenticate(LoginUserObject lo) {
		
		Authentication response=new Authentication();
		response.setUsername(lo.getUsername());
		response.setAuth(false);

		if("deeps".equals(lo.getUsername()) && "123".equals(lo.getPassword()))
		{
			System.out.println("user authenticayted");
			response.setAuth(true);
			response.setMsg("Username and password valid!!");
		}
		
		return response;
	}

}
