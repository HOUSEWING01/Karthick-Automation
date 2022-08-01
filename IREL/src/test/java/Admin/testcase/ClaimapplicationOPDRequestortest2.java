package Admin.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import IREL.Base.testbase;
import IREL.Commonutility.Actionscreenshot;
import IREL.Pages.ClaimapplicationOPDRequestorpage2;
import IREL.Pages.ClaimintimationRequestorpage2;
import IREL.Pages.Loginpage;

public class ClaimapplicationOPDRequestortest2 extends testbase {
	Loginpage lp;
	ClaimapplicationOPDRequestorpage2 Car2;
	Actionscreenshot as;

	public ClaimapplicationOPDRequestortest2() {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		initilization();
		lp = new Loginpage();
		Car2 = new ClaimapplicationOPDRequestorpage2();
		as = new Actionscreenshot();
		lp.applogin(prop.getProperty("UserName1"), prop.getProperty("Password1"));
		Car2.reimbclick();
	}
	
	@Test(priority = 1)
	public void  ClaimIntimationtest()throws InterruptedException {
	Car2.ClaimIntimation();
	}
	

	@Test(priority = 2)
	public void edittest() throws InterruptedException {
		Car2.edit();
		
    }
	@Test(priority = 3)
	public void submittest()throws InterruptedException {
		Car2.submit();
       
    }
	
	@AfterMethod
	public void quit() {
		driver.quit();
	}
	
	

}
