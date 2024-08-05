package com.Pages.TP;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseUtilClass;

public class TP_07_Upload_Document_page extends BaseUtilClass {
	 

	
	
	public TP_07_Upload_Document_page() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//span[.='Upload Documents'])[2]")
	private WebElement Upload_Documents_tab;
	@FindBy(xpath="(//input[@type='file'])[1]")
	private WebElement Upload_File_sExclusion_Sanction_Documents_button;
	@FindBy(xpath="(//input[@type='file'])[2]")
	private WebElement Upload_Files_Additional_Documents_button;
	public WebElement getUpload_File_sExclusion_Sanction_Documents_button() {
		return Upload_File_sExclusion_Sanction_Documents_button;
	}
	public WebElement getUpload_Files_Additional_Documents_button() {
		return Upload_Files_Additional_Documents_button;
	}
	public WebElement getUpload_Documents_tab() {
		return Upload_Documents_tab;
	}
	
	public void Upload_Documents_tab_click() throws InterruptedException {
		scrollToViewelement(getUpload_Documents_tab());
		Thread.sleep(1000);
		actionClick(getUpload_Documents_tab());
		Thread.sleep(2000);
	}
	
	public void upload_file_into_upload_button() throws FileNotFoundException, IOException {
		String file = getPropertyFileValue("Excell");
		
		try {
			Thread.sleep(3000);
			
			getUpload_File_sExclusion_Sanction_Documents_button().sendKeys(file);
			Thread.sleep(2000);
			getUpload_Files_Additional_Documents_button().sendKeys(file);
			Thread.sleep(4000);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
	
}
