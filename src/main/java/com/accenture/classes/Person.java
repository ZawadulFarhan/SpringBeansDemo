package com.accenture.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//annotated as component for Component scan of BeanConfig
@Component
public class Person {
	protected Brain brain;
	protected Heart heart;
	
	//autowired needed to fill constructor automatically, not needed if just one parameter
	@Autowired
	public Person(Brain brain, Heart heart) {
		super();
		this.brain = brain;
		this.heart = heart;
	}
	
	public Brain getBrain() {
		return brain;
	}
	public void setBrain(Brain brain) {
		this.brain = brain;
	}
	public Heart getHeart() {
		return heart;
	}
	public void setHeart(Heart heart) {
		this.heart = heart;
	}

	@Override
	public String toString() {
		return "Person [\nbrain=" + brain + ",\nheart=" + heart
				+ ",\nhashID=" + Integer.toHexString(this.hashCode()) + "]";
	}
}
