package com.cucumber.gost.StepDefinitions;

import com.cucumber.gost.Selenium.SeleniumFunctions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CommonSD {

	SeleniumFunctions sf = new SeleniumFunctions();
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
		sf.createDriver();
		sf.ishomepageDisplayed();
		sf.clickSigninLink();
	      
	}
	
	@When("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page() throws Throwable {
		 sf.isloginsectionDisplayed();
	   
	}
	@When("^User LogOut from the Application$")
	public void user_LogOut_from_the_Application() throws Throwable {
	    sf.logOut();
		
	}

	
	@Then("^Message displayed LogOut Successfully$")
	public void message_displayed_LogOut_Successfully() throws Throwable {
	  sf.isloginsectionDisplayed();
	  sf.teardown();
	   
	}
}
