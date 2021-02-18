package com.crm.qa.testcases;

import java.io.IOException;
import java.net.MalformedURLException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.TestBase;

import pages.ForgotPasswordSubscriberPage;

public class Forgot_Password_Subscriber extends TestBase{

	ForgotPasswordSubscriberPage forgot1;

	public Forgot_Password_Subscriber() throws IOException {
		super();
	}

	@BeforeMethod

	public void setUp() throws IOException {

		launchApp();

		forgot1 = new ForgotPasswordSubscriberPage();

		forgot1.loginButton.click();

	}

	@Test
	public void forgotpasswordTest(){

		System.out.println("Forgot password test for Subscriber has started");

		forgot1.changePassword(prop.getProperty("AccountName"), prop.getProperty("FirstName"),prop.getProperty("LastName"), prop.getProperty("Password"), prop.getProperty("ConfirmPassword"));


		System.out.println("Forgot password test for Subscriber has completed");
	}
}













