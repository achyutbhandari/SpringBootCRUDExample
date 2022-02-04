package com.mylibrary.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mylibrary.entity.Category;
import com.mylibrary.service.CategoryService;

@Controller
public class CategoryController {

	@Autowired
	private CategoryService service;
	
	@RequestMapping("/listCategory")
	public String listCategory(Model model) {
		List<Category> listCategory = service.listAll();
		model.addAttribute("listCategory",listCategory);
		return "listCategory";
		
	}
	
	@RequestMapping("/categoryForm")
	public String showCategoryForm(Model model) {
		Category category = new Category() ;
		model.addAttribute("category" , category) ;
		return "categoryForm" ;
	}
	
	
	@RequestMapping(value = "/saveCategory", method = RequestMethod.POST)
	public String saveCategory(@ModelAttribute("category") Category category) {
		service.save(category);
		
		return "redirect:/listCategory";
	}
	
	@RequestMapping("/editCategory/{id}")
	public ModelAndView showEditCategoryForm(@PathVariable(name = "id") int id) {
		ModelAndView mav = new ModelAndView("editCategory");		
		Category category = service.get(id);
		mav.addObject("category", category);		
		return mav;
	}	
	
	@RequestMapping("/deleteCategory/{id}")
	public String deleteCategory(@PathVariable(name = "id") int id) {
		service.delete(id);	
		return "redirect:/listCategory";
	}
}
