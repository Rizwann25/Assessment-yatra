package com.atmecs.assess.yatra.pages;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.atmecs.assess.yatra.constants.Constants;
import com.atmecs.assess.yatra.helper.HelperClass;
import com.atmecs.assess.yatra.reader.PropertyReader;
import com.atmecs.assess.yatra.setup.SetUp;

public class FlightBookingClass extends SetUp {

	Properties Location_path;
	Properties Data_path;
	Properties validate_path;
	
    	public void bookTickets() throws InterruptedException, Exception {
		Location_path = PropertyReader.readProperty(Constants.LOCATORS_PATH);
		Data_path = PropertyReader.readProperty(Constants.DATA_FILE);
		validate_path= PropertyReader.readProperty(Constants.VALIDATION_PATH);
		
		//POPUP CLOSE
		HelperClass.closeAdWindow(driver, Location_path.getProperty("yatra_iframe_ad"), 
				               Location_path.getProperty("yatra_iframe_close_window"));
			
		 //FLIGHT BOOKING
		 HelperClass.elementClick(driver, Location_path.getProperty("xpathFlights"));
		 
		 //TRIP TYPE
		 HelperClass.elementClick(driver, Location_path.getProperty("roundTrip_Id"));
		 
		 driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);

		  //TRIP DETAILS
		  HelperClass.elementClick(driver, Location_path.getProperty("loc_departure_city")); 
		  HelperClass.enterElement(driver, Location_path.getProperty("loc_departure_city"), Data_path.getProperty("depart"));
		  
		  driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		  HelperClass.elementClick(driver, Location_path.getProperty("loc_arrival_city"));
		  
		  HelperClass.enterElement(driver, Location_path.getProperty("loc_arrival_city"), Data_path.getProperty("arrivals"));
		  HelperClass.elementClick(driver, Location_path.getProperty("loc_departure_date_field"));
		  
		  
		  //BOOKING DATE DETAILS 
		  HelperClass.elementClick(driver, Location_path.getProperty("loc_departure_date_field"));
		  HelperClass.elementClick(driver, Location_path.getProperty("loc_departure_date"));
		  
		  driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		  HelperClass.elementClick(driver, Location_path.getProperty("loc_arrival_date_field"));
		  HelperClass.elementClick(driver, Location_path.getProperty("loc_arrival_date")); 
		  
		 		  
		  // Flight CLASS TYPE 
		  HelperClass.elementClick(driver, Location_path.getProperty("flightClass"));
		  
		  HelperClass.elementClick(driver, Location_path.getProperty("economyXpath"));
		  
		  
		  // SEARCH OPERATION 
		  HelperClass.elementClick(driver, Location_path.getProperty("searchButtonXpath"));
		  
		  
		  //Verifying Details
		  HelperClass.elementClick(driver, Location_path.getProperty("arriveDetails"));
		  HelperClass.elementClick(driver, Location_path.getProperty("departDetails"));
		  HelperClass.elementClick(driver, Location_path.getProperty("durationFlight"));
		  HelperClass.elementClick(driver, Location_path.getProperty("pricePerAdult"));
		  
		  //Validation
		/*
		 * HelperClass.elementClick(driver, Location_path.getProperty("flightDetails"));
		 * String expectedFlighName = validate_path.getProperty("flightName"); String
		 * actualFlightName = HelperClass.getText(driver,
		 * Location_path.getProperty("airBus")); Assert.assertEquals(actualFlightName,
		 * expectedFlighName);
		 */
		  
		  HelperClass.elementClick(driver, Location_path.getProperty("fareSummary"));
		  
		  HelperClass.elementClick(driver, Location_path.getProperty("totalFareToBook"));
		  
		  // BOOKING CONFIRMATION 
		  HelperClass.elementClick(driver, Location_path.getProperty("bookNowXpath"));
		  
		  Thread.sleep(5000);
		 // HelperClass.elementClick(driver, Location_path.getProperty("viewFareRules"));
		  
		  
		  
	}
}
