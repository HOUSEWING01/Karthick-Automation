package IREL.Pages;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Factory;

import IREL.Base.testbase;

public class VigilanceNOCpassportRequestorpage extends testbase {
	JavascriptExecutor js;
	@FindBy(xpath = "//a[contains(text(),'Vigilance')]")
	WebElement Vigilance;

	@FindBy(xpath = "//a[contains(text(),'New Forms')]")
	WebElement Newform;
	@FindBy(xpath = "//a[contains(text(),'Go Back')]")
	WebElement Goback;
	@FindBy(xpath = "//*[@id=\"screenlet_1_col\"]/div/table/tbody/tr/td/a[1]/h2")
	WebElement Nocpassport;
	@FindBy(xpath = "//input[@name='nocReqDate']")
	WebElement NocDate;
	@FindBy(xpath = "//input[@name='lastDateNOC']")
	WebElement LastDate;
	@FindBy(xpath = "//input[@name='ePFBalance']")
	WebElement Epfbalamce;
	@FindBy(xpath = "//input[@name='cName']")
	WebElement cName;
	@FindBy(xpath = "//textarea[@name='resAdd']")
	WebElement presentaddress;
	@FindBy(xpath = "//textarea[@name='permanentAdd']")
	WebElement permanentaddress;
	@FindBy(xpath = "//textarea[@name='purposeOfV']")
	WebElement purposeofvisit;
	@FindBy(xpath = "//input[@type='checkbox']")
	WebElement Declaration;
	@FindBy(xpath = "//input[@type='button']")
	WebElement Cancel;
	@FindBy(xpath = "//input[@type='submit']")
	WebElement Submit;
	@FindBy(xpath = "//a[(text()='View')]")
	WebElement View;
	@FindBy(xpath = "//a[(text()='Quit')]")
	WebElement Quit;
	@FindBy(xpath = "//a[(text()='Delete')]")
	WebElement Delete;

	public VigilanceNOCpassportRequestorpage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	public void Vigilanceclick() throws InterruptedException {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", Vigilance);
		Thread.sleep(3000);
	}

	public void Goback() throws InterruptedException {
		Nocpassport.click();
		Thread.sleep(3000);
		Newform.click();
		Thread.sleep(3000);
		Nocpassport.click();
		Thread.sleep(3000);
		Goback.click();
		Thread.sleep(3000);
	}

	public void Nocpassportcancel() throws InterruptedException {
		Thread.sleep(3000);
		Nocpassport.click();
		Thread.sleep(3000);
		Newform.click();
		Thread.sleep(3000);
		Nocpassport.click();
		Thread.sleep(3000);
		Submit.click();
		Thread.sleep(3000);
		NocDate.sendKeys("06/22/2022");
		Thread.sleep(3000);
		LastDate.sendKeys("06/22/2022");
		Thread.sleep(3000);
		Epfbalamce.sendKeys("1000");
		Thread.sleep(3000);
		cName.sendKeys("India");
		Thread.sleep(3000);
		presentaddress.sendKeys("5/43  nagar");
		Thread.sleep(3000);
		permanentaddress.sendKeys("3/43 hill view kerala");
		Thread.sleep(3000);
		purposeofvisit.sendKeys("office work");
		Thread.sleep(3000);
		Declaration.click();
		Thread.sleep(3000);
		Cancel.click();
		Thread.sleep(3000);
	}

	public void Nocpassportsubmit() throws InterruptedException {
		Thread.sleep(3000);
		Nocpassport.click();
		Thread.sleep(3000);
		Newform.click();
		Thread.sleep(3000);
		Nocpassport.click();
		Thread.sleep(3000);
		Submit.click();
		Thread.sleep(3000);
		NocDate.sendKeys("06/22/2022");
		Thread.sleep(3000);
		LastDate.sendKeys("06/22/2022");
		Thread.sleep(3000);
		Epfbalamce.sendKeys("1000");
		Thread.sleep(3000);
		cName.sendKeys("India");
		Thread.sleep(3000);
		presentaddress.sendKeys("5/43  nagar");
		Thread.sleep(3000);
		permanentaddress.sendKeys("3/43 hill view kerala");
		Thread.sleep(3000);
		purposeofvisit.sendKeys("office work");
		Thread.sleep(3000);
		Declaration.click();
		Thread.sleep(3000);
		Submit.click();
		Thread.sleep(3000);
	}

	public void ViewandQuit() throws InterruptedException {
		Thread.sleep(3000);
		Nocpassport.click();
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
		Nocpassport.click();
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
		Nocpassport.click();
		Thread.sleep(3000);
		Newform.click();
		Thread.sleep(3000);
		Nocpassport.click();
		Thread.sleep(3000);
		Submit.click();
		Thread.sleep(3000);
		NocDate.sendKeys("06/22/2022");
		Thread.sleep(3000);
		LastDate.sendKeys("06/22/2022");
		Thread.sleep(3000);
		Epfbalamce.sendKeys("1000");
		Thread.sleep(3000);
		cName.sendKeys("India");
		Thread.sleep(3000);
		presentaddress.sendKeys("5/43  nagar");
		Thread.sleep(3000);
		permanentaddress.sendKeys("3/43 hill view kerala");
		Thread.sleep(3000);
		purposeofvisit.sendKeys("office work");
		Thread.sleep(3000);
		Declaration.click();
		Thread.sleep(3000);
		Submit.click();
		Thread.sleep(3000);
	}

}
