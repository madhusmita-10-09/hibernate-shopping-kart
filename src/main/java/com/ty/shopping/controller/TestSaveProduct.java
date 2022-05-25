package com.ty.shopping.controller;

import com.ty.shopping.dto.Product;
import com.ty.shopping.dto.User;
import com.ty.shopping.service.ProductService;
import com.ty.shopping.service.UserService;

public class TestSaveProduct {

		public static void main(String[] args) {
			ProductService productservice=new ProductService();
			
			Product product=new Product();
			
			productservice.saveProduct(product);
			System.out.println("data saved");
			
	}

}
