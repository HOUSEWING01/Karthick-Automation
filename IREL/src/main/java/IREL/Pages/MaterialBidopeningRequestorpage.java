package IREL.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import IREL.Base.testbase;

public class MaterialBidopeningRequestorpage extends testbase {
	JavascriptExecutor js;
	@FindBy(xpath = "//a[contains(text(),'Material Management')]")
	WebElement Material;
	@FindBy(xpath = "//a[contains(text(),'Purchase')]")
	WebElement Purchase;
	@FindBy(xpath = "//a[contains(text(),'Bid Opening')]")
	WebElement BidOpening;
	@FindBy(xpath = "//a[contains(text(),'Create New')]")
	WebElement CreateNew;
	@FindBy(xpath = "//select[@id='quoteId']")
	WebElement Invitingnumber;
	@FindBy(xpath = "//select[@name='commercialCompliance']")
	WebElement Commercial;
	@FindBy(xpath = "//select[@name='preQualificationCriteria']")
	WebElement preQualificationCriteria;
	@FindBy(xpath = "//select[@name='technical']")
	WebElement technical;
	@FindBy(xpath = "//input[@value='Submit']")
	WebElement submit;
	@FindBy(xpath = "//input[@value='Cancel']")
	WebElement Cancel;
	@FindBy(xpath = "//a[contains(text(),'Release')]")
	WebElement Release;
	@FindBy(xpath = "//input[@value='Submit for Approval']")
	WebElement submitapproval;

	public MaterialBidopeningRequestorpage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	public void Materialclick() throws InterruptedException {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", Material);
		Thread.sleep(3000);
		js.executeScript("arguments[0].click()", Purchase);
	}

	public void createBidopening() throws InterruptedException {
		Thread.sleep(3000);
		BidOpening.click();
		Thread.sleep(3000);
		CreateNew.click();
		Thread.sleep(6000);
		select(Invitingnumber,"11442 - PRD material");// change the value notice inviting tender each and every time during automation.
		Thread.sleep(3000);
		select(Commercial, "Yes");
		Thread.sleep(3000);
		select(preQualificationCriteria, "Qualified");
		Thread.sleep(3000);
		select(technical, "Qualified");
		Thread.sleep(3000);
	//	Cancel.click();
		Thread.sleep(3000);
		submit.click();
		Thread.sleep(3000);
		Release.click();
		Thread.sleep(3000);
		submitapproval.click();
		Thread.sleep(3000);
		

	}

}
