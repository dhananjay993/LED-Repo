package pages;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.crm.qa.TestBase;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SignUpCameraPage extends TestBase {

	public SignUpCameraPage() throws IOException {
		super();
		
		PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(100)), this);
	}
	
	@FindBy(id ="com.globalmed.loveeveryday:id/btnUpload")
	
	public WebElement upload_profile_pic ;	
	
	
	@FindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.ImageView")
	
	public WebElement camera ;	
	
	@FindBy(id ="com.android.permissioncontroller:id/permission_allow_button")
	
	public WebElement allow ;	
	
	
	@FindBy(id ="com.oneplus.camera:id/primary_capture_button")
	
	public WebElement camera_button ;	
	
	
	@FindBy(id ="com.oneplus.camera:id/review_ok_button")
	
	public WebElement camera_sign ;	
	
	
	@FindBy(id ="com.globalmed.loveeveryday:id/menu_crop")
	
	public WebElement crop_arrow ;	
	
	@FindBy(id ="com.globalmed.loveeveryday:id/btnContinue")
	
	public WebElement cont_profile_pic  ;	
	
	@FindBy(id="com.globalmed.loveeveryday:id/fname_edit_text")

	WebElement part_fname2 ;
	
	@FindBy(id="com.globalmed.loveeveryday:id/lname_edit_text")

	WebElement part_lname2  ;
	
	@FindBy(id="com.globalmed.loveeveryday:id/password_edit_text")

	WebElement part_pwd2  ;
	
	@FindBy(id="com.globalmed.loveeveryday:id/email_edit_text")

	WebElement part_email2  ;
	
	@FindBy(id="com.globalmed.loveeveryday:id/phone_dummy")

	WebElement phone_textbox2  ;
	
	@FindBy(id="com.globalmed.loveeveryday:id/phone_number_edit_text")

	WebElement part_phone2  ;
	
	@FindBy(id="com.globalmed.loveeveryday:id/add_partner_button")

	WebElement add_partner_button2  ;
	
	
	
	
	public void cameraUpload() {
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		upload_profile_pic.click();
		
		/*wait.until(ExpectedConditions.elementToBeClickable( driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.ImageView"))));
		   */
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		camera.click();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		wait.until(ExpectedConditions.elementToBeClickable( driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button"))));
		
		allow.click();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		wait.until(ExpectedConditions.elementToBeClickable( driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_buttoncom.oneplus.camera:id/primary_capture_button"))));
		
		camera_button.click();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	    wait.until(ExpectedConditions.elementToBeClickable( driver.findElement(By.id("com.oneplus.camera:id/review_ok_button"))));
	    
	    camera_sign.click();
	    

 		try {
 			Thread.sleep(50000);
 		} catch (InterruptedException e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		}
    
 		wait.until(ExpectedConditions.elementToBeClickable( driver.findElement(By.id("com.oneplus.camera:id/review_ok_button"))));
    
    
 		try {
 			Thread.sleep(50000);
 		} catch (InterruptedException e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		}
    
 		wait.until(ExpectedConditions.elementToBeClickable( driver.findElement(By.id("com.globalmed.loveeveryday:id/menu_crop"))));
 		
 		crop_arrow.click();
 		
 		wait.until(ExpectedConditions.elementToBeClickable( driver.findElement(By.id("com.globalmed.loveeveryday:id/btnContinue"))));
 		
 		cont_profile_pic.click();
 		
 		  
	    try {
			Thread.sleep(11000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	  
	    
	}
	
	  public void partnerInfo2(String partFirstName, String partLastName, String partPassword, String partEmail, String partPhoneNumber) {
	    	
		  try {
				Thread.sleep(20000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  
		  	part_fname2.sendKeys(partFirstName);
		    
		    part_lname2.sendKeys(partLastName);
		    
		    part_pwd2.sendKeys(partPassword);
		    
		    part_email2.sendKeys(partEmail);
		    
		    phone_textbox2.click();
		    
		    part_phone2.sendKeys(partPhoneNumber);
		    
		    add_partner_button2.click();
		    
		    try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  
	    	
	    }
	    
	
}
