package com.crm.qa.testcases;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.TestBase;

import io.appium.java_client.MobileElement;
import pages.CreateEventPage;
import pages.LoginPage;

public class EditEventTest extends TestBase{

	public LoginPage login;

	public CreateEventPage event;	

	public EditEventTest() throws IOException {

		super();

	}

	@BeforeMethod
	public void setUp() throws IOException {

		launchApp();

		login = new LoginPage();


		event = new CreateEventPage();

	}

	@Test(priority=1)
	public void editEventSubscriberTest() {
		
		System.out.println(" Edit event test for Subscriber has started");

		login.loginValidUser(prop.getProperty("AccountName"), prop.getProperty("FirstName"), prop.getProperty("LastName"), prop.getProperty("Password"));

		event.editEvent("edited event subscriber");	

		MobileElement more = driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc='More']/android.widget.ImageView"));

		more.click();

		MobileElement Logout = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[4]/android.widget.CheckedTextView"));

		Logout.click();

		System.out.println(" Edit event test for Subscriber has Completed");

	}

	@Test
	public void editEventPartnerTest() {
		

		System.out.println(" Edit event test Partner has started");

		login.loginValidUser(prop.getProperty("AccountName"), prop.getProperty("PartnerFirstName"), prop.getProperty("PartnerLastName"), prop.getProperty("Password"));

		event.editEvent("edited event partner");	

		MobileElement more = driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc='More']/android.widget.ImageView"));

		more.click();

		MobileElement Logout = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[4]/android.widget.CheckedTextView"));

		Logout.click();
		
		System.out.println(" Edit event test Partner has Completed");


	}
}
