package com.sj.springboot.rest_api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sj.springboot.rest_api.entity.Book;

@Service
public interface BookService {
	
	public List<Book> getAllBooks();
	public Book getBookById(int id);
	public Book createBook(Book book);
	public Book updateBook(Book book);
	//public Book updatePrice(double value);
	public void removeBook(String bookTitle);
}
