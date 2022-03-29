package org.stepdef;

import org.base.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksClass extends BaseClass{
	
	@Before
	public void beforeScenario() {
		
		BaseClass b = new BaseClass();
		b.getOneDriver("chrome", "https://blazedemo.com/");

	}
	
	@After
	public void afterScenario(Scenario s) {
		
		if (s.isFailed()) {
			TakesScreenshot screenshot = (TakesScreenshot) driver;
			byte[] screenshotAs = screenshot.getScreenshotAs(OutputType.BYTES);
		s.embed(screenshotAs, s.getName()+".png");
		}
		
		
		driver.close();

	}

}
