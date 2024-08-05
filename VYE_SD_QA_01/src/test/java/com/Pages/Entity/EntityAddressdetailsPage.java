package com.Pages.Entity;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseUtilClass;

public class EntityAddressdetailsPage  extends BaseUtilClass{
	
	public EntityAddressdetailsPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="(//span[.='Address Details'])[2]")
	private WebElement Address_Details_tab;
	public WebElement getAddress_Details_tab() {
		return Address_Details_tab;
	}
	@FindBy(xpath="//input[@id='line1']")
	private WebElement Mailing_Address_Line;
	@FindBy(xpath="(//li[@role='option'])[1]")
    private WebElement Mailing_address_click;
	@FindBy(xpath="//input[@aria-label='Attention Line']")
	private WebElement Attention_line;
	@FindBy(xpath="//input[contains(@id , 'Extension')]")
	private WebElement Extension;
	@FindBy(xpath="(//input[@placeholder='(___)___-____'] )[1]")
	private WebElement phone;
	@FindBy(xpath="(//input[@placeholder='(___)___-____'] )[2]")
	private WebElement fax;
	@FindBy(xpath="//input[@aria-label='Email']")
	private WebElement Email;
	@FindBy(xpath="//input[@name='Position']")
	private WebElement Postion;
	@FindBy(xpath="(//input[@type='radio'])[1]")
	private WebElement Yes_Billing_Contact_Person_Details;
	@FindBy(xpath="(//input[@type='radio'])[2]")
	private WebElement No_Billing_Contact_Person_Details;
	public WebElement getYes_Billing_Contact_Person_Details() {
		return Yes_Billing_Contact_Person_Details;
	}
	public WebElement getNo_Billing_Contact_Person_Details() {
		return No_Billing_Contact_Person_Details;
	}
	public WebElement getAttention_line() {
		return Attention_line;
	}
	public WebElement getExtension() {
		return Extension;
	}
	public WebElement getPhone() {
		return phone;
	}
	public WebElement getFax() {
		return fax;
	}
	public WebElement getEmail() {
		return Email;
	}
	public WebElement getPostion() {
		return Postion;
	}
	public WebElement getPostion_dropdown_first() {
		return Postion_dropdown_first;
	}
	@FindBy(xpath="(//li[@role='option'])[1]")
    private WebElement Postion_dropdown_first;
	
	
	public WebElement getMailing_Address_Line() {
		return Mailing_Address_Line;
	}
	public WebElement getMailing_address_click() {
		return Mailing_address_click;
	}
	public void SelectQuestion(String Options) throws InterruptedException
    {
	   SelectRadioButton(Options, getYes_Billing_Contact_Person_Details(), getNo_Billing_Contact_Person_Details(), "Q of Billing Contact Person Details");
    }
	
}
