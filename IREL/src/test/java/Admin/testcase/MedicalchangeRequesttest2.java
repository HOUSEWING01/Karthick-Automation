package Admin.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import IREL.Base.testbase;
import IREL.Commonutility.Actionscreenshot;
import IREL.Pages.Loginpage;
import IREL.Pages.MedicalchangeRequestorpage2;

;

public class MedicalchangeRequesttest2 extends testbase {
	
	Loginpage lp;
	MedicalchangeRequestorpage2 Mcr2;
	Actionscreenshot as;

	public MedicalchangeRequesttest2() {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		initilization();
		lp = new Loginpage();
		Mcr2 = new MedicalchangeRequestorpage2();
		as = new Actionscreenshot();
		lp.applogin(prop.getProperty("UserName1"), prop.getProperty("Password1"));
		Mcr2.reimbclick();

	}
	
	@Test(priority = 1)
	public void  changedependenttest()throws InterruptedException {
	Mcr2.changedependent();
	}
	

	@Test(priority = 2)
	public void edittest() throws InterruptedException {
		Mcr2.edit();
		
    }
	@Test(priority = 3)
	public void submittest()throws InterruptedException {
		Mcr2.submit();
       
    }
	
	@AfterMethod
	public void quit() {
		driver.quit();
	}
	

}
