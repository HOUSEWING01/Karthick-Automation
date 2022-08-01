package Admin.testcase;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import IREL.Base.testbase;
import IREL.Commonutility.Actionscreenshot;
import IREL.Pages.HomePage1;
import IREL.Pages.Loginpage;

public class EmployeePage1test extends testbase {
	Loginpage lp;
	HomePage1 hp1;
	Actions act;
	Actionscreenshot As;

	public EmployeePage1test() {
		super();
	}

	@BeforeClass

	public void setup() {
		initilization();
		lp = new Loginpage();
		hp1 = new HomePage1();
		As=new Actionscreenshot();
		lp.applogin(prop.getProperty("UserName"), prop.getProperty("Password"));
	}
    @Test(priority =1 )
	public void employeeselection() {
    	hp1.employeeclick();
    	As.GetScreenshot();
    }
	
	@Test(priority = 1)
	public void employee() {
		hp1.employeeclick();
		act = new Actions(driver);
		As.GetScreenshot();
    }

	@Test(priority = 2)
	public void Employeenumber() {
		hp1.enterdata();
		As.GetScreenshot();
	}

	@Test(priority = 3)
	public void clickingemployee() {
		hp1.clickemp();
		act.sendKeys(Keys.ENTER).perform();
		As.GetScreenshot();
	}

}
