package IREL.Pages;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Factory;

import IREL.Base.testbase;

public class MarketingSalesquotation extends testbase {
	JavascriptExecutor js;
	@FindBy(xpath = "//a[contains(text(),'Marketing')]")
	WebElement Marketing;
	@FindBy(xpath = "//a[contains(text(),'Sales Transactions')]")
	WebElement SalesTransactions;
	@FindBy(xpath = "//a[contains(text(),' Sales Quotation cum Proforma Invoice')]")
	WebElement SalesQuotation;
	@FindBy(xpath = "//a[contains(text(),'Create New')]")
	WebElement CreateNew;
	@FindBy(xpath = "//*[@id=\"myform\"]/table[1]/tbody/tr[3]/td[2]/span/span[1]/span/span[2]")
	WebElement cclick;
	@FindBy(xpath = " //input[@class='select2-search__field']")
	WebElement valueenter;
	@FindBy(xpath = "//select[@name='referenceDocument']")
	WebElement referenceDocument;
	@FindBy(xpath = "//select[@name='documentNumber']")
	WebElement documentNumber;
	@FindBy(xpath = "//input[@name='customerOrderNumber']")
	WebElement customerOrderNumber;
	@FindBy(xpath = "//input[@name='validFromDate']")
	WebElement validFromDate;
	@FindBy(xpath = "//input[@name='validThruDate']")
	WebElement validThruDate;
	@FindBy(xpath = "//select[@name='deliveryTerm']")
	WebElement deliveryTerm;
	@FindBy(xpath = "//select[@name='bankId']")
	WebElement bankid;
	@FindBy(xpath = "//input[@name='submitForCaApproval']")
	WebElement submitCA;
	@FindBy(xpath = "//select[@name='saleInquiryLineNo']")
	WebElement linenumber;
	@FindBy(xpath = "//*[@id=\"add\"]/tbody/tr[3]/td[2]/span/span[1]/span/span[2]")
	WebElement ptclick;
	@FindBy(xpath = "//select[@name='uom']")
	WebElement uom;
	@FindBy(xpath = "//input[@name='quantity']")
	WebElement quantity;
	@FindBy(xpath = "//input[@name='price']")
	WebElement price;
	@FindBy(xpath = "//select[@name='taxCode']")
	WebElement taxcode;
	@FindBy(xpath = "//select[@name='billToContactMechId']")
	WebElement billtoaddress;
	@FindBy(xpath = "//select[@name='shipToContactMechId']")
	WebElement shiptoaddress;
	@FindBy(xpath = "//span[@id='select2-profitCenter0-container']")
	WebElement profitcenter;
	@FindBy(xpath = "//*[@id=\"add\"]/tbody/tr[3]/td[12]/span/span[1]/span/span[2]")
	WebElement profit;
	@FindBy(xpath = "//input[@name='SQ_MOM_DOC']")
	WebElement upload;
	@FindBy(xpath = "//input[@value='Create']")
	WebElement create;
	// Approver
	@FindBy(xpath = "//a[contains(text(),'Proforma Invoice Approver Tab')]")
	WebElement ProformaInvoice;
	@FindBy(xpath = "//a[contains(text(),'11370')]")
	WebElement invoice; // NEED TO FIND THE NUMBER AND ENTER
	@FindBy(xpath = "//select[@name='actionType']")
	WebElement action;
	@FindBy(xpath = "//textarea[@name='approverRemarks']")
	WebElement remark;
	@FindBy(xpath = "//input[@value='Reset']")
	WebElement reset;
	@FindBy(xpath = "//input[@value='Submit']")
	WebElement submit;
	// Recepit
	@FindBy(xpath = "//a[contains(text(),' Receipt')]")
	WebElement recepit;
	@FindBy(xpath = "//a[contains(text(),' New Receipt')]")
	WebElement NewReceipt;
	@FindBy(xpath = "//*[@id=\"screenlet_1_col\"]/form/table[1]/tbody/tr[2]/td[2]/span/span[1]/span/span[2]")
	WebElement customerclick;
	@FindBy(xpath = "//input[@name='transactionDate']")
	WebElement recepitdate;
	@FindBy(xpath = "//select[@name='paymentMode']")
	WebElement payment;
	@FindBy(xpath = "//input[@name='referenceNo']")
	WebElement referenceno;
	@FindBy(xpath = "//input[@name='amount']")
	WebElement amount;
	@FindBy(xpath = "//input[@name='remarks']")
	WebElement remarks;
	@FindBy(xpath = "//input[@value='Cancel']")
	WebElement cancel;
	@FindBy(xpath = "//input[@value='Save']")
	WebElement save;
	// Deliveryorder
	@FindBy(xpath = "//a[contains(text(),' Delivery Order')]")
	WebElement DeliveryOrder;
	@FindBy(xpath = "//*[@id=\"myform\"]/div/div[2]/div/table[1]/tbody/tr[2]/td[2]/span/span[1]/span/span[2]")
	WebElement customercode2;
	@FindBy(xpath = "//select[@name='referenceDocument']")
	WebElement referenceDocument2;
	@FindBy(xpath = "//select[@name='tdsDeducted']")
	WebElement TDSDeducted;
	@FindBy(xpath = "//select[@name='tcsApplicable']")
	WebElement tcsApplicable;
	@FindBy(xpath = "//select[@name='bagType']")
	WebElement bagtype;
	@FindBy(xpath = "//input[@value='SUBMIT']")
	WebElement SUBMIT;

