package com.Pages.TP;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseUtilClass;
import Utilities.Excelreader;

public class TP_09_Affiliation_Page  extends BaseUtilClass{

	public TP_09_Affiliation_Page() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="(//span[.='Affiliation'])[2]")
	private WebElement Affiliation_tab;

	public WebElement getAffiliation_tab() {
		return Affiliation_tab;
	}
	
	public void Affiliation_tab_click() throws InterruptedException {
		scrollToViewelement(getAffiliation_tab());
		Thread.sleep(1000);
		actionClick(getAffiliation_tab());
		Thread.sleep(2000);
	}
	
}
