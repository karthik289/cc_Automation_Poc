package com.cucumber.gost.StepDefinitions;

import com.cucumber.gost.Selenium.SeleniumFunctions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSD {

	SeleniumFunctions sf = new SeleniumFunctions();

	@And("^User enters UserName and Password$")
	public void user_enters_UserName_and_Password() throws Throwable {
		sf.enterUserNameAndPwd();
	}

	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Throwable {
		sf.isSuccessfulLoginDisplayed();
	}
}
