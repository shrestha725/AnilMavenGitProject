package testNGTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Base.BaseTestSuite;
import ExtentReports.ExtentFactory;
import pageClasses.HomePage;



public class LoginTest2_WorkingOn{
	//BaseTestSuite  bs= new BaseTestSuite();
	private WebDriver driver;
	private String baseUrl;
	ExtentReports report;
	ExtentTest test;
	HomePage hp;

	
	/*@BeforeClass
	public void beforeClass() {
		report = ExtentFactory.getInstance();
		test = report.startTest("Verify Welcome Text");

		//driver = new FirefoxDriver();
		//driver = new ChromeDriver();
		hp = new HomePage(driver, test);
		test.log(LogStatus.INFO, "Browser Started...");

		// Maximize the browser's window
	
	
		
	
	}*/
	
	@Test
	public void test1_validLoginTest() throws Exception {
		
		boolean result = hp.isWelcomeTextPresent();
        Assert.assertTrue(result);
		test.log(LogStatus.PASS, "Verified Welcome Text");
		//test.log(LogStatus.FAIL, "Verified Welcome TextNOT");
	}
	
	//@AfterClass
	//public void afterClass() {
/*		//driver.quit();
		//report.endTest(test);
		//report.flush();
	}*/
}