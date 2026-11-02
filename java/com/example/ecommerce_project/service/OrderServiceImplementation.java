package com.example.ecommerce_project.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.ecommerce_project.entity.Orders;
import com.example.ecommerce_project.entity.Product;
import com.example.ecommerce_project.repository.OrderRepository;
import com.example.ecommerce_project.repository.ProductRepository;



@Service
public class OrderServiceImplementation implements OrderService{
	
	private final OrderRepository orderRepository;
	private final ProductRepository productRepository;
	
	
	public OrderServiceImplementation(OrderRepository orderRepository, ProductRepository productRepository) {
		this.orderRepository = orderRepository;
		this.productRepository = productRepository;
	}

	@Override
	public Orders placeOrder(Orders order) {
	Product product=productRepository.findById(order.getProduct().getId())
			.orElseThrow(()-> new RuntimeException("Product not found"));
	
	order.setTotalPrice(product.getPrice() * order.getQuantity());
	
	order.setStatus("Order Placed");
	
	return orderRepository.save(order);
	}

	
	
	@Override
	public List<Orders> getAllOrders() {
		
		return orderRepository.findAll();
	}

	@Override
	public List<Orders> getOrdersByUser(Long userId) {
		return orderRepository.findByUserId(userId);
	}

	@Override
	public Orders updateStatus(Long id, String status) {
		Orders order=orderRepository.findById(id).orElseThrow(()->new RuntimeException("Order not found"));
		
		order.setStatus(status);
		
		return orderRepository.save(order);
	}

}