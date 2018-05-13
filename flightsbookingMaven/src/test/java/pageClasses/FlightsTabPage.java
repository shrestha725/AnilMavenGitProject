package pageClasses;

//import static org.testng.AssertJUnit.assertEquals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import Base.BaseTestSuite;
import utilities.FlightsTabRepo;

public class FlightsTabPage extends BaseTestSuite {

	public FlightsTabPage(WebDriver driver) {
		super(driver);
		// this.test = test;
	}

	FlightsTabRepo ft = new FlightsTabRepo();

	public void FlightsClick() {
		driver.findElement(ft.FlightsTab).click();
		System.out.println("Flights Tab clicked successfully.");
		}

	public void VerifyFlightsText() {
		String s = driver.findElement(ft.FlightsTab).getText();
		String s2=driver.findElement(ft.FlightsHiddenText).getText();
		System.out.println(s);
		System.out.println(s2);
	   // myFlight= (s-s2);
		
	  //Assert.assertEquals("Flights", s);
	}

	public static WebElement FlightsClick1() {
		FlightsTabRepo ft = new FlightsTabRepo();
		WebElement element = driver.findElement(ft.FlightsTab);
		element.click();
		return element;

	}

	public void FlightsClick2() {
		// FlightsTabRepo ft = new FlightsTabRepo();
		driver.findElement(ft.FlightsTab).click();
	}

	public void FlightsClick3() {
		// FlightsTabRepo ft = new FlightsTabRepo();
		driver.findElement(ft.FlightsTab).click();
	}

}
