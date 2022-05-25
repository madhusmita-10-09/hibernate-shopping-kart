package com.ty.shopping.controller;

import com.ty.shopping.service.ProductService;

public class TestGetProductByCost {

	public static void main(String[] args) {
		ProductService productservice=new ProductService();
		 productservice.getProductByCost(2256);
	}

}
