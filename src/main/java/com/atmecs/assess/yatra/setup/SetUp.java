package com.atmecs.assess.yatra.setup;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.atmecs.assess.yatra.constants.Constants;
import com.atmecs.assess.yatra.reader.PropertyReader;

	public class SetUp  {
		
		public static WebDriver driver;
		public static Properties properties;
		String url;
		
		
		@BeforeMethod
		public void declaration() throws FileNotFoundException, IOException, InterruptedException
		{
			properties=PropertyReader.readProperty(Constants.DATA_FILE);
			System.setProperty("webdriver.chrome.driver", Constants.CHROME_PATH);
			//System.setProperty("webdriver.gecko.driver", Constants.GECKO_PATH);
		     driver=new ChromeDriver();
			
			
			//URL loading
			url=properties.getProperty("url");
			driver.get(url);
			//driver.navigate().to("url");
			driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.MINUTES);
			driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			
		//Browser Choice
		/*
		 * if(Data_path.getProperty("browserName").equalsIgnoreCase("Chrome")) {
		 * System.setProperty("webdriver.chrome.driver", Constants.CHROME_PATH);
		 * driver=new ChromeDriver(); } else
		 * 
		 * if((Data_path.getProperty("browserName").equalsIgnoreCase("firefox"))) {
		 * System.setProperty("webdriver.gecko.driver", Constants.GECKO_PATH);
		 * driver=new FirefoxDriver(); }
		 */
		
		
		}
		
		@AfterMethod
		public void closeBrowser()
		{
			driver.quit();
		}
}
