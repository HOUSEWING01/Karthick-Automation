package IREL.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import IREL.Base.testbase;

public class MaterialBidcomparisonApproverpage  extends testbase{
	JavascriptExecutor js;
	@FindBy(xpath = "//a[contains(text(),'Material Management')]")
	WebElement Material;
	@FindBy(xpath = "//a[contains(text(),'Purchase')]")
	WebElement Purchase;
	@FindBy(xpath = "//a[contains(text(),' Bid Comparison')]")
	WebElement  BidComparison;
	@FindBy(xpath = "//a[contains(text(),'Bid Comparison Approver')]")
	WebElement    BidComparisonApprover;
	@FindBy(xpath = "//a[contains(text(),'Show')]")
	WebElement Show;
	@FindBy(xpath = "//a[contains(text(),'Approval Form')]")
	WebElement ApprovalForm;
	@FindBy(xpath = "//select[@name='response']")
	WebElement Actiontype;
	@FindBy(xpath = "//input[@name='remarks']")
	WebElement Remarks;
	@FindBy(xpath = "//input[@value='Reset']")
	WebElement Reset;
	@FindBy(xpath = "//input[@value='Submit']")
	WebElement Submit;

	public MaterialBidcomparisonApproverpage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	public void Materialclick() throws InterruptedException {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", Material);
		Thread.sleep(3000);
		js.executeScript("arguments[0].click()", Purchase);
	}

	public void approveBidcomparison() throws InterruptedException {
		Thread.sleep(3000);
		 BidComparison.click();
		Thread.sleep(3000);
		 BidComparisonApprover.click();
		Thread.sleep(3000);
		Show.click();
		Thread.sleep(3000);
		ApprovalForm.click();
		Thread.sleep(3000);
		Remarks.sendKeys("good");
		Thread.sleep(3000);
		select(Actiontype, "Accept");
		Thread.sleep(3000);
		Reset.click();
		Thread.sleep(3000);
		Remarks.sendKeys("good");
		Thread.sleep(3000);
		select(Actiontype, "Accept");
		Thread.sleep(3000);
		Submit.click();
	}


}
