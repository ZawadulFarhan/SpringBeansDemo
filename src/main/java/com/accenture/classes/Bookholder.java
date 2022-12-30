package com.accenture.classes;

import org.springframework.stereotype.Component;

//not much to say about this... it holds a book and also annotated with @Component
@Component
public class Bookholder {
	
	private Book book;
	
	//no @Autowired needed as just single parameter
	public Bookholder(Book book) {
		super();
		this.book = book;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	@Override
	public String toString() {
		return "Bookholder [book=" + book + ",\nhashID=" + Integer.toHexString(this.hashCode())+ "]";
	}
}