package testNGTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import ExtentReports.ExtentFactory;
import pageClasses.HomePage;

public class LoginTest {
	
	private WebDriver driver;
	private String email;
	private String password;
	//ExtentReports report;
	//ExtentTest test;
	
      
	@BeforeClass
	public void beforeClass() {
		email = "test@gmail.com";
		password = "testpassword";
		//report = ExtentFactory.getInstance();
		//test = report.startTest("Verify Welcome Text");
		//driver = new FirefoxDriver();
		driver = new ChromeDriver();
		
		//test.log(
		//LogStatus.INFO, "Browser Started...");

		// Maximize the browser's window
		driver.manage().window().maximize();
		//test.log(LogStatus.INFO, "Browser Maximized");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//test.log(LogStatus.INFO, "Web application opened");
	}
	
	@Test
	public void test1_validLoginTest() throws Exception {
		HomePage testing = new HomePage(driver);
		testing.lunchHomePage();
		
	}
	
	@AfterClass
	public void afterClass() {
		driver.quit();
		//report.endTest(test);
		//report.flush();
	}
}