package com.example.ecommerce_project.service;

import java.util.List;

import com.example.ecommerce_project.entity.Wishlist;

public interface WishlistService {

	Wishlist add(Wishlist wishlist);
	
	List<Wishlist> getUser(Long userId);
	
	void delete(Long id);
}
