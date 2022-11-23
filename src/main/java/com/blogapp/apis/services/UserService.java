package com.blogapp.apis.services;

import java.util.List;
import com.blogapp.apis.payloads.UserDto;

public interface UserService {
	UserDto createUser(UserDto user);
	
	List<UserDto> getAllUser();
	
	UserDto getUserById(int userId);
	
	UserDto updateUser(UserDto userDto, int userId);
	
	void deleteUser(int userId);
}
