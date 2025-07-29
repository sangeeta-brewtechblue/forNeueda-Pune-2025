package com.sj.rest_demo.controller;


import com.sj.rest_demo.exceptions.BookNotFoundException;
import com.sj.rest_demo.model.Book;
import com.sj.rest_demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping("/hi")
    public String sayHello() {
        return "Hello world";
    }

    @GetMapping("/books")
    public List<Book> getAllBooks(){
      return   bookService.getAllBooks();
    }

    @GetMapping("/books/{id}")
    public Book findBookById(@PathVariable int id) {
        return  bookService.getBookById(id);
     }

     @PostMapping("/books")
     public Book createBook(@RequestBody Book book) {
       return bookService.addBook(book);
     }

     @PatchMapping("/books/{id}")
     public Book updateBook(@PathVariable int id, @RequestBody Book book){
         System.out.println("here"+id);
        return bookService.updateBook(id,book);

     }
     @DeleteMapping("/books/delete/{title}")
     public List<Book> deleteBook(@PathVariable String title){

         bookService.deleteBook(title);
         return bookService.getAllBooks();
     }




   /**
    @ExceptionHandler(BookNotFoundException.class)
    public ResponseEntity<String> handleNotFoundException(BookNotFoundException ex){

                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
    }
   */

}
