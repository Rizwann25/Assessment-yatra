package com.atmecs.assess.yatra.testscripts;

import org.testng.annotations.Test;
import com.atmecs.assess.yatra.pages.FlightBookingClass;
import com.atmecs.assess.yatra.setup.SetUp;

	public class FlightBooking extends SetUp   {
	
		@Test
		public void runBooking() throws Exception
		{
			FlightBookingClass run=new FlightBookingClass();
			run.bookTickets();
			
		}
	}


