package com.example.ecommerce_project.service;

import com.example.ecommerce_project.entity.User;

public interface UserService {

    User signup(User user);

    String signin(String email, String password);
}
