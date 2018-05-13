package testNGTestCases;

import org.testng.annotations.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import Helper.BrowserFactory;
import pageClasses.SearchPageFactory;
import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class NewFrameworkTest1 {

	private WebDriver driver;
	private String baseURL;
	SearchPageFactory searchPage;
	BrowserFactory browser;
	private static final Logger log = LogManager.getLogger(BrowserFactory.class.getName());

	@BeforeClass
	public void beforeClass() {

		driver = BrowserFactory.startBrowser("firefox", "https://www.expedia.com/");
		searchPage = new SearchPageFactory(driver);

	}

	@Test
	public void clickFlights() throws InterruptedException {
		searchPage.clickFlightsTab();
		System.out.println("Flights tab was clicked successfully");
		log.debug("debug message logged");

		Thread.sleep(3000);
	}

	@Test
	public void clickHotels() throws InterruptedException {
		searchPage.clickHotelsTab();
		System.out.println("Hotels tab was clicked successfully");

		Thread.sleep(3000);
	}

	@Test
	public void clickBundleandSave() throws InterruptedException {

		searchPage.clickBundelsSaveTab();
		System.out.println("Bundel and saved was clicked successfully");
		Thread.sleep(3000);
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
