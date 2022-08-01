package IREL.Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import IREL.Base.testbase;
import IREL.Commonutility.Actionscreenshot;

public class TelephoneRequestorepage2  extends testbase{
	JavascriptExecutor js;
	Actionscreenshot as;
	
	
	@FindBy(xpath = "//a[contains(text(),' Reimbursement')]")
	WebElement reimb;
	@FindBy(linkText = "Telephone Expenditure/Bill")
	WebElement Telephone;
	@FindBy(xpath = "//a[contains(text(),'Edit')]")
	WebElement edit;
	@FindBy(xpath = "//input[@name='description']")
	WebElement Description;
	@FindBy(css = "#appendfilerow > tr:nth-child(1) > td:nth-child(3) > input")
	WebElement fileupload1;
	@FindBy(xpath = "//input[@value='Submit']")
	WebElement Sumit;
	
	
	
	public TelephoneRequestorepage2() {
		PageFactory.initElements(driver, this);
	}

	public void reimbclick() throws InterruptedException {
		js = (JavascriptExecutor) driver;
		as = new Actionscreenshot();
		js.executeScript("arguments[0].click()", reimb);
		Thread.sleep(3000);
		Telephone.click();
		Thread.sleep(3000);
	  }
	
	public void editclick() throws InterruptedException {
		Thread.sleep(3000);
		edit.click();
	}
	public void fieldfilled() throws InterruptedException {
		Thread.sleep(3000);
		edit.click();
		Thread.sleep(3000);
		Description.sendKeys("newfile");
		Thread.sleep(3000);
		fileupload1.sendKeys("C:\\\\Users\\\\soumya_hugar\\\\Desktop\\\\Upload files\\\\File4.xlsx");
		Thread.sleep(3000);
	}
	
	public  void sumitformafterrejection() throws InterruptedException {
		Thread.sleep(3000);
		edit.click();
		Thread.sleep(3000);
		Description.sendKeys("newfile");
		Thread.sleep(3000);
		fileupload1.sendKeys("C:\\\\Users\\\\soumya_hugar\\\\Desktop\\\\Upload files\\\\File4.xlsx");
		Thread.sleep(3000);
		Sumit.click();
		Alert simple=driver.switchTo().alert();
		simple.accept();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
