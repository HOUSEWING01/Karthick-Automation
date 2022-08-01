package IREL.Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import IREL.Base.testbase;

public class VigilancePropertySMDRequestorpage extends testbase {
	JavascriptExecutor js;
	@FindBy(xpath = "//a[contains(text(),'Vigilance')]")
	WebElement Vigilance;
	@FindBy(xpath = "//a[contains(text(),'Create New')]")
	WebElement Newform;
	@FindBy(xpath = "//a[contains(text(),'Go Back')]")
	WebElement Goback;
	@FindBy(xpath = "//*[@id=\"screenlet_1_col\"]/div/table/tbody/tr/td/a[3]/h2")
	WebElement Property;
	@FindBy(xpath = "//input[@id='Sanction']")
	WebElement Sanction;
	@FindBy(xpath = "//input[@id='Movable']")
	WebElement Movable;
	@FindBy(xpath = "//input[@id='Disposed']")
	WebElement Disposed;
	@FindBy(xpath = "//input[@value='Generate Form']")
	WebElement Generateform;
	@FindBy(xpath = "//input[@name='dateOfAcq']")
	WebElement dateOfAcq;
	@FindBy(xpath = "//textarea[@name='partyAddress']")
	WebElement partyAddress;
	@FindBy(xpath = "//textarea[@name='descriptionOfProp']")
	WebElement descriptionOfProp;
	@FindBy(xpath = "//input[@id='relatedYes']")
	WebElement relatedYes;
	@FindBy(xpath = "//input[@name='relationship']")
	WebElement relationship;
	@FindBy(xpath = "//input[@name='modelNo']")
	WebElement modelNo;
	@FindBy(xpath = "//input[@name='dealing']")
	WebElement dealing;
	@FindBy(xpath = "//input[@name='modeOfAcq']")
	WebElement modeOfAcq;
	@FindBy(xpath = "//input[@name='dealingNature']")
	WebElement dealingNature;
	@FindBy(xpath = "//input[@name='purchasePrice']")
	WebElement purchasePrice;
	@FindBy(xpath = "//textarea[@name='transactionArranged']")
	WebElement transactionArranged;
	@FindBy(xpath = "//input[@name='vig_propertyTran']")
	WebElement Requsiteupload;
	@FindBy(xpath = "//input[@name='acqGift']")
	WebElement Acquisition;
	@FindBy(xpath = "//textarea[@name='partyName']")
	WebElement partyName;
	@FindBy(xpath = "//textarea[@name='otherFact']")
	WebElement otherFact;
	@FindBy(xpath = "//input[@name='declaration']")
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

	public VigilancePropertySMDRequestorpage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	public void Vigilanceclick() throws InterruptedException {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", Vigilance);
		Thread.sleep(3000);
	}

	public void Goback() throws InterruptedException {
		Property.click();
		Thread.sleep(3000);
		Newform.click();
		Thread.sleep(3000);
		Goback.click();
		Thread.sleep(3000);
	}

	public void NocpropertySMDcancel() throws InterruptedException {
		Thread.sleep(3000);
		Property.click();
		Thread.sleep(3000);
		Newform.click();
		Thread.sleep(3000);
		Sanction.click();
		Thread.sleep(3000);
		Movable.click();
		Thread.sleep(3000);
		Disposed.click();
		Thread.sleep(3000);
		Generateform.click();
		Thread.sleep(3000);
		dateOfAcq.sendKeys("06/22/2022");
		Thread.sleep(3000);
		partyAddress.sendKeys("5/87 banglore");
		Thread.sleep(3000);
		descriptionOfProp.sendKeys("Car");
		Thread.sleep(3000);
		relatedYes.click();
		Thread.sleep(3000);
		relationship.sendKeys("friend");
		Thread.sleep(3000);
		modelNo.sendKeys("rte46e");
		Thread.sleep(3000);
		dealing.sendKeys("office works");
		Thread.sleep(3000);
		modeOfAcq.sendKeys("sales");
		Thread.sleep(3000);
		dealingNature.sendKeys("work");
		Thread.sleep(3000);
		purchasePrice.sendKeys("5000");
		Thread.sleep(3000);
		transactionArranged.sendKeys("Agency");
		Thread.sleep(3000);
		Requsiteupload.sendKeys("C:\\\\Users\\\\soumya_hugar\\\\Desktop\\\\Upload files\\\\File1.pdf");
		Thread.sleep(3000);
		Acquisition.sendKeys("gift");
		Thread.sleep(3000);
		partyName.sendKeys("online gift");
		Thread.sleep(3000);
		otherFact.sendKeys("nothing");
		Thread.sleep(3000);
		Declaration.click();
		Thread.sleep(3000);
		Cancel.click();
		Thread.sleep(3000);
		Alert simple = driver.switchTo().alert();
		Thread.sleep(3000);
		simple.accept();
		Thread.sleep(3000);
		simple.accept();
		Thread.sleep(3000);

	}

