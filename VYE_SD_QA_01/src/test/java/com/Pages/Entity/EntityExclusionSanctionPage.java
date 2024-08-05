package com.Pages.Entity;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseUtilClass;

public class EntityExclusionSanctionPage extends BaseUtilClass {
 
	
	public EntityExclusionSanctionPage() {
		PageFactory.initElements(driver, this);
	}
//A. Has the provider or any person with an ownership or controlling interest in the provider ever been convicted of crimes, 
	
	
	@FindBy(xpath="(//span[.='Exclusion/Sanction Information'])[2]")
	private WebElement ExclusionSanction_Information_tab;
	public WebElement getExclusionSanction_Information_tab() {
		return ExclusionSanction_Information_tab;
	}


	@FindBy(xpath="(//input[@type='radio'])[1]")
	private WebElement Yes_QuestionA1;
	@FindBy(xpath="(//input[@type='radio'])[2]")
	private WebElement 	No_QuestionA1;
	@FindBy(xpath="(//input[@type='radio'])[3]")
	private WebElement Yes_QuestionA2;
	@FindBy(xpath="(//input[@type='radio'])[4]")
	private WebElement No_QuestionA2;
	@FindBy(xpath="(//input[@type='radio'])[5]")
	private WebElement Yes_QuestionA3;
	@FindBy(xpath="(//input[@type='radio'])[6]")
	private WebElement No_QuestionA3;
	@FindBy(xpath="(//input[@type='radio'])[7]")
	private WebElement Yes_QuestionA4;
	@FindBy(xpath="(//input[@type='radio'])[8]")
	private WebElement No_QuestionA4;
	@FindBy(xpath="(//input[@type='radio'])[9]")
	private WebElement Yes_QuestionA5;
	@FindBy(xpath="(//input[@type='radio'])[1O]")
	private WebElement No_QuestionA5;
	@FindBy(xpath="(//input[@type='radio'])[11]")
	private WebElement Yes_QuestionA6;
	@FindBy(xpath="(//input[@type='radio'])[12]")
	private WebElement No_QuestionA6;
	@FindBy(xpath="(//input[@type='radio'])[13]")
	private WebElement Yes_QuestionA7;
	@FindBy(xpath="(//input[@type='radio'])[14]")
	private WebElement No_QuestionA7;
//B. Has the provider or any person with an ownership or controlling interest in the provider ever had the following situations apply:
	@FindBy(xpath="(//input[@type='radio'])[15]")
	private WebElement Yes_QuestionB1;
	@FindBy(xpath="(//input[@type='radio'])[16]")
	private WebElement No_QuestionB1;
	@FindBy(xpath="(//input[@type='radio'])[17]")
	private WebElement Yes_QuestionB2;
	@FindBy(xpath="(//input[@type='radio'])[18]")
	private WebElement No_QuestionB2;
	@FindBy(xpath="(//input[@type='radio'])[19]")
	private WebElement Yes_QuestionB3;
	@FindBy(xpath="(//input[@type='radio'])[20]")
	private WebElement No_QuestionB3;
	@FindBy(xpath="(//input[@type='radio'])[21]")
	private WebElement Yes_QuestionB4;
	@FindBy(xpath="(//input[@type='radio'])[22]")
	private WebElement No_QuestionB4;
	@FindBy(xpath="(//input[@type='radio'])[23]")
	private WebElement Yes_QuestionB5;
	@FindBy(xpath="(//input[@type='radio'])[24]")
	private WebElement No_QuestionB5;
	@FindBy(xpath="(//input[@type='radio'])[25]")
	private WebElement Yes_QuestionB6;
	@FindBy(xpath="(//input[@type='radio'])[26]")
	private WebElement No_QuestionB6;
	@FindBy(xpath="(//input[@type='radio'])[27]")
	private WebElement Yes_QuestionB7;
	@FindBy(xpath="(//input[@type='radio'])[28]")
	private WebElement No_QuestionB7;
	@FindBy(xpath="(//input[@type='radio'])[29]")
	private WebElement Yes_QuestionB8;
	@FindBy(xpath="(//input[@type='radio'])[30]")
	private WebElement No_QuestionB8;
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
   
	public void SelectQuestionA1(String Options) throws InterruptedException
    {
	   SelectRadioButton(Options, getYes_QuestionA1(), getNo_QuestionA1(), "Q1 EntityExclusion Sanction ");
    }
	public void SelectQuestionA2(String Options) throws InterruptedException
    {
	   SelectRadioButton(Options, getYes_QuestionA2(), getNo_QuestionA2(), "Q2 EntityExclusion Sanction ");
    }
	public void SelectQuestionA3(String Options) throws InterruptedException
    {
	   SelectRadioButton(Options, getYes_QuestionA3(), getNo_QuestionA3(), "Q3 EntityExclusion Sanction ");
    }
	public void SelectQuestionA4(String Options) throws InterruptedException
    {
	   SelectRadioButton(Options, getYes_QuestionA4(), getNo_QuestionA4(), "Q4 EntityExclusion Sanction ");
    }
	public void SelectQuestionA5(String Options) throws InterruptedException
    {
	   SelectRadioButton(Options, getYes_QuestionA5(), getNo_QuestionA5(), "Q5 EntityExclusion Sanction ");
    }
	public void SelectQuestionA6(String Options) throws InterruptedException
    {
	   SelectRadioButton(Options, getYes_QuestionA6(), getNo_QuestionA6(), "Q6 EntityExclusion Sanction ");
    }
	
	public void SelectQuestionA7(String Options) throws InterruptedException
    {
	   SelectRadioButton(Options, getYes_QuestionA7(), getNo_QuestionA7(), "Q7 EntityExclusion Sanction ");
    }
	
	
	public void SelectQuestionB1(String Options) throws InterruptedException
    {
	   SelectRadioButton(Options, getYes_QuestionB1(), getNo_QuestionB1(), "Q1 B EntityExclusion Sanction ");
    }
	public void SelectQuestionB2(String Options) throws InterruptedException
    {
	   SelectRadioButton(Options, getYes_QuestionB2(), getNo_QuestionB2(), "Q2 B EntityExclusion Sanction ");
    }
	public void SelectQuestionB3(String Options) throws InterruptedException
    {
	   SelectRadioButton(Options, getYes_QuestionB3(), getNo_QuestionB3(), "Q3 B EntityExclusion Sanction ");
    }
	public void SelectQuestionB4(String Options) throws InterruptedException
    {
	   SelectRadioButton(Options, getYes_QuestionB4(), getNo_QuestionB4(), "Q4 B EntityExclusion Sanction ");
    }
	public void SelectQuestionB5(String Options) throws InterruptedException
    {
	   SelectRadioButton(Options, getYes_QuestionB5(), getNo_QuestionB5(), "Q5 B EntityExclusion Sanction ");
    }
	public void SelectQuestionB6(String Options) throws InterruptedException
    {
	   SelectRadioButton(Options, getYes_QuestionB6(), getNo_QuestionB6(), "Q6 B EntityExclusion Sanction ");
    }
	public void SelectQuestionB7(String Options) throws InterruptedException
    {
	   SelectRadioButton(Options, getYes_QuestionB7(), getNo_QuestionB7(), "Q7 B EntityExclusion Sanction ");
    }
	public void SelectQuestionB8(String Options) throws InterruptedException
    {
	   SelectRadioButton(Options, getYes_QuestionB8(), getNo_QuestionB8(), "Q8 B EntityExclusion Sanction ");
    }
}
