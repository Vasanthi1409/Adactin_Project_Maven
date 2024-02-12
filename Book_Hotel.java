package pom_Class.com;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Hotel {
	
	public WebDriver driver;
	
	public Book_Hotel(WebDriver launched_driver) {
		driver = launched_driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="first_name")
	private WebElement firstname;
	
	public WebElement getfirstname() {
		return firstname;
	}
	
	@FindBy(id="last_name")
	private WebElement lastname;
	
	public WebElement getlastname() {
		return lastname;
	}
	
	@FindBy(id="address")
	private WebElement billaddress;
	
	public WebElement getbilladdress() {
		return billaddress;
	}
	
	@FindBy(id="cc_num")
	private WebElement ccnum;
	
	public WebElement getccnum() {
		return ccnum;
	}
	
	@FindBy(id="cc_type")
	private WebElement cctype;
	
	public WebElement getcctype() {
		return cctype;
	}
	
	@FindBy(id="cc_exp_month")
	private WebElement ccexpmonth;
	
	public WebElement getccexpmonth() {
		return ccexpmonth;
	}
	
	@FindBy(id="cc_exp_year")
	private WebElement ccexpyear;
	
	public WebElement getccexpyear() {
		return ccexpyear;
	}
	
	@FindBy(id="cc_cvv")
	private WebElement cccvv;
	
	public WebElement getcccvv() {
		return cccvv;
	}
	
	@FindBy(id="book_now")
	private WebElement booknow;

	public WebElement getBooknow() {
		return booknow;
	}
}
