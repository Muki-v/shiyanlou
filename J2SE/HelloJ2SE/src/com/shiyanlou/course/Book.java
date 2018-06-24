package com.shiyanlou.course;

public class Book {
	private String name;
	private String author;
	private String ISBN;
	
	public Book(String name, String author, String ISBN){
		this.name = name;
		this.author = author;
		this.ISBN = ISBN;
	}
	
	public String getName(){
		return name;
	}
	
	public String getAuthor(){
		return author;
	}
	
	public String getISBN(){
		return ISBN;
	}

}
