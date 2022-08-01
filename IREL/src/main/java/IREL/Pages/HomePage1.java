package IREL.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import IREL.Base.testbase;

public class HomePage1 extends testbase {
	JavascriptExecutor js;
	@FindBy(xpath = " //a[contains(text(),'Employees')]")
	WebElement employee;
	@FindBy(css = " input.ui-autocomplete-input")
	WebElement perempcde;
	@FindBy(xpath = " //a[contains(text(),'8800673')]")
	WebElement empcde;

	public HomePage1() {
		PageFactory.initElements(driver, this);

	}

	public void employeeclick() {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", employee);
	}
	public void enterdata() {
		perempcde.sendKeys("8800673");
		
		
	}
	public void clickemp() {
		empcde.click();
	}

}