	public void NocpropertySMDsubmit() throws InterruptedException {
		Thread.sleep(3000);
		Property.click();
		Thread.sleep(3000);
		Newform.click();
		Thread.sleep(3000);
		Sanction.click();
		Thread.sleep(3000);
		Movable.click();
		Thread.sleep(3000);
		Disposed.click();
		Thread.sleep(3000);
		Generateform.click();
		Thread.sleep(3000);
		dateOfAcq.sendKeys("06/22/2022");
		Thread.sleep(3000);
		partyAddress.sendKeys("5/87 banglore");
		Thread.sleep(3000);
		descriptionOfProp.sendKeys("Car");
		Thread.sleep(3000);
		relatedYes.click();
		Thread.sleep(3000);
		relationship.sendKeys("friend");
		Thread.sleep(3000);
		modelNo.sendKeys("rte46e");
		Thread.sleep(3000);
		dealing.sendKeys("office works");
		Thread.sleep(3000);
		modeOfAcq.sendKeys("sales");
		Thread.sleep(3000);
		dealingNature.sendKeys("work");
		Thread.sleep(3000);
		purchasePrice.sendKeys("5000");
		Thread.sleep(3000);
		transactionArranged.sendKeys("Agency");
		Thread.sleep(3000);
		Requsiteupload.sendKeys("C:\\\\Users\\\\soumya_hugar\\\\Desktop\\\\Upload files\\\\File1.pdf");
		Thread.sleep(3000);
		Acquisition.sendKeys("gift");
		Thread.sleep(3000);
		partyName.sendKeys("online gift");
		Thread.sleep(3000);
		otherFact.sendKeys("nothing");
		Thread.sleep(3000);
		Declaration.click();
		Thread.sleep(3000);
		Submit.click();
		Thread.sleep(3000);
		

	}

	public void ViewandQuit() throws InterruptedException {
		Thread.sleep(3000);
		Property.click();
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
		Property.click();
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
		Property.click();
		Thread.sleep(3000);
		Newform.click();
		Thread.sleep(3000);
		Sanction.click();
		Thread.sleep(3000);
		Movable.click();
		Thread.sleep(3000);
		Disposed.click();
		Thread.sleep(3000);
		Generateform.click();
		Thread.sleep(3000);
		dateOfAcq.sendKeys("06/22/2022");
		Thread.sleep(3000);
		partyAddress.sendKeys("5/87 banglore");
		Thread.sleep(3000);
		descriptionOfProp.sendKeys("Car");
		Thread.sleep(3000);
		relatedYes.click();
		Thread.sleep(3000);
		relationship.sendKeys("friend");
		Thread.sleep(3000);
		modelNo.sendKeys("rte46e");
		Thread.sleep(3000);
		dealing.sendKeys("office works");
		Thread.sleep(3000);
		modeOfAcq.sendKeys("sales");
		Thread.sleep(3000);
		dealingNature.sendKeys("work");
		Thread.sleep(3000);
		purchasePrice.sendKeys("5000");
		Thread.sleep(3000);
		transactionArranged.sendKeys("Agency");
		Thread.sleep(3000);
		Requsiteupload.sendKeys("C:\\\\Users\\\\soumya_hugar\\\\Desktop\\\\Upload files\\\\File1.pdf");
		Thread.sleep(3000);
		Acquisition.sendKeys("gift");
		Thread.sleep(3000);
		partyName.sendKeys("online gift");
		Thread.sleep(3000);
		otherFact.sendKeys("nothing");
		Thread.sleep(3000);
		Declaration.click();
		Thread.sleep(3000);
		Submit.click();
		Thread.sleep(3000);
		

	}

}
