package com.accenture.classes;

public class Heart {
	//HR in beats per min
	private int hr;
	//weight in kg
	private float weight;
	//spo2 in percentage(%)
	private int spo2;
	
	public Heart(int hr, float weight, int spo2) {
		this.hr = hr;
		this.weight = weight;
		this.spo2 = spo2;
		System.out.println("\nHeart Constructor Called!");
	}

	public int getHr() {
		return hr;
	}

	public void setHr(int hr) {
		this.hr = hr;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public int getSpo2() {
		return spo2;
	}

	public void setSpo2(int spo2) {
		this.spo2 = spo2;
	}

	@Override
	public String toString() {
		return "Heart [hr=" + hr + ", weight=" + weight + ", spo2=" + spo2 + ", hashID=" + Integer.toHexString(this.hashCode())+ "]";
	}
}