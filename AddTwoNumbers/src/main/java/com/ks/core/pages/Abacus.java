package com.ks.core.pages;

public class Abacus {

	private int sum;

	public int getSum() {
		return sum;
	}
	
	public void addNumbers(int a, int b){
		sum = a + b;
	}

	public Abacus() {
		this. sum = 0;
	}
	
}
