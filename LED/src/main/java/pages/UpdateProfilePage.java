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

public class UpdateProfilePage extends TestBase{

	public UpdateProfilePage() throws IOException {
		
		super();
		
	    PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(100)), this);

	}
	
	@FindBy(xpath="//android.widget.FrameLayout[@content-desc=\"More\"]/android.widget.ImageView")
	
	WebElement more;
	
	@FindBy(id="com.globalmed.loveeveryday:id/settings")
	
	WebElement settings;
	
	@FindBy(id="com.globalmed.loveeveryday:id/img2")
	
	WebElement profile;
	
	
	@FindBy(id="com.globalmed.loveeveryday:id/imgNotifications")
	
	WebElement pencil_edit ;
	
	
	@FindBy (id="com.globalmed.loveeveryday:id/email_edit_text")
	
	WebElement email_id;
	
	@FindBy (id="com.globalmed.loveeveryday:id/phone_number_edit_text")
	
	WebElement phone;
	
	@FindBy(id="com.globalmed.loveeveryday:id/btnSave")
	
	WebElement save;
	
	@FindBy(id="com.globalmed.loveeveryday:id/editIcon")
	
	WebElement profile_pencil ;
	
	@FindBy(id="com.globalmed.loveeveryday:id/imgAv1")
	
	WebElement avatar;
	
	@FindBy(id="com.globalmed.loveeveryday:id/imgAv4")
	
	WebElement avatar2;
	
	@FindBy(id="com.globalmed.loveeveryday:id/btnContinue")
	
	WebElement cont;
	
	@FindBy(id="//android.widget.FrameLayout[@content-desc=\"Home\"]/android.view.ViewGroup/android.widget.TextView")
	
	WebElement home;
	
	
	
	public void profileUpdate() {
		
	wait.until(ExpectedConditions.elementToBeClickable(By.id("com.globalmed.loveeveryday:id/answer_text_view")));
		
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.FrameLayout[@content-desc=\"More\"]/android.widget.ImageView")));
	
	more.click();
	
	wait.until(ExpectedConditions.elementToBeClickable( driver.findElement(By.id("com.globalmed.loveeveryday:id/settings"))));
	
	settings.click();
	
    wait.until(ExpectedConditions.elementToBeClickable( driver.findElement(By.id("com.globalmed.loveeveryday:id/img2"))));
		
    profile.click();
    
    wait.until(ExpectedConditions.elementToBeClickable( driver.findElement(By.id("com.globalmed.loveeveryday:id/txtTitle"))));
    
    pencil_edit.click();
    
    email_id.clear();
    
    email_id.sendKeys("dhananjaysubhashchandra@gmail.com");
    
    phone.click();
    
    phone.sendKeys("8263958640");
    
    save.click();
    
    wait.until(ExpectedConditions.elementToBeClickable( driver.findElement(By.id("com.globalmed.loveeveryday:id/img2"))));
    
    profile.click();
    
    wait.until(ExpectedConditions.elementToBeClickable( driver.findElement(By.id("com.globalmed.loveeveryday:id/txtTitle"))));
    
    profile_pencil.click();
    
    wait.until(ExpectedConditions.elementToBeClickable( driver.findElement(By.id("com.globalmed.loveeveryday:id/imgAv3"))));
    
    avatar.click();
    
    wait.until(ExpectedConditions.elementToBeClickable( driver.findElement(By.id("com.globalmed.loveeveryday:id/btnContinue"))));

    cont.click();
    
    wait.until(ExpectedConditions.elementToBeClickable( driver.findElement(By.id("com.globalmed.loveeveryday:id/profile_image"))));
    
    home.click();
    
		
		
	}
	
	public void profileUpdatePartner() {
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.globalmed.loveeveryday:id/answer_text_view")));
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.FrameLayout[@content-desc=\"More\"]/android.widget.ImageView")));
		
		more.click();
		
		wait.until(ExpectedConditions.elementToBeClickable( driver.findElement(By.id("com.globalmed.loveeveryday:id/settings"))));
		
		settings.click();
		
	    wait.until(ExpectedConditions.elementToBeClickable( driver.findElement(By.id("com.globalmed.loveeveryday:id/img2"))));
			
	    profile.click();
	    
	    wait.until(ExpectedConditions.elementToBeClickable( driver.findElement(By.id("com.globalmed.loveeveryday:id/txtTitle"))));
	    
	    pencil_edit.click();
	    
	    email_id.clear();
	    
	    email_id.sendKeys("dpatil@amsys.com");
	    
	    phone.click();
	    
	    phone.sendKeys("7276059974");
	    
	    save.click();
	    
	    wait.until(ExpectedConditions.elementToBeClickable( driver.findElement(By.id("com.globalmed.loveeveryday:id/img2"))));
	    
	    profile.click();
	    
	    wait.until(ExpectedConditions.elementToBeClickable( driver.findElement(By.id("com.globalmed.loveeveryday:id/txtTitle"))));
	    
	    profile_pencil.click();
	    
	    wait.until(ExpectedConditions.elementToBeClickable( driver.findElement(By.id("com.globalmed.loveeveryday:id/imgAv3"))));
	    
	    avatar2.click();
	    
	    wait.until(ExpectedConditions.elementToBeClickable( driver.findElement(By.id("com.globalmed.loveeveryday:id/btnContinue"))));

	    cont.click();
	    
	    wait.until(ExpectedConditions.elementToBeClickable( driver.findElement(By.id("com.globalmed.loveeveryday:id/profile_image"))));
	    
	    home.click();
	    
			
			
		}
		
	
	
	
	
	
	
	
	
	
	
	

}
