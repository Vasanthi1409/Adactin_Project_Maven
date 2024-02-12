package pom_Class.com;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adactin_Login {
	
	
	public WebDriver driver;
	
	public Adactin_Login(WebDriver launched_driver) {
		driver = launched_driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="username")				//VasanthiSIH
	private WebElement username;
	
	public WebElement getUsername() {
		return username;
	}
	
	@FindBy(id="password")				//vasanthiharish
	private WebElement password;
	
	public WebElement getPassword() {
		return password;
	}
	
	@FindBy(id="login")
	private WebElement login;

	public WebElement getLogin() {
		return login;
	}
}
