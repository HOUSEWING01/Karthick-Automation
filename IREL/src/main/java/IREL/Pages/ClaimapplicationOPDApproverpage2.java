package IREL.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import IREL.Base.testbase;

public class ClaimapplicationOPDApproverpage2  extends testbase{
		JavascriptExecutor js;
		@FindBy(xpath = "//a[contains(text(),' Reimbursement')]")
		WebElement reimb;
		@FindBy(linkText = "Medical")
		WebElement medical;
		@FindBy(linkText = "Claim Application")
		WebElement ClaimApplication;
		@FindBy(xpath = "//a[contains(text(),' Pending Request For Approver')]")
		WebElement Pendingapprover;
		@FindBy(xpath = "//a[contains(text(),'Show')]")
		WebElement Show;
		@FindBy(css = "input#remarks")
		WebElement Approver;
		@FindBy(xpath = "//input[@name='admissibleAmount1']")
		WebElement admissibleamount1;
		@FindBy(xpath = "//input[@name='admissibleAmount2']")
		WebElement admissibleamount2;
		@FindBy(xpath = "//input[@name='admissibleAmount3']")
		WebElement admissibleamount3;
		
		@FindBy(css = "select.responseRemarks")
		WebElement Action;
		@FindBy(xpath = "//input[@name='additionalRemarks']")
		WebElement Rejection;
		@FindBy(xpath = "//input[@value='Submit']")
		WebElement Sumit;
		@FindBy(xpath = "//input[@type='reset']")
		WebElement Reset;

		public ClaimapplicationOPDApproverpage2() {
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
			ClaimApplication.click();
			Thread.sleep(3000);
			Pendingapprover.click();
			Thread.sleep(3000);
		}
		public void finalapproveform() throws InterruptedException {
			Thread.sleep(3000);
			ClaimApplication.click();
			Thread.sleep(3000);
			Pendingapprover.click();
			Thread.sleep(3000);
			Show.click();
			Thread.sleep(3000);
			admissibleamount1.sendKeys("234");
			Thread.sleep(3000);
			admissibleamount2.sendKeys("1241");
			Thread.sleep(3000);
			admissibleamount3.sendKeys("342");
			Thread.sleep(3000);
			Approver.sendKeys("good");
			Thread.sleep(3000);
			select(Action, "Accept");
			Thread.sleep(3000);
			Sumit.click();
			Thread.sleep(3000);
		}

		
	

}
