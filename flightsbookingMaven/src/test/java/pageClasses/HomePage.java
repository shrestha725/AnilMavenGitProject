package pageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Base.BaseTestSuite;
import utilities.Constant;
import utilities.FlightsTabRepo;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class HomePage extends BaseTestSuite{
	
	ExtentTest test;
	
   public HomePage(WebDriver driver) {
		super(driver);
		//this.test = test;
	}
	

	public void clickSignUpLink() {
		WebElement signupLink = driver.findElement(By.id("comp-iiqg1vggactionTitle"));
		signupLink.click();
		//test.log(LogStatus.INFO, "Clicked on signup link");
	}
	public void lunchHomePage() {
		driver.get(Constant.baseURL);
	}
	
	public void clickLoginLink() {
		WebElement loginLink = driver.findElement(By.id("signUpDialogswitchDialogLink"));
		loginLink.click();
		//test.log(LogStatus.INFO, "Clicked on login link");
	}
	
	public void enterEmail(String email) {
		WebElement emailField = driver.findElement(By.xpath("//div[@id='memberLoginDialogemail']//input"));
		emailField.sendKeys(email);
		//test.log(LogStatus.INFO, "Enter email");
	}
	
	public void enterPassword(String password) {
		WebElement passwordField = driver.findElement(By.xpath("//div[@id='memberLoginDialogpassword']//input"));
		passwordField.sendKeys(password);
		//test.log(LogStatus.INFO, "Enter password");
	}
	public void clickGoLink1() {
		FlightsTabRepo ft = new FlightsTabRepo();
		//WebElement goButton = driver.findElement(By.xpath("*//div[@id='memberLoginDialogoklink']"));
		//goButton.click();
		WebElement goButton1 = driver.findElement(ft.FlightsTab);
		goButton1.click();
		//test.log(LogStatus.INFO, "Clicked Go button");
	}
	public static WebElement clickGoLink2() {
		FlightsTabRepo ft = new FlightsTabRepo();
		WebElement goButton1 = driver.findElement(ft.FlightsTab);
		goButton1.click();
		return goButton1;
		//test.log(LogStatus.INFO, "Clicked Go button");
	}
	public void clickLogIn() {
		WebElement goButton = driver.findElement(By.xpath("//span[@id='memberLoginDialogoklabel']"));
		goButton.click();
		System.out.println("CLICKED");
		//test.log(LogStatus.INFO, "Clicked Go button");
	}
	
	public boolean isWelcomeTextPresent() {
		WebElement welcomeText = null;
		try {
			welcomeText = driver.findElement(By.xpath("//div[text()='Hello test@email.com']"));
			if (welcomeText != null) {
				return true;
			}
		}
		catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
			return false;
		}
		return false;
	}
	
	public void login(String email, String password) throws InterruptedException {
		clickSignUpLink();
		Thread.sleep(2000);
		clickLoginLink();
		Thread.sleep(2000);
		enterEmail(email);
		//Thread.sleep(2000);
		enterPassword(password);
		Thread.sleep(2000);
		clickLogIn();
		System.out.println("Login clicked");
		//Thread.sleep(2000);
	}
}