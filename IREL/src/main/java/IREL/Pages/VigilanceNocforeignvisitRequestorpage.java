package IREL.Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import IREL.Base.testbase;

public class VigilanceNocforeignvisitRequestorpage extends testbase {
	JavascriptExecutor js;
	@FindBy(xpath = "//a[contains(text(),'Vigilance')]")
	WebElement Vigilance;
	@FindBy(xpath = "//a[contains(text(),'New Forms')]")
	WebElement Newform;
	@FindBy(xpath = "//a[contains(text(),'Go Back')]")
	WebElement Goback;
	@FindBy(xpath = "//*[@id=\"screenlet_1_col\"]/div/table/tbody/tr/td/a[1]/h2")
	WebElement Nocpassport;
	@FindBy(xpath = "//*[@id=\"screenlet_1_col\"]/div/table/tbody/tr/td/a[3]/h2")
	WebElement Nocforeignvisit;
	@FindBy(xpath = "//input[@name='dateOfJoinGrade']")
	WebElement Dateofjoin;
	@FindBy(xpath = "//input[@name='contact']")
	WebElement Contact;
	@FindBy(xpath = "//input[@name='passport']")
	WebElement Passport;
	@FindBy(xpath = "//input[@name='finance']")
	WebElement Finance;
	@FindBy(xpath = "//input[@name='periodFrom']")
	WebElement periodFrom;
	@FindBy(xpath = "//input[@name='periodTo']")
	WebElement periodTo;
	WebElement experience;
	@FindBy(xpath = "//input[@name='nocReqDate']")
	WebElement NocDate;
	@FindBy(xpath = "//input[@name='lastDateNOC']")
	WebElement LastDate;
	@FindBy(xpath = "//input[@name='ePFBalance']")
	WebElement Epfbalance;
	@FindBy(xpath = "//select[@name='purposeOfV']")
	WebElement Purposevisit;
	@FindBy(xpath = "//textarea[@name='permanentAdd']")
	WebElement permanentAdd;
	@FindBy(xpath = "//textarea[@name='countryV']")
	WebElement countryV;
	@FindBy(xpath = "//textarea[@name='personV']")
	WebElement NAMEofperson;
	@FindBy(xpath = "//textarea[@name='arrangement']")
	WebElement arrangement;
	@FindBy(xpath = "//textarea[@name='expenditure']")
	WebElement expenditure;
	@FindBy(xpath = "//input[@type='checkbox']")
	WebElement declaration;
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

	public VigilanceNocforeignvisitRequestorpage() {
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
		Nocforeignvisit.click();
		Thread.sleep(3000);
		Goback.click();
		Thread.sleep(3000);
	}

	public void Nocforeigncancel() throws InterruptedException {
		Thread.sleep(3000);
		Nocpassport.click();
		Thread.sleep(3000);
		Newform.click();
		Thread.sleep(3000);
		Nocforeignvisit.click();
		Thread.sleep(3000);
		Contact.sendKeys("8756785678");
		Thread.sleep(3000);
		Passport.sendKeys("EART4575");
		Thread.sleep(3000);
		Finance.sendKeys("Bankloan");
		Thread.sleep(3000);
		periodFrom.sendKeys("05/22/2022");
		Thread.sleep(9000);
		//periodTo.sendKeys("22/06/2022");
		Thread.sleep(3000);
		NocDate.sendKeys("06/24/2022");
		Thread.sleep(3000);
		LastDate.sendKeys("08/25/2022");
		Thread.sleep(3000);
		Epfbalance.sendKeys("1000");
		Thread.sleep(3000);
		Purposevisit.sendKeys("office work");
		Thread.sleep(3000);
		permanentAdd.sendKeys("Near KNVS ");
		Thread.sleep(3000);
		countryV.sendKeys("Italy");
		Thread.sleep(3000);
		NAMEofperson.sendKeys("Jackson");
		Thread.sleep(3000);
		arrangement.sendKeys("Hotel");
		Thread.sleep(3000);
		expenditure.sendKeys("10000");
		Thread.sleep(3000);
		declaration.click();
		Thread.sleep(3000);
		Cancel.click();
		Thread.sleep(3000);
	}

	public void Nocforeignsubmit() throws InterruptedException {
		Thread.sleep(3000);
		Nocpassport.click();
		Thread.sleep(3000);
		Newform.click();
		Thread.sleep(3000);
		Nocforeignvisit.click();
		Thread.sleep(3000);
		Contact.sendKeys("8756785678");
		Thread.sleep(3000);
		Passport.sendKeys("EART4575");
		Thread.sleep(3000);
		Finance.sendKeys("Bankloan");
		Thread.sleep(3000);
		periodFrom.sendKeys("05/22/2022");
		Thread.sleep(9000);
		//periodTo.sendKeys("06/22/2022");
		Thread.sleep(3000);
		NocDate.sendKeys("07/22/2022");
		Thread.sleep(3000);
		LastDate.sendKeys("08/22/2022");
		Thread.sleep(3000);
		Epfbalance.sendKeys("1000");
		Thread.sleep(3000);
		Purposevisit.sendKeys("office work");
		Thread.sleep(3000);
		permanentAdd.sendKeys("Near KNVS ");
		Thread.sleep(3000);
		countryV.sendKeys("Italy");
		Thread.sleep(3000);
		NAMEofperson.sendKeys("Jackson");
		Thread.sleep(3000);
		arrangement.sendKeys("Hotel");
		Thread.sleep(3000);
		expenditure.sendKeys("10000");
		Thread.sleep(3000);
		declaration.click();
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
		Nocforeignvisit.click();
		Thread.sleep(3000);
		Contact.sendKeys("8756785678");
		Thread.sleep(3000);
		Passport.sendKeys("EART4575");
		Thread.sleep(3000);
		Finance.sendKeys("Bankloan");
		Thread.sleep(3000);
		periodFrom.sendKeys("05/22/2022");
		Thread.sleep(9000);
		//periodTo.sendKeys("06/22/2022");
		Thread.sleep(3000);
		NocDate.sendKeys("07/22/2022");
		Thread.sleep(3000);
		LastDate.sendKeys("08/22/2022");
		Thread.sleep(3000);
		Epfbalance.sendKeys("1000");
		Thread.sleep(3000);
		Purposevisit.sendKeys("office work");
		Thread.sleep(3000);
		permanentAdd.sendKeys("Near KNVS ");
		Thread.sleep(3000);
		countryV.sendKeys("Italy");
		Thread.sleep(3000);
		NAMEofperson.sendKeys("Jackson");
		Thread.sleep(3000);
		arrangement.sendKeys("Hotel");
		Thread.sleep(3000);
		expenditure.sendKeys("10000");
		Thread.sleep(3000);
		declaration.click();
		Thread.sleep(3000);
		Submit.click();
		Thread.sleep(3000);
	}
}
