package com.Pages.TP;

import javax.print.DocFlavor.STRING;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseUtilClass;

public class TP_06_Exclusion_Sanction_page extends BaseUtilClass {

	
	public TP_06_Exclusion_Sanction_page() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//span[.='Exclusion/Sanction Information'])[2]")
	private WebElement ExclusionSanction_Information_tab;
	public WebElement getExclusionSanction_Information_tab() {
		return ExclusionSanction_Information_tab;
	}

	@FindBy(xpath="//input[@type='radio' and contains(@name,'Fraud, theft') and @value='true']")
	private WebElement Yes_QuestionA1;
	@FindBy(xpath="//input[@type='radio' and contains(@name,'Fraud, theft') and @value='false']")
	private WebElement 	No_QuestionA1;
	@FindBy(xpath="//input[@type='radio' and contains(@name,' Financial misconduct') and @value='true']")
	private WebElement Yes_QuestionA2;
	@FindBy(xpath="//input[@type='radio' and contains(@name,' Financial misconduct') and @value='false']")
	private WebElement No_QuestionA2;
	@FindBy(xpath="//input[@type='radio' and contains(@name,' Perjury') and @value='true']")
	private WebElement Yes_QuestionA3;
	@FindBy(xpath="//input[@type='radio' and contains(@name,' Perjury') and @value='false']")
	private WebElement No_QuestionA3;
	@FindBy(xpath="//input[@type='radio' and contains(@name,' Abuse or neglect') and @value='true']")
	private WebElement Yes_QuestionA4;
	@FindBy(xpath="//input[@type='radio' and contains(@name,' Abuse or neglect') and @value='false']")
	private WebElement No_QuestionA4;
	@FindBy(xpath="//input[@type='radio' and contains(@name,' Obstruction') and @value='true']")
	private WebElement Yes_QuestionA5;
	@FindBy(xpath="(//input[@type='radio' and contains(@name,' Obstruction') and @value='false	']")
	private WebElement No_QuestionA5;
	@FindBy(xpath="//input[@type='radio' and contains(@name,' Unlawful manufacture') and @value='true']")
	private WebElement Yes_QuestionA6;
	@FindBy(xpath="//input[@type='radio' and contains(@name,' Unlawful manufacture') and @value='false']")
	private WebElement No_QuestionA6;
	@FindBy(xpath="//input[@type='radio' and contains(@name,'Health care') and @value='true']")
	private WebElement Yes_QuestionA7;
	@FindBy(xpath="//input[@type='radio' and contains(@name,'Health care') and @value='false']")
	private WebElement No_QuestionA7;
//B. Has the provider or any person with an ownership or controlling interest in the provider ever had the following situations apply:
	@FindBy(xpath="//input[@type='radio' and contains(@name,' Failed to grant') and @value='true']")
	private WebElement Yes_QuestionB1;
	@FindBy(xpath="//input[@type='radio' and contains(@name,' Failed to grant') and @value='false']")
	private WebElement No_QuestionB1;
	@FindBy(xpath="//input[@type='radio' and contains(@name,'Failed to provide') and @value='true']")
	private WebElement Yes_QuestionB2;
	@FindBy(xpath="//input[@type='radio' and contains(@name,'Failed to provide') and @value='false']")
	private WebElement No_QuestionB2;
	@FindBy(xpath="//input[@type='radio' and contains(@name,'license to provide health') and @value='true']")
	private WebElement Yes_QuestionB3;
	@FindBy(xpath="//input[@type='radio' and contains(@name,'license to provide health') and @value='false']")
	private WebElement No_QuestionB3;
	@FindBy(xpath="//input[@type='radio' and contains(@name,'accreditation') and @value='true']")
	private WebElement Yes_QuestionB4;
	@FindBy(xpath="//input[@type='radio' and contains(@name,'accreditation') and @value='false']")
	private WebElement No_QuestionB4;
	@FindBy(xpath="//input[@type='radio' and contains(@name,'exclusion, debarment') and @value='true']")
	private WebElement Yes_QuestionB5;
	@FindBy(xpath="//input[@type='radio' and contains(@name,'exclusion, debarment') and @value='false']")
	private WebElement No_QuestionB5;
	@FindBy(xpath="//input[@type='radio' and contains(@name,'Current payment') and @value='true']")
	private WebElement Yes_QuestionB6;
	@FindBy(xpath="//input[@type='radio' and contains(@name,'Current payment') and @value='false']")
	private WebElement No_QuestionB6;
	@FindBy(xpath="//input[@type='radio' and contains(@name,'Judgment') and @value='true']")
	private WebElement Yes_QuestionB7;
	@FindBy(xpath="//input[@type='radio' and contains(@name,'Judgment') and @value='false']")
	private WebElement No_QuestionB7;
	@FindBy(xpath=" //input[@type='radio' and contains(@name,'Current overpayment') and @value='true']")
	private WebElement Yes_QuestionB8;
	public WebElement getYes_QuestionA1() {
		return Yes_QuestionA1;
	}
	public WebElement getNo_QuestionA1() {
		return No_QuestionA1;
	}
	public WebElement getYes_QuestionA2() {
		return Yes_QuestionA2;
	}
	public WebElement getNo_QuestionA2() {
		return No_QuestionA2;
	}
	public WebElement getYes_QuestionA3() {
		return Yes_QuestionA3;
	}
	public WebElement getNo_QuestionA3() {
		return No_QuestionA3;
	}
	public WebElement getYes_QuestionA4() {
		return Yes_QuestionA4;
	}
	public WebElement getNo_QuestionA4() {
		return No_QuestionA4;
	}
	public WebElement getYes_QuestionA5() {
		return Yes_QuestionA5;
	}
	public WebElement getNo_QuestionA5() {
		return No_QuestionA5;
	}
	public WebElement getYes_QuestionA6() {
		return Yes_QuestionA6;
	}
	public WebElement getNo_QuestionA6() {
		return No_QuestionA6;
	}
	public WebElement getYes_QuestionA7() {
		return Yes_QuestionA7;
	}
	public WebElement getNo_QuestionA7() {
		return No_QuestionA7;
	}
	public WebElement getYes_QuestionB1() {
		return Yes_QuestionB1;
	}
	public WebElement getNo_QuestionB1() {
		return No_QuestionB1;
	}
	public WebElement getYes_QuestionB2() {
		return Yes_QuestionB2;
	}
	public WebElement getNo_QuestionB2() {
		return No_QuestionB2;
	}
	public WebElement getYes_QuestionB3() {
		return Yes_QuestionB3;
	}
	public WebElement getNo_QuestionB3() {
		return No_QuestionB3;
	}
	public WebElement getYes_QuestionB4() {
		return Yes_QuestionB4;
	}
	public WebElement getNo_QuestionB4() {
		return No_QuestionB4;
	}
	public WebElement getYes_QuestionB5() {
		return Yes_QuestionB5;
	}
	public WebElement getNo_QuestionB5() {
		return No_QuestionB5;
	}
	public WebElement getYes_QuestionB6() {
		return Yes_QuestionB6;
	}
	public WebElement getNo_QuestionB6() {
		return No_QuestionB6;
	}
	public WebElement getYes_QuestionB7() {
		return Yes_QuestionB7;
	}
	public WebElement getNo_QuestionB7() {
		return No_QuestionB7;
	}
	public WebElement getYes_QuestionB8() {
		return Yes_QuestionB8;
	}
	public WebElement getNo_QuestionB8() {
		return No_QuestionB8;
	}


