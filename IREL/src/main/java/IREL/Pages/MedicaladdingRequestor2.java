package IREL.Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import IREL.Base.testbase;

public class MedicaladdingRequestor2 extends testbase {

	JavascriptExecutor js;
	@FindBy(xpath = "//a[contains(text(),' Reimbursement')]")
	WebElement reimb;
	@FindBy(xpath = "//a[contains(text(),' Adding Dependent Family Member Detail Requests')]")
	WebElement addigdependent;
	@FindBy(linkText = "Edit")
	WebElement edit;
	@FindBy(linkText = "Medical")
	WebElement medical;
	@FindBy(linkText = "Adding Dependent Family Member")
	WebElement addingdependent;
	@FindBy(xpath = "//input[@value='Submit']")
	WebElement Submit;

	public MedicaladdingRequestor2() {
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

	}

	public void addigdependent() throws InterruptedException {
		Thread.sleep(3000);
		addigdependent.click();
		Thread.sleep(3000);

	}

	public void edit() throws InterruptedException {
		Thread.sleep(3000);
		addigdependent.click();
		Thread.sleep(3000);
		edit.click();
		Thread.sleep(3000);

	}

	public void submit() throws InterruptedException {
		Thread.sleep(3000);
		addigdependent.click();
		Thread.sleep(3000);
		edit.click();
		Thread.sleep(3000);
		Submit.click();
		Thread.sleep(3000);
		Alert simple = driver.switchTo().alert();
		Thread.sleep(3000);
		simple.accept();
		Thread.sleep(3000);
	}

}
