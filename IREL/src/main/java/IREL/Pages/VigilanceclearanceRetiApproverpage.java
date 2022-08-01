package IREL.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import IREL.Base.testbase;

public class VigilanceclearanceRetiApproverpage extends testbase {
	JavascriptExecutor js;
	@FindBy(xpath = "//a[contains(text(),'Vigilance')]")
	WebElement Vigilance;
	@FindBy(xpath = "//a[contains(text(),'Go Back')]")
	WebElement Goback;
	@FindBy(xpath = "//a[contains(text(),'Vigilance Clearance')]")
	WebElement VigilanceClearance;
	@FindBy(xpath = "//a[(text()=' Pending Requests/History For Approver')]")
	WebElement pendingapprover;
	@FindBy(xpath = "//select[@name='subType']")
	WebElement select;
	@FindBy(xpath = "//select[@name='DataTables_Table_0_length']")
	WebElement Database;
	@FindBy(xpath = "//input[@name='checkBoxClass']")
	WebElement checkboc;
	@FindBy(xpath = "//select[@name='level']")
	WebElement selectremark;
	@FindBy(xpath = "//textarea[@name='remarks']")
	WebElement Remark;
	@FindBy(xpath  = "//select[@name='response']")
	WebElement status;
	@FindBy(xpath = "//input[@name='Vigi_ApproverFiles']")
	WebElement Upload;
	@FindBy(xpath = "//input[@value='Reset']")
	WebElement Reset;
	@FindBy(xpath = "//input[@name='forRec']")
	WebElement Recommended;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement Sumit;
	
	public VigilanceclearanceRetiApproverpage() {
		PageFactory.initElements(driver, this);
	}

	public void Vigilanceclick() throws InterruptedException {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()",Vigilance );
		Thread.sleep(3000);
		
		
		//show.click();
	}

	public void clickviewform() throws InterruptedException {
		Thread.sleep(3000);
		VigilanceClearance.click();
		Thread.sleep(3000);
		pendingapprover.click();
		Thread.sleep(3000);
		Goback.click();
		Thread.sleep(3000);
		pendingapprover.click();
		Thread.sleep(6000);
		select.sendKeys("Retirement");
		Thread.sleep(6000);
		Database.sendKeys("100");
		Thread.sleep(3000);
		checkboc.click();
	}

	public void remarkandalldetails() throws InterruptedException {
		pendingapprover.click();
		Thread.sleep(3000);
		Goback.click();
		Thread.sleep(3000);
		pendingapprover.click();
		Thread.sleep(6000);
		select.sendKeys("Retirement");
		Thread.sleep(6000);
		Database.sendKeys("100");
		Thread.sleep(3000);
		checkboc.click();
		Thread.sleep(3000);
		selectremark.sendKeys("HRM Officer");
		Thread.sleep(3000);
		Remark.sendKeys("good");
		Thread.sleep(6000);
	}
	
	public void Submit() throws InterruptedException {
		Thread.sleep(3000);
		VigilanceClearance.click();
		Thread.sleep(3000);
		pendingapprover.click();
		Thread.sleep(3000);
		Goback.click();
		Thread.sleep(3000);
		pendingapprover.click();
		Thread.sleep(6000);
		select.sendKeys("Retirement");
		Thread.sleep(6000);
		Database.sendKeys("100");
		Thread.sleep(3000);
		checkboc.click();
		Thread.sleep(3000);
		selectremark.sendKeys("HRM Officer");
		Thread.sleep(3000);
		Remark.sendKeys("good");
		Thread.sleep(6000);
		select(status, "Accept");
		Thread.sleep(3000);
		Sumit.click();
		
	}
	
}
