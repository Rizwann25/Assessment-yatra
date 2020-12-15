package com.atmecs.assess.yatra.reader;

import java.io.IOException;
import org.testng.annotations.DataProvider;

import com.atmecs.assess.yatra.constants.Constants;

		public class DataProviderClass {

		  @DataProvider(name="Data")
		   public static Object[][] getData() throws IOException
		   {
				XlsReader xls=new XlsReader(Constants.TEST_DATA);
				Object[][] data=xls.readExcelData("DataSheet");
				return data;
				
		   }
	}

