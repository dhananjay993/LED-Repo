package pages;

import java.io.IOException;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.TestBase;

import io.appium.java_client.MobileElement;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
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
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPage extends TestBase{

	public LoginPage() throws IOException {
		super();
		
		PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(100)), this);
	}
	
	@FindBy(id="com.globalmed.loveeveryday:id/btnLogin")
	
	public WebElement login ;
	
	@FindBy(id ="com.globalmed.loveeveryday:id/account_name_edit_text")
	public WebElement accountName ;
	
	@FindBy(id ="com.globalmed.loveeveryday:id/fname_edit_text")
	public WebElement firstName ;
	
	@FindBy(id ="com.globalmed.loveeveryday:id/lname_edit_text")
	public WebElement lastName ;
	
	@FindBy(id ="com.globalmed.loveeveryday:id/password_edit_text")
	public WebElement password ;
	
	@FindBy(id ="com.globalmed.loveeveryday:id/btnLogin")
	public WebElement submit  ;
	
	@FindBy(id="com.globalmed.loveeveryday:id/btnLogin")
	public WebElement loginButton;
	
	
	public void loginValidUser(String acctName, String fname, String lname,String pwd) {
		
		loginButton.click();
		accountName.sendKeys(acctName);
		firstName.sendKeys(fname);
		lastName.sendKeys(lname);
		password.sendKeys(pwd);
		submit.click();
		
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
