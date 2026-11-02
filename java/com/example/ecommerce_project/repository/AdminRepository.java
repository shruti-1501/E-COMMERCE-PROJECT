package com.example.ecommerce_project.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ecommerce_project.entity.Admin;
import com.example.ecommerce_project.entity.User;

public interface AdminRepository extends JpaRepository<Admin, Long> {
	boolean existsByEmail(String email);
	Optional<Admin> findByEmail(String email);
	Admin save(Admin admin);
	
}
