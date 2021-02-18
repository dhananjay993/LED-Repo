package com.crm.qa.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.TestBase;

import pages.HomePage;
import pages.LoginPage;
import pages.MessagePage;

public class SubscriberMessage extends TestBase{
	
	LoginPage login;
	
	MessagePage message;

	public SubscriberMessage() throws IOException {
		
		super();
	}

	@BeforeMethod
	public void setUp() throws IOException {

		launchApp();

		login = new LoginPage();
		
		message = new MessagePage();

		login.loginValidUser(prop.getProperty("AccountName"), prop.getProperty("FirstName"), prop.getProperty("LastName"), prop.getProperty("Password"));

	}
	
	
	@Test
	public void SubscriberMessageTest() {
		
	System.out.println(" Subscriber messahe test has started");
		
	message.MessageSubscriber("so how is life ?");
	
	System.out.println(" Subscriber messahe test has completed");
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
