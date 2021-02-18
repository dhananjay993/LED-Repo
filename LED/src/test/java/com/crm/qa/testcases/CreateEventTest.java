package com.crm.qa.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.TestBase;

import io.appium.java_client.MobileElement;
import pages.CreateEventPage;
import pages.LoginPage;

public class CreateEventTest extends TestBase{

	public LoginPage login;

	public CreateEventPage event;

	public CreateEventTest() throws IOException {
		super();


	}

	@BeforeMethod
	public void setUp() throws IOException {

		launchApp();

		login = new LoginPage();

		event = new CreateEventPage();

	}


	@Test(priority=1)
	public void createEventTest() throws InterruptedException {
		
		System.out.println(" Create event test for Subscriber has started");

		login.loginValidUser(prop.getProperty("AccountName"), prop.getProperty("FirstName"), prop.getProperty("LastName"), prop.getProperty("Password"));

		event.addEvent("test1");	
		
		System.out.println(" Create event test for Subscriber has Completed");

	}

	@Test(priority=2)
	public void createEventPartnerTest() throws InterruptedException {
		
		System.out.println(" Create event test for Partner has started");

		login.loginValidUser(prop.getProperty("AccountName"), prop.getProperty("PartnerFirstName"), prop.getProperty("PartnerLastName"), prop.getProperty("Password"));


		event.addEvent("test2");	
		

		System.out.println(" Create event test for Partner has Completed");

	
	}









}
