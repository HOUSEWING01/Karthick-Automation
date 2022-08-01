package IREL.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Factory;

import IREL.Base.testbase;

public class MarketingDomesticRequestorpage extends testbase {
	JavascriptExecutor js;
	@FindBy(xpath = "//a[contains(text(),'Marketing')]")
	WebElement Marketing;
	@FindBy(xpath = "//a[contains(text(),'Sales Transactions')]")
	WebElement SalesTransactions;
	@FindBy(xpath = "//a[contains(text(),'Create New')]")
	WebElement CreateNew;
	@FindBy(xpath = "//a[contains(text(),'Go Back')]")
	WebElement Goback;
	@FindBy(xpath = "//input[@name='custRequestDate']")
	WebElement CustRequestDate;
	@FindBy(css = "input#currentDate")
	WebElement currentDate;
	@FindBy(css = "input#closedDateTime")
	WebElement ClosedDateTime;
	@FindBy(xpath = "//select[@name='salesChannelEnumId']")
	WebElement Inquiry;
	@FindBy(css = "select#unit")
	WebElement Unit;
	@FindBy(xpath = "//select[@name='inquiryType']")
	WebElement inquirytype;
	@FindBy(xpath = "//*[@id=\"myform\"]/table[1]/tbody/tr[4]/td[4]/span/span[1]/span/span[2]")
	WebElement cclick;
	@FindBy(xpath = " //input[@class='select2-search__field']")
	WebElement valueenter;
	@FindBy(xpath = "//select[@name='currencyUomId']")
	WebElement Currency;
	@FindBy(xpath = "//select[@name='customerOrderNumber']")
	WebElement Reference;
	@FindBy(xpath = "//select[@name='inquiryType']")
	WebElement Inquirytype;
	@FindBy(xpath = "//select[@name='customerOrderNumber']")
	WebElement referencenumber;
	@FindBy(xpath = "//textarea[@name='internalComment']")
	WebElement Remark;
	@FindBy(xpath = "//select[@name='transportType']")
	WebElement transportType;
	@FindBy(xpath = "//*[@id=\"myform\"]/table[1]/tbody/tr[9]/td[4]/span/span[1]/span/span[2]")
	WebElement tclick;
	@FindBy(xpath = "//*[@id=\"vendorRow\"]/td[2]/span/span[1]/span/span[2]")
	WebElement Pclick;
	@FindBy(xpath = " //button[@value='Add Row'] ")
	WebElement adding;
	@FindBy(xpath = "//button[contains(text(),'Add File')]")
	WebElement addfile;
	@FindBy(xpath = "//button[contains(text(),'Delete File')]")
	WebElement DeleteFile;
	@FindBy(xpath = "//input[@name='MOM_ATTACHMENT']")
	WebElement upload;
	@FindBy(xpath = "//*[@id=\"dynamicRow0\"]/td[1]/span/span[1]/span/span[2]")
	WebElement productclick;
	@FindBy(xpath = "//button[contains(text(),'Add Products')]")
	WebElement addproduct;
	@FindBy(xpath = "//button[contains(text(),'Delete')]")
	WebElement delete;
	@FindBy(xpath = "//*[@id=\"tax\"]/tr/td[1]/span/span[1]/span/span[2]")
	WebElement ptclick;
	@FindBy(xpath = "//select[@name='uom']")
	WebElement uom;
	@FindBy(xpath = "//input[@name='quantity']")
	WebElement quantity;
	@FindBy(xpath = "//input[@name='requiredDate']")
	WebElement requireddate;
	@FindBy(xpath = "//select[@name='billToContactMechId']")
	WebElement billtoaddress;
	@FindBy(xpath = "//select[@name='shipToContactMechId']")
	WebElement shiptoaddress;

	@FindBy(xpath = "//input[@value='Cancel']")
	WebElement cancel;
	@FindBy(xpath = "//input[@value='Create']")
	WebElement create;

	public MarketingDomesticRequestorpage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	public void Marketingclick() throws InterruptedException {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", Marketing);
		Thread.sleep(3000);
		js.executeScript("arguments[0].click()", SalesTransactions);
	}

	public void createnew() {
		CreateNew.click();
	}

	public void Goback(String data[]) {

		Goback.click();

		CreateNew.click();
currentDate.sendKeys(data[0]);
		ClosedDateTime.sendKeys(data[1]);

		select(Inquiry, data[2]);

		cclick.click();

		valueenter.sendKeys(data[3] + Keys.ARROW_DOWN + Keys.ENTER);

		Remark.sendKeys(data[4]);

		transportType.sendKeys(data[5]);

		tclick.click();

		valueenter.sendKeys(data[6] + Keys.ARROW_DOWN + Keys.ENTER);

		addfile.click();

		addfile.click();

		DeleteFile.click();

		DeleteFile.click();

		upload.sendKeys(data[7]);
		ptclick.click();

		valueenter.sendKeys(data[8] + Keys.ARROW_DOWN + Keys.ENTER);

		select(uom, data[9]);

		quantity.sendKeys(data[10]);

		requireddate.sendKeys(data[11]);

		select(billtoaddress, data[12]);

		select(shiptoaddress, data[13]);

		// cancel.click();

		create.click();
	}
}

//	public void Goback() throws InterruptedException {
//	CreateNew.click();
//	Thread.sleep(3000);
//	Goback.click();
//	Thread.sleep(3000);
//	CreateNew.click();
//	Thread.sleep(3000);
//	ClosedDateTime.sendKeys("08/14/2022");
//	Thread.sleep(3000);
//	select(Inquiry, "Phone Channel");
//	Thread.sleep(3000);
//	cclick.click();
//	Thread.sleep(3000);
//	valueenter.sendKeys("EXTERNAL DOMESTIC [22110125]" + Keys.ARROW_DOWN + Keys.ENTER);
//	Thread.sleep(3000);
//	Remark.sendKeys("Good");
//	Thread.sleep(3000);
//	transportType.sendKeys("ROAD");
//	Thread.sleep(3000);
//	tclick.click();
//	Thread.sleep(3000);
//	valueenter.sendKeys("IREL" + Keys.ARROW_DOWN + Keys.ENTER);
//	Thread.sleep(3000);
//	addfile.click();
//	Thread.sleep(3000);
//	addfile.click();
//	Thread.sleep(3000);
//	DeleteFile.click();
//	Thread.sleep(3000);
//	DeleteFile.click();
//	Thread.sleep(3000);
//	upload.sendKeys("C:\\Users\\soumya_hugar\\Desktop\\Upload files\\File5.png");
//	Thread.sleep(3000);
//	ptclick.click();
//	Thread.sleep(3000);
//	valueenter.sendKeys("2400100003 [ILMENITE \"Q\" GRADE (BAGGED)]" + Keys.ARROW_DOWN + Keys.ENTER);
//	Thread.sleep(3000);
//	select(uom, "Metric Ton");
//	Thread.sleep(3000);
//	quantity.sendKeys("1000");
//	Thread.sleep(3000);
//	requireddate.sendKeys("10/10/2022");
//	Thread.sleep(3000);
//	select(billtoaddress, "Bill To Address,Maharashtra,mumbai");
//	Thread.sleep(3000);
//	select(shiptoaddress, "Ship To Address,Maharashtra,mumbai");
//	Thread.sleep(3000);
//	// cancel.click();
//	Thread.sleep(3000);
//	create.click();
//	}
//}
