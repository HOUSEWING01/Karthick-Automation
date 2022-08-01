package IREL.Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import IREL.Base.testbase;

public class VigilanceNOCforwardingRequestorpage extends testbase {
	JavascriptExecutor js;
	@FindBy(xpath = "//a[contains(text(),'Vigilance')]")
	WebElement Vigilance;

	@FindBy(xpath = "//a[contains(text(),'New Forms')]")
	WebElement Newform;
	@FindBy(xpath = "//a[contains(text(),'Go Back')]")
	WebElement Goback;
	@FindBy(xpath = "//*[@id=\"screenlet_1_col\"]/div/table/tbody/tr/td/a[1]/h2")
	WebElement Nocpassport;
	@FindBy(xpath = "//*[@id=\"screenlet_1_col\"]/div/table/tbody/tr/td/a[2]/h2")
	WebElement Nocforwarding;
	@FindBy(xpath = "//input[@name='dateOfJoinGrade']")
	WebElement Dateofjoin;
	@FindBy(xpath = "//input[@name='dues']")
	WebElement Dues;
	@FindBy(xpath = "//input[@name='postApplied']")
	WebElement postApplied;
	@FindBy(xpath = "//input[@name='organization']")
	WebElement organization;
	@FindBy(xpath = "//input[@name='payScaleOffered']")
	WebElement payScaleOffered;
	@FindBy(xpath = "//input[@name='qualification']")
	WebElement qualification;
	@FindBy(xpath = "//input[@name='experience']")
	WebElement experience;
	@FindBy(xpath = "//input[@name='nocReqDate']")
	WebElement NocDate;
	@FindBy(xpath = "//input[@name='lastDateNOC']")
	WebElement LastDate;
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
	@FindBy(xpath = "//input[@name='vig_otherService']")
	WebElement Upload;

	public VigilanceNOCforwardingRequestorpage() {
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
		Nocforwarding.click();
		Thread.sleep(3000);
		Goback.click();
		Thread.sleep(3000);
	}

	public void Nocforwardingcancel() throws InterruptedException {
		Thread.sleep(3000);
		Nocpassport.click();
		Thread.sleep(3000);
		Newform.click();
		Thread.sleep(3000);
		Nocforwarding.click();
		Thread.sleep(3000);
		Dateofjoin.sendKeys("05/22/2022");
		Thread.sleep(3000);
		Dues.sendKeys("1000");
		Thread.sleep(3000);
		postApplied.sendKeys("officer");
		Thread.sleep(3000);
		organization.sendKeys("Frankspace");
		Thread.sleep(3000);
		payScaleOffered.sendKeys("30000");
		Thread.sleep(3000);
		qualification.sendKeys("Arts");
		Thread.sleep(3000);
		experience.sendKeys("2 years");
		Thread.sleep(3000);
		NocDate.sendKeys("06/22/2022");
		Thread.sleep(3000);
		LastDate.sendKeys("06/22/2022");
		Thread.sleep(3000);
		Cancel.click();
		Thread.sleep(3000);
	}

	public void Nocforwardingsubmit() throws InterruptedException {
		Thread.sleep(3000);
		Nocpassport.click();
		Thread.sleep(3000);
		Newform.click();
		Thread.sleep(3000);
		Nocforwarding.click();
		Thread.sleep(3000);
		Dateofjoin.sendKeys("05/22/2022");
		Thread.sleep(3000);
		Dues.sendKeys("1000");
		Thread.sleep(3000);
		postApplied.sendKeys("officer");
		Thread.sleep(3000);
		organization.sendKeys("Frankspace");
		Thread.sleep(3000);
		payScaleOffered.sendKeys("30000");
		Thread.sleep(3000);
		qualification.sendKeys("Arts");
		Thread.sleep(3000);
		experience.sendKeys("2 years");
		Thread.sleep(3000);
		NocDate.sendKeys("06/22/2022");
		Thread.sleep(3000);
		LastDate.sendKeys("06/22/2022");
		Thread.sleep(3000);
		Upload.sendKeys("C:\\\\\\\\Users\\\\\\\\soumya_hugar\\\\\\\\Desktop\\\\\\\\Upload files\\\\\\\\File1.pdf");
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
		Nocforwarding.click();
		Thread.sleep(3000);
		Dateofjoin.sendKeys("05/22/2022");
		Thread.sleep(3000);
		Dues.sendKeys("1000");
		Thread.sleep(3000);
		postApplied.sendKeys("officer");
		Thread.sleep(3000);
		organization.sendKeys("Frankspace");
		Thread.sleep(3000);
		payScaleOffered.sendKeys("30000");
		Thread.sleep(3000);
		qualification.sendKeys("Arts");
		Thread.sleep(3000);
		experience.sendKeys("2 years");
		Thread.sleep(3000);
		NocDate.sendKeys("06/22/2022");
		Thread.sleep(3000);
		LastDate.sendKeys("06/22/2022");
	    Thread.sleep(3000);
		Upload.sendKeys("C:\\\\\\\\\\\\\\\\Users\\\\\\\\\\\\\\\\soumya_hugar\\\\\\\\\\\\\\\\Desktop\\\\\\\\\\\\\\\\Upload files\\\\\\\\\\\\\\\\File1.pdf");
		Thread.sleep(3000);
		Submit.click();
		Thread.sleep(3000);
	}

}
