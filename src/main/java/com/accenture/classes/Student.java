package com.accenture.classes;

import java.util.ArrayList;

public class Student extends Person {

	private ArrayList<Book> books;
	private Bike bike;
	
	public Student(Brain brain, Heart heart) {
		super(brain, heart);
		books = new ArrayList<Book>();
	}

	public ArrayList<Book> getBooks() {
		return books;
	}

	public void setBooks(ArrayList<Book> books) {
		this.books = books;
	}

	public Bike getBike() {
		return bike;
	}

	public void setBike(Bike bike) {
		this.bike = bike;
	}

	@Override
	public String toString() {
		return "Student [\nbooks=" + books + ", \nbike=" + bike
				+ ", \nbrain=" + brain + ", \nheart=" + heart
				+ ",\nhashID=" + Integer.toHexString(this.hashCode()) + "]";
	}


}