package com.example.userservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.userservice.entity.User;
import com.example.userservice.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/register")
	public User register(@RequestBody User user) {
		System.out.println("Register endpoint called"); // Add this line for debugging
		return userService.saveUser(user);
	}

	@GetMapping("/{username}")
	public List<User> getUser(@PathVariable String username) {
		return userService.findByUsername(username);
	}
	
	/*
	 * @PostMapping("/register") public User register(@RequestBody User user) {
	 * System.out.println("Register endpoint called"); // Add this line for
	 * debugging return userService.saveUser(user); }
	 */


}
