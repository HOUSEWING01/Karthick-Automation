package IREL.Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import IREL.Base.testbase;

public class MedicalchangeRequestpage extends testbase {
	JavascriptExecutor js;
	@FindBy(xpath = "//a[contains(text(),' Reimbursement')]")
	WebElement reimb;
	@FindBy(xpath = "//a[contains(text(),' Pending Request For Approver')]")
	WebElement Pendingapprover;
	@FindBy(xpath = "//a[contains(text(),' Telephone Reimbursement Approver History')]")
	WebElement approvehistory;
	@FindBy(xpath = "//a[contains(text(),'Create')]")
	WebElement crtnew;
	@FindBy(id = "familyMembers")
	WebElement Familyselection;
	@FindBy(linkText = "Medical")
	WebElement medical;
	@FindBy(linkText = "Change Dependent Family Member")
	WebElement changedependent;
	@FindBy(name = "profession")
	WebElement Profession;
	@FindBy(name = "monthlyIncome")
	WebElement Income;
	@FindBy(xpath = "//a[contains(text(),'Delete')]")
	WebElement delete;
	@FindBy(xpath = "//a[contains(text(),'Cancel')]")
	WebElement Cancel;
	@FindBy(xpath = "//input[@value='Save']")
	WebElement save;
	@FindBy(xpath = "//input[@value='Submit']")
	WebElement Sumit;
	@FindBy(xpath = "//input[@value='Cancel']")
	WebElement exit;
	@FindBy(xpath = "//a[contains(text(),'Show')]")
	WebElement Show;
	@FindBy(xpath = "//a[contains(text(),'Go Back')]")
	WebElement Goback;
	@FindBy(xpath = "//a[contains(text(),'Edit')]")
	WebElement edit;
	@FindBy(xpath = "//a[contains(text(),'Quit')]")
	WebElement Quit;

	public MedicalchangeRequestpage() {
		PageFactory.initElements(driver, this);
	}

	public void reimbclick() throws InterruptedException {
		js = (JavascriptExecutor) driver;
		// as = new Actionscreenshot();
		js.executeScript("arguments[0].click()", reimb);
		Thread.sleep(3000);
		medical.click();
		Thread.sleep(3000);
		changedependent.click();
		Thread.sleep(3000);
	}

	public void Creatnewgoback() throws InterruptedException {
		Thread.sleep(3000);
		crtnew.click();
		Thread.sleep(3000);
		Goback.click();
		Thread.sleep(3000);
	}

	public void Viewfamilymember() throws InterruptedException {
		Thread.sleep(3000);
		crtnew.click();
		Thread.sleep(3000);
		Goback.click();
		Thread.sleep(3000);
		crtnew.click();
		Thread.sleep(3000);
	}

	public void addingmember() throws InterruptedException {
		Thread.sleep(3000);
		crtnew.click();
		Thread.sleep(3000);
		select(Familyselection, prop.getProperty("familyname1"));
		Thread.sleep(3000);
		select(Familyselection, prop.getProperty("familyname2"));
		Thread.sleep(3000);
		select(Familyselection, prop.getProperty("familyname3"));
		Thread.sleep(3000);
		select(Familyselection, prop.getProperty("familyname4"));
		Thread.sleep(3000);

	}

	public void canceladdingmemebers() throws InterruptedException {
		Thread.sleep(3000);
		crtnew.click();
		Thread.sleep(3000);
		select(Familyselection, prop.getProperty("familyname1"));
		Thread.sleep(3000);
		Thread.sleep(3000);
		select(Familyselection, prop.getProperty("familyname2"));
		Thread.sleep(3000);
		select(Familyselection, prop.getProperty("familyname3"));
		Thread.sleep(3000);
		select(Familyselection, prop.getProperty("familyname4"));
		Thread.sleep(3000);

		delete.click();
		Thread.sleep(3000);
		Cancel.click();
		Thread.sleep(3000);
	}

	public void save() throws InterruptedException {
		Thread.sleep(3000);
		crtnew.click();
		Thread.sleep(3000);
		select(Familyselection, prop.getProperty("familyname1"));
		Thread.sleep(3000);
		Thread.sleep(3000);
		select(Familyselection, prop.getProperty("familyname2"));
		Thread.sleep(3000);
		select(Familyselection, prop.getProperty("familyname3"));
		Thread.sleep(3000);
		select(Familyselection, prop.getProperty("familyname4"));
		Thread.sleep(3000);

		save.click();
		Thread.sleep(3000);
		Alert simple = driver.switchTo().alert();
		Thread.sleep(3000);
		simple.accept();
		Thread.sleep(3000);
	}

	public void sumbit() throws InterruptedException {
		Thread.sleep(3000);
		edit.click();
		Thread.sleep(3000);
		Sumit.click();
		Thread.sleep(3000);
		Alert simple = driver.switchTo().alert();
		Thread.sleep(3000);
		simple.accept();
		Thread.sleep(3000);
	}

	public void quit() throws InterruptedException {
		Thread.sleep(3000);
		Quit.click();
		Thread.sleep(3000);
		Alert simple = driver.switchTo().alert();
		Thread.sleep(3000);
		simple.accept();
	}

	public void delete() throws InterruptedException {
		Thread.sleep(3000);
		delete.click();
		Thread.sleep(3000);
		Alert simple = driver.switchTo().alert();
		Thread.sleep(3000);
		simple.accept();
	}

	public void submitform() throws InterruptedException {
		Thread.sleep(3000);
		crtnew.click();
		Thread.sleep(3000);
		select(Familyselection, prop.getProperty("familyname1"));
		Thread.sleep(3000);
		Thread.sleep(3000);
		select(Familyselection, prop.getProperty("familyname2"));
		Thread.sleep(3000);
		select(Familyselection, prop.getProperty("familyname3"));
		Thread.sleep(3000);
		select(Familyselection, prop.getProperty("familyname4"));
		Thread.sleep(3000);
		Sumit.click();
		Thread.sleep(3000);
		Alert simple = driver.switchTo().alert();
		Thread.sleep(3000);
		simple.accept();
		Thread.sleep(3000);
	}

}
