package com.crm.qa.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.TestBase;

import io.appium.java_client.MobileElement;
import pages.LoginPage;
import pages.UpdateProfilePage;

public class UpdateProfilePartnerTest extends TestBase{

	public LoginPage login;

	public UpdateProfilePage updateProfile;


	public UpdateProfilePartnerTest() throws IOException {

		super();
	}

	@BeforeMethod
	public void setUp() throws IOException{

		launchApp();

		login = new LoginPage();

		login.loginValidUser(prop.getProperty("AccountName"), prop.getProperty("PartnerFirstName"), prop.getProperty("PartnerLastName"), prop.getProperty("Password"));

		updateProfile = new UpdateProfilePage();
	}

	@Test
	public void updatePrfilePartnerTest() {

		System.out.println("Update profile test for Partner has started");


		updateProfile.profileUpdatePartner();

		MobileElement more = driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc='More']/android.widget.ImageView"));

		more.click();

		MobileElement Logout = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[4]/android.widget.CheckedTextView"));

		Logout.click();

		System.out.println("Update profile test for Partner has completed");

	}



}
