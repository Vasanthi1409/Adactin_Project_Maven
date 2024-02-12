package pom_Class.com;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Base_Class_Adactin {

	public static WebDriver driver;

	public static WebDriver browser_Launch(String B) {

		try {
			if (B.equalsIgnoreCase("Chrome")) {
				driver = new ChromeDriver();
			} else if (B.equalsIgnoreCase("Firefox")) {
				driver = new FirefoxDriver();
			} else if (B.equalsIgnoreCase("Edge")) {
				driver = new EdgeDriver();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			driver = new ChromeDriver();
		}

		return driver;
	}

	public static void url(String Website) {
		driver.get(Website);
		driver.manage().window().maximize();
	}

	public static void sendkeys(WebElement locators, String senddata) {
		locators.sendKeys(senddata);
	}

	public static void click(WebElement locators) {
		locators.click();
	}

	public static void selectbyvalue(WebElement locators, String selectedval) {
		Select S = new Select(locators);
		S.selectByValue(selectedval);
	}
	
//	public static void Screenshot(WebDriver driver) throws IOException {
//		TakesScreenshot ts = (TakesScreenshot) driver;
//		File SRC = ts.getScreenshotAs(OutputType.FILE);
//		File DES = new File("C:\\Users\\inbaraj\\eclipse-workspace\\Maven_TCF\\src\\test\\java\\runner_Class\\com\\Capture.png");
//		FileUtils.copyFile(SRC, DES);
//	}
}