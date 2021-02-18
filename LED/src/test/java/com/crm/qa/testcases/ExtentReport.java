package com.crm.qa.testcases;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport {

	public static void main(String[] args) {

		
		ExtentHtmlReporter html = new ExtentHtmlReporter("C:\\LoveEveryDay\\LED\\Reports\\firstReport.html");
		
		ExtentReports extent = new ExtentReports();
		
		extent.attachReporter(html);
		
		ExtentTest test = extent.createTest("Camera upload profile pic","sign up with profile pic upload");
				
	
	
	
	
	}

}
