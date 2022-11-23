package com.blogapp.apis.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blogapp.apis.payloads.ApiResponse;
import com.blogapp.apis.payloads.UserDto;
import com.blogapp.apis.services.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping
	public ResponseEntity<UserDto> createUser(@Valid @RequestBody UserDto userDto) {
		UserDto createUser = this.userService.createUser(userDto);
		return new ResponseEntity<UserDto>(createUser, HttpStatus.CREATED);
	}

	@GetMapping
	public ResponseEntity<List<UserDto>> getAllUsers() {
		List<UserDto> allUser = this.userService.getAllUser();
		
		return ResponseEntity.ok(allUser);
	}

	@GetMapping("/{userId}")
	public ResponseEntity<UserDto> getSingleUser(@PathVariable int userId) {
		UserDto user = this.userService.getUserById(userId);
		return ResponseEntity.ok(user);
	}
	
	@PutMapping("/{userId}")
	public ResponseEntity<UserDto> updateUser(@Valid @RequestBody UserDto userDto, @PathVariable int userId) {
		UserDto updateUser = this.userService.updateUser(userDto, userId);
		return ResponseEntity.ok(updateUser);
	}

	@DeleteMapping("/{userId}")
	public ResponseEntity<ApiResponse> deleteUser(@PathVariable int userId) {
		this.userService.deleteUser(userId); 
		return new ResponseEntity<ApiResponse>(new ApiResponse("User Deleted Successfully..!!", true), HttpStatus.OK);
	}

}
