package Base;

import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import ExtentReports.ExtentFactory;
import Helper.BrowserFactory;
import pageClasses.HomePage;
import pageClasses.SearchPageFactory;
import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;

public class BaseTestSuite {
	//@Test  no Test cases is written in baseTestSuite, it is only to have all common thing that class uses.
	//public void f() {
	//}
	protected static WebDriver driver;// changed to static
	//private String baseUrl;
	 ExtentReports report; 
	 ExtentTest test;
	// HomePage hp;
	// SearchPageFactory searchPage;
	
	public BaseTestSuite(WebDriver driver){
	
		this.driver=driver;
	}	

}
	/*	
	@BeforeClass
	public void beforeClass() {
		driver = BrowserFactory.startBrowser("firefox", "http://www.letskodeit.com");
		searchPage = new SearchPageFactory(driver);
		driver.manage().window().maximize();
		test.log(LogStatus.INFO, "Browser Maximized");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		test.log(LogStatus.INFO, "Web application opened");
		System.out.println("/nBaseTestSuite--->before class1");
		//baseUrl = "http://www.letskodeit.com/";
/*		report = ExtentFactory.getInstance();
		test = report.startTest("Verify Welcome Text");
		//driver = new FirefoxDriver();
		//driver = new ChromeDriver();
		hp = new HomePage(driver, test);
		test.log(LogStatus.INFO, "Browser Started...");

		// Maximize the browser's window
		driver.manage().window().maximize();
		test.log(LogStatus.INFO, "Browser Maximized");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseUrl);
		test.log(LogStatus.INFO, "Web application opened");
		System.out.println("/nBaseTestSuite--->before class");*/
/**/

/*	@AfterClass
	public void afterClass() {
		driver.quit();
		report.endTest(test);
		report.flush();

		System.out.println("/nBaseTestSuite--->After class");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("/nBaseTestSuite--->Before Test");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("/nBaseTestSuite--->After Test");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("/nBaseTestSuite--->before suite");
	}*/

/*	@AfterSuite
	public void afterSuite() {
		System.out.println("/nBaseTestSuite--->After suite");
	}*/

//}*/*/

