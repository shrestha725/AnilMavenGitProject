package pageClasses;

//import static org.testng.AssertJUnit.assertEquals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import Base.BaseTestSuite;
import ObjectsRepo.A_FlightsTabRepo;

public class A_FlightsTabPage extends BaseTestSuite {
	
	
	   public A_FlightsTabPage(WebDriver driver) {
			super(driver);
			//this.test = test;
		}
		A_FlightsTabRepo ft = new A_FlightsTabRepo();

		public void FlightsClick() {
			driver.findElement(ft.FlightsTab).click();
			System.out.println("Flights Tab clicked successfully.");
			}

		public void FlightsTextAssertion() {
			String s = driver.findElement(ft.FlightsTab).getText();
			String s2=driver.findElement(ft.FlightsHiddenText).getText();
			/*System.out.println(s);
			System.out.println(s2);*/
			String aa= s.replace(s2, "").trim();
		    System.out.println("my exact text="+aa);
			Assert.assertEquals("Flights", aa);
		}
////   With return
		public static WebElement FlightsClick1() {
			A_FlightsTabRepo ft = new A_FlightsTabRepo();
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