	@FindBy(xpath=" //input[@type='radio' and contains(@name,'Current overpayment') and @value='false']")
	private WebElement No_QuestionB8;
	
	
	
	public void SelectQuestionA1(String ExclusionOption) throws InterruptedException
    {
	   SelectRadioButton(ExclusionOption, getYes_QuestionA1(), getNo_QuestionA1(), "Q1 TradingExclusion Sanction ");
    }
	public void SelectQuestionA2(String ExclusionOption) throws InterruptedException
    {
	   SelectRadioButton(ExclusionOption, getYes_QuestionA2(), getNo_QuestionA2(), "Q2 TradingExclusion Sanction ");
    }
	public void SelectQuestionA3(String ExclusionOption) throws InterruptedException
    {
	   SelectRadioButton(ExclusionOption, getYes_QuestionA3(), getNo_QuestionA3(), "Q3 TradingExclusion Sanction ");
    }
	public void SelectQuestionA4(String ExclusionOption) throws InterruptedException
    {
	   SelectRadioButton(ExclusionOption, getYes_QuestionA4(), getNo_QuestionA4(), "Q4 TradingExclusion Sanction ");
    }
	public void SelectQuestionA5(String ExclusionOption) throws InterruptedException
    {
	   SelectRadioButton(ExclusionOption, getYes_QuestionA5(), getNo_QuestionA5(), "Q5 TradingExclusion Sanction ");
    }
	public void SelectQuestionA6(String ExclusionOption) throws InterruptedException
    {
	   SelectRadioButton(ExclusionOption, getYes_QuestionA6(), getNo_QuestionA6(), "Q6 TradingExclusion Sanction ");
    }
	
