package testNGTestCases;

import org.testng.annotations.Test;

import Helper.BrowserFactory;
import genericMethodCollection.GenericMethods;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class NewTest {
	private WebDriver driver;
	private String baseUrl;
	private GenericMethods gm;
  
  @BeforeClass
  public void beforeClass() {
		driver = new FirefoxDriver();
		baseUrl = "https://letskodeit.teachable.com/pages/practice";
		gm = new GenericMethods(driver);
		driver.get(baseUrl);
		//WebDriver driver = BrowserFactory.startBrowser("chrome", "https://letskodeit.teachable.com/pages/practice");

		//Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
	  
  }
  
  
  @Test
  public void findElements() throws Exception {
	  
	
		
		boolean result1 = gm.isElementPresent("name", "id");
		System.out.println("Is Element Present: " + result1);
		
		boolean result2 = gm.isElementPresent("name-not-present", "id");
		System.out.println("Is Element Present: " + result2);
		
		boolean result3 = gm.isElementPresent("BMW", "linktext");
		System.out.println("Is Element Present: " + result3);
		
	}

	  
	  
  
  
  
  @AfterClass
  public void afterClass() throws Exception {
		
			Thread.sleep(2000);
			driver.quit();
  }

}
