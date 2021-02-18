package com.crm.qa.testcases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.TestBase;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import pages.LoginPage;
import pages.UpdateProfilePage;

public class UpdateProfileSubscriber extends TestBase{


	public LoginPage login;

	public UpdateProfilePage updateProfile;

	public UpdateProfileSubscriber() throws IOException {

		super();


	}

	@BeforeMethod
	public void setUp() throws IOException{

		launchApp();

		login = new LoginPage();

		login.loginValidUser(prop.getProperty("AccountName"), prop.getProperty("FirstName"), prop.getProperty("LastName"), prop.getProperty("Password"));

		updateProfile = new UpdateProfilePage();
	}


	@Test
	public void updatePrfileSubscriberTest() {

		System.out.println("Update profile test for Subscriber has started");


		updateProfile.profileUpdate();

		MobileElement more = driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc='More']/android.widget.ImageView"));

		more.click();

		MobileElement Logout = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[4]/android.widget.CheckedTextView"));

		Logout.click();

		System.out.println("Update profile test for Subscriber has completed");



	}



}
