package Admin.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import IREL.Base.testbase;
import IREL.Commonutility.Actionscreenshot;
import IREL.Pages.ClaimapplicationIPDRequestorpage2;
import IREL.Pages.ClaimapplicationOPDRequestorpage2;
import IREL.Pages.Loginpage;

public class ClaimapplicationIPDRequestortest2  extends testbase{

	Loginpage lp;
	ClaimapplicationIPDRequestorpage2 Cair2;
	Actionscreenshot as;

	public ClaimapplicationIPDRequestortest2() {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		initilization();
		lp = new Loginpage();
		Cair2 = new ClaimapplicationIPDRequestorpage2();
		as = new Actionscreenshot();
		lp.applogin(prop.getProperty("UserName1"), prop.getProperty("Password1"));
		Cair2.reimbclick();
	}
	
	@Test(priority = 1)
	public void  ClaimIntimationtest()throws InterruptedException {
	Cair2.ClaimIntimation();
	}
	

	@Test(priority = 2)
	public void edittest() throws InterruptedException {
		Cair2.edit();
		
    }
	@Test(priority = 3)
	public void submittest()throws InterruptedException {
		Cair2.submit();
       
    }
	
	@AfterMethod
	public void quit() {
		driver.quit();
	}
	
}
