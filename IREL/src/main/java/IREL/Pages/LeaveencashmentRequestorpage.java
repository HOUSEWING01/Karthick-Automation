package IREL.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import IREL.Base.testbase;

public class LeaveencashmentRequestorpage  extends testbase{
	JavascriptExecutor js;
	@FindBy(xpath = "//a[contains(text(),'Leave Management')]")
	WebElement leave;
	@FindBy(xpath = "//a[contains(text(),' Leave Encashment')]")
	WebElement  LeaveEncashment;
	@FindBy(xpath = "//a[contains(text(),'Create')]")
	WebElement  Create;
	@FindBy(xpath = "//input[@id='daystoencash']")
	WebElement encashmentdays;
	@FindBy(xpath = "//input[@value='Submit']")
	WebElement submit;
	@FindBy(xpath = "//a[contains(text(),'Delete')]")
	WebElement delete;
	
	public LeaveencashmentRequestorpage() {
		PageFactory.initElements(driver, this);
	}

	public void Leaveclick() throws InterruptedException {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", leave);
		Thread.sleep(3000);
	}
	
	public void Encashmentdays() throws InterruptedException {
		Thread.sleep(3000);
		LeaveEncashment.click();
		Thread.sleep(3000);
		Create.click();		
		Thread.sleep(3000);
		encashmentdays.sendKeys("1");
		Thread.sleep(3000);
		submit.click();
		Thread.sleep(3000);
	}
	
	public void Delete() throws InterruptedException {
		Thread.sleep(3000);
		LeaveEncashment.click();
		Thread.sleep(3000);
		Thread.sleep(3000);
		delete.click();
		Thread.sleep(3000);
		
	}
	public void Finalencashmentsubmit() throws InterruptedException {
		Thread.sleep(3000);
		LeaveEncashment.click();
		Thread.sleep(3000);
		Create.click();		
		Thread.sleep(3000);
		encashmentdays.sendKeys("1");
		Thread.sleep(3000);
		submit.click();
		Thread.sleep(3000);
	}
	
	public void viewpage() throws InterruptedException {
		Thread.sleep(3000);
		LeaveEncashment.click();
		Thread.sleep(3000);
		
	}
	
	
	
	
	
	
	

}
