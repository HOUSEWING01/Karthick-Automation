package IREL.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import IREL.Base.testbase;

public class MaterialBidcomparisonRequestorpage extends testbase {
	JavascriptExecutor js;
	@FindBy(xpath = "//a[contains(text(),'Material Management')]")
	WebElement Material;
	@FindBy(xpath = "//a[contains(text(),'Purchase')]")
	WebElement Purchase;
	@FindBy(xpath = "//a[contains(text(),' Bid Comparison')]")
	WebElement BidComparison;
	@FindBy(xpath = "//a[contains(text(),'Create New')]")
	WebElement Create;
	@FindBy(xpath = "//span[@class='select2-selection__arrow']")
	WebElement Nitclick;
	@FindBy(xpath = "//input[@class='select2-search__field']")
	WebElement Nitvalue;
	@FindBy(xpath = "//input[@class='smallSubmit']")
	WebElement Submit;
	@FindBy(xpath = "//input[@class='btn smallSubmit fixed-button']")
	WebElement Submit1;
	@FindBy(xpath = "//a[contains(text(),'Release')]")
	WebElement Release;
	@FindBy(xpath = "//input[@value='Submit for Approval']")
	WebElement submitapproval;

	@FindBy(xpath = "//select[@name='quoteId']")
	WebElement Invitingnumber;
	@FindBy(xpath = "//input[@value='Submit']")
	WebElement submit;

	public MaterialBidcomparisonRequestorpage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	public void Materialclick() throws InterruptedException {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", Material);
		Thread.sleep(3000);
		js.executeScript("arguments[0].click()", Purchase);
	}

	public void selectBidcompsrison() throws InterruptedException {
		Thread.sleep(3000);
		BidComparison.click();
		Thread.sleep(3000);
		Create.click();
		Thread.sleep(3000);
		Nitclick.click();
		Thread.sleep(3000);
		Nitvalue.sendKeys("11142 - office" + Keys.ARROW_DOWN + Keys.ENTER);// Change according to the form number
		Thread.sleep(3000);
		Submit.click();
		Thread.sleep(3000);
		Submit1.click();
		Thread.sleep(3000);
		Release.click();
		Thread.sleep(3000);
		submitapproval.click();
		Thread.sleep(3000);
	}
}
