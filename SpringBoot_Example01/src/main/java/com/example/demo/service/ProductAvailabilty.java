package com.example.demo.service;


import com.example.demo.model.ProductChecking;
import com.example.demo.model.ProductObject;

public interface ProductAvailabilty {

	ProductChecking isAvaliable(ProductObject po);
	
}
