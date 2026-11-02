package com.example.ecommerce_project.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.ecommerce_project.entity.Wishlist;
import com.example.ecommerce_project.repository.ProductRepository;
import com.example.ecommerce_project.repository.UserRepository;
import com.example.ecommerce_project.repository.WishlistRepository;

@Service
public class WishlistServiceImpl implements WishlistService {
 
	private final WishlistRepository repository;
	private final UserRepository userRepository;
	private final ProductRepository productRepository;
	
	public WishlistServiceImpl(WishlistRepository repository, UserRepository userRepository,
			ProductRepository productRepository) {
		super();
		this.repository = repository;
		this.userRepository = userRepository;
		this.productRepository = productRepository;
	}
	
	public Wishlist add(Wishlist wishlist)
	{
		Long userId=wishlist.getUser().getId();
		Long productId=wishlist.getProduct().getId();
	
	
	if(!userRepository.existsById(userId))
	{
		throw new RuntimeException("User not found");
	}
	if(!productRepository.existsById(productId))
	{
		throw new RuntimeException("product not found");
	}
	return repository.save(wishlist);
	
	}
	@Override
	public List<Wishlist> getUser(Long userId)
	{
		return repository.findByUserId(userId);
	}
	
	@Override
	public void delete(Long id)
	{
		repository.deleteById(id);
	}
	
	
	
}

