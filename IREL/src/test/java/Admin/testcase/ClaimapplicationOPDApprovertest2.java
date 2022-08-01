package Admin.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import IREL.Base.testbase;
import IREL.Commonutility.Actionscreenshot;
import IREL.Pages.ClaimapplicationOPDApproverpage2;
import IREL.Pages.ClaimintimationApproverpage2;
import IREL.Pages.Loginpage;

public class ClaimapplicationOPDApprovertest2 extends testbase {
	Loginpage lp;
	ClaimapplicationOPDApproverpage2 Caa2;
	Actionscreenshot As;

	public ClaimapplicationOPDApprovertest2() {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		initilization();
		lp = new Loginpage();
		Caa2 = new ClaimapplicationOPDApproverpage2();
		Thread.sleep(3000);
		lp.applogin(prop.getProperty("UserName2"), prop.getProperty("Password2"));
		Caa2.reimbclick();
	}
	@Test(priority = 1)
	public void approverhistorytest() throws InterruptedException {
		Caa2.approverhistory();
	}

	@Test(priority = 2)
	public void finalapproveformtest() throws InterruptedException {
		Caa2.finalapproveform();
	}
	@AfterMethod
	public void quit() {
		driver.quit();
	}



}
