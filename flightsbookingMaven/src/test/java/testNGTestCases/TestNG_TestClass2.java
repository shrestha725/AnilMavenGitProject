package testNGTestCases;
import Base.BaseTestSuite;
import Helper.BrowserFactory;
import pageClasses.HomePage;
import pageClasses.SearchPageFactory;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class TestNG_TestClass2 {
	

    private WebDriver driver;
    ExtentReports report;
	ExtentTest test;
    HomePage hp;
	SearchPageFactory searchPage;
	
@BeforeClass
	public void beforeClass() {
	System.setProperty("webdriver.gecko.driver", "C:/Automation_WorkSpace/geckodriver.exe");
	driver =BrowserFactory.startBrowser("firefox", "http://letskodeit.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("\nTestNG_TestClass2 -> This runs before every method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("\nTestNG_TestClass2 -> This runs after every method");
	}
	
	@Test
	public void testMethod1() throws InterruptedException {
		//BaseTestSuite c= new BaseTestSuite();
		HomePage hp=new HomePage(driver);
		//hp.login(email, password);
		hp.login("test@email.com", "abcabc");
		//Thread.sleep(3000);
		//boolean result = hp.isWelcomeTextPresent();
        //Assert.assertTrue(result);
		//test.log(LogStatus.PASS, "Verified Welcome Text");
		System.out.println("\nRunning Test -> TestNG_TestClass2 -> testMethod1");
	}
	
	@Test
	public void testMethod2() {
		System.out.println("\nRunning Test -> TestNG_TestClass2 -> testMethod2");
	}
	@AfterClass
	public void cleanUp() {
		driver.quit();
		System.out.println("\nTestNG_TestClass2 -> This runs once after class");
	}
	
}