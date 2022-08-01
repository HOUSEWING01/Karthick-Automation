package IREL.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import IREL.Base.testbase;
import IREL.Commonutility.Actionscreenshot;

public class TelephoneApproverpage2 extends testbase {
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
	
	public TelephoneApproverpage2() {
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
	public void pendingclick() {
		pending.click();
	}
	
	public void  showclick() {
		show.click();
	}
	
	public void accepttheform(String data[]) throws InterruptedException {
		//pending.click();
		Thread.sleep(3000);
		//show.click();
		Thread.sleep(3000);
		payable.sendKeys(prop.getProperty(data[0]));
		Thread.sleep(3000);
		Approver.sendKeys(data[1]);
		Thread.sleep(3000);
		Fileupload.sendKeys(data[2]);
		Thread.sleep(3000);
		Description.sendKeys(data[3]);
		Thread.sleep(3000);
		select(Action, data[4]);
		Thread.sleep(3000);
		 Sumit.click();
	}
	
	
	
}
