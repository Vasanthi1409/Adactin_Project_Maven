package pom_Class.com;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booked_Itinerary {
	
	public WebDriver driver;
	
	public Booked_Itinerary(WebDriver launched_driver) { 
		driver = launched_driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name="ids[]")
	private WebElement clickordered;
	
	public WebElement getClickordered() {
		return clickordered;
	}

	@FindBy(name="cancelall")
	private WebElement cancelall;
	
	public WebElement getCancelall() {
		return cancelall;
	}
}
