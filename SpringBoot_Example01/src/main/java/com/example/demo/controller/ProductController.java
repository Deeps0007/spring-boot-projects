package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Product;
import com.example.demo.model.ProductChecking;
import com.example.demo.model.ProductObject;
import com.example.demo.service.ProductAvailabilty;

@RestController
public class ProductController {

	@Autowired
	private ProductAvailabilty pv;
	
	@GetMapping("/product")
	public Product view()
	{
		Product p=new Product();
		p.setProductName("Watch");
		p.setPrice("999");
		p.setQuality("Model 2 ");
		
		return p;
		
		
		
	}
	
	
	@PostMapping("/productinfo")
	public ProductChecking view2(@RequestBody ProductObject po)
	{
		return pv.isAvaliable(po);
	
	}

	
	
	
	
	
}
