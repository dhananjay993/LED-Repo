package pages;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.crm.qa.TestBase;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CreateEventPage extends TestBase{


	public CreateEventPage() throws IOException {
		super();

		PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(100)), this);

	}

	@FindBy(xpath="//android.widget.FrameLayout[@content-desc=\"Calendar\"]/android.widget.ImageView")

	public WebElement calendar;

	@FindBy(id="com.globalmed.loveeveryday:id/addEventFloatingButton")

	public WebElement plus_icon ;

	@FindBy(id="com.globalmed.loveeveryday:id/account_name_edit_text")

	public WebElement add_event ;

	@FindBy(id="com.globalmed.loveeveryday:id/from_time_text_view")

	public WebElement start_time  ;

	@FindBy(id="com.globalmed.loveeveryday:id/mdtp_ok")

	public WebElement date;

	@FindBy(id="com.globalmed.loveeveryday:id/mdtp_ok")

	public WebElement time;

	@FindBy(id="com.globalmed.loveeveryday:id/to_time_text_view")

	public WebElement end_time;

	@FindBy (id="com.globalmed.loveeveryday:id/mdtp_ok")

	public WebElement date1;

	@FindBy (id ="com.globalmed.loveeveryday:id/mdtp_ok")

	public WebElement date_time;

	@FindBy(id ="com.globalmed.loveeveryday:id/reminders_text_view")

	public WebElement reminder;

	@FindBy (id="com.globalmed.loveeveryday:id/fifteen_minutes_text_view")

	public WebElement fifteen_mins;

	@FindBy(id ="com.globalmed.loveeveryday:id/ok_button")

	public WebElement ok;

	@FindBy(id="com.globalmed.loveeveryday:id/save_button_button")

	public WebElement save;

	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.TextView[1]")

	public WebElement event_name;

	@FindBy(id="com.globalmed.loveeveryday:id/imgNotifications")

	public WebElement pencil;

	@FindBy(id="com.globalmed.loveeveryday:id/delete_button")

	public WebElement delete_event;
	
	@FindBy(id="android:id/button1")
	
	public WebElement delete_ok;



	public void addEvent(String eventName) throws InterruptedException {
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.globalmed.loveeveryday:id/answer_text_view")));

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.FrameLayout[@content-desc=\"Calendar\"]/android.widget.ImageView")));

		calendar.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.globalmed.loveeveryday:id/addEventFloatingButton")));

		plus_icon.click();

		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.globalmed.loveeveryday:id/account_name_edit_text"))) ;	

		add_event.sendKeys(eventName);

		start_time.click();

		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.globalmed.loveeveryday:id/mdtp_ok"))) ;

		date.click();

		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.globalmed.loveeveryday:id/mdtp_ok"))) ;

		time.click();

		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.globalmed.loveeveryday:id/to_time_text_view"))) ;

		end_time.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.globalmed.loveeveryday:id/mdtp_ok"))) ;
		
		date1.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("com.globalmed.loveeveryday:id/mdtp_hours"))));
		
		MobileElement end_time1 = driver.findElement(By.id("com.globalmed.loveeveryday:id/mdtp_pm_label"));
		
		end_time1.click();

		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.globalmed.loveeveryday:id/mdtp_ok"))) ;

		date_time.click();

		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.globalmed.loveeveryday:id/reminders_text_view"))) ;

		reminder.click();

		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.globalmed.loveeveryday:id/fifteen_minutes_text_view"))) ;

		fifteen_mins.click();

		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.globalmed.loveeveryday:id/ok_button"))) ;

		ok.click();

		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.globalmed.loveeveryday:id/save_button_button"))) ;

		save.click();

	}

	public void editEvent(String eventName) {

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.FrameLayout[@content-desc=\"Calendar\"]/android.widget.ImageView")));

		calendar.click();

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.TextView[1]"))) ;	

		event_name.click();

		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.globalmed.loveeveryday:id/imgNotifications"))) ;	

		pencil.click();

		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.globalmed.loveeveryday:id/imgNotifications"))) ;	

		add_event.sendKeys(eventName);

		start_time.click();

		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.globalmed.loveeveryday:id/mdtp_ok"))) ;

		date.click();

		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.globalmed.loveeveryday:id/mdtp_ok"))) ;

		time.click();

		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.globalmed.loveeveryday:id/to_time_text_view"))) ;

		end_time.click();

		date.click();

		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.globalmed.loveeveryday:id/mdtp_ok"))) ;

		date_time.click();

		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.globalmed.loveeveryday:id/reminders_text_view"))) ;

		reminder.click();

		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.globalmed.loveeveryday:id/fifteen_minutes_text_view"))) ;

		fifteen_mins.click();

		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.globalmed.loveeveryday:id/ok_button"))) ;

		ok.click();

		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.globalmed.loveeveryday:id/save_button_button"))) ;

		save.click();


	}

	public void deleteEvent() {

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.FrameLayout[@content-desc=\"Calendar\"]/android.widget.ImageView")));

		calendar.click();

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.TextView[1]"))) ;	

		event_name.click();	

		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.globalmed.loveeveryday:id/imgNotifications"))) ;	

		pencil.click();

		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.globalmed.loveeveryday:id/delete_button"))) ;

		delete_event.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("android:id/button1"))) ;
		
		delete_ok.click();
		

	}

}
