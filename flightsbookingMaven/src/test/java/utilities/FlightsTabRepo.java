package utilities;

import org.openqa.selenium.By;

public class FlightsTabRepo {
	
	
	
/*	public static final By logOutLink = By.linkText("LogIn");
	public static final By logInLink = By.id("Log");
	public static final By OkWebButton = By.xpath("LogIn");
	public static final By UserNameTextBox = By.name("Log");
	public static final By CarCheckBox = By.cssSelector("Log");
	public static final By BikeCheckBox = By.partialLinkText("Log");
	public static final By CarCheckBox2 = By.className("Log");
	public static final By CarCheckBox22 = By.tagName("Log");
	public static final By test  = By.id("flight-returning");*/
	
	public static final By FlightsTab = By.id("tab-flight-tab-hp");
	public static final By FlightsHiddenText = By.xpath("//button[@id='tab-flight-tab-hp']/span[@class='tab-label']/span[@class='visuallyhidden']");
	public static final By SearchFlightsTitle = By.cssSelector("#gcw-flights-form-hp-flight .mobile-hero-banner-title");
	public static final By RoundTripTab = By.xpath("//label[@id='flight-type-roundtrip-label-hp-flight']");
	public static final By OneWayTab = By.xpath("//label[@id='flight-type-one-way-label-hp-flight']");
	public static final By MultiCityTab = By.xpath("//label[@id='flight-type-multi-dest-label-hp-flight']");
	public static final By FlyingFromTextBox = By.xpath("//input[@id='flight-origin-hp-flight']");
	public static final By FlyingToTextBox = By.xpath("//input[@id='flight-destination-hp-flight']");
	public static final By DepartingDate = By.xpath("//input[@id='flight-departing-single-hp-flight']");
	public static final By ReturningDate = By.xpath("//div[@id='flight-returning-wrapper-hp-flight']//span[@class='label']");
	public static final By AdvancedOptions = By.xpath("//a[@id='flight-advanced-options-hp-flight']");
	public static final By NonStopChkBox = By.xpath("//input[@id='advanced-flight-nonstop-hp-flight']");
	public static final By RefundableFltChkBox = By.xpath("//input[@id='advanced-flight-nonstop-hp-flight']");
	public static final By PreferredAirLineDrpDwn = By.xpath("//select[#'flight-advanced-preferred-airline-hp-flight']");
	public static final By PreferredClassDrpDwn = By.xpath("//select[#'flight-advanced-preferred-class-hp-flight']");
	public static final By AddToHotelChkBox = By.xpath("//input[@id='flight-add-hotel-checkbox-hp-flight']");
	public static final By AddToCarChkBox = By.xpath("//input[@id='flight-add-car-checkbox-hp-flight']");
	public static final By CheckInDate = By.xpath("//div[@id='flight-hotel-checkin-wrapper-hp-flight']//span[@class='label']");
	public static final By CheckOutDate = By.xpath("//input[@id='flight-hotel-checkout-hp-flight']");
	public static final By TravellersDropDwnBtn = By.xpath("//div[@id='flights-add-hotel-hp-flight']/div//ul[@class='menu-bar-inner']/li/button[@type='button']");
	public static final By SearchBtn = By.xpath("//form[@id='gcw-flights-form-hp-flight']//button[@type='submit']");
	
	
	
		
	
	/*	public static final By TravellersTab = By.xpath("//form[@id='gcw-flights-form-hp-flight']//div[@class='ab25184-traveler-wrapper-flight available-for-flights gcw-clear-both']//ul[@class='menu-bar-inner']/li/button[@type='button']");
	public static final By FlyingFrom = By.id("flight-2-origin-hp-flight");
	public static final By FlyingTo = By.id("flight-2-destination-hp-flight");*/


}
