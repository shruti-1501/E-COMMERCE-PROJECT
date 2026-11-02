package com.example.ecommerce_project.service;

import java.util.List;

import com.example.ecommerce_project.entity.Orders;

public interface OrderService {

	Orders placeOrder(Orders order);
	
	List<Orders> getAllOrders();
	
	List<Orders> getOrdersByUser(Long userId);
	
	Orders updateStatus(Long id, String status);
}