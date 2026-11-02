package com.example.ecommerce_project.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.ecommerce_project.entity.Admin;
import com.example.ecommerce_project.entity.User;
import com.example.ecommerce_project.repository.AdminRepository;
import com.example.ecommerce_project.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository repository;
    private final AdminRepository adminRepository;

    public UserServiceImpl(UserRepository repository, 
    						AdminRepository adminRepository) {
        this.repository = repository;
        this.adminRepository = adminRepository;
    }

    @Override
    public User signup(User user) {

        if (repository.existsByEmail(user.getEmail())){
            throw new RuntimeException("Email already exists");
        }
        return repository.save(user);

    }
    @Override
    public String signin(String email, String password) {

    	 if (adminRepository.existsByEmail(email)) {
             return "This email belongs to admin";
         }

         Optional<User> optionalUser = repository.findByEmail(email);

         if (optionalUser.isEmpty()) {
             return "User not found";
         }

         User dbUser =optionalUser.get();

         if (!dbUser.getPassword().equals(password)) {
             return "Invalid password";
         }

         return " login Successful";
    }
}
