package IREL.Pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import IREL.Base.testbase;
import IREL.Commonutility.Actionscreenshot;
import IREL.Commonutility.Datepicker;

public class TelephoneRequestorpage extends testbase {
	private static final boolean Alert = false;
	JavascriptExecutor js;
	Actionscreenshot as;
	static Alert alt;
	WebDriverWait wait;
	@FindBy(xpath = "//a[contains(text(),' Reimbursement')]")
	WebElement reimb;
	@FindBy(xpath = "//a[contains(text(),' Pending Request For Approver')]")
	WebElement Pendingapprover;
	@FindBy(xpath = "//a[contains(text(),' Telephone Reimbursement Approver History')]")
	WebElement approvehistory;
	@FindBy(css = "#content-main-section > div.button-bar.button-style-2 > a")
	WebElement Goback;
	@FindBy(linkText = "Telephone Expenditure/Bill")
	WebElement Telephone;
	@FindBy(xpath = "//a[contains(text(),'Create')]")
	WebElement crtnew;
	@FindBy(xpath = "//*[@id=\"dd\"]")
	WebElement year;
	@FindBy(xpath = "//*[@id=\"selectId\"]")
	List<WebElement> applicables;
	@FindBy(xpath = "//*[@id=\"select-time-period\"]")
	List<WebElement> times;
	@FindBy(name = "yearId")
	WebElement years;
	@FindBy(css = "select#selectId")
	WebElement applicable;
	@FindBy(css = "form#myform select#select-time-period")
	WebElement time;
	@FindBy(name = "invoiceBillNo")
	WebElement voice;
	@FindBy(xpath = "//*[@id=\"invoiceBillDate\"]")
	WebElement dates;
	@FindBy(xpath = "//input[@name='amount']")
	WebElement Amount;
	@FindBy(xpath = "//input[@value='UDAYAKUMAR   N']")
	WebElement Name;
	@FindBy(xpath = " //button[@value='Add Row'] ")
	WebElement adding;
	@FindBy(xpath = "//button[@value='Delete Row']")
	WebElement deleting;
	@FindBy(css = "#appendfilerow > tr:nth-child(1) > td:nth-child(3) > input")
	WebElement fileupload1;
	@FindBy(css = "#rowFileAdd2 > td:nth-child(3) > input")
	WebElement fileupload2;
	@FindBy(css = "#rowFileAdd3 > td:nth-child(3) > input")
	WebElement fileupload3;
	@FindBy(css = "#rowFileAdd4 > td:nth-child(3) > input")
	WebElement fileupload4;
	@FindBy(css = "#rowFileAdd5 > td:nth-child(3) > input")
	WebElement fileupload5;
	@FindBy(xpath = "//input[@value='Save']")
	WebElement save;
	@FindBy(xpath = "//input[@value='Submit']")
	WebElement Sumit;
	@FindBy(xpath = "//input[@value='Cancel']")
	WebElement exit;
	@FindBy(xpath = "//a[contains(text(),'Edit')]")
	WebElement edit;
	// a[contains(text(),'Edit')]
	@FindBy(xpath = "//input[@name='description']")
	WebElement Description;
	@FindBy(css = "#appendfilerow > tr > td:nth-child(3) > input")
	WebElement editupload;
	@FindBy(xpath = "//input[@value='Update']")
	WebElement Update;
	@FindBy(xpath = "//a[contains(text(),'Show')]")
	WebElement Show;
	@FindBy(xpath = "//a[contains(text(),'Quit')]")
	WebElement Quit;
	@FindBy(xpath = "//a[contains(text(),'Delete')]")
	WebElement Frontdelete;

