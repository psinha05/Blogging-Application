package com.ps.blog.services;

import java.util.List;

import com.ps.blog.payloads.UserDto;

public interface UserService {
	
	 UserDto createUser(UserDto user);
	 UserDto updateUser(UserDto user, Integer userId);
	 UserDto getUserById(Integer userId);  
	 void deleteUser(Integer userId);
	 List<UserDto> getAllUsers();
	  
	 // for register the new users 
	UserDto registerNewUser(UserDto user);

}
