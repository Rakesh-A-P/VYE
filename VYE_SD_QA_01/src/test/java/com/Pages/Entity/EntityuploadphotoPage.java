package com.Pages.Entity;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseUtilClass;
import net.bytebuddy.asm.Advice.This;

public class EntityuploadphotoPage extends BaseUtilClass {
	
	public EntityuploadphotoPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//span[.='Upload Documents'])[2]")
	private WebElement Upload_Documents_tab;
	@FindBy(xpath="(//span[.='Upload Documents'])[1]")
	private WebElement Upload_Documents_tab1;
	public WebElement getUpload_Documents_tab1() {
		return Upload_Documents_tab1;
	}

	@FindBy(xpath="(//input[@type='file'])[1]")
	private WebElement Upload_Files_button1;
	@FindBy(xpath="(//input[@type='file'])[2]")
	private WebElement Upload_Files_button2;
	public WebElement getUpload_Files_button1() {
		return Upload_Files_button1;
	}
	public WebElement getUpload_Files_button2() {
		return Upload_Files_button2;
	}

	@FindBy(xpath="//span[.='Next']")
	private WebElement Next;
	
	
	public WebElement getUpload_Documents_tab() {
		return Upload_Documents_tab;
	}
	
	public WebElement getNext() {
		return Next;
	}
	
	
	

}
