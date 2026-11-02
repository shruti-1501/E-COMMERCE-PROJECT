package com.example.ecommerce_project.service;

import java.util.List;

import com.example.ecommerce_project.entity.Product;


public interface ProductService {
	
  Product saveProduct(Product product);
	
	List<Product> getAllProducts();
	
	Product getProductById(Long id);
	
	
	
	//update product
	
	Product updateProduct(Long id,Product product);
	List<Product> searchByName(String name);
	
	List<Product> getByCategory(Long categoryId);
	
	void deleteProduct(Long id);

}