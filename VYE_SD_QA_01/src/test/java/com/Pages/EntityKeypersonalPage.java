package com.Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseUtilClass;

public class EntityKeypersonalPage extends BaseUtilClass{

	public  EntityKeypersonalPage() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="(//span[.='Key Personnel'])[2]")
	private WebElement Key_personal_tab;
	@FindBy(xpath="//span[.='+ Add Line']")
	private WebElement Add_line_keypersonal;
	@FindBy(xpath="(//div[@role='button'])[2]")
	private WebElement Managing_Employee_Type;
    @FindBy(xpath="//li[@role='option']")
    private List<WebElement> dropdownlist;
	@FindBy(xpath="(//div[@role='button'])[3]")
	private WebElement Employee_Status;
	@FindBy(xpath="(//div[@role='button'])[5]")
	private WebElement Country_of_Birth;
	@FindBy(xpath="(//div[@role='button'])[4]")
	private WebElement State_of_Birth;
	@FindBy(xpath="//input[@aria-label='First Name']")
	private WebElement First_Name;
	@FindBy(xpath="//input[@aria-label='Middle Name']")
	private WebElement Middle_Name;
	@FindBy(xpath="//input[@aria-label='Last Name']")
	private WebElement Last_Name;
	@FindBy(xpath="//INPUT[@placeholder='___-__-____']")
	private WebElement SSN;
	@FindBy(xpath="(//input[@placeholder='MM/DD/YYYY'])[1]")
	private WebElement date_of_birth;
	@FindBy(xpath="(//input[@placeholder='MM/DD/YYYY'])[2]")
	private WebElement effective_date;
	@FindBy(xpath="(//input[@placeholder='MM/DD/YYYY'])[3]")
	private WebElement end_date;
	@FindBy(xpath="//input[@id='line1']")
	private WebElement Address;
	@FindBy(xpath="(//li[@role='option'])[1]")
	private WebElement address_click;
	@FindBy(xpath="//span[.='Save']")//span[.='Save']
	private WebElement Save;
	
	public WebElement getFirst_Name() {
		return First_Name;
	}
	public WebElement getMiddle_Name() {
		return Middle_Name;
	}
	public WebElement getLast_Name() {
		return Last_Name;
	}
	public WebElement getSSN() {
		return SSN;
	}
	public WebElement getDate_of_birth() {
		return date_of_birth;
	}
	public WebElement getEffective_date() {
		return effective_date;
	}
	public WebElement getEnd_date() {
		return end_date;
	}
	public WebElement getAddress() {
		return Address;
	}
	public WebElement getAddress_click() {
		return address_click;
	}
	public WebElement getSave() {
		return Save;
	}
	public WebElement getKey_personal_tab() {
		return Key_personal_tab;
	}
	public WebElement getAdd_line_keypersonal() {
		return Add_line_keypersonal;
	}
	public WebElement getManaging_Employee_Type() {
		return Managing_Employee_Type;
	}
	public List<WebElement> getDropdownlist() {
		return dropdownlist;
	}
	public WebElement getEmployee_Status() {
		return Employee_Status;
	}
	public WebElement getCountry_of_Birth() {
		return Country_of_Birth;
	}
	public WebElement getState_of_Birth() {
		return State_of_Birth;
	}

	

	

}
