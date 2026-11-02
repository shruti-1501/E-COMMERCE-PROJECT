package com.example.ecommerce_project.service;

import java.util.List;

import com.example.ecommerce_project.entity.Review;



public interface ReviewService {
	
	Review add(Review review);
	
	List<Review> getByProductId(Long productId);
	
	void delete(Long id);
	
	Double average(Long productId);

}