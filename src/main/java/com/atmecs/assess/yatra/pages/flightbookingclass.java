package com.atmecs.assess.yatra.pages;

import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.atmecs.assess.yatra.constants.Constants;
import com.atmecs.assess.yatra.helper.HelperClass;
import com.atmecs.assess.yatra.reader.PropertyReader;
import com.atmecs.assess.yatra.setup.SetUp;

public class flightbookingclass extends SetUp {

	Properties Location_path;
	Properties Data_path;
	
	
	//WebDriverWait wait = new WebDriverWait(driver, 60);
    	public void bookTickets() throws InterruptedException, Exception {
		Location_path = PropertyReader.readProperty(Constants.LOCATORS_PATH);
		Data_path = PropertyReader.readProperty(Constants.DATA_FILE); 
		Thread.sleep(7000);
		HelperClass.closeAdWindow(driver, Location_path.getProperty("yatra_iframe_ad"), 
				Location_path.getProperty("yatra_iframe_close_window"));
		
		
		  HelperClass.elementClick(driver,
		  Location_path.getProperty("yatra_iframe_ad"));
		  HelperClass.elementClick(driver,
		  Location_path.getProperty("yatra_iframe_close_window"));
		 
		 //driver.switchTo().alert().accept();
		
		 //FLIGHT BOOKING
		 HelperClass.elementClick(driver, Location_path.getProperty("xpathFlights"));
		 Thread.sleep(1000);
		
		 //TRIP TYPE
		 driver.manage().timeouts().implicitlyWait(0,TimeUnit.SECONDS);
		 HelperClass.elementClick(driver, Location_path.getProperty("roundTrip_Id"));
		 Thread.sleep(1000);

		  //TRIP DETAILS
		
		  HelperClass.elementClick(driver,
		  Location_path.getProperty("departFromXpath")); Thread.sleep(1000);
		  HelperClass.enterElement(driver,
		  Location_path.getProperty("departFromXpath"),
		  Data_path.getProperty("depart"));
		  
		  HelperClass.elementClick(driver, Location_path.getProperty("goingToXpath"));
		  Thread.sleep(1000); HelperClass.enterElement(driver,
		  Location_path.getProperty("goingToXpath"),
		  Data_path.getProperty("arrivals")); Thread.sleep(3000);
		 
		
		
		  //BOOKING DETAILS 
		
		  //HelperClass.elementClick(driver, Location_path.getProperty("departureDate"));
		  driver.findElement(By.id("departureDate"));
		  HelperClass.enterElement(driver, Location_path.getProperty("goingToXpath"), Data_path.getProperty("xpathDepartureDate"));
		  
		  //HelperClass.elementClick(driver, Location_path.getProperty("returnDate"));
		  driver.findElement(By.id("departureDate"));
		  HelperClass.enterElement(driver, Location_path.getProperty("goingToXpath"), Data_path.getProperty("xpathReturnDate")); 
		  Thread.sleep(5000);
		 
		  //driver.findElement(By.id("departureDate")).click();
		  
		  HelperClass.selectElementById(driver, Location_path.getProperty("xpathDepartureDate"));
		  
		  //driver.findElement(By.id("returnDate")).click();
		  
		  HelperClass.selectElementById(driver, Location_path.getProperty("xpathReturnDate"));
		  
		  // Flight CLASS TYPE 
		  HelperClass.elementClick(driver, Location_path.getProperty("xpathFlightClass"));
		  HelperClass.elementClick(driver, Location_path.getProperty("economyXpath"));
		  
		  // SEARCH OPERATION 
		  HelperClass.elementClick(driver, Location_path.getProperty("searchButtonXpath"));
		  HelperClass.selectElementById(driver, Location_path.getProperty("confirmationTab"));
		  
		  // BOOKING CONFIRMATION 
		  HelperClass.elementClick(driver, Location_path.getProperty("bookNowXpath"));
		 

		driver.close();

	}
}