	// Deliveryorder
	@FindBy(xpath = "//a[contains(text(),' Delivery Order Approver')]")
	WebElement DeliveryOrdeapprover;
	@FindBy(xpath = "//a[@class='fixed-button']")
	WebElement Delivery;
	@FindBy(xpath = "//select[@name='salesOrderStatus']")
	WebElement salesorder;
	@FindBy(xpath = "//textarea[@name='approverRemarks']")
	WebElement approvremark;

// Product Loading/Transfer Advice
	@FindBy(xpath = "//a[contains(text(),' Product Loading/Transfer Advice')]")
	WebElement productloading;
	@FindBy(xpath = "//*[@id=\"myform\"]/table[1]/tbody/tr[3]/td[2]/span/span[1]/span/span[2]")
	WebElement customerclick3;
	@FindBy(xpath = "//*[@id=\"deliveryOrderRef\"]/td[2]/span/span[1]/span/span[2]")
	WebElement Deliveryclick;
	@FindBy(xpath = "//select[@name='shipToContactMechId']")
	WebElement shiptocustomer;
	@FindBy(xpath = " //input[@name='numberOfBags']")
	WebElement numberbags;
	@FindBy(xpath = " //input[@name='quantity']")
	WebElement plaquantity;
	@FindBy(xpath = " //input[@name='checkPost']")
	WebElement checkpost;
	
//ware house
	@FindBy(xpath = "//a[contains(text(),'Ware House')]")
	WebElement warehouse;
	@FindBy(xpath = "//input[@name='lrNumber']")
	WebElement lrnumber;
	@FindBy(xpath = "//*[@id=\"myform\"]/table[1]/tbody/tr[6]/td[2]/span/span[1]/span/span[2]")
	WebElement vehiclenumber;
	@FindBy(xpath = "//*[@id=\"myform\"]/table[1]/tbody/tr[6]/td[4]/span/span[1]/span/span[2]")
	WebElement personclick;
	
	// weightbridge
	@FindBy(xpath = "//a[contains(text(),' Weigh-Bridge')]")
	WebElement  WeighBridge;
	@FindBy(xpath = "//input[@name='netWeight']")
	WebElement netweight;
	@FindBy(xpath = "//*[@id=\"myform\"]/table[1]/tbody/tr[4]/td[2]/span/span[1]/span/span[2]")
	WebElement personclick2;
	@FindBy(xpath = "//input[@name='tareWeight']")
	WebElement tareweight;
	
	//sales invoice
	@FindBy(xpath = "//a[contains(text(),' Sales Invoice')]")
	WebElement salesinvoice;
	@FindBy(xpath = "//a[contains(text(),'Invoice')]")
	WebElement invoice2;
	@FindBy(xpath = "//a[contains(text(),'  New Customer Invoice')]")
	WebElement  NewInvoice ;
	
	
	public MarketingSalesquotation() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	public void Marketingclick() throws InterruptedException {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", Marketing);
		Thread.sleep(3000);
		js.executeScript("arguments[0].click()", SalesTransactions);
		Thread.sleep(3000);
		js.executeScript("arguments[0].click()", SalesQuotation);
	}

