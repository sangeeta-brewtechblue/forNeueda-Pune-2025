package com.sj.rest_demo.service;

import com.sj.rest_demo.model.Book;

import java.util.List;


public interface BookService {

         public Book getBookById(int id);

         public Book addBook(Book book);

         List<Book> getAllBooks();

          public Book updateBook(int id, Book book);

          public void deleteBook(String title);
}
