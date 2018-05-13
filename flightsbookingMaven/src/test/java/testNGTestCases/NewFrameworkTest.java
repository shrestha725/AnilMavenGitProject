package testNGTestCases;

import org.testng.annotations.Test;

import Base.BaseTestSuite;
import pageClasses.SearchPageFactory;
import org.testng.annotations.BeforeClass;
import genericMethodCollection.GenericMethods;
import genericMethodCollection.isElementPresentDemo;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import Helper.BrowserFactory;
import utilities.FlightsTabRepo;
import pageClasses.FlightsTabPage;

public class NewFrameworkTest{
	
	private WebDriver driver;
	private String baseURL;
	SearchPageFactory searchPage;
	GenericMethods gm;
	FlightsTabPage flightTab;
	
	



	

	@BeforeClass
	public void beforeClass() {
		driver =BrowserFactory.startBrowser("firefox", "https://www.expedia.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	  @Test
	  public void ftest() {
		  FlightsTabPage fp = new FlightsTabPage(driver);
		 fp .FlightsClick();
		System.out.println("Flights tab clicked successfully");
		  

		
	String s=gm.getElement("//button[@id='tab-flight-tab-hp']/span[@class='icons-container']", "xpath").getText();
	////*[@id="tab-flight-tab-hp"]/span[2]
	System.out.println(s);
		//String sText=gm.getElement("[data-lob=\"flight\"]", "css").getText();
/*		String sText1=gm.getElement("//*[@id=\"tab-flight-tab-hp\"]/span[2]", "xpath").getAttribute("value");
		String s2=gm.getElement("//button[@id='tab-flight-tab-hp']/span[@class='tab-label']/span[@class='visuallyhidden']", "xpath").getText();
		System.out.println("my expected text  ="+s);
		System.out.println("Flights tab was clicked successfully");
        String aa= s.replace(s2, "").trim();
        System.out.println("my exact text="+aa);
        Assert.assertEquals(aa, "Flights");*/
    
	  }

/*	@Test
	public void click2Hotels() throws InterruptedException {
		
		searchPage.clickHotelsTab();
		System.out.println("Hotels tab was clicked successfully");
		Thread.sleep(3000);
	}

	@Test
	public void click3BundleandSave() throws InterruptedException {
	
		searchPage.clickBundelsSaveTab();
		System.out.println("Bundel and saved was clicked successfully");
		Thread.sleep(3000);
	}

	@Test
	public void click4Cars() throws InterruptedException {
	
		searchPage.clickCarsTab();
		System.out.println("Cars Tab was clicked successfully");
		Thread.sleep(3000);
	}*/

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
