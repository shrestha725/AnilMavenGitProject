package testNGTestCases;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.Test;


	
	

	public class ExpediaNavigation {
	    private WebDriver driver;
	    private String baseURL;
	    @BeforeClass
	    public void beforeClass() {
	        driver = new ChromeDriver();
	        baseURL = "https://www.expedia.com/";
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        driver.get(baseURL);
	    }
	    @Test()
	    public void test1ClickFlights() throws InterruptedException {
	        driver.findElement(By.xpath("//button[@data-section-id='#section-flight-tab-hp']")).click();
	        // Added sleep so that it is easy to notice the change
	        Thread.sleep(3000);
	    }
	    @Test
	    public void test2ClickHotels() throws InterruptedException {
	        driver.findElement(By.xpath("//button[@data-section-id='#section-hotel-tab-hp']")).click();
	        // Added sleep so that it is easy to notice the change
	        Thread.sleep(3000);
	    }
	    @Test
	    public void test3ClickBundleandSave() throws InterruptedException {
	        driver.findElement(By.xpath("//button[@data-section-id='#section-package-tab-hp']")).click();
	        // Added sleep so that it is easy to notice the change
	        Thread.sleep(3000);
	    }
	    @Test
	    public void test4ClickCars() throws InterruptedException {
	        driver.findElement(By.xpath("//button[@data-section-id='#section-car-tab-hp']")).click();
	        // Added sleep so that it is easy to notice the change
	        Thread.sleep(3000);
	    }
	    @AfterClass
	    public void afterClass() {
	         driver.quit();
	    }

 
}
