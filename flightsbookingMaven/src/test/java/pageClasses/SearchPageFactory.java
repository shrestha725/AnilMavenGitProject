package pageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericMethodCollection.GenericMethods;

public class SearchPageFactory {
	WebDriver driver;
	GenericMethods gm;

	@FindBy(id = "tab-flight-tab-hp")
	WebElement flightsTab;

	@FindBy(id = "tab-car-tab-hp")
	WebElement CarsTab;

	@FindBy(id = "tab-hotel-tab-hp")
	WebElement hotelsTab;

	@FindBy(xpath = "//button[@id='tab-package-tab-hp']/span[@class='tab-label']")
	WebElement bundlesSaveTab;

	@FindBy(id = "buttonCloseBanner")
	WebElement closeBanner;

	@FindBy(xpath = "//div[@id='travelerAlert']//span[@class='icon icon-close']")
	WebElement travelAdvisory;

	@FindBy(xpath = "//label[@id='flight-type-roundtrip-label-hp-flight']")
	WebElement RoundTrip;

	public SearchPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickFlightsTab() {

		flightsTab.click();
	}

	public void clickHotelsTab() {

		hotelsTab.click();
	}

	public void clickBundelsSaveTab() {
		bundlesSaveTab.click();
	}

	public void clickCarsTab() {
		CarsTab.click();
	}

	public void clickCloseBanner() {
		 boolean present;
		try {
			closeBanner.isDisplayed();
			present = true;
			closeBanner.click();
			System.out.println(" it actually exists!!!!!!!!");
		} catch (NoSuchElementException e) {
			present = false;
			System.out.println("Such element dosen't exist");

		}

	}

	public void clickCloseTravelAdvisory() {

		 boolean present;
		try {
			travelAdvisory.isDisplayed();

			// driver.findElement(By.xpath("//div[@id='travelerAlert']//span[@class='icon
			// icon-close']"));
			present = true;
			travelAdvisory.click();
		} catch (NoSuchElementException e) {
			present = false;
			System.out.println("Such element dosen't exist");
		}

	}
}
