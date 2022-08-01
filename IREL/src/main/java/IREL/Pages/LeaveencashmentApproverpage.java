package IREL.Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import IREL.Base.testbase;

public class LeaveencashmentApproverpage extends testbase{
	JavascriptExecutor js;
	@FindBy(xpath = "//a[contains(text(),'Leave Management')]")
	WebElement leave;
	@FindBy(xpath = "//a[contains(text(),' Leave Encashment')]")
	WebElement  LeaveEncashment;
	@FindBy(xpath = "//a[contains(text(),' Leave Encashment Pending Approval')]")
	WebElement  LeaveEncashmentpendingapproval;
	@FindBy(xpath = "//input[@value='Submit']")
	WebElement Sumit;
	@FindBy(xpath = "//a[contains(text(),'Accept')]")
	WebElement Accept;

	
	public LeaveencashmentApproverpage() {
		PageFactory.initElements(driver, this);
	}

	public void Leaveclick() throws InterruptedException {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", leave);
		Thread.sleep(3000);
	}


	public void Acceptform() throws InterruptedException {
		Thread.sleep(3000);
		LeaveEncashment.click();
		Thread.sleep(3000);
		LeaveEncashmentpendingapproval.click();
		Thread.sleep(3000);
		Thread.sleep(3000);
		Accept.click();
		Thread.sleep(3000);
		Alert simple = driver.switchTo().alert();
		Thread.sleep(3000);
		simple.accept();
		Thread.sleep(3000);

	}
	
	

}
