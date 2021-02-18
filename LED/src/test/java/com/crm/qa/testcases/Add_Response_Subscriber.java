package com.crm.qa.testcases;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.crm.qa.TestBase;

import io.appium.java_client.MobileElement;
import pages.HomePage;
import pages.LoginPage;

public class Add_Response_Subscriber extends TestBase{

	public HomePage homepage;

	public LoginPage login;

	public Add_Response_Subscriber() throws IOException {

		super();
	}

	@BeforeMethod
	public void setUp() throws IOException {

		launchApp();

		login = new LoginPage();

		homepage = new HomePage();

		login.loginValidUser(prop.getProperty("AccountName"), prop.getProperty("FirstName"), prop.getProperty("LastName"), prop.getProperty("Password"));

	}

	@Test(priority=1)
	public void addResponseSubscriberTest() {
		
		System.out.println(" Add response test for Subscriber has started");

		homepage.addYourResponse("hi how are youd doing today");
		
		MobileElement more = driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc='More']/android.widget.ImageView"));

		more.click();

		MobileElement Logout = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[4]/android.widget.CheckedTextView"));

		Logout.click();
		
		System.out.println("Add response test for Subscriber has completed");
	}


}
