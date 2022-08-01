package IREL.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import IREL.Base.testbase;

public class MedicalchangeApproverpage extends testbase {
	JavascriptExecutor js;
	@FindBy(xpath = "//a[contains(text(),' Reimbursement')]")
	WebElement reimb;
	@FindBy(linkText = "Medical")
	WebElement medical;
	@FindBy(linkText = "Change Dependent Family Member")
	WebElement changedependent;
	@FindBy(xpath = "//a[contains(text(),' Pending List of Dependent Family Members Change Requests')]")
	WebElement Pendingapprover;
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

	public MedicalchangeApproverpage() {
		PageFactory.initElements(driver, this);
	}

	public void reimbclick() throws InterruptedException {
		js = (JavascriptExecutor) driver;
		// as = new Actionscreenshot();
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

	public void remark() throws InterruptedException {
		Thread.sleep(3000);
		changedependent.click();
		Thread.sleep(3000);
		Pendingapprover.click();
		Thread.sleep(3000);
		Show.click();
		Thread.sleep(3000);
		Sumit.click();
		Thread.sleep(3000);
		Approver.sendKeys("good");
		Thread.sleep(3000);
	}

	public void rejectform() throws InterruptedException {
		Thread.sleep(3000);
		changedependent.click();
		Thread.sleep(3000);
		Pendingapprover.click();
		Thread.sleep(3000);
		Show.click();
		Thread.sleep(3000);
		Approver.sendKeys("good");
		Thread.sleep(3000);
		Sumit.click();
		select(Action, "Reject");
		Thread.sleep(3000);
		Sumit.click();
		Thread.sleep(3000);
		Rejection.sendKeys("Some changes required");
		Thread.sleep(3000);
	}

	public void reset() throws InterruptedException {
		Thread.sleep(3000);
		changedependent.click();
		Thread.sleep(3000);
		Pendingapprover.click();
		Thread.sleep(3000);
		Show.click();
		Thread.sleep(3000);
		Approver.sendKeys("good");
		Thread.sleep(3000);
		select(Action, "Reject");
		Thread.sleep(3000);
		Thread.sleep(3000);
		Rejection.sendKeys("Some changes required");
		Thread.sleep(3000);
		Reset.click();
		Thread.sleep(3000);
	}

	public void finalrejectform() throws InterruptedException {
		Thread.sleep(3000);
		changedependent.click();
		Thread.sleep(3000);
		Pendingapprover.click();
		Thread.sleep(3000);
		Show.click();
		Thread.sleep(3000);
		Approver.sendKeys("good");
		Thread.sleep(3000);
		select(Action, "Reject");
		Thread.sleep(3000);
		Thread.sleep(3000);
		Rejection.sendKeys("Some changes required");
		Thread.sleep(3000);
		Sumit.click();
		Thread.sleep(3000);
	}
	

}