	public void Goback() throws InterruptedException {
		Thread.sleep(3000);
		CreateNew.click();
		Thread.sleep(3000);
		cclick.click();
		Thread.sleep(3000);
		valueenter.sendKeys("EXTERNAL DOMESTIC [22110125]" + Keys.ARROW_DOWN + Keys.ENTER);
		Thread.sleep(3000);
		select(referenceDocument, "Sales Inquiry");
		Thread.sleep(3000);
		select(documentNumber, "SIQ11685");// CHANGES EACH AND EVERY TIME WHEN NEW TRANSCATION IS STARTED
		Thread.sleep(3000);
		customerOrderNumber.sendKeys("FGRJV454");// NEED TO CHANGE
		Thread.sleep(3000);
		validFromDate.sendKeys("09/11/2022");
		Thread.sleep(3000);
		validThruDate.sendKeys("09/12/2022");
		Thread.sleep(3000);
		select(deliveryTerm, "FCA - Free Carrier");
		Thread.sleep(3000);
		select(bankid, "HDFC");
		Thread.sleep(3000);
		submitCA.click();
		Thread.sleep(3000);
		select(linenumber, "00001");
		Thread.sleep(3000);
		price.sendKeys("600");
		Thread.sleep(3000);
		select(taxcode, "IGST-18% - 18%");
		Thread.sleep(3000);
		profit.click();
		Thread.sleep(3000);
		valueenter.sendKeys("Mineral-Chavara" + Keys.ARROW_DOWN + Keys.ENTER);
		Thread.sleep(3000);
		create.click();
	}

	public void proformaapprover() throws InterruptedException {
		Thread.sleep(3000);
		ProformaInvoice.click();
		Thread.sleep(3000);
		invoice.click();
		Thread.sleep(3000);
		select(action, "Approve");
		Thread.sleep(3000);
		remark.sendKeys("Correct data");
		Thread.sleep(3000);
		reset.click();
		Thread.sleep(3000);
		select(action, "Approve");
		Thread.sleep(3000);
		remark.sendKeys("Correct data");
		Thread.sleep(3000);
		submit.click();
	}

	public void Recepit() throws InterruptedException {
		Thread.sleep(3000);
		recepit.click();
		Thread.sleep(3000);
		NewReceipt.click();
		Thread.sleep(3000);
		customerclick.click();
		Thread.sleep(3000);
		valueenter.sendKeys("EXTERNAL DOMESTIC [22110125]" + Keys.ARROW_DOWN + Keys.ENTER);
		Thread.sleep(3000);
		recepitdate.sendKeys("08/09/2022");
		Thread.sleep(3000);
		select(payment, "NEFT");
		Thread.sleep(3000);
		referenceno.sendKeys("AABWE124");// NEED TO CHANGE THE VALUE FOR EACH AND EVERY TRANSACTION
		Thread.sleep(3000);
		amount.sendKeys("10000");
		Thread.sleep(3000);
		remarks.sendKeys("Correct");
		Thread.sleep(3000);
		cancel.click();
		Thread.sleep(3000);
		//customerclick.click();
		Thread.sleep(3000);
	//	valueenter.sendKeys("EXTERNAL DOMESTIC [22110125]" + Keys.ARROW_DOWN + Keys.ENTER);
		Thread.sleep(3000);
		recepitdate.sendKeys("08/09/2022");
		Thread.sleep(3000);
		select(payment, "NEFT");
		Thread.sleep(3000);
		referenceno.sendKeys("AABWE124");// NEED TO CHANGE THE VALUE FOR EACH AND EVERY TRANSACTION
		Thread.sleep(3000);
		amount.sendKeys("10000");
		Thread.sleep(3000);
		remarks.sendKeys("Correct");
		Thread.sleep(3000);
		save.click();
	}

