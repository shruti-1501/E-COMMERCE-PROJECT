package com.example.ecommerce_project.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ecommerce_project.entity.User;
import com.example.ecommerce_project.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {

	private final UserService service;

	public UserController(UserService service) {
	this.service=service;
	}
	
	@PostMapping("/register")
	public User register(@RequestBody User user)
	{
		return service.signup(user);
	}
	@PostMapping("/login")
	public String login(@RequestBody Map<String, String> data)
	{
		return service.signin(data.get("email"),data.get("password")
				);
	}
	
	
}
