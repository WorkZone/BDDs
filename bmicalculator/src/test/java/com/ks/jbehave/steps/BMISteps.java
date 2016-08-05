package com.ks.jbehave.steps;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.ks.domain.Patient;
import com.ks.domain.BMIService;


import junit.framework.Assert;

public class BMISteps {

    //@Steps
    BMIService bmiCalculator;
    Patient patient;

    @Given("a body mass index calculator")
    public void givenBmicalculator() {
        bmiCalculator = new BMIService();
    }

    @When("the patient mass is $weight kg and height is $height m")
    public void whenThePatientMassAndHeightAreProvided(double weight, double height) {
    	patient = new Patient(weight,height);
    	bmiCalculator.calculateBMI(patient);
        //endUser.looks_for(word);
    }

    @Then("the patient body mass index is $bmi")
    public void thenCheckBMI(double bmi) {
        Assert.assertEquals(bmi, bmiCalculator.getBmi(),0.1d);
    }

}
