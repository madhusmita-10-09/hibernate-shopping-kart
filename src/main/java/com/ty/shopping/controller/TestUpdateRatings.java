package com.ty.shopping.controller;

import com.ty.shopping.service.ProductService;

public class TestUpdateRatings {
			public static void main(String[] args) {
				ProductService productService=new ProductService();
				productService.updateRating("ladies kurti", "avasa", "strethable");
			}

}
