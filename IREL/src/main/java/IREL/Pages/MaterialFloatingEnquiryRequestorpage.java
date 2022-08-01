package IREL.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import IREL.Base.testbase;

public class MaterialFloatingEnquiryRequestorpage extends testbase {
	JavascriptExecutor js;
	@FindBy(xpath = "//a[contains(text(),'Material Management')]")
	WebElement Material;
	@FindBy(xpath = "//a[contains(text(),'Purchase')]")
	WebElement Purchase;
	@FindBy(xpath = "//a[contains(text(),' Notice Inviting Tender Floating Enquiry')]")
	WebElement Floatingenquiry;
	@FindBy(xpath = "//a[contains(text(),'Create New NIT For Floating Enquiry')]")
	WebElement Createnew;
	@FindBy(xpath = "//*[@id=\"content-main-section\"]/form/table[1]/tbody/tr[1]/td[2]/span/span[1]/span/span[2]")
	WebElement purchaseclick;
	@FindBy(xpath = "//input[@class='select2-search__field']")
	WebElement purchasevalue;
	@FindBy(xpath = "//*[@id=\"tenderMethod\"]")
	WebElement tenderFloatingMethod;
	@FindBy(xpath = "//select[@id='preBidMeetingReq']")
	WebElement preBidMeetingReq;
	@FindBy(xpath = "//*[@id=\"multiVendorPartyIdTD\"]/div/div[1]/span")
	WebElement vendorclick;
	@FindBy(xpath = "//*[@id=\"multiVendorPartyIdTD\"]/div/div[2]/div[1]/input")
	WebElement vendorvalue;
	@FindBy(xpath = "//input[@value='Submit']")
	WebElement submit;
	@FindBy(xpath = "//input[@value='Cancel']")
	WebElement Cancel;
	@FindBy(xpath = "//a[contains(text(),'Release')]")
	WebElement Release;
	@FindBy(xpath = "//input[@value='Submit for Approval']")
	WebElement submitapproval;

	public MaterialFloatingEnquiryRequestorpage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	public void Materialclick() throws InterruptedException {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", Material);
		Thread.sleep(3000);
		js.executeScript("arguments[0].click()", Purchase);
	}

	public void createFloatingenquiry() throws InterruptedException {
		Thread.sleep(3000);
		Floatingenquiry.click();
		Thread.sleep(3000);
		Createnew.click();
		Thread.sleep(3000);
		purchaseclick.click();
		Thread.sleep(3000);
		purchasevalue.sendKeys("1175 - mmm01" + Keys.ARROW_DOWN + Keys.ENTER);// change the purchase number form number for each and
																		// every automation
		Thread.sleep(3000);
		select(tenderFloatingMethod, "MSTC");
		Thread.sleep(3000);
		vendorclick.click();
		Thread.sleep(3000);
		vendorvalue.sendKeys("CMS Queens & Road" + Keys.ARROW_DOWN + Keys.ENTER);
		Thread.sleep(5000);
//		vendorclick.click();
//		Thread.sleep(4000);
//		vendorvalue.clear();
//		Thread.sleep(4000);
//		vendorvalue.sendKeys("jkjhdv  kj  89 k" + Keys.ARROW_DOWN + Keys.ENTER);
//		Thread.sleep(4000);
//		vendorclick.click();
//		Thread.sleep(4000);
//		vendorvalue.clear();
//		Thread.sleep(4000);
//		vendorvalue.sendKeys("JGJHGH 3434 34 HJJ" + Keys.ARROW_DOWN + Keys.ENTER);
//		Thread.sleep(4000);
		submit.click();
		Thread.sleep(3000);
		Release.click();
		Thread.sleep(3000);
		submitapproval.click();
	}

}
