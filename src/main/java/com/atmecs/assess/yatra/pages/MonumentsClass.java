package com.atmecs.assess.yatra.pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import com.atmecs.assess.yatra.constants.Constants;
import com.atmecs.assess.yatra.helper.HelperClass;
import com.atmecs.assess.yatra.reader.PropertyReader;
import com.atmecs.assess.yatra.setup.SetUp;
			
	public class MonumentsClass extends SetUp {
				
		Properties Location_path;
		Properties Data_path;

		public void SearchMonuments() throws InterruptedException, Exception {
			Location_path = PropertyReader.readProperty(Constants.LOCATORS_PATH);
			Data_path = PropertyReader.readProperty(Constants.DATA_FILE);
			Robot r = new Robot();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					
			HelperClass.closeAdWindow(driver, Location_path.getProperty("yatra_iframe_ad"), 
				               Location_path.getProperty("yatra_iframe_close_window"));
		 
		
		  //Monuments Search 
		  HelperClass.elementClick(driver, Location_path.getProperty("moreLink")); 
		  HelperClass.elementClick(driver, Location_path.getProperty("monumentsXpath")); Thread.sleep(2000);
		  HelperClass.elementClick(driver, Location_path.getProperty("selectDestination")); Thread.sleep(2000);
		  
		  //Searching Monuments
		  HelperClass.elementSendKeys(driver, Location_path.getProperty("selectDestination"), Data_path.getProperty("monumentPlace")); 
		  r.keyPress(KeyEvent.VK_TAB);
		  r.keyRelease(KeyEvent.VK_TAB); 
			
		  //Search Button Operation
		  HelperClass.elementClick(driver, Location_path.getProperty("searchButton"));
					
		}
}
