package com.ty.shopping.controller;

import com.ty.shopping.dto.User;
import com.ty.shopping.service.UserService;

public class TestValidUser {

	public static void main(String[] args) {
		UserService userservice=new UserService();
		User user=new User();
		
		userservice.validUser("madhu","madhu@gmail.com");
		
	}

}
