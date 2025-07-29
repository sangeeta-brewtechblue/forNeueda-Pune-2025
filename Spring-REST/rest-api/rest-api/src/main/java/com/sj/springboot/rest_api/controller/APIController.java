package com.sj.springboot.rest_api.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sj.springboot.rest_api.entity.Book;
import com.sj.springboot.rest_api.service.BookService;

@RestController
@RequestMapping("/api")
public class APIController {
	
	@Autowired
	BookService bookService;
	
	
       //getAllEntites
	@GetMapping("/books")
	public List<Book> getAllBooks(){
		return bookService.getAllBooks();
	}
	
	//find a book by id
	@GetMapping("/books/{id}")
	public Book getBookById(@PathVariable int id) {
	    return	bookService.getBookById(id);
	}
	
	
	@PostMapping("/books")
	public Book createBook(@RequestBody Book book) {
		return bookService.createBook(book);
	}
	
	
	@DeleteMapping("/books/delete/{title}")
	public List<Book> deleteBook(@PathVariable String title){
		bookService.removeBook(title);
		return getAllBooks();
	}
	
	
	
	

}
