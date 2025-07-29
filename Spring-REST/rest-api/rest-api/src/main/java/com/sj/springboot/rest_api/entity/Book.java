package com.sj.springboot.rest_api.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
import java.util.Objects;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String title;
    private LocalDate dop;
    private double price;



    public Book(String title, LocalDate dop, double price) {
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
	public int hashCode() {
		return Objects.hash(dop, id, price, title);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(dop, other.dop) && id == other.id
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(title, other.title);
	}



	public Book(int id, String title, LocalDate dop, double price) {
		super();
		this.id = id;
		this.title = title;
		this.dop = dop;
		this.price = price;
	}



	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
    
    
    
    
    
    
    
}
