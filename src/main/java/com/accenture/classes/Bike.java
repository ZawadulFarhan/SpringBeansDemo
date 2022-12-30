package com.accenture.classes;

public class Bike {
	private String name;
	//in km
	private float mileage;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getMileage() {
		return mileage;
	}

	public void setMileage(float mileage) {
		this.mileage = mileage;
	}

	@Override
	public String toString() {
		return "Bike [name=" + name + ", mileage=" + mileage + ", hashID=" + Integer.toHexString(this.hashCode())+ "]";
	}
}