	public TelephoneRequestorpage() {
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

	public void Reimbursementallflow() throws InterruptedException {
		js = (JavascriptExecutor) driver;
		as = new Actionscreenshot();
		js.executeScript("arguments[0].click()", reimb);
		Thread.sleep(3000);
		Telephone.click();
		Thread.sleep(3000);
		js.executeScript("arguments[0].click()", Pendingapprover);
		Thread.sleep(3000);
		js.executeScript("arguments[0].click()", approvehistory);
		Thread.sleep(3000);
		Goback.click();
		Thread.sleep(3000);
		Goback.click();
		Thread.sleep(3000);
		crtnew.click();
	}

	public void basicbuttontpage() throws InterruptedException {
		Thread.sleep(3000);
		crtnew.click();
		Thread.sleep(3000);
		Goback.click();
		Thread.sleep(3000);
		crtnew.click();
		Thread.sleep(3000);
		adding.click();
		Thread.sleep(3000);
		deleting.click();
		Thread.sleep(3000);
		save.click();
		Thread.sleep(3000);
		Alert simple = driver.switchTo().alert();
		Thread.sleep(3000);
		simple.accept();
		Sumit.click();
		Alert simple1 = driver.switchTo().alert();
		Thread.sleep(3000);
		simple1.accept();
		Thread.sleep(3000);
		exit.click();
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

	public static void alert() {

		alt = driver.switchTo().alert();
		alt.accept();

	}

	/*
	 * public void dropdown() throws InterruptedException { Thread.sleep(3000);
	 * crtnew.click(); Thread.sleep(3000); select(years, prop.getProperty("year"));
	 * Thread.sleep(3000);
	 * 
	 * System.out.println("alert"); wait = new WebDriverWait(driver, 20);
	 * 
	 * if (wait.until(ExpectedConditions.alertIsPresent()) == null) { //
	 * voice.sendKeys("lkjhg"); System.out.println("lkjhg");
	 * 
	 * } else { System.out.println("karan"); } }
	 */
	
	public void year() throws InterruptedException {
		Thread.sleep(3000);
		crtnew.click();
		Thread.sleep(3000);
		select(years, prop.getProperty("year"));
		Sumit.click();
		Thread.sleep(3000);
		Alert simple = driver.switchTo().alert();
		Thread.sleep(3000);
		simple.accept();
	}

	public void applicable() throws InterruptedException {
		Thread.sleep(3000);
		crtnew.click();
		Thread.sleep(3000);
		select(years, prop.getProperty("year"));
		Thread.sleep(3000);
		select(applicable, prop.getProperty("applicable"));
		Thread.sleep(3000);
		Sumit.click();
		Thread.sleep(3000);
		Alert simple = driver.switchTo().alert();
		Thread.sleep(3000);
		simple.accept();
	}

	public void time() throws InterruptedException {
		Thread.sleep(3000);
		crtnew.click();
		Thread.sleep(3000);
		select(years, prop.getProperty("year"));
		Thread.sleep(3000);
		select(applicable, prop.getProperty("applicable"));
		Thread.sleep(3000);
		wait(time);
		Thread.sleep(3000);
		select(time, prop.getProperty("month"));
		Thread.sleep(3000);
		Sumit.click();
		Thread.sleep(3000);
		Alert simple = driver.switchTo().alert();
		Thread.sleep(3000);
		simple.accept();

	}

	// public void invoice( String data[]) throws InterruptedException {
	public void invoice() throws InterruptedException {
		Thread.sleep(3000);
		crtnew.click();
		Thread.sleep(3000);
		select(years, prop.getProperty("year"));
		Thread.sleep(3000);
		select(applicable, prop.getProperty("applicable"));
		Thread.sleep(3000);
		wait(time);
		Thread.sleep(3000);
		select(time, prop.getProperty("month"));
		Thread.sleep(3000);
		// voice.sendKeys(data[0]);
		voice.sendKeys("EARET124");
		Thread.sleep(3000);
		as.GetScreenshot();
		Sumit.click();
		Alert simple = driver.switchTo().alert();
		simple.accept();
		Thread.sleep(3000);
		voice.clear();
		as.GetScreenshot();
		Thread.sleep(3000);
		voice.sendKeys("EARET..456");
		as.GetScreenshot();
		Thread.sleep(3000);
		voice.clear();
		Thread.sleep(3000);
		as.GetScreenshot();
		voice.sendKeys("DAR      13");
		Thread.sleep(3000);
		as.GetScreenshot();
		voice.clear();
		voice.sendKeys("EARET124");
		Sumit.click();
		Alert simple1 = driver.switchTo().alert();
		simple1.accept();
		Thread.sleep(3000);
		as.GetScreenshot();

	}

	public void dates() throws InterruptedException {
		Thread.sleep(3000);
		crtnew.click();
		Thread.sleep(3000);
		select(years, prop.getProperty("year"));
		Thread.sleep(3000);
		select(applicable, prop.getProperty("applicable"));
		Thread.sleep(3000);
		wait(time);
		Thread.sleep(3000);
		select(time, prop.getProperty("month"));
		Thread.sleep(3000);
		voice.sendKeys("EAER234");
		Thread.sleep(3000);
		dates.sendKeys("03/22/2022");
		Thread.sleep(3000);
		Sumit.click();
		Thread.sleep(3000);
		Alert simple = driver.switchTo().alert();
		Thread.sleep(3000);
		simple.accept();
	}

	public void amount() throws InterruptedException {
		Thread.sleep(3000);
		crtnew.click();
		Thread.sleep(3000);
		select(years, prop.getProperty("year"));
		Thread.sleep(3000);
		select(applicable, prop.getProperty("applicable"));
		Thread.sleep(3000);
		wait(time);
		Thread.sleep(3000);
		select(time, prop.getProperty("month"));
		Thread.sleep(3000);
		voice.sendKeys("EAER234");
		Thread.sleep(3000);
		dates.sendKeys("03/22/2022");
		Thread.sleep(3000);
		Amount.sendKeys("98567845678124");// 14values
		Thread.sleep(3000);
		Sumit.click();
		Alert simple = driver.switchTo().alert();
		simple.accept();
		Thread.sleep(3000);
		Amount.clear();
		as.GetScreenshot();
		Amount.sendKeys("986789456798.2");// 14values with dot;
		Thread.sleep(3000);
		as.GetScreenshot();
		Amount.clear();
		as.GetScreenshot();
		Thread.sleep(3000);
		Amount.sendKeys("8796784567904599");// 15 numbers
		Thread.sleep(3000);
		as.GetScreenshot();
		Amount.clear();
		as.GetScreenshot();
		Thread.sleep(3000);
		Amount.sendKeys("98678945679852");// 14values ;
		Thread.sleep(3000);
		Sumit.click();
		Alert simple1 = driver.switchTo().alert();
		simple1.accept();
		Thread.sleep(3000);
		as.GetScreenshot();

	}

	public void add() throws InterruptedException {
		Thread.sleep(3000);
		crtnew.click();
		Thread.sleep(3000);
		select(years, prop.getProperty("year"));
		Thread.sleep(3000);
		select(applicable, prop.getProperty("applicable"));
		Thread.sleep(3000);
		wait(time);
		Thread.sleep(3000);
		select(time, prop.getProperty("month"));
		Thread.sleep(3000);
		voice.sendKeys("EAER234");
		Thread.sleep(3000);
		dates.sendKeys("03/22/2022");
		Thread.sleep(3000);
		Amount.sendKeys("5000");
		Thread.sleep(3000);
		adding.click();
		Thread.sleep(3000);
		Sumit.click();
		Thread.sleep(3000);
		Alert simple = driver.switchTo().alert();
		Thread.sleep(3000);
		simple.accept();
	}

	public void delete() throws InterruptedException {
		Thread.sleep(3000);
		crtnew.click();
		Thread.sleep(3000);
		select(years, prop.getProperty("year"));
		Thread.sleep(3000);
		select(applicable, prop.getProperty("applicable"));
		Thread.sleep(3000);
		wait(time);
		Thread.sleep(3000);
		select(time, prop.getProperty("month"));
		Thread.sleep(3000);
		voice.sendKeys("EAER234");
		Thread.sleep(3000);
		dates.sendKeys("03/22/2022");
		Thread.sleep(3000);
		Amount.sendKeys("5000");
		Thread.sleep(3000);
		adding.click();
		Thread.sleep(3000);
		deleting.click();
		Thread.sleep(3000);
		Sumit.click();
		Thread.sleep(3000);
		Alert simple = driver.switchTo().alert();
		Thread.sleep(3000);
		simple.accept();
	}

	public void descriptio() throws InterruptedException {
		Thread.sleep(3000);
		crtnew.click();
		Thread.sleep(3000);
		select(years, prop.getProperty("year"));
		Thread.sleep(3000);
		select(applicable, prop.getProperty("applicable"));
		Thread.sleep(3000);
		wait(time);
		Thread.sleep(3000);
		select(time, prop.getProperty("month"));
		Thread.sleep(3000);
		voice.sendKeys("EAER234");
		Thread.sleep(3000);
		dates.sendKeys("03/22/2022");
		Thread.sleep(3000);
		// Amount.sendKeys("5000");
		Thread.sleep(3000);
		adding.click();
		Thread.sleep(3000);
		deleting.click();
		Thread.sleep(3000);
		Description.sendKeys("karthick");
		Thread.sleep(3000);
		Sumit.click();
		Thread.sleep(3000);
		Alert simple = driver.switchTo().alert();
		Thread.sleep(3000);
		simple.accept();
	}

	public void Fileupload() throws InterruptedException {
		Thread.sleep(3000);
		crtnew.click();
		Thread.sleep(3000);
		select(years, prop.getProperty("year"));
		Thread.sleep(3000);
		select(applicable, prop.getProperty("applicable"));
		Thread.sleep(3000);
		wait(time);
		Thread.sleep(3000);
		select(time, prop.getProperty("month"));
		Thread.sleep(3000);
		voice.sendKeys("EAER234");
		Thread.sleep(3000);
		dates.sendKeys("03/22/2022");
		Thread.sleep(3000);
		Amount.sendKeys("98567845678124");
		adding.click();
		Thread.sleep(3000);
		adding.click();
		Thread.sleep(3000);
		adding.click();
		Thread.sleep(3000);
		adding.click();
		Thread.sleep(3000);
		adding.click();
		Thread.sleep(3000);
		deleting.click();
		Thread.sleep(3000);
		adding.click();
		Thread.sleep(3000);
		deleting.click();
		Thread.sleep(3000);
		// adding.click();
		Thread.sleep(3000);
		Description.sendKeys("karthick");
		Thread.sleep(3000);
		fileupload1.sendKeys("C:\\Users\\soumya_hugar\\Desktop\\Upload files\\File1.pdf");
		Thread.sleep(3000);
		fileupload2.sendKeys("C:\\Users\\soumya_hugar\\Desktop\\Upload files\\File2.jpg");
		Thread.sleep(3000);
		fileupload3.sendKeys("C:\\Users\\soumya_hugar\\Desktop\\Upload files\\File3.docx");
		Thread.sleep(3000);
		fileupload4.sendKeys("C:\\Users\\soumya_hugar\\Desktop\\Upload files\\File4.xlsx");
		Thread.sleep(3000);
		fileupload5.sendKeys("C:\\Users\\soumya_hugar\\Desktop\\Upload files\\File5.png");
		Thread.sleep(3000);
	}

	public void totaldetailscancel() throws InterruptedException {
		Thread.sleep(3000);
		crtnew.click();
		Thread.sleep(3000);
		select(years, prop.getProperty("year"));
		Thread.sleep(3000);
		select(applicable, prop.getProperty("applicable"));
		Thread.sleep(3000);
		wait(time);
		Thread.sleep(3000);
		select(time, prop.getProperty("month"));
		Thread.sleep(3000);
		voice.sendKeys("EAER234");
		Thread.sleep(3000);
		dates.sendKeys("03/22/2022");
		Thread.sleep(3000);
		Amount.sendKeys("98567845678124");
		adding.click();
		Thread.sleep(3000);
		adding.click();
		Thread.sleep(3000);
		adding.click();
		Thread.sleep(3000);
		adding.click();
		Thread.sleep(3000);
		adding.click();
		Thread.sleep(3000);
		deleting.click();
		Thread.sleep(3000);
		adding.click();
		Thread.sleep(3000);
		deleting.click();
		Thread.sleep(3000);
		// adding.click();
		Thread.sleep(3000);
		Description.sendKeys("karthick");
		Thread.sleep(3000);
		fileupload1.sendKeys("C:\\Users\\soumya_hugar\\Desktop\\Upload files\\File1.pdf");
		Thread.sleep(3000);
		fileupload2.sendKeys("C:\\Users\\soumya_hugar\\Desktop\\Upload files\\File2.jpg");
		Thread.sleep(3000);
		fileupload3.sendKeys("C:\\Users\\soumya_hugar\\Desktop\\Upload files\\File3.docx");
		Thread.sleep(3000);
		fileupload4.sendKeys("C:\\Users\\soumya_hugar\\Desktop\\Upload files\\File4.xlsx");
		Thread.sleep(3000);
		fileupload5.sendKeys("C:\\Users\\soumya_hugar\\Desktop\\Upload files\\File5.png");
		Thread.sleep(3000);
		exit.click();
	}

	public void filesave() throws InterruptedException {
		Thread.sleep(3000);
		crtnew.click();
		Thread.sleep(3000);
		select(years, prop.getProperty("year"));
		Thread.sleep(3000);
		select(applicable, prop.getProperty("applicable"));
		Thread.sleep(3000);
		wait(time);
		Thread.sleep(3000);
		select(time, prop.getProperty("month"));
		Thread.sleep(3000);
		voice.sendKeys("EAER234");
		Thread.sleep(3000);
		dates.sendKeys("03/22/2022");
		Thread.sleep(3000);
		Amount.sendKeys("98567845678124");
		Thread.sleep(3000);
		adding.click();
		Thread.sleep(3000);
		adding.click();
		Thread.sleep(3000);
		adding.click();
		Thread.sleep(3000);
		adding.click();
		Thread.sleep(3000);
		adding.click();
		Thread.sleep(3000);
		deleting.click();
		Thread.sleep(3000);
		adding.click();
		Thread.sleep(3000);
		deleting.click();
		Thread.sleep(3000);
		// adding.click();
		Thread.sleep(3000);
		Description.sendKeys("karthick");
		Thread.sleep(3000);
		fileupload1.sendKeys("C:\\Users\\soumya_hugar\\Desktop\\Upload files\\File1.pdf");
		Thread.sleep(3000);
		fileupload2.sendKeys("C:\\Users\\soumya_hugar\\Desktop\\Upload files\\File2.jpg");
		Thread.sleep(3000);
		fileupload3.sendKeys("C:\\Users\\soumya_hugar\\Desktop\\Upload files\\File3.docx");
		Thread.sleep(3000);
		fileupload4.sendKeys("C:\\Users\\soumya_hugar\\Desktop\\Upload files\\File4.xlsx");
		Thread.sleep(3000);
		fileupload5.sendKeys("C:\\Users\\soumya_hugar\\Desktop\\Upload files\\File5.png");
		Thread.sleep(3000);
		save.click();

		Alert simple = driver.switchTo().alert();
		Thread.sleep(3000);
		simple.accept();
		Thread.sleep(3000);

	}

	public void editupload() throws InterruptedException {
		Thread.sleep(3000);
		edit.click();
		Thread.sleep(3000);
		editupload.sendKeys("C:\\\\Users\\\\soumya_hugar\\\\Desktop\\\\Upload files\\\\File3.docx");
		as.GetScreenshot();
		Thread.sleep(3000);
		Update.click();
		Alert simple = driver.switchTo().alert();
		Thread.sleep(3000);
		simple.accept();
		Thread.sleep(3000);
	}

	public void finalsumit() throws InterruptedException {
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

	public void viewthepage() throws InterruptedException {
		Thread.sleep(3000);
		Show.click();
		Thread.sleep(3000);
	}

	public void quitformpage() throws InterruptedException {
		Thread.sleep(3000);
		Quit.click();
		Thread.sleep(3000);
		Alert simple = driver.switchTo().alert();
		Thread.sleep(3000);
		simple.accept();
		Thread.sleep(3000);
	}

	public void frontdelete1() throws InterruptedException {
		Thread.sleep(3000);
		Frontdelete.click();
		Thread.sleep(3000);
		Alert simple = driver.switchTo().alert();
		Thread.sleep(3000);
		simple.accept();
		Thread.sleep(3000);
	}

	public void againcreateform() throws InterruptedException {
		Thread.sleep(3000);
		crtnew.click();
		Thread.sleep(3000);
		select(years, prop.getProperty("year"));
		Thread.sleep(3000);
		select(applicable, prop.getProperty("applicable"));
		Thread.sleep(3000);
		wait(time);
		Thread.sleep(3000);
		select(time, prop.getProperty("month"));
		Thread.sleep(3000);
		voice.sendKeys("EAER234");
		Thread.sleep(3000);
		dates.sendKeys("03/22/2022");
		Thread.sleep(3000);
		Amount.sendKeys("98567845678124");
		adding.click();
		Thread.sleep(3000);
		adding.click();
		Thread.sleep(3000);
		adding.click();
		Thread.sleep(3000);
		adding.click();
		Thread.sleep(3000);
		adding.click();
		Thread.sleep(3000);
		deleting.click();
		Thread.sleep(3000);
		adding.click();
		Thread.sleep(3000);
		deleting.click();
		Thread.sleep(3000);
		// adding.click();
		Thread.sleep(3000);
		Description.sendKeys("karthick");
		Thread.sleep(3000);
		fileupload1.sendKeys("C:\\Users\\soumya_hugar\\Desktop\\Upload files\\File1.pdf");
		Thread.sleep(3000);
		fileupload2.sendKeys("C:\\Users\\soumya_hugar\\Desktop\\Upload files\\File2.jpg");
		Thread.sleep(3000);
		fileupload3.sendKeys("C:\\Users\\soumya_hugar\\Desktop\\Upload files\\File3.docx");
		Thread.sleep(3000);
		fileupload4.sendKeys("C:\\Users\\soumya_hugar\\Desktop\\Upload files\\File4.xlsx");
		Thread.sleep(3000);
		fileupload5.sendKeys("C:\\Users\\soumya_hugar\\Desktop\\Upload files\\File5.png");
		Thread.sleep(3000);
		Sumit.click();
		Alert simple = driver.switchTo().alert();
		Thread.sleep(3000);
		simple.accept();
		Thread.sleep(3000);
	}

}
