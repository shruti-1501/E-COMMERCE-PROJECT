package com.example.ecommerce_project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.ecommerce_project.entity.Review;



public interface ReviewRepository extends JpaRepository<Review, Long> {
	
	List<Review> findByProductId(Long productId);
	
	@Query("SELECT avg(r.rating) FROM Review r WHERE r.product.id = ?1")
	Double getAverageRating(Long productId);
}