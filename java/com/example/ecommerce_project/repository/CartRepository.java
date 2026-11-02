package com.example.ecommerce_project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ecommerce_project.entity.Cart;

public interface CartRepository extends JpaRepository<Cart, Long>{

	List<Cart> findByUserId(Long userId);
	void deleteByUserId(Long userId);
}
