package com.ks.domain;

public class BMIService {

	private Patient patient;
	
	private double bmi;
	
	public void calculateBMI(Patient iPatient){
		this.patient = iPatient;
		bmi = patient.getWeight() /(patient.getHeight() * patient.getHeight());
	}

	public double getBmi() {
		return bmi;
	}
	
	
}
