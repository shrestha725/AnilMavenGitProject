package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CarsPageFactory {
	
	WebDriver driver;
	
	@FindBy(xpath="")
	WebElement test;
	
	public CarsPageFactory(WebDriver driver) {
		
		this.driver= driver;
		PageFactory.initElements( driver, this);
		
	}
	

}
