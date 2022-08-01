package IREL.Pages;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import IREL.Base.testbase;

public class ClaimintimationRequestorpage extends testbase {
	JavascriptExecutor js;
	@FindBy(xpath = "//a[contains(text(),' Reimbursement')]")
	WebElement reimb;
	@FindBy(linkText = "Medical")
	WebElement medical;
	@FindBy(linkText = "Claim Intimation")
	WebElement ClaimIntimation;
	@FindBy(xpath = "//a[contains(text(),'Create')]")
	WebElement crtnew;
	@FindBy(name = "dateOfAdmission")
	WebElement admissiondate;
	@FindBy(name = "nameOfHospital")
	WebElement hospital;
	@FindBy(name = "locationHospital")
	WebElement location;
	@FindBy(id = "advanace")
	WebElement advance;
	@FindBy(xpath = "//input[@name='advanceAmount']")
	WebElement advanceamount;
	@FindBy(xpath = "/html/body/div[2]/div[5]/div/div[1]/div[2]/div[2]/form/div[2]/table/tbody/tr[6]/td[2]/span/span[1]/span/span[1]")
	WebElement admittedfaamilymember;
	@FindBy(xpath ="//li[contains(text(),'Puneeth')]")
	WebElement admittednames;
	
	@FindBy(xpath = "//input[@name='AgeOfPatient']")
	WebElement age;
	@FindBy(xpath = "//input[@name='RelationOfPatient']")
	WebElement relation;
	@FindBy(xpath = "//input[@name='NatureOfIllness']")
	WebElement illness;
	@FindBy(xpath = "//input[@name='DischargeDate']")
	WebElement dischargedate;
	@FindBy(xpath = "//input[@value='Save']")
	WebElement save;
	@FindBy(xpath = "//input[@value='Submit']")
	WebElement Sumit;
	@FindBy(xpath = "//input[@value='Cancel']")
	WebElement exit;
	@FindBy(xpath = "//a[contains(text(),'Go Back')]")
	WebElement Goback;
	@FindBy(xpath = "//a[contains(text(),'Edit')]")
	WebElement edit;
	@FindBy(xpath = "//a[contains(text(),'Quit')]")
	WebElement Quit;
	@FindBy(xpath = "//a[contains(text(),'Delete')]")
	WebElement delete;

	public ClaimintimationRequestorpage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	public void reimbclick() throws InterruptedException {
		js = (JavascriptExecutor) driver;
		// as = new Actionscreenshot();
		js.executeScript("arguments[0].click()", reimb);
		Thread.sleep(3000);
		medical.click();
		Thread.sleep(3000);
		ClaimIntimation.click();
		Thread.sleep(3000);
	}

	public void Creatnewgoback() throws InterruptedException {
		Thread.sleep(3000);
		crtnew.click();
		Thread.sleep(3000);
		Goback.click();
		Thread.sleep(3000);
	}

	public void Allmandatoryfield() throws InterruptedException {
		Thread.sleep(3000);
		crtnew.click();
		Thread.sleep(3000);
		Sumit.click();
		Thread.sleep(3000);
		Alert simple = driver.switchTo().alert();
		Thread.sleep(3000);
		simple.accept();
	}

	public void dateofadmission() throws InterruptedException {
		Thread.sleep(3000);
		crtnew.click();
		Thread.sleep(3000);
		admissiondate.sendKeys("03/04/2010");
		Thread.sleep(3000);
	}

	public void Nameofhospital() throws InterruptedException {
		Thread.sleep(3000);
		crtnew.click();
		Thread.sleep(3000);
		admissiondate.sendKeys("03/04/2010");
		Thread.sleep(3000);
		hospital.sendKeys("Ganga");
		Thread.sleep(3000);
		Sumit.click();
		Thread.sleep(3000);
		Alert simple = driver.switchTo().alert();
		Thread.sleep(3000);
		simple.accept();
		Thread.sleep(3000);
	}

	public void locationofhospital() throws InterruptedException {
		Thread.sleep(3000);
		crtnew.click();
		Thread.sleep(3000);
		admissiondate.sendKeys("03/04/2010");
		Thread.sleep(3000);
		hospital.sendKeys("Ganga");
		Thread.sleep(3000);
		location.sendKeys("Banglore");
		Thread.sleep(3000);
		Sumit.click();
		Thread.sleep(3000);
		Alert simple = driver.switchTo().alert();
		Thread.sleep(3000);
		simple.accept();
		Thread.sleep(3000);
	}

