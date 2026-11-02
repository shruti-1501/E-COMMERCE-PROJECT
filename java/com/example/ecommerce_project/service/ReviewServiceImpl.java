package com.example.ecommerce_project.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.ecommerce_project.entity.Review;
import com.example.ecommerce_project.repository.ReviewRepository;



@Service
public class ReviewServiceImpl implements ReviewService {
	
	private final ReviewRepository reviewRepository;
	
	public ReviewServiceImpl(ReviewRepository reviewRepository) {
		this.reviewRepository = reviewRepository;
	}

	@Override
	public Review add(Review review) {
		return reviewRepository.save(review);
	}

	@Override
	public List<Review> getByProductId(Long productId) {
		return reviewRepository.findByProductId(productId);
	}

	@Override
	public void delete(Long id) {
		reviewRepository.deleteById(id);
		
	}

	@Override
	public Double average(Long productId) {
		return reviewRepository.getAverageRating(productId);
	}

}