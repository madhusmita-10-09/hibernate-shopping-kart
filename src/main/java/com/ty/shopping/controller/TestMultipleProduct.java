package com.ty.shopping.controller;

import java.util.List;

import com.ty.shopping.dto.Product;
import com.ty.shopping.dto.User;
import com.ty.shopping.service.ProductService;
import com.ty.shopping.service.UserService;

public class TestMultipleProduct {

	public static void main(String[] args) {
		
			
		ProductService productservice=new ProductService();
		
		Product product=new Product();
			List<Product> product1=productservice.getAllProduct();
			
	}

}
