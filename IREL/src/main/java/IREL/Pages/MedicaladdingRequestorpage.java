package IREL.Pages;

import javax.swing.plaf.metal.MetalBorders.TableHeaderBorder;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openxmlformats.schemas.drawingml.x2006.main.ThemeDocument;
import org.testng.annotations.AfterMethod;

import IREL.Base.testbase;
import IREL.Commonutility.Actionscreenshot;

public class MedicaladdingRequestorpage extends testbase {

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
	@FindBy(linkText = "Adding Dependent Family Member")
	WebElement addingdependent;
	@FindBy(name = "profession")
	WebElement Profession;
	@FindBy(css="#rowAddFamilyMemberTab14264 > td:nth-child(5) > input[type=text]")
	WebElement Profession1;
	@FindBy(css="#rowAddFamilyMemberTab14265 > td:nth-child(5) > input[type=text]")
	WebElement Profession2;
	@FindBy(css="#rowAddFamilyMemberTab14266 > td:nth-child(5) > input[type=text]")
	WebElement Profession4;
	
	@FindBy(css="#rowAddFamilyMemberTab14267 > td:nth-child(5) > input[type=text]")
	WebElement  Profession3;
	@FindBy(css="#rowAddFamilyMemberTab14264 > td:nth-child(6) > input[type=text]:nth-child(1)")
	WebElement Income1;
	@FindBy(css="#rowAddFamilyMemberTab14265 > td:nth-child(6) > input[type=text]:nth-child(1)")
	WebElement Income2;
	@FindBy(css="#rowAddFamilyMemberTab14266 > td:nth-child(6) > input[type=text]:nth-child(1)")
	WebElement Income4;
	@FindBy(css="#rowAddFamilyMemberTab14267 > td:nth-child(6) > input[type=text]:nth-child(1)")
	WebElement Income3;

	@FindBy(name = "monthlyIncome")
	WebElement Income;
	@FindBy(xpath = "//a[contains(text(),'Delete')]")
	WebElement delete;
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

	public MedicaladdingRequestorpage() {
		PageFactory.initElements(driver, this);
	}

	public void reimbclick() throws InterruptedException {
		js = (JavascriptExecutor) driver;
		// as = new Actionscreenshot();
		js.executeScript("arguments[0].click()", reimb);
		Thread.sleep(3000);
		medical.click();
		Thread.sleep(3000);
		addingdependent.click();
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
		delete.click();
		Thread.sleep(3000);
		select(Familyselection, prop.getProperty("familyname1"));
		Thread.sleep(3000);
		save.click();
		Thread.sleep(3000);
		Alert simple = driver.switchTo().alert();
		Thread.sleep(3000);
		simple.accept();
		Profession1.sendKeys("86594fges");
		Thread.sleep(3000);
		Profession1.clear();
		Thread.sleep(3000);
		Profession1.sendKeys("Tax officer");
		save.click();
		Thread.sleep(3000);
		Alert simple1 = driver.switchTo().alert();
		Thread.sleep(3000);
		simple1.accept();
		Income1.sendKeys("ghfkd");
		Thread.sleep(3000);
		Income1.clear();
     	Thread.sleep(3000);
		Income1.sendKeys("1000");
		Thread.sleep(3000);
		select(Familyselection, prop.getProperty("familyname2"));
		Thread.sleep(3000);
		Profession2.sendKeys("Officer");
		Thread.sleep(3000);
		Income2.sendKeys("1000");
		Thread.sleep(3000);
		select(Familyselection, prop.getProperty("familyname3"));
		Thread.sleep(3000);
		Profession3.sendKeys("Income tax");
		Thread.sleep(3000);
		Income3.sendKeys("2000");
		Thread.sleep(3000);
		select(Familyselection, prop.getProperty("familyname3"));
		Thread.sleep(3000);
		Alert simple2 = driver.switchTo().alert();
		Thread.sleep(3000);
		System.out.println(simple2.getText());
		Thread.sleep(3000);
		simple2.accept();
		Thread.sleep(3000);
		select(Familyselection, prop.getProperty("familyname4"));
		Thread.sleep(3000);
		Profession4.sendKeys("Tax officer");
		Thread.sleep(3000);
		Income4.sendKeys("3000");
		Thread.sleep(3000);
		select(Familyselection, prop.getProperty("familyname5"));
		Thread.sleep(3000);
		Alert simple3 = driver.switchTo().alert();
		Thread.sleep(3000);
		System.out.println(simple3.getText());
		Thread.sleep(3000);
		simple3.getText();
		Thread.sleep(3000);
		
	}

