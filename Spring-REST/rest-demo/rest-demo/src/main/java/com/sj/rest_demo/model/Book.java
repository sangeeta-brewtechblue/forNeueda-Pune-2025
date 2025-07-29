package com.sj.rest_demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
import java.util.Objects;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    @NotNull   //null value not allowed for title
    private String title;
    private LocalDate dop;
    private double price;

    public Book() {
    }

    public Book(int id, String title, LocalDate dop, double price) {
        this.id = id;
        this.title = title;
        this.dop = dop;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getDop() {
        return dop;
    }

    public void setDop(LocalDate dop) {
        this.dop = dop;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id && Double.compare(book.price, price) == 0 && Objects.equals(title, book.title) && Objects.equals(dop, book.dop);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, dop, price);
    }
}
