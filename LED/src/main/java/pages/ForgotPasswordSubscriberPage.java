package pages;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.TestBase;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ForgotPasswordSubscriberPage extends TestBase{

	public ForgotPasswordSubscriberPage() throws IOException {
		super();
		
		PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(100)), this);

	}
	
	@FindBy(id="com.globalmed.loveeveryday:id/txtForgot")
	WebElement forgotPassword;
	
	@FindBy(id="com.globalmed.loveeveryday:id/account_name_edit_text")
	WebElement AccountName;
	
	@FindBy(id="com.globalmed.loveeveryday:id/fname_edit_text")
	WebElement firstName;
	
	@FindBy(id="com.globalmed.loveeveryday:id/lname_edit_text")
	WebElement lastName;
	
	@FindBy(id="com.globalmed.loveeveryday:id/send_request_button")
	WebElement sendRequest;
	
	@FindBy(id="com.globalmed.loveeveryday:id/btnVerify")
	WebElement verify;
	
	@FindBy(id="com.globalmed.loveeveryday:id/password_edit_text")
	WebElement password;
	
	@FindBy(id="com.globalmed.loveeveryday:id/confirm_password_edit_text")
	WebElement confirm_password;
	
	@FindBy(id="com.globalmed.loveeveryday:id/btnSubmit")
	WebElement submit;
	
	@FindBy(id="com.globalmed.loveeveryday:id/btnLogin")
	public WebElement loginButton;
	
	
	public void changePassword(String accountName, String firstname, String lastname, String pwd, String confirmPwd) {
		
		forgotPassword.click();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		AccountName.sendKeys(accountName);
		
		firstName.sendKeys(firstname);
		
		lastName.sendKeys(lastname);
		
		sendRequest.click();
		
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		verify.click();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		password.sendKeys(pwd);
		
		confirm_password.sendKeys(confirmPwd);		
		
		submit.click();
	}
	
}