	public void canceladdingmemebers() throws InterruptedException {
		Thread.sleep(3000);
		crtnew.click();
		Thread.sleep(3000);
		select(Familyselection, prop.getProperty("familyname1"));
		Thread.sleep(3000);
		Profession1.sendKeys("Tax officer");
		Thread.sleep(3000);
		Income1.sendKeys("1000");
		Thread.sleep(3000);
		select(Familyselection, prop.getProperty("familyname2"));
		Thread.sleep(3000);
		Profession2.sendKeys("Officer");
		Thread.sleep(3000);
		Income2.sendKeys("1000");
		Thread.sleep(3000);
		select(Familyselection, prop.getProperty("familyname3"));
		Thread.sleep(3000);
		Profession3.sendKeys("Income tax");
		Thread.sleep(3000);
		Income3.sendKeys("2000");
		Thread.sleep(3000);
		select(Familyselection, prop.getProperty("familyname4"));
		Thread.sleep(3000);
		Profession4.sendKeys("Tax officer");
		Thread.sleep(3000);
		Income4.sendKeys("3000");
		Thread.sleep(3000);
		exit.click();
		Thread.sleep(6000);
	}

	public void save() throws InterruptedException {
		Thread.sleep(3000);
		crtnew.click();
		Thread.sleep(3000);
		select(Familyselection, prop.getProperty("familyname1"));
		Thread.sleep(3000);
		Profession1.sendKeys("Tax officer");
		Thread.sleep(3000);
		Income1.sendKeys("1000");
		Thread.sleep(3000);
		select(Familyselection, prop.getProperty("familyname2"));
		Thread.sleep(3000);
		Profession2.sendKeys("Officer");
		Thread.sleep(3000);
		Income2.sendKeys("1000");
		Thread.sleep(3000);
		select(Familyselection, prop.getProperty("familyname3"));
		Thread.sleep(3000);
		Profession3.sendKeys("Income tax");
		Thread.sleep(3000);
		Income3.sendKeys("2000");
		Thread.sleep(3000);
		select(Familyselection, prop.getProperty("familyname4"));
		Thread.sleep(3000);
		Profession4.sendKeys("Tax officer");
		Thread.sleep(3000);
		Income4.sendKeys("3000");
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
		Profession.sendKeys("Tax officer");
		Thread.sleep(3000);
		Income.sendKeys("1000");
		Thread.sleep(3000);
		select(Familyselection, prop.getProperty("familyname2"));
		Thread.sleep(3000);
		Profession2.sendKeys("Officer");
		Thread.sleep(3000);
		Income2.sendKeys("1000");
		Thread.sleep(3000);
		select(Familyselection, prop.getProperty("familyname3"));
		Thread.sleep(3000);
		Profession3.sendKeys("Income tax");
		Thread.sleep(3000);
		Income3.sendKeys("2000");
		Thread.sleep(3000);
		select(Familyselection, prop.getProperty("familyname4"));
		Thread.sleep(3000);
		Profession4.sendKeys("Tax officer");
		Thread.sleep(3000);
		Income4.sendKeys("3000");
		Thread.sleep(3000);
		Sumit.click();
		Thread.sleep(3000);
		Alert simple = driver.switchTo().alert();
		Thread.sleep(3000);
		simple.accept();
		Thread.sleep(3000);
	}
	
}
