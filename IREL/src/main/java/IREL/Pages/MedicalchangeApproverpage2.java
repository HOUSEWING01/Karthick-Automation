package IREL.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import IREL.Base.testbase;

public class MedicalchangeApproverpage2 extends testbase {

	JavascriptExecutor js;
	@FindBy(xpath = "//a[contains(text(),' Reimbursement')]")
	WebElement reimb;
	@FindBy(linkText = "Medical")
	WebElement medical;
	@FindBy(linkText = "Adding Dependent Family Member")
	WebElement addingdependent;
	@FindBy(xpath = "//a[contains(text(),' Pending List of Dependent Family Members Change Requests')]")
	WebElement Pendingapprover;
	@FindBy(linkText = "Change Dependent Family Member")
	WebElement changedependent;
	@FindBy(xpath = "//input[@value='Show']")
	WebElement Show;
	@FindBy(css = "input#remarks")
	WebElement Approver;
	@FindBy(css = "select.responseRemarks")
	WebElement Action;
	@FindBy(xpath = "//input[@name='additionalRemarks']")
	WebElement Rejection;
	@FindBy(xpath = "//input[@value='Submit']")
	WebElement Sumit;
	@FindBy(xpath = "//input[@type='reset']")
	WebElement Reset;

	public MedicalchangeApproverpage2(){
		PageFactory.initElements(driver, this);
	}
		

	public void reimbclick() throws InterruptedException {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", reimb);
		Thread.sleep(3000);
		medical.click();
		Thread.sleep(3000);
	}

	public void approverhistory() throws InterruptedException {
		Thread.sleep(3000);
		changedependent.click();
		Thread.sleep(3000);
		Pendingapprover.click();
		Thread.sleep(3000);
	}
	public void finalapproveform() throws InterruptedException {
		Thread.sleep(3000);
		changedependent.click();
		Thread.sleep(3000);
		Pendingapprover.click();
		Thread.sleep(3000);
		Show.click();
		Thread.sleep(3000);
		Approver.sendKeys("good");
		Thread.sleep(3000);
		select(Action, "Accept");
		Thread.sleep(3000);
		Sumit.click();
		Thread.sleep(3000);
	}


}
