package com.example.ecommerce_project.service;

import java.util.List;

import com.example.ecommerce_project.entity.Cart;

public interface CartService {

	Cart addToCart(Cart cart);
	
	List<Cart> getUser(Long userId);
	
	void removeItem(Long cartId);
	
	void clearCart(Long userId);
}
