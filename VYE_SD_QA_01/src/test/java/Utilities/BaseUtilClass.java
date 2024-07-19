package Utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.messages.internal.com.google.protobuf.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaseUtilClass {
 
	public static WebDriver driver;
	public static String defaultPath = System.getProperty("user.dir");
 
	/**
	 * @Description Used to get datas in config properties
	 * @param key
	 * @return
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public void SelectContinueDelete(String button,WebElement Continue,WebElement Delete,WebElement Delete1, String Question)
			throws InterruptedException {
		
		Thread.sleep(5000);
		try {
//			System.out.println("Button="+button);
			if(button.equalsIgnoreCase("Continue")) {
				
				actionClick(Continue);
				System.out.println("Provider Enrollement is Continue="+Question);
			}		
			
			
		} catch (Exception e) {
			// TODO: handle exception
			
			System.out.println("Provider Enrollement is Not Continue="+Question);
		}
		
		
		try {
			

			if(button.equalsIgnoreCase("Delete")) {
				
				actionClick(Delete);
				Thread.sleep(2000);
				actionClick(Delete1);
				System.out.println("Provider Enrollement is Delete="+Question);
			}
			
		}
			
		 catch (Exception e) {
			// TODO: handle exception
			System.out.println("Provider Enrollement is Not Delete="+Question);
		}

}
	
	public void SelectRadioButton(String Options,WebElement yesOption,WebElement noOption, String Question)
			throws InterruptedException {
		
		//Thread.sleep(5000);
		try {
			System.out.println("Option="+Options);
			if(Options.equalsIgnoreCase("yes")) {
			
				javascriptactionClick(yesOption);
				
				System.out.println("Yes Option is Selected for="+Question);
			}		
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			
			System.out.println("Yes Option is Not Selected for="+Question);
		}
		
		
		try {
			

			if(Options.equalsIgnoreCase("no")) {
				javascriptactionClick(noOption);
				
				System.out.println("No Option is Selected for="+Question);
			}
			
		}
			
		 catch (Exception e) {
			// TODO: handle exception
			System.out.println("No Option is Not Selected for="+Question);
		}

}
	public static String getPropertyFileValue(String key) throws FileNotFoundException, IOException {
 
		Properties properties = new Properties();
		properties.load(new FileInputStream(System.getProperty("user.dir") + ("\\Config\\config.properties")));
		return (String) properties.get(key);
 
	}
 
	/**
	 * @Description Used to set Browser
	 * @param browserType
	 */

	
public static WebDriver getDriverchrome() {
		
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\RakeshA\\eclipse-workspace\\VYE_SD_QA_01\\chromedriver\\chromedriver.exe");
			
		   
		    ChromeOptions options=new ChromeOptions();
		    options.setAcceptInsecureCerts(true);
		    driver= new ChromeDriver(options);
		   
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return driver;	
	}


	  public void ActionMoveByOffSet(WebDriver driver,int x,int y) {
		  Actions actions = new Actions(driver);
		  actions.moveByOffset(x, y).click().perform();
	  }
	public static void getDriver(BrowserType browserType) {
		
 
		switch (browserType) {
		case CHROME:
			System.setProperty("webdriver.chrome.driver", defaultPath+"C:\\Users\\RakeshA\\eclipse-workspace\\VYE_SD_QA_01\\chromedriver\\chromedriver.exe");
			 ChromeOptions options=new ChromeOptions();
			    options.setAcceptInsecureCerts(true);
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(options);
			break;
 
		case FIREFOX:
			 FirefoxOptions options1 = new FirefoxOptions();
		        options1.setAcceptInsecureCerts(true);
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver(options1);
			
			break;
 
		case IE:
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			break;
		case EDGE:
			
			 EdgeOptions options3 = new EdgeOptions();
			 options3.setCapability("acceptInsecureCerts", true);
			WebDriverManager.edgedriver().setup();
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			
			System.out.println("Edge Print");
			break;
		default:
			break;
		}
 
	}
 
	/**
	 * @Description Used to take screenshot
	 * @return byte[]
	 */
	public byte[] getScreenshot() {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		byte[] b = screenshot.getScreenshotAs(OutputType.BYTES);
		return b;
 
	}
 
	/**
	 * @Description Used to pass url
	 * @param browserType
	 */
 
	// getUrl
	public static void getUrl(String browserType) {
		//driver.get(browserType);
		driver.get(browserType);
	}
 
	/**
	 * @Descripiton Used to maximize the window
	 */
	// maximize
	public static void maximize() {
		driver.manage().window().maximize();
	}
 
	/**
	 * @Descripiton Used to get the title
	 * @return String
	 */
	// getTitle
	public String getTitle() {
		String title = driver.getTitle();
		return title;
	}
 
	/**
	 * Descripiton Used to get the current url
	 *
	 * @return String
	 */
	// getCurrentUrl
	public String getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}
 
	/**
	 * @Descripiton Used to pass the values
	 * @param element
	 * @param text
	 */
	// sendKeys
	public static void sendkeys(WebElement element, String text) {
		element.sendKeys(text);
	}
 
	
	/**
	 * @Descripiton Used to perform the click action
	 * @param object
	 */
	// click
	public static void click(WebElement object) {
		( object).click();
	}
 
	/**
	 * @Descripiton Used to get the text
	 * @param element
	 * @return String
	 */
	// getText
	public static String getText(WebElement element) {
		// String text = element.getText();
		String text = element.getText();
		return text;
	}
 
	/**
	 * @Descripiton Used to get the value from text box
	 * @param element
	 * @return String
	 */
	// getAttribute
	public static String getAttribute(WebElement element) {
		String text = element.getAttribute("value");
		return text;
	}
 
	/**
	 * @Descripiton Used to find the locator of the weblement using Id
	 * @param attributeValue
	 * @return webelement
	 * @throws InterruptedException
	 */
 
	// findLocatorById
	public static WebElement findLocatorById(String attributeValue) throws InterruptedException {
		Thread.sleep(2000);
		WebElement findElement = driver.findElement(By.id(attributeValue));
		return findElement;
	}
 
	/**
	 * @Descripiton Used to find the locator of the webelement using Name
	 * @param attributeValue
	 * @return webelement
	 * @throws InterruptedException
	 */
	// findLocatorByName
	public static WebElement findLocatorByName(String attributeValue) throws InterruptedException {
		Thread.sleep(2000);
		WebElement findElement = driver.findElement(By.name(attributeValue));
		return findElement;
	}
 
	/**
	 * @Descripiton Used to find the locator of the webelement using classname
	 * @param attributeValue
	 * @return webelemnt
	 * @throws InterruptedException
	 */
	// findLocatorByClassName
	public static WebElement findLocatorByClassName(String attributeValue) throws InterruptedException {
		Thread.sleep(2000);
		WebElement findElement = driver.findElement(By.className(attributeValue));
		return findElement;
		
	}
 
	/**
	 * @Descripiton Used to find the locator of the webelement using Xpath
	 * @param attributeValue
	 * @return webelement
	 * @throws InterruptedException
	 */
	// findLocatorByXpath
	public static WebElement findLocatorByXpath(String attributeValue) throws InterruptedException {
		Thread.sleep(2000);
		WebElement findElement = driver.findElement(By.xpath(attributeValue));
		return findElement;
	}
 
	/**
	 * @Descripiton Used to get get attribute other than value
	 * @param attributeName
	 * @param element
	 * @return String
	 * @throws InterruptedException
	 */
	// getAttribute other thanValue
	public static String getAttribute(String attributeName, WebElement element) throws InterruptedException {
		Thread.sleep(2000);
		String attribute = element.getAttribute(attributeName);
		return attribute;
	}
 
	/**
	 * @Descripiton Used to get the text from text box
	 * @param element
	 * @return String
	 */
	// to get text from text box
	public static String getAttributee(WebElement element) {
		String attribute = element.getAttribute("value");
		return attribute;
	}
 
	/**
	 * @Descripiton Used to perform wait
	 * @param milliseconds
	 * @throws InterruptedException
	 */
	// Sleep
 
	public void sleep(int milliseconds) throws InterruptedException {
		Thread.sleep(milliseconds);
	}
 
	/**
	 * @Descripiton Used to perform key press action using robot class
	 * @param keycode
	 * @throws AWTException
	 */
	// robot keyPress
	public void robotKeyPress(int keycode) throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(keycode);
	}
	public void actionTab() throws AWTException, InterruptedException {
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.TAB).build().perform();
		Thread.sleep(2000);
	}
	public void actionEnter() throws AWTException, InterruptedException {
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
	}
	
	/**
	 * @Descripiton Used to perform key release action using robot class
	 * @param keycode
	 * @throws AWTException
	 */
	// 20.robot keyRelease
	public void robotKeyRelease(int keycode) throws AWTException {
		Robot robot = new Robot();
		robot.keyRelease(keycode);
	}
 
	/**
	 * @Descripiton Used to pass the value using action class
	 * @param element
	 * @param keycode
	 * @param keysToSend
	 */
	// SendKeys in Actions
	public void sendkeysinactions(WebElement element, CharSequence keycode, String keysToSend) {
		element.sendKeys(keysToSend, keycode);
	}
 
	/**
	 * @Descripiton Used to perform accept alert
	 */
	// Accept Alert
	public void acceptAlert() {
		Alert al = driver.switchTo().alert();
		al.accept();
	}
 
	/**
	 * @Descripiton Used to perform dismiss alert
	 */
	// Dismiss Alert
	public void dismissAlert() {
		Alert al = driver.switchTo().alert();
		al.dismiss();
	}
 
	/**
	 * @Descripiton Used to select the value in drop down
	 * @param element
	 * @param value
	 */
 
	// Select By Value in Drop Down
	public void selectByValue(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}
 
	/**
	 * @Descripiton Used to select in drop down using index
	 * @param element
	 * @param index
	 */
	// Select By Index in Drop Down
	public void selectByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
 
	}
 
	/**
	 * @Descripiton Used to select in drop down using text
	 * @param element
	 * @param text
	 */
	// Select By Text in Drop Down
	public void selectByText(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}
 
	/**
	 * @Descripiton Used to get the options from drop down
	 * @param element
	 * @return list<webelemnt>
	 */
	// get Options in Drop Down
	public List<WebElement> getoptions(WebElement element) {
		Select select = new Select(element);
		List<WebElement> options = select.getOptions();
		return options;
	}
 
	/**
	 * @Descripiton Used to close the current window
	 */
	// close
	public void close() {
		driver.close();
	}
 
	/**
	 * @Descripiton Used to close all windows
	 */
	// quit
	public static void quit() {
		driver.quit();
	}
 
	/**
	 * @Descripiton Used to clear
	 * @param element
	 */
	// clear
	public void clearMethod(WebElement element) {
		element.clear();
	}
	public WebElement waitForElementToClickableExplicitly(WebDriver driver, int waitTime, WebElement element) throws InterruptedException {
	//	System.out.println("System will wait for max " + waitTime + " sec");
		sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, waitTime);
		return wait.until(ExpectedConditions.elementToBeClickable(element));
		
	}
	public WebElement waitForElementToVisibile(WebDriver driver, int waitTime, WebElement element) throws InterruptedException {
		//	System.out.println("System will wait for max " + waitTime + " sec");
			sleep(2000);
			try {
			WebDriverWait wait = new WebDriverWait(driver, waitTime);
			return wait.until(ExpectedConditions.visibilityOf(element));
			
		}catch(Exception e){
			e.printStackTrace();
		}
			return element;
			
		}
	
