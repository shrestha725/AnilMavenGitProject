package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CruisesPageFacroty {
	WebDriver driver;

	@FindBy(xpath = "")
	WebElement tets;

	public CruisesPageFacroty(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	

}
