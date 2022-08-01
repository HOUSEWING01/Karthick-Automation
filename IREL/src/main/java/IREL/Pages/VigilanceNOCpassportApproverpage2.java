package IREL.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import IREL.Base.testbase;

public class VigilanceNOCpassportApproverpage2 extends testbase {
	JavascriptExecutor js;
	@FindBy(xpath = "//a[contains(text(),'Vigilance')]")
	WebElement Vigilance;
	@FindBy(xpath = "//a[contains(text(),'Go Back')]")
	WebElement Goback;
	@FindBy(xpath = "//*[@id=\"screenlet_1_col\"]/div/table/tbody/tr/td/a[1]")
	WebElement Nocpassport;
	@FindBy(xpath = "//a[(text()=' Pending Requests/History For Approver')]")
	WebElement pendingapprover;
	@FindBy(xpath = "//a[(text()='View')]")
	WebElement View;
	@FindBy(xpath = "//input[@name='remarks']")
	WebElement Remark;
	@FindBy(xpath = "//input[@name='reasonForRejection']")
	WebElement Rejection;
	@FindBy(css = "select.remarks")
	WebElement Action;
	@FindBy(xpath = "//input[@name='Vigi_ApproverFiles']")
	WebElement Upload;
	@FindBy(xpath = "//input[@value='Reset']")
	WebElement Reset;
	@FindBy(xpath = "//input[@value='Submit']")
	WebElement Sumit;
	
	public VigilanceNOCpassportApproverpage2() {
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
		Nocpassport.click();
		Thread.sleep(3000);
		pendingapprover.click();
		Thread.sleep(3000);
		Goback.click();
		Thread.sleep(3000);
		pendingapprover.click();
		Thread.sleep(3000);
		View.click();
		Thread.sleep(3000);
	}

	public void remarkandalldetails() throws InterruptedException {
		Thread.sleep(3000);
		Nocpassport.click();
		Thread.sleep(3000);
		pendingapprover.click();
		Thread.sleep(3000);
		View.click();
		Thread.sleep(3000);
		Remark.sendKeys("good");
		Thread.sleep(3000);
		select(Action, "Accept");
		Thread.sleep(3000);
		Upload.sendKeys("C:\\\\Users\\\\soumya_hugar\\\\Desktop\\\\Upload files\\\\File4.xlsx");
		Thread.sleep(3000);
		
	}
	
	public void Reset() throws InterruptedException {
		Thread.sleep(3000);
		Nocpassport.click();
		Thread.sleep(3000);
		pendingapprover.click();
		Thread.sleep(3000);
		View.click();
		Thread.sleep(3000);
		Remark.sendKeys("good");
		Thread.sleep(3000);
		select(Action, "Accept");
		Thread.sleep(3000);
		Upload.sendKeys("C:\\\\Users\\\\soumya_hugar\\\\Desktop\\\\Upload files\\\\File4.xlsx");
		Thread.sleep(3000);
		Reset.click();
		Thread.sleep(3000);
	}
	
	public void Submit() throws InterruptedException {
		Thread.sleep(3000);
		Nocpassport.click();
		Thread.sleep(3000);
		pendingapprover.click();
		Thread.sleep(3000);
		View.click();
		Thread.sleep(3000);
		Remark.sendKeys("good");
		Thread.sleep(3000);
		select(Action, "Accept");
		Thread.sleep(3000);
		Upload.sendKeys("C:\\\\Users\\\\soumya_hugar\\\\Desktop\\\\Upload files\\\\File1.pdf");
		Thread.sleep(3000);
		Sumit.click();
		Thread.sleep(3000);
		
	}
	
	
	
	
	
	
	

}
