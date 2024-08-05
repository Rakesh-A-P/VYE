package com.Pages.Entity;

import static org.testng.Assert.assertEquals;

import java.io.FileNotFoundException;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import Utilities.BaseUtilClass;

public class loginPage extends BaseUtilClass {

	public loginPage() {
		PageFactory.initElements(driver, this);
	}
	
    // login as provider
	@FindBy(xpath = "//button[@id='details-button']")
	private WebElement adavnec;
	@FindBy(xpath = "//a[@id='proceed-link']")
	private WebElement link;
	@FindBy(xpath = "//span[.='Sign In / Register']")
	private WebElement signin;
	@FindBy(xpath = "//input[@id='username']")
	private WebElement un;
	@FindBy(xpath = "//input[@id='password']")
	private WebElement pwd;
	@FindBy(xpath = "//span[.='Login']")
	private WebElement login;
//	@FindBy(xpath = "//p[.=' ****WARNING**WARNING**WARNING****']")
//	private WebElement Agree1;
	@FindBy(xpath = "//button[.='Agree']") ////body/div[@id='root']/div[1]/div[2]/div[1]/div[4]/div[1]/div[5]/div[1]/button[1]/span[1]
	private WebElement Agree;
	@FindBy(xpath = "//button[@data-type='close' and @class='joyride-tooltip__close joyride-tooltip__close--header']")
	private WebElement close;
	@FindBy(xpath = "//a[contains(@class ,'dashboard_delete-link')]")
	private WebElement delete;
	@FindBy(xpath = "//span[.='Delete']")
	private WebElement delete1;
	@FindBy(xpath = "(//span[.='Continue'])[2]")
	private WebElement Continue;
	
	
	public WebElement getContinue() {
		return Continue;
	}

	public WebElement getClose() {
		return close;
	}

	public WebElement getDelete() {
		return delete;
	}

	public WebElement getDelete1() {
		return delete1;
	}

	public WebElement getAdavnec() {
		return adavnec;
	}

	public WebElement getLink() {
		return link;
	}
	public WebElement getSignin() {
		return signin;
	}
	public WebElement getUn() {
		return un;
	}

	public WebElement getPwd() {
		return pwd;
	}
	public WebElement getLogin() {
		return login;
	}
	public WebElement getAgree() {
		return Agree;
	}
	
	public void SelectCONTINUEORDELETE(String button) throws InterruptedException
    {
		SelectContinueDelete(button, getContinue(), getDelete(), getDelete1(), "PROVIDER ENROLLEMENT Application");
    }
	
	
	



}
