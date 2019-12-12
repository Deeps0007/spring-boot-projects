package com.example.demo.service;

import com.example.demo.controller.Authentication;
import com.example.demo.model.LoginUserObject;

public interface LoginServiceInterface {

	
	
	Authentication authenticate(LoginUserObject lo);
}
