package com.atmecs.assess.yatra.pages;

import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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
		
		HelperClass.closeAdWindow(driver, Location_path.getProperty("yatra_iframe_ad"), 
				               Location_path.getProperty("yatra_iframe_close_window"));
			
		 //FLIGHT BOOKING
		 HelperClass.elementClick(driver, Location_path.getProperty("xpathFlights"));
		 
		
		 //TRIP TYPE
		 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		 HelperClass.elementClick(driver, Location_path.getProperty("roundTrip_Id"));
		 

		  //TRIP DETAILS
		  HelperClass.elementClick(driver, Location_path.getProperty("loc_departure_city")); 
		  HelperClass.enterElement(driver, Location_path.getProperty("loc_departure_city"), Data_path.getProperty("depart"));
		  
		  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		  HelperClass.elementClick(driver, Location_path.getProperty("loc_arrival_city"));
		  
		  HelperClass.enterElement(driver, Location_path.getProperty("loc_arrival_city"), Data_path.getProperty("arrivals"));
		  HelperClass.elementClick(driver, Location_path.getProperty("loc_departure_date_field"));
		  
		  
		  //BOOKING DATE DETAILS 
		  HelperClass.elementClick(driver, Location_path.getProperty("loc_departure_date_field"));
		  HelperClass.elementClick(driver, Location_path.getProperty("loc_departure_date"));
		  
		  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		  HelperClass.elementClick(driver, Location_path.getProperty("loc_arrival_date_field"));
		  HelperClass.elementClick(driver, Location_path.getProperty("loc_arrival_date")); 
		  
		 		  
		  // Flight CLASS TYPE 
		  HelperClass.elementClick(driver, Location_path.getProperty("flightClass"));
		  
		  HelperClass.elementClick(driver, Location_path.getProperty("economyXpath"));
		  
		  
		  // SEARCH OPERATION 
		  HelperClass.elementClick(driver, Location_path.getProperty("searchButtonXpath"));
		  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		  // BOOKING CONFIRMATION 
		  HelperClass.elementClick(driver, Location_path.getProperty("bookNowXpath"));
		 
		driver.close();

	}
}
