package com.crm.qa.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.crm.qa.TestBase;

import pages.SignUpCameraPage;
import pages.SignUpGalleryPage;
import pages.SignUpPage;

public class SignUpGalleryPicTest extends TestBase{

	public SignUpGalleryPage signUpGallery;

	public SignUpPage signUp3; 
	
	public SignUpCameraPage signUpCamera2;


	public SignUpGalleryPicTest() throws IOException {

		super();
	}

	@BeforeTest
	public void before() throws IOException {

		launchApp();
		
		signUpGallery = new SignUpGalleryPage();
		
		signUp3 = new SignUpPage();
		
		signUp3.launchSignUp();

	}
	
	@Test(priority=1)
	public void signUpRegistrationTest1() {

		System.out.println("in sign up");

		signUp3.signUpRegistration("jack", "Ray", "dhananjaysubhash@gmail.com", "india", "7276059974", "AutomationTest33", "Blackberry@2", "Blackberry@2");

	}
	
	@Test(priority=2)
	public void partDetailsTest3() {
		
		signUpGallery.skip1();
	}
	
	@Test(priority=3)
	public void galleryUploadTest(){
		
		System.out.println("on gallery page");
		
		signUpGallery.SignUpGalleryPic();
		
	}


}
