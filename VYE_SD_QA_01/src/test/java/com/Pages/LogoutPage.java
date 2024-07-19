package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseUtilClass;

public class LogoutPage extends BaseUtilClass{
	public LogoutPage() {
		
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[.='Provider Admin']")
	private WebElement Provider_Admin;
	@FindBy(xpath="//span[.='Log out']")
	private WebElement logoutbutton;
	public WebElement getProvider_Admin() {
		return Provider_Admin;
	}
	public WebElement getLogoutbutton() {
		return logoutbutton;
	}
	
	

}
