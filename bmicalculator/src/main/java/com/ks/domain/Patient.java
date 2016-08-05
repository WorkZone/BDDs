package com.ks.domain;

public class Patient {

	private String name;  
	private double weight;
    private double height;
    
    public String getName() {
		return name;
	}
    
	public double getWeight() {
		return weight;
	}

	public double getHeight() {
		return height;
	}
	

	public Patient(String name, double weight, double height) {
		super();
		this.name = name;
		this.weight = weight;
		this.height = height;
	}

	public Patient(double weight, double height) {
		super();
		this.weight = weight;
		this.height = height;
	}

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

    
}