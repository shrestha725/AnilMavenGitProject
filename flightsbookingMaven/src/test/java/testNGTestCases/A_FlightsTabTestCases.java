package testNGTestCases;

import org.testng.annotations.Test;

import Helper.BrowserFactory;
import pageClasses.SearchPage;
import pageClasses.HomePage;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import pageClasses.A_FlightsTabPage;

;

public class A_FlightsTabTestCases {
	private WebDriver driver;	
	
	    private String baseURL;
	


@BeforeClass
public void beforeClass() {
	BrowserFactory bf=new BrowserFactory();
	driver =bf.startBrowser("firefox", "https://www.expedia.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   /* driver = new ChromeDriver();
    baseURL = "https://www.expedia.com/";
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get(baseURL);*/
}

@Test
public void VerifyFlightsTabCanBeClicked() {
	 A_FlightsTabPage fp = new A_FlightsTabPage(driver);
	  fp .FlightsClick();
	  System.out.println("Flights tab clicked successfully");
	  }
@Test 
public void  VerifyFlightsText() {
	  A_FlightsTabPage fp = new A_FlightsTabPage(driver);
	  fp.FlightsTextAssertion();
}

@Test
public void VerifyFlightsTabCanBeClickedReturnMethod() {
	  A_FlightsTabPage fp = new A_FlightsTabPage(driver);
	  fp.FlightsClick1();
}

  @AfterClass
  public void afterTest() {
	  driver.quit();
  }

}
