package com.Pages.Entity;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseUtilClass;

public class EntitySummaryPage extends BaseUtilClass{
	
	public EntitySummaryPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//span[.='Summary'])[2]")
	private WebElement Summary_tab;
	@FindBy(xpath="//input[@aria-label='First Name']")
	private WebElement First_Name;
	@FindBy(xpath="//input[@aria-label='Last Name']")
	private WebElement Last_Name;
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement checkbox;
	@FindBy(xpath="//span[.='Back']")
	private WebElement Back;
	@FindBy(xpath="//span[.='SUBMIT']")
	private WebElement Submit;
	@FindBy(xpath="//span[.='Navigate to dashboard']")
	private WebElement Navigate_to_dashboard_button;
	
	
	public WebElement getNavigate_to_dashboard_button() {
		return Navigate_to_dashboard_button;
	}
	public WebElement getSummary_tab() {
		return Summary_tab;
	}
	public WebElement getFirst_Name() {
		return First_Name;
	}
	public WebElement getLast_Name() {
		return Last_Name;
	}
	public WebElement getCheckbox() {
		return checkbox;
	}
	public WebElement getBack() {
		return Back;
	}
	public WebElement getSubmit() {
		return Submit;
	}
	

}
