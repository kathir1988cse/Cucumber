package org.runner;

import org.base.ReportingClass;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="E:\\Selenium\\Cucumber\\src\\test\\resources\\Login.feature", glue = "org.stepdef", monochrome = true,
plugin = {"pretty","html:E:\\Selenium\\Cucumber\\Report", "json:E:\\Selenium\\Cucumber\\Report\\sample.json"}, snippets = SnippetType.CAMELCASE)
public class TestRunner {
	
	@AfterClass
	public static void afterClass() {
		ReportingClass.generateJVMReport("E:\\\\Selenium\\\\Cucumber\\\\Report\\\\sample.json");

	}

}