//	public WebElement waitForElementToInvisible(WebDriver driver, int waitTime, Boolean element) {
//		try {
//			WebDriverWait wait = new WebDriverWait(driver, waitTime);
//			return wait.until(ExpectedConditions.invisibilityOfElementLocated(element));
//			
//		}catch(Exception e){
//			e.printStackTrace();
//		}
//			return element;
//			
//		}
//	}
	// javascript click
	public static void performJavaScriptClick(WebDriver driver, WebElement element) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].click();", element);
	
		
	}
	public static void javascriptactionClick(WebElement element) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].click();", element);
	
		
	}
 

	public static void actionClick(WebElement elementToClick) {
		Actions actions = new Actions(driver);
		actions.click(elementToClick).perform();
	//	actions.doubleClick(elementToClick).perform();
	}
    public static void sendkeyactions (WebElement elementToSend, CharSequence[] provider_name2) throws InterruptedException {
    	Actions actions = new Actions(driver);
    	Thread.sleep(2000);
    	actions.sendKeys(elementToSend, provider_name2).build().perform();
    }
	public static String readdata(String sheetName, int rowNum, int cellNum) throws IOException {
		String res = null;
		File file = new File("C:\\Users\\RakeshA\\eclipse-workspace\\VYE_SD_QA_01\\src\\test\\java\\ExcelData\\Book3.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook book = new XSSFWorkbook(stream);
		Sheet sheet = book.getSheet(sheetName);
		Row row = sheet.getRow(rowNum);
		Cell cell = row.getCell(cellNum);
		CellType type = cell.getCellType();
		switch (type) {
		case STRING:
			res = cell.getStringCellValue();
			break;
		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
				res = f.format(dateCellValue);
			} else {
				double d = cell.getNumericCellValue();
				// BigDecimal valueOf = BigDecimal.valueOf(numericCellValue);
				// res = valueOf.toString();
				long check = Math.round(d);
				if (check == d) {
					res = String.valueOf(check);
				} else {
					res = String.valueOf(d);
 
					
					
					
					
					
					
				}
			}
		default:
			break;
		}
		return res;
	}
 
	
  public  void implicitwait() {
    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
 
}
  public void scrollBottom(WebDriver driver) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
