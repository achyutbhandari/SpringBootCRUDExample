package com.mylibrary.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mylibrary.Repository.CategoryRepository;
import com.mylibrary.entity.Category;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repo ;
	
	public List<Category> listAll() {
		return repo.findAll();
	}
	
	public void save(Category category) {
		repo.save(category) ;
	}
	
	public Category get(int id) {
		return repo.findById(id).get() ;
	}
	
	public void delete(int id) {
		repo.deleteById(id);
	}


}
