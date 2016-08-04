package com.ks.core.jbehave;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.ks.core.pages.Abacus;

import junit.framework.Assert;
import net.thucydides.core.steps.ScenarioSteps;

@SuppressWarnings("deprecation")
public class AddSteps extends ScenarioSteps{

		Abacus abacus = null;

	    @Given("a Abacus")
	    public void givenAbacus() {
	        this.abacus = new Abacus();
	    }

	    @When("requested to add $number1 and $number2")
	    public void whenTheUserRequestToAdd(@Named("number1") int number1, @Named("number2") int number2) {
	    	abacus.addNumbers(number1, number2);
	    }

	    @SuppressWarnings("deprecation")
		@Then("the result should be $sum")
	    public void thenTheSumShouldbe(@Named("sum") int sum) {
	    	Assert.assertEquals(sum, abacus.getSum());
	    }
}
