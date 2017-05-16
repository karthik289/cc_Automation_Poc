package com.cucumber.gost.StepDefinitions;

import com.cucumber.gost.Selenium.SeleniumFunctions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegisterSD {

	SeleniumFunctions sf = new SeleniumFunctions();
	@When("^User enters Registration Details$")
	public void user_enters_Registration_Details() throws Throwable {
		sf.enterRegisterDetails();
	    
	}

	@Then("^Message displayed Register Successfully$")
	public void message_displayed_Register_Successfully() throws Throwable {
		sf.isSuccessfulLoginDisplayed();
	   
	}
	
	}
