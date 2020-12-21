package com.atmecs.assess.yatra.helper;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.atmecs.assess.yatra.pages.FlightBookingClass;

public class log4j {

	    static Logger logger = Logger.getLogger(FlightBookingClass.class);
	    public static void main(String[] args)
	    {
	        //PropertiesConfigurator is used to configure logger from properties file
	        PropertyConfigurator.configure("log4j.properties");
	 
	        //Log in console in and log file
	        logger.debug("Log4j appender configuration is successful !!");
	    }
}
