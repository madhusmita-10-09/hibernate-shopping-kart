package com.ty.shopping.controller;

import com.ty.shopping.service.ProductService;

public class TestGetProductByType {

	public static void main(String[] args) {
		ProductService productservice=new ProductService();
		productservice.getProductByType("simple Aztec");
		
	}

}
