package testNGTestCases;

import org.testng.annotations.Test;

import pageClasses.SearchPage;
import pageClasses.HomePage;

import org.testng.annotations.BeforeClass;
import utilities.BrowserFactory;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import pageClasses.FlightsTabPage;



public class FlightsTabTestCases {
	private WebDriver driver;	
	
	

	
@BeforeClass
public void beforeClass() {
	driver =BrowserFactory.startBrowser("firefox", "https://www.expedia.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}

  @Test
  public void VerifyFlightsTabCanBeClicked() {
	 FlightsTabPage fp = new FlightsTabPage(driver);
	  fp .FlightsClick();
	  System.out.println("Flights tab clicked successfully");
	  }
  @Test 
  public void  VerifyFlightsText() {
	  FlightsTabPage fp = new FlightsTabPage(driver);
	  fp.VerifyFlightsText();
  }
  
@Test
public void VerifyFlightsTabCanBeClickedReturnMethod() {
	  FlightsTabPage fp = new FlightsTabPage(driver);
	  fp.FlightsClick1();
	
	
	
}

  @AfterClass
  public void afterTest() {
	  driver.quit();
  }

}
