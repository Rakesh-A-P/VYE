package com.TestRunner;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


	@CucumberOptions(strict = true, monochrome = true, dryRun = false, plugin = { "pretty", "json:target\\output.json",
	"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }, 
	glue = {"com.StepDefinitions" }, features = "src\\test\\resources\\Features"
	
	)
	public class testrun extends AbstractTestNGCucumberTests
	{
		
		
		
		
		
//		 @Override
//		    @DataProvider(parallel = true)
//		    public Object[][] scenarios() {
//		        return super.scenarios();
//		    }
//		
    }
