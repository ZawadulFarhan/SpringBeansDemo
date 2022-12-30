package com.accenture;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.accenture.classes.*;

public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("\n\n\n+*****************************************************************+");
    	System.out.println("     Showing Stuff using annotation based bean configuration");
    	System.out.println("+*****************************************************************+");
    	
    	System.out.println("Before ApplicationContext is made...");
    	ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
    	System.out.println("\nAfter ApplicationContext is made...");
    	
    	System.out.println("\nBefore getting all the beans...");
    	//get the beans
    	Person person = context.getBean("person", Person.class);
    	//do not need the name when getting bean if there is no ambiguation
    	//probably still good practice to provide bean name
    	Person student = context.getBean(Student.class);

    	Brain brain = context.getBean(Brain.class);
    	Heart heart = context.getBean(Heart.class);
    	Book book = context.getBean(Book.class);
    	Bike bike = context.getBean(Bike.class);
    	Bookholder bookHolder = context.getBean(Bookholder.class);
    	Empty empty = context.getBean(Empty.class);
    	System.out.println("\nAfter getting all the beans...");
    	

    	System.out.println("\nShowing the stuffs inside Person\n" + person);
    	System.out.println("\nShowing just the heart\n" + heart);
    	System.out.println("\nAnd now the brain\n" + brain);
    	System.out.println("\nObservation: Heart all have the same hashID but Brain is different."
    			+ "\nThis is because brain scope is changed to prototype while "
    			+ "heart is still using default singleton scope");
    	System.out.println("\nShowing the stuffs inside Student\n" + student);
    	System.out.println("\nCheck out what is inside a book bean\n" + book);
    	System.out.println("\nA bike!\n" + bike);
    	System.out.println("\nA bookholder... It holds a book...\n" + bookHolder);
    	System.out.println("\nAn empty class but it does have a hashID!\n" + empty);
    	
    	System.out.println("\n\n\n+*****************************************************************+");
    	System.out.println("     Showing Stuff using xml based bean configuration this time");
    	System.out.println("+*****************************************************************+");
    	
    	System.out.println("Before ApplicationContext is made...");
    	context = new ClassPathXmlApplicationContext("beans.xml");
    	System.out.println("\nAfter ApplicationContext is made...");
    	
    	System.out.println("\nBefore getting all the beans...");
    	//get the beans
    	person = context.getBean("person", Person.class);
    	//do not need the name when getting bean if there is no ambiguation
    	//probably still good practice to provide bean name
    	student = context.getBean(Student.class);

    	brain = context.getBean(Brain.class);
    	heart = context.getBean(Heart.class);
    	book = context.getBean(Book.class);
    	bike = context.getBean(Bike.class);
    	bookHolder = context.getBean(Bookholder.class);
    	empty = context.getBean(Empty.class);
    	System.out.println("\nAfter getting all the beans...");
    	

    	System.out.println("\nShowing the stuffs inside Person\n" + person);
    	System.out.println("\nShowing just the heart\n" + heart);
    	System.out.println("\nAnd now the brain\n" + brain);
    	System.out.println("\nObservation: Heart all have the same hashID but Brain is different."
    			+ "\nThis is because brain scope is changed to prototype while "
    			+ "heart is still using default singleton scope");
    	System.out.println("\nShowing the stuffs inside Student\n" + student);
    	System.out.println("\nCheck out what is inside a book bean\n" + book);
    	System.out.println("\nA bike!\n" + bike);
    	System.out.println("\nA bookholder... It holds a book...\n" + bookHolder);
    	System.out.println("\nAn empty class but it does have a hashID!\n" + empty);

    }
}
