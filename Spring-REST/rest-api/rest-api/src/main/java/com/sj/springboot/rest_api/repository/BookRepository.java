package com.sj.springboot.rest_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sj.springboot.rest_api.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer>{
	
      public Book findByTitle(String title);
}
