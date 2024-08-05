package com.Pages.Entity;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseUtilClass;

public class EntityEFTInformationPage extends BaseUtilClass {

	
	public EntityEFTInformationPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//span[.='EFT Information'])[2]")
	private WebElement EFT_Information_tab;
	@FindBy(xpath="//input[@aria-label='Name of the Financial Institution']")
	private WebElement Name_of_the_Financial_Institution;
	@FindBy(xpath="//input[@placeholder='_________']")
	private WebElement Routing_Number_of_EF;
	@FindBy(xpath="//input[contains(@id,'Account Number')]")
	private WebElement Account_Number;
	@FindBy(xpath="//input[@placeholder='MM/DD/YYYY']")
	private WebElement start_date;
	@FindBy(xpath="//input[@name='Account Type']")
	private WebElement account_type;
	@FindBy(xpath="//strong[.='Savings']")
	private WebElement Savings;
	@FindBy(xpath="//strong[.='Checking']")
	private WebElement Checking;
	

	
	public WebElement getEFT_Information_tab() {
		return EFT_Information_tab;
	}
	public WebElement getName_of_the_Financial_Institution() {
		return Name_of_the_Financial_Institution;
	}
	public WebElement getRouting_Number_of_EF() {
		return Routing_Number_of_EF;
	}
	public WebElement getAccount_Number() {
		return Account_Number;
	}
	public WebElement getStart_date() {
		return start_date;
	}
	public WebElement getAccount_type() {
		return account_type;
	}
	public WebElement getSavings() {
		return Savings;
	}
	public WebElement getChecking() {
		return Checking;
	}
	
}
