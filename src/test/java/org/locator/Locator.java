package org.locator;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Locator extends BaseClass{
	
	
	
	public Locator() {
		
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//select[@name='fromPort']")
	private WebElement dropDown1;
	
	@FindBy(xpath="//select[@name='toPort']")
	private WebElement dropDown2;
	
	
	@FindBy(xpath="//input[@value='Find Flights']")
	private WebElement btnFindFlights;
	
	
	
	@FindBy(xpath="(//input[@value='Choose This Flight'])[1]")
	private WebElement btnChooseFlight;
	
	
	
	@FindBy(xpath="//input[@id='inputName']")
	private WebElement txtFirstName;
	
	
	@FindBy(xpath="//input[@id='address']")
	private WebElement txtAddress;
	
	
	@FindBy(xpath="//input[@id='city']")
	private WebElement txtCity;
	
	@FindBy(xpath="//input[@id='state']")
	private WebElement txtState;
	
	
	@FindBy(xpath="//input[@id='zipCode']")
	private WebElement txtZip;
	
	@FindBy(xpath="//select[@id='cardType']")
	private WebElement dropdownCard;
	
	@FindBy(xpath="//input[@id='creditCardNumber']")
	private WebElement txtCard;
	
	@FindBy(xpath="//input[@id='creditCardMonth']")
	private WebElement txtCardMonth;
	
	@FindBy(xpath="//input[@id='creditCardYear']")
	private WebElement txtCardYear;
	
	@FindBy(xpath="//input[@id='nameOnCard']")
	private WebElement txtCardName;
	
	@FindBy(xpath="//input[@value='Purchase Flight']")
	private WebElement btnPurchase;
	
	
	
			
	@FindBy(xpath="/html/body/div[2]/div/table/tbody/tr[1]/td[2]")
	private WebElement orderResult;	
	
	
	
	
	public WebElement getBtnChooseFlight() {
		return btnChooseFlight;
	}

	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtAddress() {
		return txtAddress;
	}

	public WebElement getTxtCity() {
		return txtCity;
	}

	public WebElement getTxtState() {
		return txtState;
	}

	public WebElement getTxtZip() {
		return txtZip;
	}

	public WebElement getDropdownCard() {
		return dropdownCard;
	}

	public WebElement getTxtCard() {
		return txtCard;
	}

	public WebElement getTxtCardMonth() {
		return txtCardMonth;
	}

	public WebElement getTxtCardYear() {
		return txtCardYear;
	}

	public WebElement getTxtCardName() {
		return txtCardName;
	}

	public WebElement getBtnPurchase() {
		return btnPurchase;
	}

	public WebElement getOrderResult() {
		return orderResult;
	}

	public WebElement getBtnFindFlights() {
		return btnFindFlights;
	}

	public WebElement getDropDown1() {
		return dropDown1;
	}

	public WebElement getDropDown2() {
		return dropDown2;
	}
	
	
	

}
