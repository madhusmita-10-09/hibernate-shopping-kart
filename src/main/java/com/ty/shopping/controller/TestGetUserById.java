package com.ty.shopping.controller;

import com.ty.shopping.dto.User;
import com.ty.shopping.service.UserService;

public class TestGetUserById {

	public static void main(String[] args) {
		UserService userservice=new UserService();
		User user=new User();
		userservice.getUserById(1);

	}

}
