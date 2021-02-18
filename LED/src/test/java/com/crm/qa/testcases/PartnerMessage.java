package com.crm.qa.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.TestBase;

import io.appium.java_client.MobileElement;
import pages.LoginPage;
import pages.MessagePage;

public class PartnerMessage extends TestBase{

	MessagePage message;

	LoginPage login;

	public PartnerMessage() throws IOException {

		super();


	}

	@BeforeMethod
	public void setUp() throws IOException {

		launchApp();

		login = new LoginPage();

		message = new MessagePage();

		login.loginValidUser(prop.getProperty("AccountName"), prop.getProperty("PartnerFirstName"), prop.getProperty("PartnerLastName"), prop.getProperty("Password"));

	}

	@Test
	public void SubscriberMessageTest() {

		System.out.println(" Partner message test has started");	

		message.MessageSubscriber("hi how are you doing today");

		MobileElement more = driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc='More']/android.widget.ImageView"));

		more.click();

		MobileElement Logout = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[4]/android.widget.CheckedTextView"));

		Logout.click();

		System.out.println(" Partner message test has completed");

	}














}
