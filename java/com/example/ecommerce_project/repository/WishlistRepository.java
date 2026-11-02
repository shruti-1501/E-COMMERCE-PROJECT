package com.example.ecommerce_project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ecommerce_project.entity.Wishlist;

public interface WishlistRepository extends JpaRepository<Wishlist, Long> {

	List<Wishlist> findByUserId(Long UserId);
}
