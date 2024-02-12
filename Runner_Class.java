package runner_Class.com;

import java.io.IOException;
import java.time.Duration;

import pom_Class.com.Adactin_Login;
import pom_Class.com.Base_Class_Adactin;
import pom_Class.com.Book_Hotel;
import pom_Class.com.Booked_Itinerary;
import pom_Class.com.Booking_Confirmation;
import pom_Class.com.Search_Hotel;
import pom_Class.com.Select_Hotel;

public class Runner_Class extends Base_Class_Adactin{

	public static void main(String[] args) throws IOException {

		browser_Launch(null);
		url("https://adactinhotelapp.com/index.php");
		
		Adactin_Login log = new Adactin_Login(driver);
		sendkeys(log.getUsername(), "VasanthiSIH");
		sendkeys(log.getPassword(), "vasanthiharish");
		click(log.getLogin());
		
		Search_Hotel sh = new Search_Hotel(driver);
		selectbyvalue(sh.getLocation(), "London");
		selectbyvalue(sh.getHotels(), "Hotel Sunshine");
		selectbyvalue(sh.getRoom_type(), "Standard");
		selectbyvalue(sh.getRoom_nos(), "2");
		sendkeys(sh.getDatepick_in(), "23/01/2024");
		sendkeys(sh.getDatepick_out(), "25/01/2024");
		selectbyvalue(sh.getAdult_room(), "2");
		selectbyvalue(sh.getChild_room(), "1");
		click(sh.getSearch());
		
		Select_Hotel slh = new Select_Hotel(driver);
		click(slh.getRadiobutton());
		click(slh.getContinuebutton());
		
		Book_Hotel bh = new Book_Hotel(driver);
		sendkeys(bh.getfirstname(), "Vasanthi");
		sendkeys(bh.getlastname(), "S");
		sendkeys(bh.getbilladdress(), "Chennai");
		sendkeys(bh.getccnum(), "1234567891234567");
		selectbyvalue(bh.getcctype(),"VISA");
		selectbyvalue(bh.getccexpmonth(),"2");
		selectbyvalue(bh.getccexpyear(),"2026");
		sendkeys(bh.getcccvv(), "821");
		click(bh.getBooknow());
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		Booking_Confirmation bc = new Booking_Confirmation(driver);
		click(bc.getMyitinerary());
		
		Booked_Itinerary bi = new Booked_Itinerary(driver); 
		click(bi.getClickordered());
		click(bi.getCancelall());
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000000));
//		Screenshot(driver);
	}
}
