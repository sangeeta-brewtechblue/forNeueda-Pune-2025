package com.sj.rest_demo.service;

import com.sj.rest_demo.exceptions.BookNotFoundException;
import com.sj.rest_demo.model.Book;
import com.sj.rest_demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    BookRepository bookRepository;


    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Book getBookById(int id) {
        return bookRepository.findById(id).orElseThrow(()->new BookNotFoundException());
    }

    @Override
    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Book updateBook(int id , Book book){
        Book toUpdate = getBookById(id);
        toUpdate.setPrice(book.getPrice());
         return bookRepository.save(toUpdate);

    }

    @Override
    public void deleteBook(String title){
        System.out.println(title);
       Book toDelete = bookRepository.findByTitle(title);
         bookRepository.delete(toDelete);
    }

}
