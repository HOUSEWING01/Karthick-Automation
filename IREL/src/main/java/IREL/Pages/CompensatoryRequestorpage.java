package IREL.Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import IREL.Base.testbase;

public class CompensatoryRequestorpage extends testbase{
	JavascriptExecutor js;
	@FindBy(xpath = "//a[contains(text(),'Leave Management')]")
	WebElement leave;
	@FindBy(xpath = "//a[contains(text(),' Apply For Leave')]")
	WebElement ApplyForLeave;
	@FindBy(xpath = "//a[contains(text(),'My Leave History')]")
	WebElement Myeavehistory;
	@FindBy(xpath = "//select[@name='name']")
	WebElement leavetype;
	@FindBy(xpath = "//input[@name='fromDate']")
	WebElement fromDate;
	@FindBy(xpath = "//input[@name='toDate']")
	WebElement toDate;
	@FindBy(xpath = "//input[@name='compensatoryDate']")
	WebElement compensatoryDate;
	@FindBy(xpath = "//span[@class='fs-arrow']")
	WebElement select;
	@FindBy(xpath = "//span[@class='fs-arrow']")
	WebElement click;
	@FindBy(xpath = "//input[@placeholder='Search']")
	WebElement value;
	@FindBy(xpath = "//textarea[@name='description']")
	WebElement description;
	@FindBy(xpath = "//textarea[@name='addressWhileonLeave']")
	WebElement address;
	@FindBy(xpath = "//input[@name='contactNumber']")
	WebElement contact;
	@FindBy(xpath = "//input[@placeholder='Search']")
	WebElement designation;
	@FindBy(xpath = "//span[@class='fs-arrow']")
	WebElement handling;
	@FindBy(xpath = "//div[@class='fs-options']")
	WebElement hanle;

	@FindBy(xpath = "//input[@type='reset']")
	WebElement reset;
	@FindBy(xpath = "//input[@value='Submit']")
	WebElement Sumit;

	@FindBy(xpath = "//a[contains(text(),'Quit')]")
	WebElement Quit;

	public CompensatoryRequestorpage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	public void Leaveclick() throws InterruptedException {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", leave);
		Thread.sleep(3000);

	}

	public void applycompensatoryleavereset() throws InterruptedException {
		Thread.sleep(3000);
		ApplyForLeave.click();
		select(leavetype, prop.getProperty("leave3"));
		Thread.sleep(3000);
		fromDate.sendKeys("06/16/2022");
		Thread.sleep(3000);
		toDate.sendKeys("06/17/2022");
		Thread.sleep(3000);
		compensatoryDate.sendKeys("06/07/2022");
		Thread.sleep(3000);
		description.sendKeys("some personal leave");
		Thread.sleep(3000);
		address.sendKeys("chennai");
		Thread.sleep(3000);
		address.clear();
		Thread.sleep(3000);
		address.sendKeys("7564895630");
		Thread.sleep(3000);
		contact.sendKeys("leavemodule");
		Thread.sleep(3000);
		click.click();
		Thread.sleep(3000);
		value.sendKeys("8801526"+Keys.ARROW_DOWN+Keys.ENTER);
		Thread.sleep(3000);
		Thread.sleep(3000);
		reset.click();
		Thread.sleep(3000);
	}

	public void applycompensatorysubmit() throws InterruptedException {
		Thread.sleep(3000);
		ApplyForLeave.click();
		select(leavetype, prop.getProperty("leave3"));
		Thread.sleep(3000);
	fromDate.sendKeys("06/16/2022");
		Thread.sleep(3000);
		toDate.sendKeys("06/17/2022");
		Thread.sleep(9000);
		compensatoryDate.sendKeys("06/07/2022");
		Thread.sleep(3000);
		description.sendKeys("some personal leave");
		Thread.sleep(3000);
		address.sendKeys("chennai");
		Thread.sleep(3000);
		address.clear();
		Thread.sleep(3000);
		address.sendKeys("leavemodule");
		Thread.sleep(3000);
		contact.sendKeys("76594584581");
		Thread.sleep(3000);
		click.click();
		Thread.sleep(3000);
		value.sendKeys("8801526"+Keys.ARROW_DOWN+Keys.ENTER);
		Thread.sleep(3000);
		Thread.sleep(3000);
		Sumit.click();
		Thread.sleep(3000);
	}

	public void quit() throws InterruptedException {
		Thread.sleep(3000);
		Myeavehistory.click();
		Thread.sleep(3000);
		Quit.click();
		Thread.sleep(3000);
		Alert simple = driver.switchTo().alert();
		Thread.sleep(3000);
		simple.accept();
	}

	public void finalsubmit() throws InterruptedException {
		Thread.sleep(3000);
		ApplyForLeave.click();
		select(leavetype, prop.getProperty("leave3"));
		Thread.sleep(3000);
	fromDate.sendKeys("06/16/2022");
		Thread.sleep(3000);
		toDate.sendKeys("06/17/2022");
		Thread.sleep(9000);
		compensatoryDate.sendKeys("06/07/2022");
		Thread.sleep(3000);
		description.sendKeys("some personal leave");
		Thread.sleep(3000);
		address.sendKeys("chennai");
		Thread.sleep(3000);
		address.clear();
		Thread.sleep(3000);
		address.sendKeys("leavemodule");
		Thread.sleep(3000);
		contact.sendKeys("76594584581");
		Thread.sleep(3000);
		click.click();
		Thread.sleep(3000);
		value.sendKeys("8801526"+Keys.ARROW_DOWN+Keys.ENTER);
		Thread.sleep(3000);
		Thread.sleep(3000);
		Sumit.click();
		Thread.sleep(3000);

	}
	public void viewsubmitpageend() throws InterruptedException {
		Thread.sleep(3000);
		Myeavehistory.click();
		Thread.sleep(3000);
		
	}


}
