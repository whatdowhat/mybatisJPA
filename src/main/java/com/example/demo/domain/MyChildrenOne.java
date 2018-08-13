package com.example.demo.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("ONE")
public class MyChildrenOne extends MySuperClass {

	private String author;

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "MyChildrenOne [author=" + author + "]";
	}
	
	
}
