package com.example.ecommerce_project.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ecommerce_project.entity.Wishlist;
import com.example.ecommerce_project.service.WishlistService;

@RestController
@RequestMapping("/api/wishlist")
public class WishlistController {
	
	private final WishlistService service;

	public WishlistController(WishlistService service) {
		super();
		this.service = service;
	}
	
	@PostMapping
	public Wishlist add(@RequestBody Wishlist wishlist)
	{
		return service.add(wishlist);
		
	}
	@GetMapping("{userId}")
	public List<Wishlist> get(@PathVariable Long userId)
	{
		return service.getUser(userId);
	}
	@DeleteMapping("/{id}")
	public String remove(@PathVariable Long id)
	{
		service.delete(id);
		return "Removed from wishlist";
	}

}
