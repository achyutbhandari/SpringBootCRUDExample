package com.mylibrary.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mylibrary.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{

}
