package com.ty.shopping.controller;

import com.ty.shopping.dto.Product;
import com.ty.shopping.service.ProductService;

public class TestValidProduct {

	public static void main(String[] args) {
		ProductService productservice=new ProductService();
		
		Product product=new Product();
		productservice.validProduct("ladies T-shirt", "LEE COOPER");
		

	}

}
