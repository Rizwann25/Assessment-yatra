package com.atmecs.assess.yatra.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.atmecs.assess.yatra.pages.MonumentsClass;
import com.atmecs.assess.yatra.setup.SetUp;

		public class Monuments extends SetUp{
		    
			@Test
			public void runMonument() throws InterruptedException
			{
				MonumentsClass run=new MonumentsClass();
				run.SearchMonuments();
				
			}
         
		//Display Results
		public static boolean checkIfDisplayed(WebDriver driver, String xpath) {
			return driver.findElement(By.xpath(xpath)).isDisplayed();

			}
}