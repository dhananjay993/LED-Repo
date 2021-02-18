package pages;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.crm.qa.TestBase;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SignUpPage extends TestBase{

	public SignUpPage() throws IOException {
		
		super();
		
		PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(100)), this);
	}
	
	@FindBy(id="com.globalmed.loveeveryday:id/btnSignUp")
	
	WebElement signUp ;
	
	@FindBy(id="com.globalmed.loveeveryday:id/btnEnglish")
	
	WebElement language ;
	
	@FindBy(id="com.globalmed.loveeveryday:id/btnContinue")
	
	WebElement cont ;
	
	
	@FindBy(id="com.globalmed.loveeveryday:id/fname_edit_text")
	
	WebElement fname ;
	
	@FindBy(id="com.globalmed.loveeveryday:id/lname_edit_text")
	
	WebElement lname ;
	
	@FindBy(id="com.globalmed.loveeveryday:id/email_edit_text")
	
	WebElement email ;
	
	@FindBy(id="com.globalmed.loveeveryday:id/imageView_arrow")
	
	WebElement flagArrow ;
	
	@FindBy(id="com.globalmed.loveeveryday:id/editText_search")
	
	WebElement searchCountry ;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.TextView")
	
	WebElement india ;
	
	@FindBy(id="com.globalmed.loveeveryday:id/phone_number_edit_text")
	
	WebElement phoneNumber ;
	
	@FindBy(id="com.globalmed.loveeveryday:id/unique_edit_text")
	
	WebElement accnt_name ;
	
	@FindBy(id="com.globalmed.loveeveryday:id/password_edit_text")
	
	WebElement pwd ;
	
	@FindBy(id="com.globalmed.loveeveryday:id/confirm_password_edit_text")
	
	WebElement confirm_pwd ;
	
	@FindBy(id="com.globalmed.loveeveryday:id/term_condition_check_box")

	WebElement check_box ;

	@FindBy(id="com.globalmed.loveeveryday:id/txtTnC")

	WebElement terms ;

	@FindBy(id="com.globalmed.loveeveryday:id/root_layout")

	WebElement terms_text ;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RadioGroup/android.widget.RadioButton[2]")

	WebElement privacy ;
	
	@FindBy(id="com.globalmed.loveeveryday:id/root_layout")

	WebElement privacy_text ;

	@FindBy(id="com.globalmed.loveeveryday:id/txt_close")

	WebElement close ;
	
	@FindBy(id="com.globalmed.loveeveryday:id/btnSignUp")

	WebElement signUp_button ;
	
	
	@FindBy(id="com.globalmed.loveeveryday:id/btnVerify")

	WebElement verify ;
	
	@FindBy(id="com.globalmed.loveeveryday:id/btnContinue")

	WebElement conti ;
	
	@FindBy(id="com.globalmed.loveeveryday:id/fname_edit_text")

	WebElement part_fname ;
	
	@FindBy(id="com.globalmed.loveeveryday:id/lname_edit_text")

	WebElement part_lname  ;
	
	@FindBy(id="com.globalmed.loveeveryday:id/password_edit_text")

	WebElement part_pwd  ;
	
	@FindBy(id="com.globalmed.loveeveryday:id/email_edit_text")

	WebElement part_email  ;
	
	@FindBy(id="com.globalmed.loveeveryday:id/phone_dummy")

	WebElement phone_textbox  ;
	
	@FindBy(id="com.globalmed.loveeveryday:id/phone_number_edit_text")

	WebElement part_phone  ;
	
	@FindBy(id="com.globalmed.loveeveryday:id/add_partner_button")

	WebElement add_partner_button  ;
	
	@FindBy(id="com.globalmed.loveeveryday:id/imgAv3")

	WebElement avatar  ;
	
	@FindBy(id="com.globalmed.loveeveryday:id/btnContinue")

	WebElement cont_welcome_user  ;
	
	@FindBy(id="com.globalmed.loveeveryday:id/btnContinue")

	WebElement cont_profile_pic   ;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[4]/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button")
	
	WebElement subscribe;
	
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[3]/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.TextView")
	
	WebElement playstore_password;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[4]/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button")
	
	WebElement verify_Subscription;
	
	
	
	public void launchSignUp() {
		
		signUp.click();
	}
	
	public void signUpRegistration(String firstName, String lastName, String emailId, String country, String phone_Number, String account_name, String password, String confirm_password) {
		
		language.click();
		
		cont.click();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		fname.sendKeys(firstName);
		
		lname.sendKeys(lastName);
		
		email.sendKeys(emailId);
		
		flagArrow.click();
		
		searchCountry.sendKeys(country);
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		india.click();
	
	    phoneNumber.sendKeys(phone_Number);
		
	    accnt_name.sendKeys(account_name);
	    
	    pwd.sendKeys(password);
	    
	    confirm_pwd.sendKeys(confirm_password);
	    
	    check_box.click();
	    
	    terms.click();

	    terms_text.isDisplayed();
	    
	    privacy.click();
	    
	    privacy_text.isDisplayed();
	    
	    close.click();
	    
	    try {
	 			Thread.sleep(11000);
	 		} catch (InterruptedException e) {
	 			// TODO Auto-generated catch block
	 			e.printStackTrace();
	 		}
	 
	    signUp_button.click();
	    
	   
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		verify.click();
	    
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	    conti.click();
	    
	    try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    subscribe.click();
	    
	   /* playstore_password.sendKeys(playstr_password); */
	    
	    try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	  /*  verify_Subscription.click(); */

	}
	
	public void partnerInfo(String partFirstName, String partLastName, String partPassword, String partEmail, String partPhoneNumber) {
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    part_fname.sendKeys(partFirstName);
	    
	    part_lname.sendKeys(partLastName);
	    
	    part_pwd.sendKeys(partPassword);
	    
	    part_email.sendKeys(partEmail);
	    
	    phone_textbox.click();
	    
	    part_phone.sendKeys(partPhoneNumber);
	    
	    add_partner_button.click();
	    
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    avatar.click();
	    
	    cont_welcome_user.click();
	    
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    cont_profile_pic.click();
	    
	    try {
			Thread.sleep(11000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
	}

	
}
