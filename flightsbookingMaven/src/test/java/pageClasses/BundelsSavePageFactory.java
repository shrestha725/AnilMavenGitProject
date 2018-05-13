package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BundelsSavePageFactory {
	
	WebDriver driver;
	
	@FindBy(xpath="//button[@id='tab-package-tab-hp']")
	WebElement BundelSave;
	@FindBy(xpath="//input[@id='package-origin-hp-package']")
	WebElement OriginCity;
	@FindBy(xpath="//input[@id='package-destination-hp-package']")
	WebElement DestinationCity;
	@FindBy(xpath="//input[@id='package-departing-hp-package']")
	WebElement DepartingDate;
	@FindBy(xpath="//input[@id='package-returning-hp-package']")
	WebElement ReturningDate;
	
	


public BundelsSavePageFactory(WebDriver driver) {
	this.driver= driver;
	
	PageFactory.initElements(driver, this);
	}

public void SendOriginCity(String OriginCityName) {
	OriginCity.sendKeys(OriginCityName);
	
}


}