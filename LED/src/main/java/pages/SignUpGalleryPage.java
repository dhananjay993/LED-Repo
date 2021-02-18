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

public class SignUpGalleryPage extends TestBase {

	public SignUpGalleryPage() throws IOException {

		super();

		PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(100)), this);

	}

	@FindBy(id ="com.globalmed.loveeveryday:id/btnUpload")

	public WebElement upload_profile_pic2 ;	

	@FindBy(xpath ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ImageView")
	
	public WebElement gallery ;	
	
	@FindBy(id ="com.android.permissioncontroller:id/permission_allow_button")

	public WebElement gallery_photo  ;	
	
	@FindBy(xpath="//android.widget.LinearLayout[@content-desc=\\\"Screenshot_20210115-090723.png, 683 kB, 9:07 AM\\\"]/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.ImageView[1]")
	
	public WebElement photo1 ;
	
	@FindBy(id ="com.globalmed.loveeveryday:id/menu_crop")

	public WebElement crop_arrow ;	
	
	@FindBy(id ="com.globalmed.loveeveryday:id/btnContinue")

	public WebElement cont_profile_pic ;
	
	
	@FindBy(id="com.globalmed.loveeveryday:id/txtSkip")
	
	WebElement skip;
	
	public void SignUpGalleryPic() {
		
		  try {
				Thread.sleep(20000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		upload_profile_pic2.click();

		wait.until(ExpectedConditions.elementToBeClickable( driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ImageView"))));

		gallery.click();

		wait.until(ExpectedConditions.elementToBeClickable( driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button"))));

		gallery_photo.click();

		wait.until(ExpectedConditions.elementToBeClickable( driver.findElement(By.xpath("//android.widget.LinearLayout[@content-desc=\"Screenshot_20210115-090723.png, 683 kB, 9:07 AM\"]/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.ImageView[1]"))));

		photo1.click();

		wait.until(ExpectedConditions.elementToBeClickable( driver.findElement(By.id("com.globalmed.loveeveryday:id/menu_crop"))));

		crop_arrow.click();

		wait.until(ExpectedConditions.elementToBeClickable( driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView"))));

		cont_profile_pic.click();

		
	}
	
	public void skip1() {
		
		skip.click();
	}
	


}
