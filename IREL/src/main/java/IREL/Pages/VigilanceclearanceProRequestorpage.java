package IREL.Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import IREL.Base.testbase;

public class VigilanceclearanceProRequestorpage extends testbase {
	JavascriptExecutor js;
	@FindBy(xpath = "//a[contains(text(),'Vigilance')]")
	WebElement Vigilance;
	@FindBy(xpath = "//a[contains(text(),'Create New')]")
	WebElement Newform;
	@FindBy(xpath = "//a[contains(text(),'Go Back')]")
	WebElement Goback;
	@FindBy(xpath = "//*[@id=\"screenlet_1_col\"]/div/table/tbody/tr/td/a[2]")
	WebElement clearance;
	@FindBy(xpath = "//select[@name='unit']")
	WebElement unit;
	@FindBy(xpath = "//select[@name='wftId']")
	WebElement purpose;
	@FindBy(xpath = "//select[@name='promotionClearanceType']")
	WebElement promotion;
	@FindBy(xpath = "//span[@class='select2-selection__arrow']")
	WebElement click;
	@FindBy(xpath = "//input[@class='select2-search__field']")
	WebElement employee;
	@FindBy(xpath = "//input[@class='smallSubmit']")
	WebElement add;
	@FindBy(xpath = "//input[@value='Cancel']")
	WebElement Cancel;
	@FindBy(xpath = "//input[@value='Submit']")
	WebElement Submit;
	@FindBy(xpath = "//a[(text()='View')]")
	WebElement View;
	@FindBy(xpath = "//a[(text()='Quit')]")
	WebElement Quit;
	@FindBy(xpath = "//a[(text()='Delete')]")
	WebElement Delete;
	@FindBy(xpath = "//input[@value='Delete']")
	WebElement delete;

	public VigilanceclearanceProRequestorpage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	public void Vigilanceclick() throws InterruptedException {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", Vigilance);
		Thread.sleep(3000);
	}

	public void Goback() throws InterruptedException {
		Thread.sleep(3000);
		clearance.click();
		Thread.sleep(3000);
		Newform.click();
		Thread.sleep(3000);
		Goback.click();
		Thread.sleep(3000);
	}

	public void clearanceProcancel() throws InterruptedException {
		Thread.sleep(3000);
		clearance.click();
		Thread.sleep(3000);
		Newform.click();
		Thread.sleep(3000);
		unit.sendKeys("ALL");
		Thread.sleep(3000);
		purpose.sendKeys("Promotion");
		Thread.sleep(3000);
		promotion.sendKeys("Pre DPC clearance");
		Thread.sleep(3000);
		click.click();
		employee.sendKeys("12234444 3245 (8801840)" + Keys.ARROW_DOWN + Keys.ENTER);
		Thread.sleep(3000);
		add.click();
		Thread.sleep(3000);
		delete.click();
		Thread.sleep(3000);
		Cancel.click();
		Thread.sleep(3000);

	}

	public void clearanceProsubmit() throws InterruptedException {
		Thread.sleep(3000);
		clearance.click();
		Thread.sleep(3000);
		Newform.click();
		Thread.sleep(3000);
		unit.sendKeys("ALL");
		Thread.sleep(3000);
		purpose.sendKeys("Promotion");
		Thread.sleep(3000);
		promotion.sendKeys("Pre DPC clearance");
		Thread.sleep(3000);
		click.click();
		employee.sendKeys("12234444 3245 (8801840)" + Keys.ARROW_DOWN + Keys.ENTER);
		Thread.sleep(3000);
		add.click();
		Thread.sleep(3000);
		delete.click();
		Thread.sleep(3000);
		Submit.click();
	
		Thread.sleep(3000);

	}

	public void ViewandQuit() throws InterruptedException {
		Thread.sleep(3000);
		clearance.click();
		Thread.sleep(3000);
		View.click();
		Thread.sleep(3000);
		Goback.click();
		Thread.sleep(3000);
		Quit.click();
		Thread.sleep(3000);
		Alert simple = driver.switchTo().alert();
		Thread.sleep(3000);
		simple.accept();
		Thread.sleep(3000);
	}

	public void deletetherecord() throws InterruptedException {
		Thread.sleep(3000);
		clearance.click();
		Thread.sleep(3000);
		Delete.click();
		Thread.sleep(3000);
		Alert simple = driver.switchTo().alert();
		Thread.sleep(3000);
		simple.accept();
		Thread.sleep(3000);
	}

	public void Finalsubmit() throws InterruptedException {
		Thread.sleep(3000);
		clearance.click();
		Thread.sleep(3000);
		Newform.click();
		Thread.sleep(3000);
		unit.sendKeys("ALL");
		Thread.sleep(3000);
		purpose.sendKeys("Promotion");
		Thread.sleep(3000);
		promotion.sendKeys("Pre DPC clearance");
		Thread.sleep(3000);
		click.click();
		employee.sendKeys("12234444 3245 (8801840)" + Keys.ARROW_DOWN + Keys.ENTER);
		Thread.sleep(3000);
		add.click();
		Thread.sleep(3000);
		delete.click();
		Thread.sleep(3000);
		Submit.click();
		Thread.sleep(3000);
	}

}
