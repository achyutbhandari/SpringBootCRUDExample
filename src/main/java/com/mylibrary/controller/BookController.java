package com.mylibrary.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mylibrary.entity.Book;
import com.mylibrary.entity.Category;
import com.mylibrary.service.BookService;
import com.mylibrary.service.CategoryService;

@Controller
public class BookController {

	@Autowired 
    private BookService bservice ;	
	
	@Autowired
	private CategoryService cservice;
	
	@RequestMapping("/listBook")
	public String listBook(Model model) {
		model.addAttribute("booklist", bservice.listBook()) ;
		return "listBook" ;
	}
	
	@RequestMapping("/bookForm")
	public String getBookForm(Model model) {
		model.addAttribute("book", new Book()) ;
		List<Category> category = cservice.listAll();
		model.addAttribute("category", category) ;				
		return "bookForm" ;
	}
	
	@PostMapping("/saveBook")
	public String saveBook(@ModelAttribute("book") Book book)
	{
		bservice.saveBook(book) ;  
		return "redirect:/listBook" ;
	}
	
	@GetMapping("/editBook/{id}")
	public ModelAndView editBook(@PathVariable(name = "id") int Id) {
		ModelAndView mv = new ModelAndView("editBook") ;
		mv.addObject("category", cservice.listAll());
		mv.addObject("book", bservice.getBookById(Id)) ;	
		return mv ;
	}
	
	@RequestMapping("/deleteBook/{id}")
	public String deleteBook(@PathVariable(name = "id") int id) {
		bservice.deleteBook(id);
		return "redirect:/listBook" ;
	}
	
	
}
