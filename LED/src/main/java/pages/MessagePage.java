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

public class MessagePage extends TestBase{

	public MessagePage() throws IOException {
		
		super();
		
	    PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(100)), this);

	}
	
	@FindBy(xpath="//android.widget.FrameLayout[@content-desc=\"Message\"]/android.view.ViewGroup/android.widget.TextView")
	
	WebElement message;
	
	
	@FindBy(id="com.globalmed.loveeveryday:id/composer_edittext")
	
	WebElement textBox;
	
	
	@FindBy(id="com.globalmed.loveeveryday:id/composer_send")
	
	WebElement send;
	
	@FindBy(id="com.globalmed.loveeveryday:id/imgAdd")
	
	WebElement plus;
	
	@FindBy(id="com.globalmed.loveeveryday:id/linGif")
	
	WebElement gif;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.ImageView[1]")
	
	WebElement select_image;
	
	
	public void MessageSubscriber(String chat1) {
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.globalmed.loveeveryday:id/answer_text_view")));
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.FrameLayout[@content-desc=\"Message\"]/android.view.ViewGroup/android.widget.TextView")));
		
		message.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.globalmed.loveeveryday:id/composer_edittext")));
		
		textBox.sendKeys(chat1);
		
		send.click();
		
		plus.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.globalmed.loveeveryday:id/linGif")));
		
		
		gif.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(select_image));
		
		select_image.click();	
		
		
	}
	
	

}
