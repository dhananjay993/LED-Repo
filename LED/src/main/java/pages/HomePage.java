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

public class HomePage extends TestBase {

	public HomePage() throws IOException {

		super();

		PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(100)), this);
	}


	@FindBy(id="com.globalmed.loveeveryday:id/answer_text_view")

	public WebElement add_Response ;

	@FindBy(id="com.globalmed.loveeveryday:id/edt_my_answer")

	public WebElement response ;

	@FindBy(id="com.globalmed.loveeveryday:id/txt_submit")

	public WebElement submit1 ;

	@FindBy(id="com.globalmed.loveeveryday:id/txt_reply_challenge")

	public WebElement challenge;
	
	@FindBy(id="com.globalmed.loveeveryday:id/txt_cancel")

	WebElement cancel;


	public void addYourResponse(String answer) {


		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("com.globalmed.loveeveryday:id/answer_text_view"))));
		
		add_Response.click();

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("com.globalmed.loveeveryday:id/edt_my_answer"))));

		response.sendKeys(answer);

		submit1.click(); 

		challenge.click();

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		add_Response.click();
		
		cancel.click();


	}

	public void addYourResponsePartner(String answer2) {


		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("com.globalmed.loveeveryday:id/answer_text_view"))));

		add_Response.click();

		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("com.globalmed.loveeveryday:id/edt_my_answer"))));

		response.sendKeys(answer2);

		submit1.click(); 

		challenge.click();

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		add_Response.click();

		cancel.click();

	}



}
