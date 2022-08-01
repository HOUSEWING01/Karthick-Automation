package IREL.Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import IREL.Base.testbase;

public class MaterialpurchaseRequestorpage extends testbase {
	JavascriptExecutor js;
	@FindBy(xpath = "//a[contains(text(),'Material Management')]")
	WebElement Material;
	@FindBy(xpath = "//a[contains(text(),'Purchase')]")
	WebElement Purchase;
	@FindBy(xpath = "//a[contains(text(),' Notice Inviting Tender Floating Enquiry')]")
	WebElement Floatingenquiry;
	@FindBy(xpath = "//a[contains(text(),' Purchase Requisition')]")
	WebElement PurchaseRequisition;
	@FindBy(xpath = "//a[contains(text(),'0103400320 [Hand Pump   5681501 6656813501]')]")
	WebElement Materialvalue;
	@FindBy(xpath = "//a[contains(text(),'Create New')]")
	WebElement CreateNew;
	@FindBy(xpath = "//a[contains(text(),'Go Back')]")
	WebElement Goback;
	@FindBy(xpath = "//select[@name='custRequestTypeId']")
	WebElement Requisition;
	@FindBy(xpath = "//input[@name='jobTitle']")
	WebElement jobTitle;
	@FindBy(xpath = "//select[@name='itemTypeValue']")
	WebElement itemTypeValue;
	@FindBy(xpath = "//select[@name='departmentId']")
	WebElement departmentId;
	@FindBy(xpath = "//*[@id=\"content-main-section\"]/form/table/tbody/tr[3]/td[6]/span/span[1]/span/span[2]")
	WebElement dopclick;
	@FindBy(xpath = "//input[@type='search']")
	WebElement dopvalue;
	@FindBy(xpath = "//input[@name='budgetId']")
	WebElement budgetcode;
	@FindBy(xpath = "//span[@class='cclose']")
	WebElement Alertclose;
	@FindBy(xpath = "//select[@name='indentType']")
	WebElement indenttype;
	@FindBy(xpath = "//select[@name='tenderMethodValue']")
	WebElement tendername;
	@FindBy(xpath = "//input[@name='itemUtilizationDate']")
	WebElement itemUtilizationDate;
	@FindBy(xpath = "//textarea[@name='description']")
	WebElement description;
	@FindBy(xpath = "//input[@type='number']")
	WebElement DeliveryPeriod;
	@FindBy(xpath = "//select[@name='inspectionMethodValue']")
	WebElement inspectionmethod;
	@FindBy(xpath = "//select[@id='custRequestCategoryId']")
	WebElement DOPCategorization;
	@FindBy(xpath = "//select[@name='productCategory']")
	WebElement materialCategory;
	@FindBy(xpath = "//span[@class='cclose']")
	WebElement close;
	@FindBy(xpath = "//input[@id='searchProduct0']")
	WebElement materialname;
	@FindBy(xpath = "//input[@name='quantity']")
	WebElement quantity;
	@FindBy(xpath = "//input[@name='productUomId']")
	WebElement uomnumber;
	@FindBy(xpath = "//input[@class='materialType selectedAmount']")
	WebElement ApproximateUnitPrice;
	@FindBy(xpath = "//select[@name='priceEstimate']")
	WebElement priceestimate;
	@FindBy(xpath = "//input[@name='estimateText']")
	WebElement estimateText;
	@FindBy(xpath = "//input[@name='shelfLife']")
	WebElement shelfLife;
	@FindBy(xpath = "//input[@name='requiredByDate']")
	WebElement requiredByDate;
	@FindBy(xpath = "//*[@id=\"content-main-section\"]/form/div[1]/div[2]/table/tbody/tr/td[13]/span/span[1]/span/span[2]")
	WebElement costcenterclick;
	@FindBy(xpath = "//input[@class='select2-search__field']")
	WebElement costcentervalue;
	@FindBy(xpath = "//input[@name='shelfLife']")
	WebElement shelflife;
	@FindBy(xpath = "//button[@type='button']")
	WebElement Delete;
	@FindBy(xpath = "//a[contains(text(),'Add More')]")
	WebElement AddMore;
	@FindBy(xpath = "//input[@value='Submit']")
	WebElement submit;
	@FindBy(xpath = "//input[@value='Cancel']")
	WebElement Cancel;
	@FindBy(xpath = "//a[contains(text(),'Release')]")
	WebElement Release;
	@FindBy(xpath = "//input[@value='Submit for Approval']")
	WebElement submitapproval;

	public MaterialpurchaseRequestorpage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	public void Materialclick() throws InterruptedException {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", Material);
		Thread.sleep(3000);
		js.executeScript("arguments[0].click()", Purchase);
	}

	public void createnew() throws InterruptedException {
		Thread.sleep(3000);
		PurchaseRequisition.click();
		Thread.sleep(3000);
		CreateNew.click();
		Thread.sleep(3000);
		select(Requisition, "Material");
		Thread.sleep(3000);
		jobTitle.sendKeys("PRD material");
		Thread.sleep(3000);
		select(itemTypeValue, "Capital");
		Thread.sleep(3000);
		select(departmentId, "STORES");
		Thread.sleep(3000);
		dopclick.click();
		Thread.sleep(3000);
		dopvalue.sendKeys("A1(a)" + Keys.ARROW_DOWN + Keys.ENTER);
		Thread.sleep(3000);
		budgetcode.sendKeys("200");
		Thread.sleep(3000);
		select(indenttype, "Production");
		Thread.sleep(3000);
		select(tendername, "Global Tender");
		Thread.sleep(3000);
		itemUtilizationDate.sendKeys("08/01/2022");// need to change to present date before automation
		Thread.sleep(3000);
		description.sendKeys("Material management");
		Thread.sleep(3000);
		DeliveryPeriod.sendKeys("7");
		Thread.sleep(3000);
		Thread.sleep(3000);
		select(inspectionmethod, "At Stores");
		Thread.sleep(3000);
		select(DOPCategorization, "Raw Materials");
		Thread.sleep(3000);
		select(materialCategory, "01 - SPARES");
		Thread.sleep(3000);
		materialname.sendKeys("0103400320");
		Thread.sleep(9000);
		js.executeScript("arguments[0].click()", Materialvalue);
		Thread.sleep(3000);
		js.executeScript("arguments[0].click()", Alertclose);
		Thread.sleep(10000);
		quantity.sendKeys("500");
		Thread.sleep(3000);
		ApproximateUnitPrice.sendKeys("121");
		Thread.sleep(3000);
		select(priceestimate, "Current Market Price");
		Thread.sleep(3000);
		estimateText.sendKeys("As per market price");
		Thread.sleep(3000);
		requiredByDate.sendKeys("08/08/2022");
		Thread.sleep(3000);
		costcenterclick.click();
		Thread.sleep(3000);
		costcentervalue.sendKeys("1095101 - Cost Chavara");
		shelflife.sendKeys("15");
		Thread.sleep(3000);
		AddMore.click();
		Thread.sleep(3000);
		Delete.click();
		Thread.sleep(3000);
		// Cancel.click();
		Thread.sleep(3000);
		submit.click();
		Thread.sleep(3000);
		Release.click();
		Thread.sleep(3000);
		submitapproval.click();
	}

}