	public void advanceselection() throws InterruptedException {
		Thread.sleep(3000);
		crtnew.click();
		Thread.sleep(3000);
		admissiondate.sendKeys("03/04/2010");
		Thread.sleep(3000);
		hospital.sendKeys("Ganga");
		Thread.sleep(3000);
		location.sendKeys("Banglore");
		Thread.sleep(3000);
		advance.click();
		Thread.sleep(3000);
		Sumit.click();
		Thread.sleep(3000);
		Alert simple = driver.switchTo().alert();
		Thread.sleep(3000);
		simple.accept();
		Thread.sleep(3000);
	}

	public void advanceamount() throws InterruptedException {
		Thread.sleep(3000);
		crtnew.click();
		Thread.sleep(3000);
		admissiondate.sendKeys("03/04/2010");
		Thread.sleep(3000);
		hospital.sendKeys("Ganga");
		Thread.sleep(3000);
		location.sendKeys("Banglore");
		Thread.sleep(3000);
		advance.click();
		Thread.sleep(3000);
		advanceamount.sendKeys("10000");
		Thread.sleep(3000);
		Sumit.click();
		Thread.sleep(3000);
		Alert simple = driver.switchTo().alert();
		Thread.sleep(3000);
		simple.accept();
		Thread.sleep(3000);
	}

	public void nameofpatient() throws InterruptedException {
		Thread.sleep(3000);
		crtnew.click();
		Thread.sleep(3000);
		admissiondate.sendKeys("03/04/2010");
		Thread.sleep(3000);
		hospital.sendKeys("Ganga");
		Thread.sleep(3000);
		location.sendKeys("Banglore");
		Thread.sleep(3000);
		advance.click();
		Thread.sleep(3000);
		advanceamount.sendKeys("10000");
		Thread.sleep(3000);
		admittedfaamilymember.click();
		Thread.sleep(3000);
		admittednames.click();
		/*
		 * for(WebElement names : admittednames) { System.out.println(names.getText());
		 * if(names.getText().equalsIgnoreCase("ARJUN kumar")) { names.click(); }
		 */
//}
//	select(admittedfaamilymember, prop.getProperty("familyname1"));
		Thread.sleep(3000);
		Sumit.click();
		Thread.sleep(3000);
		Alert simple = driver.switchTo().alert();
		Thread.sleep(3000);
		simple.accept();
		Thread.sleep(3000);
	}

	public void age() throws InterruptedException {
		Thread.sleep(3000);
		crtnew.click();
		Thread.sleep(3000);
		admissiondate.sendKeys("03/04/2010");
		Thread.sleep(3000);
		hospital.sendKeys("Ganga");
		Thread.sleep(3000);
		advance.click();
		Thread.sleep(3000);
		advanceamount.sendKeys("10000");
		Thread.sleep(3000);
		admittedfaamilymember.click();
		Thread.sleep(3000);
		admittednames.click();
		Thread.sleep(3000);
		age.sendKeys("22");
		Thread.sleep(3000);
		Sumit.click();
		Thread.sleep(3000);
		Alert simple = driver.switchTo().alert();
		Thread.sleep(3000);
		simple.accept();
		Thread.sleep(3000);
	}

	public void relation() throws InterruptedException {
		Thread.sleep(3000);
		crtnew.click();
		Thread.sleep(3000);
		admissiondate.sendKeys("03/04/2010");
		Thread.sleep(3000);
		hospital.sendKeys("Ganga");
		Thread.sleep(3000);
		advance.click();
		Thread.sleep(3000);
		advanceamount.sendKeys("10000");
		Thread.sleep(3000);
		admittedfaamilymember.click();
		Thread.sleep(3000);
		admittednames.click();
		Thread.sleep(3000);
		age.sendKeys("22");
		Thread.sleep(3000);
		relation.sendKeys("brother");
		Thread.sleep(3000);
		Sumit.click();
		Thread.sleep(3000);
		Alert simple = driver.switchTo().alert();
		Thread.sleep(3000);
		simple.accept();
		Thread.sleep(3000);
	}

