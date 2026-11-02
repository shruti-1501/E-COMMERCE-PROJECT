package com.example.ecommerce_project.service;

import com.example.ecommerce_project.entity.Admin;

public interface AdminService {

	Admin register(Admin admin);
	String login(String email,String password);
}
