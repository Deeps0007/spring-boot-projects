package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.model.Product;
import com.example.demo.model.ProductChecking;
import com.example.demo.model.ProductObject;

@Service
public class ProductService implements ProductAvailabilty{

	@Override
	public ProductChecking isAvaliable(ProductObject po) {
		ProductChecking pc=new ProductChecking();
		pc.setProductName(po.getProductName());
		pc.setProductAvailable(false);
		
		if("watch".equals(po.getProductName()))
		{
			pc.setProductAvailable(true);
			pc.setDetails("This product is available Now !!");
		}
		
		return pc;
	}
	

}
