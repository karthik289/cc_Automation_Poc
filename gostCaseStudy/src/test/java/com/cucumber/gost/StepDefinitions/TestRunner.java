package com.cucumber.gost.StepDefinitions;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(plugin = "json:target/cucumber-report.json", features = "src/test/java", glue = "com.cucumber.gost.StepDefinitions", format = {
		"pretty", "html:target/cucumber" })

public class TestRunner {
}
