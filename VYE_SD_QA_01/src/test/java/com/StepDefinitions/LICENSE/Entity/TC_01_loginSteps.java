package com.StepDefinitions.LICENSE.Entity;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.PageObjectManager.Entity.*;
import Utilities.BaseUtilClass;
import Utilities.Excelreader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC_01_loginSteps extends BaseUtilClass {
	public WebDriver driver;
	public PageObjectManager pom;
	public Excelreader excell;

	public TC_01_loginSteps() {
		driver = new ChromeDriver();
		pom = new PageObjectManager();
		excell = new Excelreader();
	}

	@Given("user is navigate to the VYE login page")
	public void user_is_navigate_to_the_VYE_login_page() {

		System.out.println("login with the url of vye");
		// actionClick(pom.getLoginpage().getAdavnec());
        //     actionClick(pom.getLoginpage().getLink());

	}

	JavascriptExecutor js = (JavascriptExecutor) driver;

	@When("^user enters user name from sheet (.+) and row (.+) password and click on continue button$")
	public void user_enters_user_name_Login_password_0and_click_on_continue_button(String sheetName, int rowNum)
			throws InvalidFormatException, IOException, InterruptedException {
		List<Map<String, String>> testdata =excell.getData(getPropertyFileValue("Excell"), sheetName);
//				"C:\\Users\\RakeshA\\git\\repository\\VYE_SD_QA_01\\src\\test\\java\\ExcelData\\Book3.xlsx",
//				sheetName);

		String providerUser = testdata.get(rowNum).get("Provider username");
		String Password = testdata.get(rowNum).get("passowrdprovider");

		sendkeys(pom.getLoginpage().getUn(), providerUser);
		sendkeys(pom.getLoginpage().getPwd(), Password);
		scrollToViewelement(pom.getLoginpage().getLogin());
		Thread.sleep(2000);
		actionClick(pom.getLoginpage().getLogin());
		waitForElementToVisibile(driver, 10, pom.getLoginpage().getAgree());
		actionClick(pom.getLoginpage().getAgree());
		try {
			waitForElementToVisibile(driver, 5, pom.getLoginpage().getClose());
			actionClick(pom.getLoginpage().getClose());

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	@And("^Provider Enrollemet Application continue or delete by using buttons (.+)$")
	public void provider_enrollemet_application_continue_or_delete_by_using_buttons_Continue(String button)
			throws InterruptedException {
		try {
			pom.getLoginpage().SelectCONTINUEORDELETE(button);
			   Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	@Then("validate user is redirected to Dasboard {string}")
	public void validate_user_is_redirected_to_Dasboard(String string) {
		System.out.println("user is in dasboard");
	}

}