//			js.executeScript("return document.body.style.overflow = 'hidden';");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
  public void scrollToRight(WebDriver driver) {
		try {
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollTo(500,0)");
			Thread.sleep(500);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
  public void scrollIntoView(WebDriver driver,WebElement element) {
	  ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element);
  }
  public void scrollup(WebDriver driver,int x ,int y) {
	  JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollTo(x,y)");
  }
  
//  public void scrollToViewelement( WebElement element) {
//	  ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView({ behavior: 'smooth', block: 'center' });", element);
//  }
//  public void scrollToViewelement( WebElement element) throws InterruptedException {
//	  ((JavascriptExecutor) driver).executeScript(
//	            "if (arguments[0]) {" +
//	            "    arguments[0].scrollIntoView({ behavior: 'smooth', block: 'center', inline: 'nearest' });" +
//	            "}", element
//	        );
////	            waitForElementToVisibile(driver, 5, element);
//	  
////	  Actions actions = new Actions(driver);
////      actions.moveToElement(element).perform();
//  }
  public void uploadFile(WebElement uploadButton, String filePath) throws InterruptedException {
      WebDriverWait wait = new WebDriverWait(driver,10);

      // Wait until the element is visible and enabled
      wait.until(ExpectedConditions.visibilityOf(uploadButton));
      wait.until(ExpectedConditions.elementToBeClickable(uploadButton));

      // Scroll the element into view if necessary
      scrollToViewelement(uploadButton);

      // Use Actions class to move to the element
      Actions actions = new Actions(driver);
      actions.moveToElement(uploadButton).perform();

      // Use JavascriptExecutor to ensure the element is interactable
      ((JavascriptExecutor) driver).executeScript("arguments[0].click();", uploadButton);

      // Upload the file using sendKeys
      uploadButton.sendKeys(filePath);

      // Wait for some time to observe the upload (optional)
      Thread.sleep(5000);
  }
  
  public void scrollToViewelement( WebElement element) {
	  ((JavascriptExecutor) driver).executeScript(
	            "if (arguments[0]) {" +
	            "    arguments[0].scrollIntoView({ behavior: 'smooth', block: 'center', inline: 'nearest' });" +
	            "}", element
	        );
	  Actions actions = new Actions(driver);
      actions.moveToElement(element).perform();
  }
  
  public void scrollToCenterOfPage(WebDriver driver, WebElement element) {
      // Get the dimensions of the viewport
      long windowHeight = (long) ((JavascriptExecutor) driver).executeScript("return window.innerHeight;");
      
      // Get the position of the element relative to the document
      long elementPosition = (long) ((JavascriptExecutor) driver).executeScript("return arguments[0].getBoundingClientRect().top;", element);
      
      // Calculate the desired scroll position to center the element
      long scrollPosition = elementPosition - (windowHeight / 2);
      
      // Scroll to the calculated position
      ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, arguments[0]);", scrollPosition);
  }

	 
	    
	    
public void clearChar(WebElement element) {
	 String value =element .getAttribute("value");
		if (value != null) {
			int len = value.length();
			for (int i = 0; i < len; i++) {
				element.sendKeys(Keys.BACK_SPACE);
			}
		}
		
	
}
public void scrollToUp(WebDriver driver) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,-250)");
			
			js.executeScript("scroll(0, -250);");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}}
public void scrollTOTop(WebDriver driver) {
 
			try {
 
			//JavascriptExecutor js = (JavascriptExecutor) driver;
 
		//	js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
			((JavascriptExecutor) driver).executeScript("window.scrollTo(0, 0);");
			// js.executeScript("return document.body.style.overflow = 'hidden';");
 
			} catch (Exception e) {
 
			System.out.println(e.getMessage());
 
			}}
public void scrollBy(WebDriver driver,int ScrollHeight) {
	try {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0, " + ScrollHeight + ")");
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
}
  
}
