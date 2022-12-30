package com.accenture.classes;

public class Brain {
	private int iq;
	//weight in kg
	private float weight;
	
	public Brain(int iq, float weight) {
		this.iq = iq;
		this.weight = weight;
		System.out.println("\nBrain Constructor called!");
	}

	public int getIQ() {
		return iq;
	}

	public void setIQ(int iq) {
		this.iq = iq;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Brain [iq=" + iq + ", weight=" + weight + ", hashID=" + Integer.toHexString(this.hashCode())+ "]";
	}
}