	public void natureofillness() throws InterruptedException {
		Thread.sleep(3000);
		crtnew.click();
		Thread.sleep(3000);
		admissiondate.sendKeys("03/04/2010");
		Thread.sleep(3000);
		hospital.sendKeys("Ganga");
		Thread.sleep(3000);
		advance.click();
		Thread.sleep(3000);
		advanceamount.sendKeys("10000");
		Thread.sleep(3000);
		admittedfaamilymember.click();
		Thread.sleep(3000);
		admittednames.click();
		Thread.sleep(3000);
		age.sendKeys("22");
		Thread.sleep(3000);
		relation.sendKeys("brother");
		Thread.sleep(3000);
		illness.sendKeys("general checkup");
		Thread.sleep(3000);
		Sumit.click();
		Thread.sleep(3000);
		Alert simple = driver.switchTo().alert();
		Thread.sleep(3000);
		simple.accept();
		Thread.sleep(3000);
	}

	public void dischargedate() throws InterruptedException {
		Thread.sleep(3000);
		crtnew.click();
		Thread.sleep(3000);
		admissiondate.sendKeys("03/04/2010");
		Thread.sleep(3000);
		hospital.sendKeys("Ganga");
		Thread.sleep(3000);
		advance.click();
		Thread.sleep(3000);
		advanceamount.sendKeys("10000");
		Thread.sleep(3000);
		admittedfaamilymember.click();
		Thread.sleep(3000);
		admittednames.click();
		Thread.sleep(3000);
		age.sendKeys("22");
		Thread.sleep(3000);
		relation.sendKeys("brother");
		Thread.sleep(3000);
		illness.sendKeys("general checkup");
		Thread.sleep(3000);
		dischargedate.sendKeys("04/05/2015");
		Thread.sleep(3000);
	}

	public void canceladdingmemebers() throws InterruptedException {
		Thread.sleep(3000);
		crtnew.click();
		Thread.sleep(3000);
		admissiondate.sendKeys("03/04/2010");
		Thread.sleep(3000);
		hospital.sendKeys("Ganga");
		Thread.sleep(3000);
		advance.click();
		Thread.sleep(3000);
		advanceamount.sendKeys("10000");
		Thread.sleep(3000);
		admittedfaamilymember.click();
		Thread.sleep(3000);
		admittednames.click();
		Thread.sleep(3000);
		age.sendKeys("22");
		Thread.sleep(3000);
		relation.sendKeys("brother");
		Thread.sleep(3000);
		illness.sendKeys("general checkup");
		Thread.sleep(3000);
		dischargedate.sendKeys("04/05/2015");
		Thread.sleep(3000);
		exit.click();
		Thread.sleep(3000);

	}

	public void save() throws InterruptedException {
		Thread.sleep(3000);
		crtnew.click();
		Thread.sleep(3000);
		admissiondate.sendKeys("03/04/2010");
		Thread.sleep(3000);
		hospital.sendKeys("Ganga");
		Thread.sleep(3000);
		advance.click();
		Thread.sleep(3000);
		advanceamount.sendKeys("10000");
		Thread.sleep(3000);
		admittedfaamilymember.click();
		Thread.sleep(3000);
		admittednames.click();
		Thread.sleep(3000);
		age.sendKeys("22");
		Thread.sleep(3000);
		relation.sendKeys("brother");
		Thread.sleep(3000);
		illness.sendKeys("general checkup");
		Thread.sleep(3000);
		dischargedate.sendKeys("04/05/2015");
		Thread.sleep(3000);
		save.click();
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
		admissiondate.sendKeys("03/04/2010");
		Thread.sleep(3000);
		hospital.sendKeys("Ganga");
		Thread.sleep(3000);
		advance.click();
		Thread.sleep(3000);
		advanceamount.sendKeys("10000");
		Thread.sleep(3000);
		admittedfaamilymember.click();
		Thread.sleep(3000);
		admittednames.click();
		Thread.sleep(3000);
		age.sendKeys("22");
		Thread.sleep(3000);
		relation.sendKeys("brother");
		Thread.sleep(3000);
		illness.sendKeys("general checkup");
		Thread.sleep(3000);
		dischargedate.sendKeys("04/05/2015");
		Thread.sleep(3000);
		Sumit.click();
		Thread.sleep(3000);
		Alert simple = driver.switchTo().alert();
		Thread.sleep(3000);
		simple.accept();
		Thread.sleep(3000);
	}
	
	

}
