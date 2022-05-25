package com.ty.shopping.controller;

import com.ty.shopping.dto.Product;
import com.ty.shopping.dto.User;
import com.ty.shopping.service.ProductService;
import com.ty.shopping.service.UserService;

public class TestGetProductById {

	public static void main(String[] args) {
		ProductService productservice=new ProductService();
		Product product=new Product();
		productservice.getProductById(1);

	}

}
