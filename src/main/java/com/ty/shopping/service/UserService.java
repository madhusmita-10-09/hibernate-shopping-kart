package com.ty.shopping.service;

import java.util.List;


import com.ty.shopping.dao.UserDao;
import com.ty.shopping.dto.User;


public class UserService {
		UserDao userDao=new UserDao();
		
		public User saveUser(User user) {
			
			
			user.setName("smita");
			user.setEmail("smita@gmail.com");
			user.setPhone(98987895l);
     		user.setPassword("u7e77e4");
			
			return userDao.saveUser(user);
		}
		
		public User getUserById(int id)
		{
			return userDao.getUserById(id);
		}
		
		public  List<User> getAllUser()
		{
			return userDao.getAllUser();
		}
		
		public boolean delectUserById(int id)
		{
			return userDao.delectUserById(id);
		}
		
		public  User validUser(String name,String email)
		{
			return userDao.validUser(name, email);
		}
	
	
	
}
