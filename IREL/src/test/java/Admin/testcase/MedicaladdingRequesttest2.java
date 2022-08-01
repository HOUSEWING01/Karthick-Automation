package Admin.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import IREL.Base.testbase;
import IREL.Commonutility.Actionscreenshot;
import IREL.Pages.Loginpage;
import IREL.Pages.MedicaladdingRequestor2;
import IREL.Pages.MedicaladdingRequestorpage;

public class MedicaladdingRequesttest2  extends testbase {
	
	Loginpage lp;
	MedicaladdingRequestor2 Mar2;
	Actionscreenshot as;

	public MedicaladdingRequesttest2() {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		initilization();
		lp = new Loginpage();
		Mar2 = new MedicaladdingRequestor2();
		as = new Actionscreenshot();
		lp.applogin(prop.getProperty("UserName1"), prop.getProperty("Password1"));
		Mar2.reimbclick();

	}
	
	@Test(priority = 1)
	public void  addigdependenttest()throws InterruptedException {
	Mar2.addigdependent();
	}
	

	@Test(priority = 2)
	public void edittest() throws InterruptedException {
		Mar2.edit();
		
    }
	@Test(priority = 3)
	public void submittest()throws InterruptedException {
		Mar2.submit();
       
    }
	
	@AfterMethod
	public void quit() {
		driver.quit();
	}
	
	

}
