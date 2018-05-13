package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelsPageFactory {
	WebDriver driver;
	
	@FindBy(xpath="//input[@id='hotel-destination-hp-hotel']")
	WebElement GoingTo;
	
	@FindBy(xpath="//div[@id='hotel-checkin-wrapper-hp-hotel']//span[@class='label']")
	WebElement CheckInDates;
	
	@FindBy(xpath="//input[@id='hotel-checkout-hp-hotel']")
	WebElement CheckOutDates;
	
	
	
	
	public HotelsPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	
}
