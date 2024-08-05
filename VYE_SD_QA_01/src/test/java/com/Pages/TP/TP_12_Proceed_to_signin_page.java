package com.Pages.TP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseUtilClass;

public class TP_12_Proceed_to_signin_page extends BaseUtilClass{

	public TP_12_Proceed_to_signin_page() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[.='PROCEED TO SIGN']")
	private WebElement proceed_to_sign_tab;
	@FindBy(xpath="(//button[@role='button'])[2]")
	  private WebElement ClickOk;
	@FindBy(xpath="(//button[@role='button'])[1]")
	  private WebElement Click_getStarted;
	@FindBy(xpath="(//button[@role='button'])[1]")
	  private WebElement Click_NextReq;
	public WebElement getFull_name_text() {
		return full_name_text;
	}	@FindBy(xpath="//div[contains(text(),'Click to sign')]")
	  private WebElement Click_To_Sign;
	 
		public WebElement getClick_To_Sign() {
		return Click_To_Sign;
		}
	@FindBy(xpath="//span[.='I agree']")
	  private WebElement I_Agree_button_Canvas_Signature;

		public WebElement getI_Agree_button_Canvas_Signature() {
		return I_Agree_button_Canvas_Signature;
		}
		@FindBy(xpath="//canvas[contains(@id,'signature-modal-draw__canvas')]")
		  private WebElement Canvas_Signature;

			public WebElement getCanvas_Signature() {
			return Canvas_Signature;
			}	@FindBy(xpath="//span[contains(text(),'Insert')]")
			  private WebElement Insert_button_Canvas_Signature;
			 
				public WebElement getInsert_button_Canvas_Signature() {
				return Insert_button_Canvas_Signature;
				}
				
	@FindBy(xpath="//span[.='Continue']")//(//button/span[contains(text(),'Continue')])[1]
	  private WebElement Continuet_button_Canvas_Signature;

		public WebElement getContinue_button_Canvas_Signature() {
		return Continuet_button_Canvas_Signature;
		}

	@FindBy(xpath="//div/textarea[@placeholder='Full Name']")
	private WebElement full_name_text;
		public WebElement getClick_NextReq() {
		return Click_NextReq;
		}
		public WebElement getClick_getStarted() {
		return Click_getStarted;
		}

		public WebElement getClickOk() {
		return ClickOk;
		}
	public WebElement getProceed_to_sign_tab() {
		return proceed_to_sign_tab;
	}
	@FindBy(xpath="//a[.='Navigate to dashboard']")
	private WebElement navigate_to_dashboard;
	
	
	
	public WebElement getNavigate_to_dashboard() {
		return navigate_to_dashboard;
	}
	public void Proceed_to_signin() throws InterruptedException {
	
		
		
		Thread.sleep(8000);
		actionClick(getProceed_to_sign_tab());
		 
	   
	    Thread.sleep(10000);
		   WebElement iframelement = driver.findElement(By.xpath("//iframe[@id='hsEmbeddedFrame']"));
		   driver.switchTo().frame(iframelement);
		   
		   Thread.sleep(10000);
		   actionClick(getClickOk());
		   Thread.sleep(3000);
		   actionClick(getClick_getStarted());
		   Thread.sleep(3000);
		   actionClick(getClick_NextReq());
		   Thread.sleep(3000);
		    sendkeys(getFull_name_text(), "rakes");
		    Thread.sleep(3000);
		    actionClick(getClick_To_Sign());
			  
			   
			   Thread.sleep(3000);
			   CanvasSignature(getCanvas_Signature());
			   Thread.sleep(3000);
			   
			   try {
					actionClick(getInsert_button_Canvas_Signature());
					   Thread.sleep(3000);
					   
				} catch (Exception e) {
					// TODO: handle exception
				}   
			  
					   
				  
					   actionClick(getContinue_button_Canvas_Signature());
				   Thread.sleep(3000);
				   actionClick(getI_Agree_button_Canvas_Signature());

				   Thread.sleep(8000);
				   
				   actionClick(getNavigate_to_dashboard());
		
		   
		
	
	}
		
	public static void CanvasSignature(WebElement elementToClick)
	{
		Actions actions = new Actions(driver);
		actions.moveToElement(elementToClick, 50, 50).clickAndHold().perform();
		actions.click(elementToClick).perform();
		actions.moveByOffset(10, 20);
		actions.moveByOffset(20, -10).perform();
        actions.moveByOffset(-30, 15).perform();
        actions.moveByOffset(40, 0).perform();
		actions.release().perform();
		
	}
	

		 
}
