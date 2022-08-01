package IREL.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import IREL.Base.testbase;

public class CasualleaveApproverpage extends testbase{
	JavascriptExecutor js;
	@FindBy(xpath = "//a[contains(text(),'Leave Management')]")
	WebElement leave;
	@FindBy(xpath = "//a[contains(text(),' Pending Leave Request')]")
	WebElement PendingLeaveRequest;
	@FindBy(xpath = "//a[contains(text(),'Show')]")
	WebElement Show;
	@FindBy(css = "input#remarks")
	WebElement Approver;
	@FindBy(css = "select.remarks")
	WebElement Action;
	@FindBy(xpath = "//input[@name='additionalRemarks']")
	WebElement Rejection;
	@FindBy(xpath = "//input[@value='Submit']")
	WebElement Sumit;
	@FindBy(xpath = "//input[@type='reset']")
	WebElement Reset;

	
	public CasualleaveApproverpage() {
		PageFactory.initElements(driver, this);
	}

	public void Leaveclick() throws InterruptedException {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", leave);
		Thread.sleep(3000);
	}

	public void rejectformreset() throws InterruptedException {
		Thread.sleep(3000);
		PendingLeaveRequest.click();
		Thread.sleep(3000);
		Show.click();
		Thread.sleep(3000);
		select(Action, "Reject");
		Thread.sleep(3000);
		Approver.sendKeys("good");
		Thread.sleep(3000);
		Reset.click();
		Thread.sleep(3000);
	}

	public void finalrejectedform() throws InterruptedException {
		Thread.sleep(3000);
		PendingLeaveRequest.click();
		Thread.sleep(3000);
		Show.click();
		Thread.sleep(3000);
		select(Action, "Accept");
		Thread.sleep(3000);
		Approver.sendKeys("good");
		Thread.sleep(3000);
		Sumit.click();
		Thread.sleep(3000);

	}
	
	
}
