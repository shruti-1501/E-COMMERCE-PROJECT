package com.example.ecommerce_project.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.ecommerce_project.entity.Category;
import com.example.ecommerce_project.repository.CategoryRepository;


@Service
public  class CategoryServiceImpl implements CategoryService {

	private final CategoryRepository repository;
	
	
	
	public CategoryServiceImpl(CategoryRepository repository) {
		this.repository=repository;
	}

	public Category saveCategory(Category category) {
		return repository.save(category);
	}

	@Override
	public List<Category> getAllCategories() {
		return repository.findAll();
	}

	@Override
	public Category getCategoryById(Long id) {
		return repository.findById(id)
				.orElseThrow(() -> new RuntimeException("Category not found"));
	}

	@Override
	public void deleteCategory(Long id) {
           repository.deleteById(id);		
	}
	public void deleteAllCategories()
	{
		repository.deleteAll();
	}

	public java.util.Locale.Category saveCategory(java.util.Locale.Category category) {
		// TODO Auto-generated method stub
		return null;
	}



}