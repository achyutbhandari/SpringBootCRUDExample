package com.mylibrary.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mylibrary.Repository.BookRepository;
import com.mylibrary.entity.Book ;

@Service
public class BookService {

	@Autowired
	private BookRepository repo ;
	
	public List<Book> listBook() {
		return repo.findAll();
	}
	
	public void saveBook(Book book) {
		repo.save(book) ;
	}
	
	public Book getBookById(int id) {
		return repo.getById(id) ;
	}
	
	public void deleteBook(int id) {
		repo.deleteById(id);
	}
}

