package com.atmecs.assess.yatra.testscripts;

import org.testng.annotations.Test;
import com.atmecs.assess.yatra.pages.flightbookingclass;
import com.atmecs.assess.yatra.setup.SetUp;

	public class flightbooking extends SetUp   {
	
		@Test
		public void runBooking() throws Exception
		{
			flightbookingclass run=new flightbookingclass();
			run.bookTickets();
			
		}
	}


