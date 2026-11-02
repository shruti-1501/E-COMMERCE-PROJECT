package com.example.ecommerce_project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ecommerce_project.entity.Orders;

public interface OrderRepository extends JpaRepository<Orders, Long>{

	List<Orders> findByUserId(Long userId);
}