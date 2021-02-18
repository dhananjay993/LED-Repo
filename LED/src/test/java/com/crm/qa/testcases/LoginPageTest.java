package com.crm.qa.testcases;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import com.crm.qa.TestBase;

import pages.LoginPage;

public class LoginPageTest extends TestBase {

	LoginPage login;

	public LoginPageTest() throws IOException {
		super();
	}

	@BeforeMethod
	public void setUp() throws IOException {

		launchApp();

		login = new LoginPage();


	}


	@Test(priority=1)
	public void loginSubscriberTest() {

		System.out.println("Login test for Subscriber has started");


		login.loginValidUser(prop.getProperty("AccountName"), prop.getProperty("FirstName"), prop.getProperty("LastName"), prop.getProperty("Password"));

		System.out.println("Login test for Subscriber Subscriber has completed");

	}

	@Test(priority=2)
	public void loginPartnerTest()
	{
		System.out.println("Login test for Partner has started");

		login.loginValidUser(prop.getProperty("AccountName"), prop.getProperty("PartnerFirstName"), prop.getProperty("PartnerLastName"), prop.getProperty("Password"));

		System.out.println("Login test for Partner has completed");



	}




}
