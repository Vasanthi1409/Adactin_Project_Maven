package pom_Class.com;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_Confirmation {
	
	public WebDriver driver;
	
	public Booking_Confirmation(WebDriver launched_driver) {
		driver = launched_driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="my_itinerary")
	private WebElement myitinerary;

	public WebElement getMyitinerary() {
		return myitinerary;
	}
	
	
	
	
}
