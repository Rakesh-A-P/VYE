package com.Pages.Entity;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseUtilClass;

public class EntityHealthHomeserivcePage  extends BaseUtilClass{
	
	public EntityHealthHomeserivcePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//span[.='Health Home Services'])[2]")
	private WebElement Health_Home_Services_tab;
	@FindBy(xpath="(//input[@type='text'])[1]")
	private WebElement health_question1;
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement health_question2;
	@FindBy(xpath="(//input[@type='text'])[3]")
	private WebElement health_question3;
	@FindBy(xpath="(//input[@type='text'])[4]")
	private WebElement health_question4;
	@FindBy(xpath="(//input[@type='text'])[5]")
	private WebElement health_question5;
	@FindBy(xpath="(//input[@type='text'])[6]")
	private WebElement health_question6;
	@FindBy(xpath="(//input[@type='text'])[7]")
	private WebElement health_question7;
	@FindBy(xpath="(//input[@type='text'])[8]")
	private WebElement health_question8;
	@FindBy(xpath="(//input[@type='text'])[9]")
	private WebElement health_question9;
	@FindBy(xpath="(//input[@type='text'])[10]")
	private WebElement health_question10;
	@FindBy(xpath="//div[@role='button' and contains(@id,'Please select all applicabl')]")
	private WebElement health_question11;
	@FindBy(xpath="(//li[@role='option'])[1]")
	private WebElement health_question_drop_first;
	@FindBy(xpath="//div[contains(text(),'9. How will your health home team be involved ')]")
	private WebElement health_question_other_11;
	public WebElement getHealth_Home_Services_tab() {
		return Health_Home_Services_tab;
	}
	public WebElement getHealth_question1() {
		return health_question1;
	}
	public WebElement getHealth_question2() {
		return health_question2;
	}
	public WebElement getHealth_question3() {
		return health_question3;
	}
	public WebElement getHealth_question4() {
		return health_question4;
	}
	public WebElement getHealth_question5() {
		return health_question5;
	}
	public WebElement getHealth_question6() {
		return health_question6;
	}
	public WebElement getHealth_question7() {
		return health_question7;
	}
	public WebElement getHealth_question8() {
		return health_question8;
	}
	public WebElement getHealth_question9() {
		return health_question9;
	}
	public WebElement getHealth_question10() {
		return health_question10;
	}
	public WebElement getHealth_question11() {
		return health_question11;
	}
	public WebElement getHealth_question_drop_first() {
		return health_question_drop_first;
	}
	public WebElement getHealth_question_other_11() {
		return health_question_other_11;
	}
	
	
	

}
