package com.ty.shopping.controller;

import java.util.List;

import com.ty.shopping.dto.User;
import com.ty.shopping.service.UserService;

public class TestMultipleUser {

	public static void main(String[] args) {
		
        UserService userservice=new UserService();
		
		User user=new User();
		List<User> user1=userservice.getAllUser();
		
	}

}