	public void Deliveryorder() throws InterruptedException {
		Thread.sleep(3000);
		DeliveryOrder.click();
		Thread.sleep(3000);
		CreateNew.click();
		Thread.sleep(3000);
		customercode2.click();
		Thread.sleep(3000);
		valueenter.sendKeys("EXTERNAL DOMESTIC [22110125]" + Keys.ARROW_DOWN + Keys.ENTER);
		Thread.sleep(3000);
		select(referenceDocument2, "Sales Quotation");
		Thread.sleep(3000);
		select(documentNumber, "11362");// NEED TO CHANGE THE DOCUMENT NUMBER FROM SALES QUOTATION
		Thread.sleep(3000);
		select(TDSDeducted, "No");
		Thread.sleep(3000);
		select(tcsApplicable, "No");
		Thread.sleep(3000);
		select(linenumber, "00001");
		Thread.sleep(3000);
		Alert simple = driver.switchTo().alert();
		Thread.sleep(3000);
		simple.accept();
		Thread.sleep(3000);
		select(bagtype, "50 kg");
		Thread.sleep(3000);
		quantity.sendKeys("100");
		Thread.sleep(3000);
		SUBMIT.click();
		Thread.sleep(3000);
	}

	public void Deliveryorderapprover() throws InterruptedException {
		Thread.sleep(3000);
		DeliveryOrdeapprover.click();
		Thread.sleep(3000);
		Delivery.click();
		Thread.sleep(3000);
		select(salesorder, "Approved");
		Thread.sleep(3000);
		approvremark.sendKeys("Good and correct");
		Thread.sleep(3000);
		cancel.click();
		Thread.sleep(3000);
		select(salesorder, "Approved");
		Thread.sleep(3000);
		approvremark.sendKeys("Good and correct");
		Thread.sleep(3000);
		submit.click();
		Thread.sleep(3000);
		select(salesorder, "Approved");
		Thread.sleep(3000);
		approvremark.sendKeys("Good second approver");
		Thread.sleep(3000);
		submit.click();
	}

	public void productloadingHeader() throws InterruptedException {
		//header,warehouse,weight-bridge
		Thread.sleep(3000);
		productloading.click();
		Thread.sleep(3000);
		CreateNew.click();
		Thread.sleep(3000);
		customerclick3.click();
		Thread.sleep(3000);
		valueenter.sendKeys("EXTERNAL DOMESTIC [22110125]" + Keys.ARROW_DOWN + Keys.ENTER);
		Thread.sleep(3000);
		Deliveryclick.click();
		Thread.sleep(3000);
		valueenter.sendKeys("2310506" + Keys.ARROW_DOWN + Keys.ENTER);// NEED TO GET VALUE FROM DELIVERY ORDER
		Thread.sleep(3000);
		//select(shiptocustomer, "Bill To Address,Maharashtra,mumbai");
		Thread.sleep(3000);
		numberbags.sendKeys("2");
		Thread.sleep(3000);
		plaquantity.sendKeys("50");
		Thread.sleep(3000);
		checkpost.click();
		Thread.sleep(3000);
		submit.click();
		Thread.sleep(6000);
		warehouse.click();
		Thread.sleep(3000);
		lrnumber.sendKeys("DHERT13");// VALUE NEED TO BE CHANGED EVERY TIME 
		Thread.sleep(3000);
		vehiclenumber.click();
		Thread.sleep(3000);
		valueenter.sendKeys("86" + Keys.ARROW_DOWN + Keys.ENTER);
		Thread.sleep(3000);
		personclick.click();
		Thread.sleep(3000);
		valueenter.sendKeys("C K ASNANI [8801672]" + Keys.ARROW_DOWN + Keys.ENTER);
		Thread.sleep(3000);
    	submit.click();
		Thread.sleep(3000);
		WeighBridge.click();
		Thread.sleep(3000);
		netweight.sendKeys("20");
		Thread.sleep(3000);
		personclick2.click();
		Thread.sleep(3000);
		valueenter.sendKeys("C K ASNANI [8801672]" + Keys.ARROW_DOWN + Keys.ENTER);
		Thread.sleep(3000);
		tareweight.sendKeys("10");
		Thread.sleep(3000);
		submit.click();
		Thread.sleep(3000);
	}
	public void invoice() {
	}
	
}
