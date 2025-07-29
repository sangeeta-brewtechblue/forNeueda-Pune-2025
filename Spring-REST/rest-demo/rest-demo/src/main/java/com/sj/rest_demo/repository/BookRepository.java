package com.sj.rest_demo.repository;

import com.sj.rest_demo.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {

    public Book findByTitle(String title);

}
