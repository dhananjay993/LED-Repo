package com.crm.qa.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.TestBase;

import io.appium.java_client.MobileElement;
import pages.HomePage;
import pages.LoginPage;

public class Add_Response_Partner extends TestBase{

	public HomePage homepage;

	public LoginPage login;

	public Add_Response_Partner() throws IOException {

		super();

	}

	@BeforeMethod
	public void setUp() throws IOException {

		launchApp();

		login = new LoginPage();

		homepage = new HomePage();

		login.loginValidUser(prop.getProperty("AccountName"), prop.getProperty("PartnerFirstName"), prop.getProperty("PartnerLastName"), prop.getProperty("Password"));

	}

	@Test(priority=1)
	public void addPartnerTest() {

		System.out.println(" Add response test for Partner has started");
		
		homepage.addYourResponsePartner("hello jack how are you doing today");

		MobileElement more = driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc='More']/android.widget.ImageView"));

		more.click();

		MobileElement Logout = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[4]/android.widget.CheckedTextView"));

		Logout.click();
		
		System.out.println(" Add response test for Partner has completed");
	}


















}
