package com.shiyanlou.course;

public class Test {
	public static void main(String[] args){
		Book book = new Book("This is my 1st book", "muki", "123456789");
		System.out.println("Book Name:" + book.getName());
		System.out.println("Book Author:" + book.getAuthor());
		System.out.println("Book ISBN:" + book.getISBN());
		
	}

}
