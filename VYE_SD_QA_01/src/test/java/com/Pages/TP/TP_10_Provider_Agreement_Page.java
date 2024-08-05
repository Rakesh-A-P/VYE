package com.Pages.TP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseUtilClass;

public class TP_10_Provider_Agreement_Page extends BaseUtilClass {

	
	public TP_10_Provider_Agreement_Page() {
		PageFactory.initElements(driver, this);
		
	}
	public WebElement getAGREE_AND_SIGN_button() {
		return AGREE_AND_SIGN_button;
	}

	@FindBy(xpath="(//span[.='Trading Partner Agreement'])[2]")
	private WebElement Provider_Agreement_tab;
	@FindBy(xpath="(//span[.='AGREE AND SIGN'])[1]")
	private WebElement AGREE_AND_SIGN_button;
	@FindBy(xpath="(//span[.='OK'])[1]")
	private WebElement OK;
//	@FindBy(xpath="(//span[.='Get started'])[1]")
//	private WebElement Get_started;
//	@FindBy(xpath="//div[@data-testid='field-signature']")
//	private WebElement click_to_sign;
//	@FindBy(xpath="(//span[.='Next Req*'])[1]")
//	private WebElement Next_Req;
	@FindBy(xpath="//span[.='PROCEED TO SIGN']")
	private WebElement proceed_to_sign_tab;
	
	public WebElement getProceed_to_sign_tab() {
		return proceed_to_sign_tab;
	}

	@FindBy(xpath="//div/textarea[@placeholder='Title']")
	private WebElement title_text;
	@FindBy(xpath="//div/textarea[@data-qa-ref='text-input']")
	private WebElement name_text;
	public WebElement getName_text() {
		return name_text;
	}

	public WebElement getFull_name_text() {
		return full_name_text;
	}

	@FindBy(xpath="//div/textarea[@placeholder='Full Name']")
	private WebElement full_name_text;
	

		public WebElement getOK() {
		return OK;
	}

	public WebElement getTitle_text() {
		return title_text;
	}

		////button[@id='signBtn']
		@FindBy(xpath="//button[@id='signBtn']")
	    private WebElement AgreeandSignButton;
		public WebElement getProvider_Agreement_tab() {
			return Provider_Agreement_tab;
		}

		public WebElement getContinuet_button_Canvas_Signature() {
			return Continuet_button_Canvas_Signature;
		}

		public WebElement getClick_To_Close() {
			return Click_To_Close;
		}

		public WebElement getAgreeandSignButton() {
			return AgreeandSignButton;
		}
	 
		@FindBy(xpath="(//button[@role='button'])[2]")
	  private WebElement ClickOk;
	 
		public WebElement getClickOk() {
		return ClickOk;
		}

		@FindBy(xpath="(//button[@role='button'])[1]")
		  private WebElement Click_getStarted;
	 
			public WebElement getClick_getStarted() {
			return Click_getStarted;
			}

			@FindBy(xpath="//span[contains(text(),'Insert')]")
			  private WebElement Insert_button_Canvas_Signature;
	 
				public WebElement getInsert_button_Canvas_Signature() {
				return Insert_button_Canvas_Signature;
				}

				@FindBy(xpath="//span[.='Continue']")//(//button/span[contains(text(),'Continue')])[1]
				  private WebElement Continuet_button_Canvas_Signature;
	 
					public WebElement getContinue_button_Canvas_Signature() {
					return Continuet_button_Canvas_Signature;
					}


	 
					@FindBy(xpath="(//button/span[contains(text(),'I agree')])")
					  private WebElement I_Agree_button_Canvas_Signature;
	 
						public WebElement getI_Agree_button_Canvas_Signature() {
						return I_Agree_button_Canvas_Signature;
						}

				@FindBy(xpath="//canvas[contains(@id,'signature-modal-draw__canvas')]")
				  private WebElement Canvas_Signature;
	 
					public WebElement getCanvas_Signature() {
					return Canvas_Signature;
					}

				@FindBy(xpath="(//button[@role='button'])[1]")
				  private WebElement Click_NextReq;
	 
					public WebElement getClick_NextReq() {
					return Click_NextReq;
					}
				@FindBy(xpath="//div[contains(text(),'Click to sign')]")
				  private WebElement Click_To_Sign;
	 
					public WebElement getClick_To_Sign() {
					return Click_To_Sign;
					}

					@FindBy(xpath="//span[.='Close']")
					  private WebElement Click_To_Close;
	 
						public WebElement getCClick_To_Close() {
						return Click_To_Close;
						}
				
						public void Provider_agreemenet_signin_tab() throws InterruptedException {
							Thread.sleep(2000);
							 scrollToViewelement(getProvider_Agreement_tab());
						   	 Thread.sleep(1000);
						   	 actionClick(getProvider_Agreement_tab());
						   		 Thread.sleep(2000);    
						}
						
             public void Provider_agreemenet_signin() throws InterruptedException {
						
					
							
							  
						  try { Thread.sleep(2000);
							scrollToViewelement(getAGREE_AND_SIGN_button());
							 Thread.sleep(2000);
							  actionClick(getAGREE_AND_SIGN_button());
							 
						} catch (org.openqa.selenium.NoSuchElementException e) {
							 actionClick(getAGREE_AND_SIGN_button());
							  Thread.sleep(25000);
							// TODO: handle exception
						}
						  Thread.sleep(10000);
						   WebElement iframelement = driver.findElement(By.xpath("//iframe[@id='hsEmbeddedFrame']"));
						   driver.switchTo().frame(iframelement);
						   
						   Thread.sleep(10000);
						   actionClick(getClickOk());
						   Thread.sleep(5000);
						   actionClick(getClick_getStarted());
						   Thread.sleep(5000);
						   actionClick(getClick_NextReq());
						   Thread.sleep(5000);
						   actionClick(getClick_To_Sign());
						  
						   
						   Thread.sleep(5000);
						   CanvasSignature(getCanvas_Signature());
						   Thread.sleep(5000);
						   
						   try {
								actionClick(getInsert_button_Canvas_Signature());
								   Thread.sleep(5000);
								   
							} catch (Exception e) {
								// TODO: handle exception
							}   
						   try {
							   Thread.sleep(2000);
							   sendkeys(getTitle_text(), "rakes");
							   Thread.sleep(5000); 
						} catch (Exception e) {
							// TODO: handle exception
						}
								   
							  
								   actionClick(getContinue_button_Canvas_Signature());
							   Thread.sleep(5000);
							   actionClick(getI_Agree_button_Canvas_Signature());
						
							   Thread.sleep(10000);
						
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
