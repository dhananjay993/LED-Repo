package com.crm.qa.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.TestBase;

import io.appium.java_client.MobileElement;
import pages.CreateEventPage;
import pages.LoginPage;

public class DeleteEventSubscriberTest extends TestBase{

	public LoginPage login;

	public CreateEventPage event;	

	public DeleteEventSubscriberTest() throws IOException {

		super();
	}

	@BeforeMethod
	public void setUp() throws IOException {

		launchApp();

		login = new LoginPage();


		event = new CreateEventPage();

	}

	@Test(priority=1)
	public void deleteSubscriberTest() {
		
		System.out.println(" Delete event test for Subscriber has Started");


		login.loginValidUser(prop.getProperty("AccountName"), prop.getProperty("FirstName"), prop.getProperty("LastName"), prop.getProperty("Password"));

		event.deleteEvent();
		
		System.out.println(" Delete event test for Subscriber has Completed");

		

	}

	@Test(priority=2)
	public void deletePartnerTest() {
		
		System.out.println(" Delete event test for Partner has Started");


		login.loginValidUser(prop.getProperty("AccountName"), prop.getProperty("PartnerFirstName"), prop.getProperty("PartnerLastName"), prop.getProperty("Password"));

		event.deleteEvent();
		
		System.out.println(" Delete event test for Partner has Completed");


	}

}
