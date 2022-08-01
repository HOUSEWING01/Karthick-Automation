package IREL.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import IREL.Base.testbase;

public class Loginpage extends testbase {
	@FindBy(xpath = "//img[@alt='OFBiz: Web Tools']")
	WebElement checkforlogo;
	@FindBy(xpath = " //h3[contains(text(),'Login')]")
	WebElement formtitle;
	@FindBy(name = "USERNAME")
	WebElement login;
	@FindBy(name = "PASSWORD")
	WebElement passwrd;
	@FindBy(xpath = " //input[@type='submit']")
	WebElement submit;

	// intilization
	public Loginpage() {
		PageFactory.initElements(driver, this);

	}

	public String getpagetitle() {
		return driver.getTitle();
	}

	public boolean logo() {
		return checkforlogo.isDisplayed();

	}

	public String getformtext() {
		return formtitle.getText();

	}

	public HomePage1 applogin(String usname, String pass)  {
		// Entering the data
	
		login.sendKeys(usname);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		passwrd.sendKeys(pass);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		submit.click();
		return new HomePage1();

	}
}
