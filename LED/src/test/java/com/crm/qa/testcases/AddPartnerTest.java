package com.crm.qa.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.TestBase;

import pages.DeletePartnerPage;
import pages.LoginPage;

public class AddPartnerTest extends TestBase{
	
	public LoginPage login;
	
	public DeletePartnerPage delete_partner;


	public AddPartnerTest() throws IOException {
		
		super();
		
	}
	
	@BeforeMethod
	
	public void setUp() throws IOException{
		
		launchApp();

		login = new LoginPage();
		
		login.loginValidUser(prop.getProperty("AccountName"), prop.getProperty("FirstName"), prop.getProperty("LastName"), prop.getProperty("Password"));
		
		delete_partner = new DeletePartnerPage();
	}	

	
	@Test
	public void addPartnerTest() {
		
		System.out.println("Add Partner test has started");

		delete_partner.deletePartner(prop.getProperty("PartnerFirstName"), prop.getProperty("PartnerLastName"), prop.getProperty("Password"), prop.getProperty("Partemail"), prop.getProperty("country"));	
		
		System.out.println("Add Partner test has completed");
	}
}
