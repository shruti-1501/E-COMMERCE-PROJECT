package com.example.ecommerce_project.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.ecommerce_project.entity.Orders;
import com.example.ecommerce_project.service.OrderService;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

	private final OrderService orderService;

	public OrderController(OrderService orderService) {
		this.orderService = orderService;
	}
	
	@PostMapping
	public Orders place(@RequestBody Orders order) {
		return orderService.placeOrder(order);
	}
	
	@GetMapping
	public List<Orders> all() {
		return orderService.getAllOrders();
	}
	
	@GetMapping("/user/{userId}")
	public List<Orders> byUser(@PathVariable Long userId) {
		return orderService.getOrdersByUser(userId);
	}
	
	public Orders update(@PathVariable Long id, @RequestParam String status) {
		return orderService.updateStatus(id, status);
	}
}