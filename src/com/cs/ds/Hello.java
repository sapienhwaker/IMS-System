// Java program to illustrate logging in Java 
// The following code shows a basic example how logging 
// works in Java 
package com.cs.ds;

import java.util.logging.Level; 
import java.util.logging.Logger; 
import java.util.logging.*; 

public class Hello { 
	public static void main(String[] args) 
	{ 	
		// Generating some log messages through the 
		// function defined above 
		LogManager lgmngr = LogManager.getLogManager(); 

		// lgmngr now contains a reference to the log manager. 
		Logger log = lgmngr.getLogger(Logger.GLOBAL_LOGGER_NAME); 

		// Getting the global application level logger 
		// from the Java Log Manager 
		log.log(Level.INFO, "This is a log message");
		log.log(Level.SEVERE, "Not doing well");

		// Create a log message to be displayed 
		// The message has a level of Info 
	} 
} 
