package Admin.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import IREL.Base.testbase;
import IREL.Commonutility.Actionscreenshot;
import IREL.Pages.ClaimintimationRequestorpage;
import IREL.Pages.ClaimintimationRequestorpage2;
import IREL.Pages.Loginpage;

public class ClaimintimationRequesttest2 extends  testbase{
	Loginpage lp;
	ClaimintimationRequestorpage2 Cir2;
	Actionscreenshot as;

	public ClaimintimationRequesttest2() {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		initilization();
		lp = new Loginpage();
		Cir2 = new ClaimintimationRequestorpage2();
		as = new Actionscreenshot();
		lp.applogin(prop.getProperty("UserName1"), prop.getProperty("Password1"));
		Cir2.reimbclick();
	}
	
	@Test(priority = 1)
	public void  ClaimIntimationtest()throws InterruptedException {
	Cir2.ClaimIntimation();
	}
	

	@Test(priority = 2)
	public void edittest() throws InterruptedException {
		Cir2.edit();
		
    }
	@Test(priority = 3)
	public void submittest()throws InterruptedException {
		Cir2.submit();
       
    }
	
	@AfterMethod
	public void quit() {
		driver.quit();
	}
	
	
	
	
	

}
