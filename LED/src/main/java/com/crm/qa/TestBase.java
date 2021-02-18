package com.crm.qa;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class TestBase {
	
	public static WebDriverWait wait;
	
	public static MobileElement mob;
	
	public static AppiumDriver<MobileElement> driver;	
	
	public static Properties prop;
	
	public TestBase() throws IOException {
		try {
		
		prop = new Properties();
		
		FileInputStream ip = new FileInputStream("C:\\LoveEveryDay\\LED\\src\\main\\java\\config\\config1.prop");
		
		prop.load(ip);

		
	}catch (FileNotFoundException e) {
		
		e.printStackTrace();
	}
	}
	
	public static void launchApp() throws MalformedURLException {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("deviceName", prop.getProperty("deviceName"));
		cap.setCapability("udid", prop.getProperty("udid"));
		cap.setCapability("platformName", prop.getProperty("platformName"));
		cap.setCapability("platformVersion", prop.getProperty("platformVersion"));
		cap.setCapability("appPackage", prop.getProperty("appPackage"));
		cap.setCapability("appActivity", prop.getProperty("appActivity"));
		
		/* try {
	            driver = new AndroidDriver<MobileElement>(new URL(
	                    "http://127.0.0.1:4723/wd/hub"), cap);
		 } catch (MalformedURLException e) {
	            //
	        } catch (Exception ex) {
	            //
	        }
 */
		
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
	
		
		driver = new AppiumDriver<MobileElement>(url,cap);
		
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		
		wait = new WebDriverWait(driver,20000);
		
		
	

		
	}
	

}
