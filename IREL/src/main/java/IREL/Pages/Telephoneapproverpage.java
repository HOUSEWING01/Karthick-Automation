package IREL.Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import IREL.Base.testbase;
import IREL.Commonutility.Actionscreenshot;

public class Telephoneapproverpage extends testbase {

	JavascriptExecutor js;
	Actionscreenshot as;
	@FindBy(xpath = "//a[contains(text(),' Reimbursement')]")
	WebElement reimb;
	@FindBy(linkText = "Telephone Expenditure/Bill")
	WebElement Telephone;
	@FindBy(xpath = " //a[contains(text(),' Pending Request For Approver')]")
	// selects only whetger p is there
	WebElement pending;
	@FindBy(id = "myform")
	WebElement show;
	@FindBy(xpath = "//a[text()='View']")
	// select full view
	WebElement View;
	@FindBy(css = "input#payableAmountId")
	WebElement payable;
	@FindBy(css = "select#yearIdApprover")
	WebElement Year;
	@FindBy(css = "select#monthIdApprover")
	WebElement Applicable;
	@FindBy(css = "select#timePeriodApprover")
	WebElement Time;
	@FindBy(css = "input#remarksId")
	WebElement Approver;
	@FindBy(css = "input.i_file")
	WebElement Fileupload;
	@FindBy(xpath = "//input[@name='description']")
	WebElement Description;
	@FindBy(css = "select.responseRemarks")
	WebElement Action;
	@FindBy(xpath = "//input[@value='Submit']")
	WebElement Sumit;
	@FindBy(xpath = "//input[@type='reset']")
	WebElement Reset;
	@FindBy(xpath = " //button[@value='Add Row'] ")
	WebElement adding;
	@FindBy(xpath = "//button[@value='Delete Row']")
	WebElement deleting;
	@FindBy(xpath = "//input[@name='reasonForRejection']")
	WebElement Rejection;
	@FindBy(xpath = "//a[contains(text(),' Pending Request For Approver')]")
	WebElement Pendingapprover;
	@FindBy(xpath = "//a[contains(text(),' Telephone Reimbursement Approver History')]")
	WebElement approvehistory;

	public Telephoneapproverpage() {
		PageFactory.initElements(driver, this);
	}

	public void reimbclick() throws InterruptedException {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", reimb);
		Telephone.click();
		Thread.sleep(3000);
		js.executeScript("arguments[0].click()", pending);
		Thread.sleep(3000);
		//show.click();
	}

	public void clickshowform() throws InterruptedException {
		Thread.sleep(3000);
		show.click();
		Thread.sleep(3000);
	}

	

	public void payvalue() throws InterruptedException {
		Thread.sleep(3000);
		show.click();
		Thread.sleep(3000);
		payable.sendKeys(prop.getProperty("approverlowvalue"));
		Thread.sleep(3000);
		Sumit.click();
		Thread.sleep(3000);
	}

	/*
	 * public void year() { payable.sendKeys(prop.getProperty("approverhighvalue"));
	 * 
	 * payable.sendKeys(prop.getProperty("approverlowvalue")); //
	 * select(Year,prop.getProperty("year")); Sumit.click(); }
	 */

	/*
	 * public void applicable() {
	 * payable.sendKeys(prop.getProperty("approverhighvalue"));
	 * 
	 * payable.sendKeys(prop.getProperty("approverlowvalue")); //
	 * select(Year,prop.getProperty("year")); // select(Applicable,
	 * prop.getProperty("applicable")); Sumit.click(); }
	 * 
	 * public void time() { payable.sendKeys(prop.getProperty("approverhighvalue"));
	 * Alert simple = driver.switchTo().alert(); simple.accept();
	 * payable.sendKeys(prop.getProperty("approverlowvalue")); //
	 * select(Year,prop.getProperty("year")); // select(Applicable,
	 * prop.getProperty("applicable")); // select(Time, prop.getProperty("month"));
	 * Sumit.click(); }
	 */

