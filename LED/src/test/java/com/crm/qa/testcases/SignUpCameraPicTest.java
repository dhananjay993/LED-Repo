package com.crm.qa.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.crm.qa.TestBase;

import pages.SignUpCameraPage;
import pages.SignUpPage;

public class SignUpCameraPicTest extends TestBase {

	public SignUpCameraPage signUpCamera;

	public SignUpPage signUp2; 

	public SignUpCameraPicTest() throws IOException {

		super();

	}

	/*@BeforeSuite
	public void setUp() {

		ExtentHtmlReporter html = new ExtentHtmlReporter("C:\\LoveEveryDay\\LED\\Reports\\firstReport.html");

		ExtentReports extent = new ExtentReports();

		extent.attachReporter(html);

	} */

	@BeforeTest
	public void before() throws IOException {

		launchApp();

		signUpCamera = new SignUpCameraPage();

		signUp2 = new SignUpPage();

		signUp2.launchSignUp();

	}

	@Test(priority=1)
	public void signUpRegistrationTest1() {

		System.out.println("in sign up");

		signUp2.signUpRegistration("Mike", "Ray", "dhananjaysubhash@gmail.com", "india", "7276059974", "AutomationTest24", "Blackberry@2", "Blackberry@2");

	}

	@Test(priority=2)
	public void partDetailsTest2() {

		System.out.println("on add partner screen");

		signUpCamera.partnerInfo2("Susan", "Steve", "Blackberry@2", "dhananjaysubhash@gmail.com", "7276059974");
	}

	@Test(priority=3)
	public void cameraUploadTest() {

		System.out.println("on camera upload");


		signUpCamera.cameraUpload();
	}

}
