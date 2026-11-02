package com.example.ecommerce_project.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ecommerce_project.entity.Cart;
import com.example.ecommerce_project.service.CartService;

@RestController
@RequestMapping("/api/cart")
public class CartController {

	private final CartService service;
	
	public CartController(CartService service)
	{
		this.service=service;
	}
	@PostMapping
	public Cart add(@RequestBody Cart cart)
	{
		return service.addToCart(cart);
		}
	@GetMapping("/userId)")
	public List<Cart> getCart(@PathVariable Long userId)
	{
		return service.getUser(userId);
	}
	@DeleteMapping("/item/{cartId}")
	public String remove(@PathVariable Long cartid)
	{
		service.removeItem(cartid);
		return "Item removed  from cart";
	}
	@DeleteMapping("/clear/{userId}")
	public String clear(@PathVariable Long userid)
	{
		service.removeItem(userid);
		return " Cart Cleared";
	}
}