	public void remark() throws InterruptedException {
		Thread.sleep(3000);
		show.click();
		Thread.sleep(3000);
		payable.sendKeys(prop.getProperty("approverlowvalue"));
		Approver.sendKeys("good");
		Thread.sleep(3000);
		Approver.clear();
		Thread.sleep(3000);
		Approver.sendKeys("98% good");
		Thread.sleep(3000);
		Sumit.click();
	}

	public void file() throws InterruptedException {
		Thread.sleep(3000);
		show.click();
		Thread.sleep(3000);
		payable.sendKeys(prop.getProperty("approverlowvalue"));
		Approver.sendKeys("good");
		Thread.sleep(3000);
		Approver.clear();
		Thread.sleep(3000);
		Approver.sendKeys("98% good");
		Thread.sleep(3000);
		Fileupload.sendKeys("C:\\\\Users\\\\soumya_hugar\\\\Desktop\\\\Upload files\\\\File4.xlsx");
		Sumit.click();
	}
	public void adddeletepage() throws InterruptedException{
		Thread.sleep(3000);
		show.click();
		Thread.sleep(3000);
		payable.sendKeys(prop.getProperty("approverlowvalue"));
		Approver.sendKeys("good");
		Thread.sleep(3000);
		Approver.clear();
		Thread.sleep(3000);
		Approver.sendKeys("98% good");
		Thread.sleep(3000);
		Fileupload.sendKeys("C:\\\\Users\\\\soumya_hugar\\\\Desktop\\\\Upload files\\\\File4.xlsx");
		adding.click();
		deleting.click();
		adding.click();
		deleting.click();
		Sumit.click();
		}
	
	
	public void descriptio() throws InterruptedException {
		Thread.sleep(3000);
		show.click();
		Thread.sleep(3000);
		payable.sendKeys(prop.getProperty("approverlowvalue"));
		Approver.sendKeys("good");
		Thread.sleep(3000);
		Approver.clear();
		Thread.sleep(3000);
		Approver.sendKeys("98% good");
		Thread.sleep(3000);
		Fileupload.sendKeys("C:\\\\Users\\\\soumya_hugar\\\\Desktop\\\\Upload files\\\\File4.xlsx");
		Thread.sleep(3000);
		Description.sendKeys("File1");
		Thread.sleep(3000);
		Sumit.click();
	}
	
	public void Reset() throws InterruptedException {
		Thread.sleep(3000);
		show.click();
		Thread.sleep(3000);
		payable.sendKeys(prop.getProperty("approverlowvalue"));
		Approver.sendKeys("good");
		Thread.sleep(3000);
		Approver.clear();
		Thread.sleep(3000);
		Approver.sendKeys("98% good");
		Thread.sleep(3000);
		Fileupload.sendKeys("C:\\\\Users\\\\soumya_hugar\\\\Desktop\\\\Upload files\\\\File4.xlsx");
		Thread.sleep(3000);
		Description.sendKeys("File1");
		Thread.sleep(3000);
		Reset.click();
		
	}

	public void ActionRejectsumit() throws InterruptedException {
		Thread.sleep(3000);
		show.click();
		Thread.sleep(3000);
		payable.sendKeys(prop.getProperty("approverlowvalue"));
		Approver.sendKeys("good");
		Thread.sleep(3000);
		Approver.clear();
		Thread.sleep(3000);
		Approver.sendKeys("98% good");
		Thread.sleep(3000);
		Fileupload.sendKeys("C:\\\\Users\\\\soumya_hugar\\\\Desktop\\\\Upload files\\\\File4.xlsx");
		Thread.sleep(3000);
		Description.sendKeys("File1");
		Thread.sleep(3000);
		select(Action, "Reject");
		Thread.sleep(3000);
		 Rejection.sendKeys("The values are wrong");
		 Sumit.click();
	}
 public void pendingapproverpageview() throws InterruptedException {
	 Thread.sleep(3000);
	 Pendingapprover.click();
 }
 public void pendingapproverhistorypage() throws InterruptedException {
	 Thread.sleep(3000);
	 approvehistory.click();
 }
 
}
