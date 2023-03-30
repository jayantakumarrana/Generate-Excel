package com.jayit;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="books")
public class Course {
	
	@Id
	@Column(name="book_id")
	private Integer cid;
	@Column(name="book_name")
	private String name;
	@Column(name="book_price")
	private Double price;

}

