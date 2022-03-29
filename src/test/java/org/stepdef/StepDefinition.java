package org.stepdef;

import java.io.IOException;
import java.util.List;

import org.base.BaseClass;
import org.junit.Assert;
import org.locator.Locator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;



import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition{
	Locator l;

	
	@Given("Select departure and destination city")
	public void selectDepartureAndDestinationCity() throws IOException {
	    
		
		
		l = new Locator();
		
		
		WebElement dropDown1 = l.getDropDown1();
		Select d1 = new Select(dropDown1);
		d1.selectByVisibleText(l.getDataFromExcel(1, 0));
		
		WebElement dropDown2 = l.getDropDown2();
		Select d2 = new Select(dropDown2);
		d2.selectByVisibleText(l.getDataFromExcel(1, 1));
		
		
	    
	}

	@Given("User should click find flights")
	public void userShouldClickFindFlights() throws InterruptedException {
	   
		
		l.getBtnFindFlights().click();
		Thread.sleep(2000);
		
	    
	}

	@When("user should click first choose this flight")
	public void userShouldClickFirstChooseThisFlight() throws InterruptedException {
		
		l.getBtnChooseFlight().click();
		Thread.sleep(3000);
		
	   
	    
	}

	@When("User Enters Name address city state zipcode")
	public void userEntersNameAddressCityStateZipcode() throws IOException {
		
		WebElement txtFirstName = l.getTxtFirstName();
		//	System.out.println(txtFirstName);
			txtFirstName.sendKeys(l.getDataFromExcel(1, 2));
			l.getTxtAddress().sendKeys(l.getDataFromExcel(1, 3));
			l.getTxtCity().sendKeys(l.getDataFromExcel(1, 4));
			l.getTxtState().sendKeys(l.getDataFromExcel(1, 5));
			l.getTxtZip().sendKeys(l.getDataFromExcel(1, 6));
			
	   
	    
	}

	@Then("User should select card type")
	public void userShouldSelectCardType() throws IOException {
		WebElement dropdownCard = l.getDropdownCard();
		Select ds1 = new Select(dropdownCard);
		List<WebElement> options = ds1.getOptions();
		//System.out.println(options);
		ds1.selectByVisibleText(l.getDataFromExcel(1, 7));
		
	    
	    
	}

	@Then("User should select Creditcard no month year Name on Card")
	public void userShouldSelectCreditcardNoMonthYearNameOnCard() throws IOException {
		
		l.getTxtCard().sendKeys(l.getDataFromExcel(1, 8));
		l.getTxtCardMonth().sendKeys(l.getDataFromExcel(1, 9));
		l.getTxtCardYear().sendKeys(l.getDataFromExcel(1, 10));
		l.getTxtCardName().sendKeys(l.getDataFromExcel(1, 11));
		
	   
	    
	}

	@When("User Click remember me check box and click purchase flight")
	public void userClickRememberMeCheckBoxAndClickPurchaseFlight() throws InterruptedException {
		
		l.getBtnPurchase().click();
		Thread.sleep(2000);
		
	    
	    
	}

	@When("Copy the order id and write into excel")
	public void copyTheOrderIdAndWriteIntoExcel() throws IOException {
	   
		String result = l.getOrderResult().getText();
		System.out.println(result);
		l.writeDataToExcel(0, 0, result);
	Assert.assertTrue(false);
	}

}
