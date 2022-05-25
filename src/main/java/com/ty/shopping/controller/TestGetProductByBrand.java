package com.ty.shopping.controller;

import com.ty.shopping.service.ProductService;

public class TestGetProductByBrand {

	public static void main(String[] args) {
		ProductService productservice=new ProductService();
		//Product product=new Product();
		productservice.getProductByBrand("avasa");


	}

}
