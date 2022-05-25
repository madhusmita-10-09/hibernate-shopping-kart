package com.ty.shopping.controller;

import com.ty.shopping.service.ProductService;

public class TestGetProductBySize {

	public static void main(String[] args) {
		ProductService productservice=new ProductService();
		productservice.getProductBySize("L");
	}

}
