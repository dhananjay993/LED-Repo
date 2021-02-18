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

public class DeletePartnerPage extends TestBase{

	public DeletePartnerPage() throws IOException {
		
		super();
		
		PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(100)), this);

	}
	
	@FindBy(xpath="//android.widget.FrameLayout[@content-desc=\"More\"]/android.widget.ImageView")
	
	WebElement more;
	
	@FindBy(id="com.globalmed.loveeveryday:id/settings")
	
	WebElement settings;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[3]/android.widget.TextView")
	
	WebElement partner;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.Button")
	
	WebElement delete;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[3]/android.widget.TextView")
	
	WebElement add_partner;
	
	@FindBy(id="com.globalmed.loveeveryday:id/sub_title_text_view")
	
	WebElement add_partner_text;
	
	
	@FindBy(id="com.globalmed.loveeveryday:id/fname_edit_text")

	WebElement firstName;
	

	@FindBy(id="com.globalmed.loveeveryday:id/lname_edit_text")

	WebElement lastName;
	

	@FindBy(id="com.globalmed.loveeveryday:id/password_edit_text")

	WebElement password;
	

	@FindBy(id="com.globalmed.loveeveryday:id/email_edit_text")

	WebElement email;
	
	@FindBy(id="com.globalmed.loveeveryday:id/image_flag")
	
	WebElement flag;
	
	@FindBy(id="com.globalmed.loveeveryday:id/imageView_arrow")
	
	WebElement flag_arrow;
	
	@FindBy(id="com.globalmed.loveeveryday:id/editText_search")
	
	WebElement search_box;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.TextView")
	
	WebElement india;
	
	@FindBy(id="com.globalmed.loveeveryday:id/phone_number_edit_text")
	
	WebElement phone_number;
	
	@FindBy(id="com.globalmed.loveeveryday:id/add_partner_button")
	
	WebElement add_partner_button;

	
	
	public void deletePartner(String fname, String lname, String pwd, String emailaddress, String countryy) {
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.globalmed.loveeveryday:id/answer_text_view")));
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.FrameLayout[@content-desc=\"More\"]/android.widget.ImageView")));
		
		more.click();
		
		wait.until(ExpectedConditions.elementToBeClickable( driver.findElement(By.id("com.globalmed.loveeveryday:id/settings"))));
		
		settings.click();
		
		wait.until(ExpectedConditions.elementToBeClickable( driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[3]/android.widget.TextView"))));

		partner.click();
		
		wait.until(ExpectedConditions.elementToBeClickable( driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.Button"))));
		
		delete.click();
		
		wait.until(ExpectedConditions.elementToBeClickable( driver.findElement(By.id("com.globalmed.loveeveryday:id/txt_addpartner"))));
		
		add_partner.click();
		
		wait.until(ExpectedConditions.elementToBeClickable( driver.findElement(By.id("com.globalmed.loveeveryday:id/sub_title_text_view"))));
		
		firstName.sendKeys(fname);
		
		lastName.sendKeys(lname);
		
		password.sendKeys(pwd);
		
		email.sendKeys(emailaddress);
		
		phone_number.click();
		
		flag_arrow.click();
		
		search_box.sendKeys(countryy);
		
		india.click();
		
		phone_number.sendKeys("7276059974");
		
		wait.until(ExpectedConditions.elementToBeClickable( driver.findElement(By.id("com.globalmed.loveeveryday:id/add_partner_button"))));

		add_partner_button.click();
		
		


	}
	
	
	
	
	
	
	
	
}
