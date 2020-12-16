package com.atmecs.assess.yatra.pages;

import java.util.Properties;
import java.util.concurrent.TimeUnit;
import com.atmecs.assess.yatra.constants.Constants;
import com.atmecs.assess.yatra.helper.HelperClass;
import com.atmecs.assess.yatra.reader.PropertyReader;
import com.atmecs.assess.yatra.setup.SetUp;
			
			public class MonumentsClass extends SetUp {
				
				Properties Location_path;
				Properties Data_path;

				public void SearchMonuments() throws InterruptedException {
					Location_path = PropertyReader.readProperty(Constants.LOCATORS_PATH);
					Data_path = PropertyReader.readProperty(Constants.DATA_FILE);
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					
				HelperClass.closeAdWindow(driver, Location_path.getProperty("yatra_iframe_ad"), 
				               Location_path.getProperty("yatra_iframe_close_window"));
				
		 
				//Monuments Search
				HelperClass.elementClick(driver, Location_path.getProperty("moreLink"));
			    HelperClass.elementClick(driver, Location_path.getProperty("monumentsXpath"));
			    Thread.sleep(2000);
				HelperClass.elementClick(driver, Location_path.getProperty("selectDestination"));
				HelperClass.elementSendKeys(driver, Location_path.getProperty("topMonumentsXpath"), Data_path.getProperty("arrival"));
					
				//2 Monuments displayed
				HelperClass.selectElementById(driver, Location_path.getProperty("verifyMonument1"));
				HelperClass.selectElementById(driver, Location_path.getProperty("verifyMonument2"));
					
				driver.close();
		}
}
