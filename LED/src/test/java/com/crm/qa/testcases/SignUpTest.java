package com.crm.qa.testcases;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.crm.qa.TestBase;

import io.appium.java_client.MobileElement;
import pages.LoginPage;
import pages.SignUpPage;


public class SignUpTest extends TestBase{

	public SignUpPage signUp;

	public SignUpTest() throws IOException {
		super();



	}

	@BeforeTest
	public void before() throws IOException {

		launchApp();
		signUp = new SignUpPage();
		signUp.launchSignUp();

	}

	@Test(priority = 1)
	public void signUpRegistrationTest() throws MalformedURLException {

		System.out.println("Sign up test has started");

		signUp.signUpRegistration("Rayan", "Ray", "dhananjaysubhash@gmail.com", "india", "7276059974", "AutomationTest56", "Blackberry@2", "Blackberry@2");

		
	}

	@Test(priority = 2)
	public void partDetailsTest() {

		System.out.println("on add partner screen");

		signUp.partnerInfo("Susan", "Steve", "Blackberry@2", "dhananjaysubhash@gmail.com", "7276059974");

		MobileElement more = driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc='More']/android.widget.ImageView"));

		more.click();

		MobileElement Logout = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[4]/android.widget.CheckedTextView"));

		Logout.click();
		
		System.out.println(" Sign Up test has completed");
		
	}


}

