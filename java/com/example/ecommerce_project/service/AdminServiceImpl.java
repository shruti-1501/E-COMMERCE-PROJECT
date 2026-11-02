package com.example.ecommerce_project.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.ecommerce_project.entity.Admin;
import com.example.ecommerce_project.entity.User;
import com.example.ecommerce_project.repository.AdminRepository;
import com.example.ecommerce_project.repository.UserRepository;

@Service
public class AdminServiceImpl implements AdminService {

    private final UserRepository userRepository;
    private final AdminRepository adminRepository;

    public AdminServiceImpl(AdminRepository adminRepository,
                            UserRepository userRepository) {
        this.adminRepository = adminRepository;
        this.userRepository = userRepository;
    }

    @Override
    public Admin register(Admin admin) {

        if (adminRepository.existsByEmail(admin.getEmail())) {
            throw new RuntimeException("Email already exists");
        }

      

        return adminRepository.save(admin);
    }

    @Override
    public String login(String email, String password) {

        if (userRepository.existsByEmail(email)) {
            return "This email belongs to user";
        }

        Optional<Admin> optionalAdmin = adminRepository.findByEmail(email);

        if (optionalAdmin.isEmpty()) {
            return "Admin not found";
        }

        Admin dbAdmin = optionalAdmin.get();

        if (!dbAdmin.getPassword().equals(password)) {
            return "Invalid password";
        }

        return "Admin login Successful";
    }


	}

