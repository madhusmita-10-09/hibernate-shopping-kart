package com.ty.shopping.controller;

import com.ty.shopping.dto.User;
import com.ty.shopping.service.UserService;

public class TestSaveUser {

	public static void main(String[] args) {
		UserService userservice=new UserService();
		
		User user=new User();
		
		userservice.saveUser(user);
		System.out.println("data saved");
		
		
	}

}