	public void SelectQuestionA7(String ExclusionOption) throws InterruptedException
    {
	   SelectRadioButton(ExclusionOption, getYes_QuestionA7(), getNo_QuestionA7(), "Q7 TradingExclusion Sanction ");
    }
	
	
	public void SelectQuestionB1(String ExclusionOption) throws InterruptedException
    {
	   SelectRadioButton(ExclusionOption, getYes_QuestionB1(), getNo_QuestionB1(), "Q1 B TradingExclusion Sanction ");
    }
	public void SelectQuestionB2(String ExclusionOption) throws InterruptedException
    {
	   SelectRadioButton(ExclusionOption, getYes_QuestionB2(), getNo_QuestionB2(), "Q2 B TradingExclusion Sanction ");
    }
	public void SelectQuestionB3(String ExclusionOption) throws InterruptedException
    {
	   SelectRadioButton(ExclusionOption, getYes_QuestionB3(), getNo_QuestionB3(), "Q3 B TradingExclusion Sanction ");
    }
	public void SelectQuestionB4(String ExclusionOption) throws InterruptedException
    {
	   SelectRadioButton(ExclusionOption, getYes_QuestionB4(), getNo_QuestionB4(), "Q4 B TradingExclusion Sanction ");
    }
	public void SelectQuestionB5(String ExclusionOption) throws InterruptedException
    {
	   SelectRadioButton(ExclusionOption, getYes_QuestionB5(), getNo_QuestionB5(), "Q5 B TradingExclusion Sanction ");
    }
	public void SelectQuestionB6(String ExclusionOption) throws InterruptedException
    {
	   SelectRadioButton(ExclusionOption, getYes_QuestionB6(), getNo_QuestionB6(), "Q6 B TradingExclusion Sanction ");
    }
	public void SelectQuestionB7(String ExclusionOption) throws InterruptedException
    {
	   SelectRadioButton(ExclusionOption, getYes_QuestionB7(), getNo_QuestionB7(), "Q7 B TradingExclusion Sanction ");
    }
	public void SelectQuestionB8(String ExclusionOption) throws InterruptedException
    {
	   SelectRadioButton(ExclusionOption, getYes_QuestionB8(), getNo_QuestionB8(), "Q8 B TradingExclusion Sanction ");
    }
	public void Exclusion_Sanction_Information_Tab() throws InterruptedException {
		
		scrollToViewelement(getExclusionSanction_Information_tab());
		   
		   actionClick(getExclusionSanction_Information_tab());
		   Thread.sleep(2000);
	}
	
	
	public void Exclusion_section_A_Has_the_Trading_partner(String ExclusionOption) throws InterruptedException {
		
		SelectQuestionA1(ExclusionOption);
		SelectQuestionA2(ExclusionOption);
		SelectQuestionA3(ExclusionOption);
		SelectQuestionA4(ExclusionOption);
		SelectQuestionA5(ExclusionOption);
		SelectQuestionA6(ExclusionOption);
		SelectQuestionA7(ExclusionOption);
		
	}
    public void Exclusion_section_B_Has_the_Trading_partner(String ExclusionOption) throws InterruptedException {
		
    	SelectQuestionB1(ExclusionOption);
		SelectQuestionB2(ExclusionOption);
		SelectQuestionB3(ExclusionOption);
		SelectQuestionB4(ExclusionOption);
		SelectQuestionB5(ExclusionOption);
		SelectQuestionB6(ExclusionOption);
		SelectQuestionB7(ExclusionOption);
		SelectQuestionB8(ExclusionOption);
		
		
	}
}
