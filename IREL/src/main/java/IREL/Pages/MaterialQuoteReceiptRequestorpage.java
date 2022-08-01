package IREL.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import IREL.Base.testbase;

public class MaterialQuoteReceiptRequestorpage extends testbase {
	JavascriptExecutor js;
	@FindBy(xpath = "//a[contains(text(),'Material Management')]")
	WebElement Material;
	@FindBy(xpath = "//a[contains(text(),'Purchase')]")
	WebElement Purchase;
	@FindBy(xpath = "//a[contains(text(),' Notice Inviting Tender After Quote Receipt')]")
	WebElement QuoteReceipt;
	@FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/tbody")
	WebElement table;
	@FindBy(xpath = "//input[@value='Find']")
	WebElement Find;
	@FindBy(xpath = "//a[contains(text(),'11442')]")// change the value according to the Notice Inviting Tender 
	WebElement Value;
	@FindBy(xpath = "//input[@id='periodDays']")
	WebElement deliveryperiod;
	@FindBy(xpath = "//input[@name='validity']")
	WebElement validity;
	@FindBy(xpath = "//input[@value='Numbers']")
	WebElement uom;
	@FindBy(xpath ="//input[@value='7261']")
	WebElement price;
	@FindBy(xpath = "//select[@name='loadingChargesApply']")
	WebElement loading;
	@FindBy(xpath = "//select[@name='taxCode']")
	WebElement taxcode;
	@FindBy(xpath = "//input[@name='estimatedDeliveryDate']")
	WebElement deliverydate;
	@FindBy(xpath = "//a[contains(text(),'Update')]")
	WebElement update;
	
	
	
	
	
	public MaterialQuoteReceiptRequestorpage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	public void Materialclick() throws InterruptedException {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", Material);
		Thread.sleep(3000);
		js.executeScript("arguments[0].click()", Purchase);
	}

	public void createQuoteReceipt() throws InterruptedException {
		Thread.sleep(3000);
		QuoteReceipt.click();
		Thread.sleep(3000);
		Find.click();
		Thread.sleep(3000);
		//select(table, "11426");
		Thread.sleep(3000);
		Value.click();
		Thread.sleep(3000);
		deliveryperiod.sendKeys("8");
		Thread.sleep(3000);
		validity.sendKeys("12/11/2022");
		Thread.sleep(3000);
		uom.sendKeys("Number");
		Thread.sleep(3000);
		price.sendKeys("1000");
		Thread.sleep(3000);
		select(loading, "Not Applicable");
		Thread.sleep(3000);
		select(taxcode, "C-CGST-SGST-18 CGST-SGST @ 18% - Capital");
		Thread.sleep(3000);
		deliverydate.sendKeys("01/01/2022");
		Thread.sleep(3000);
		update.click();
		Thread.sleep(3000);
	}
	
	
	
	
}
