package com.accenture;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.accenture.classes.*;

@Configuration
//for demonstrating component scan of person which is annotated as @Component
@ComponentScan("com.accenture.classes")
public class BeanConfig {
	
	//annotation based configurations using setters
	@Bean
	public Book book() {
		Book book = new Book();
		book.setAuthor("J. K. Rowling");
		book.setName("Harry Potter");
		return book;
	}
	
	//another annotation based configuration using setters
	@Bean
	public Bike bike() {
		Bike bike = new Bike();
		bike.setName("ninja1000");
		bike.setMileage(42.195f);
		return bike;
	}
	
	
	//this time the annotation based configuration is done through constructor
	//also declared with scope prototype, every bean obtained will give a new object
	@Bean
	@Scope(value= BeanDefinition.SCOPE_PROTOTYPE)
	public Brain brain() {
		return new Brain(110, 1.5f);
	}
	
	//once again this was done by using constructor
	@Bean
	public Heart heart() {
		return new Heart(72, 0.5f, 99);
	}
	
	//time to play around with referencing other beans
	@Bean
	public Student student() {
		//referencing the other beans in constructor
		Student student = new Student(brain(), heart());
		//referencing the other beans in setter
		student.setBike(bike());
		//why not start with a book in the arraylist?
		student.getBooks().add(book());
		return student;
	}
	

	
	
}
