package com.example.ecommerce_project.service;

import java.util.List;

import com.example.ecommerce_project.entity.Category;


public interface CategoryService {
	
	Category saveCategory(Category category);
	
	List<Category> getAllCategories();
	
	Category getCategoryById(Long id);
	
	void deleteCategory(Long id);
		
	}