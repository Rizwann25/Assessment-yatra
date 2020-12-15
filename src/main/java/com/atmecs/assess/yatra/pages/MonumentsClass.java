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
				
		
		/*
		 * boolean topMonuments = HelperClass.checkIfDisplayed(driver,
		 * Location_path.get("topMonumentsXpath")); Assert.assertEquals(true,
		 * topMonuments); if (topMonuments == true) {
		 * Reporter.log("Top Monuments Section has been displayed"); }
		 * driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); boolean
		 * qutubMinarstatus = HelperClass.checkIfDisplayed(driver,
		 * Location_path.get("qutubMinarXpath")); Assert.asserEquals(true,
		 * qutubMinarstatus); if(qutubMinarstatus == true) {
		 * Reporter.Log("qutub minar has been Displayed"); } boolean tombStatus =
		 * HelperClass.checkIfDisplayed(driver, Location_path.get("humayunTombXpath"));
		 * Assert.asserEquals(true, tombStatus); if(tombStatus == true) {
		 * Reporter.Log("Humayuns Tomb has been Displayed"); }
		 */
		 
				//Monuments Search
				HelperClass.elementClick(driver, Location_path.getProperty("moreLink"));
			    HelperClass.elementClick(driver, Location_path.getProperty("monumentsXpath"));
				HelperClass.elementClick(driver, Location_path.getProperty("topMonumentsXpath"));
				HelperClass.elementSendKeys(driver, Location_path.getProperty("topMonumentsXpath"), Data_path.getProperty("arrival"));
					
				//2 Monuments displayed
				HelperClass.selectElementById(driver, Location_path.getProperty("verifyMonument1"));
				HelperClass.selectElementById(driver, Location_path.getProperty("verifyMonument2"));
					
				driver.close();
		}
}
