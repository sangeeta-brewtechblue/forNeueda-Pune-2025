package com.sj.springboot.rest_api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sj.springboot.rest_api.entity.Book;
import com.sj.springboot.rest_api.exceptions.BookNotFoundException;
import com.sj.springboot.rest_api.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    BookRepository bookRepo;
	
	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return bookRepo.findAll();
	}

	@Override
	public Book getBookById(int id) {
		// TODO Auto-generated method stub
		Optional<Book> bookFound = bookRepo.findById(id);		
		return 	bookFound.orElseThrow(()->new BookNotFoundException());
	}

	@Override
	public Book createBook(Book book) {
		// TODO Auto-generated method stub
		return bookRepo.save(book);
	}

	@Override
	public Book updateBook(Book book) {
		// TODO Auto-generated method stub
		Book found = getBookById(book.getId());
		found.setPrice(book.getPrice());
		found.setTitle(book.getTitle());
		
		return bookRepo.save(found);
		
		
	}

	

	@Override
	public void removeBook(String bookTitle) {
		// TODO Auto-generated method stub
	Book toDelete =	bookRepo.findByTitle(bookTitle);
	bookRepo.delete(toDelete);
		
		
	}

	/*
	 * @Override public Book updatePrice(double value) { // TODO Auto-generated
	 * method stub return null; }
	 */
	  
	
	

}
