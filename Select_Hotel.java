package pom_Class.com;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {
	
	public WebDriver driver;
	
	public Select_Hotel(WebDriver launched_driver) {
		driver = launched_driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="radiobutton_0")
	private WebElement radiobutton;
	
	public WebElement getRadiobutton() {
		return radiobutton;
	}

	@FindBy(id="continue")
	private WebElement continuebutton;
	
	public WebElement getContinuebutton() {
		return continuebutton;
	}
}