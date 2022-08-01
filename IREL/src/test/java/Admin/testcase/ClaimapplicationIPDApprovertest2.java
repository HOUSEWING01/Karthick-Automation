package Admin.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import IREL.Base.testbase;
import IREL.Commonutility.Actionscreenshot;
import IREL.Pages.ClaimapplicationIPDApproverpage2;
import IREL.Pages.ClaimapplicationOPDApproverpage2;
import IREL.Pages.Loginpage;

public class ClaimapplicationIPDApprovertest2 extends testbase {
	Loginpage lp;
	ClaimapplicationIPDApproverpage2 Caia2;
	Actionscreenshot As;

	public ClaimapplicationIPDApprovertest2() {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		initilization();
		lp = new Loginpage();
		Caia2 = new ClaimapplicationIPDApproverpage2();
		Thread.sleep(3000);
		lp.applogin(prop.getProperty("UserName2"), prop.getProperty("Password2"));
		Caia2.reimbclick();
	}
	@Test(priority = 1)
	public void approverhistorytest() throws InterruptedException {
		Caia2.approverhistory();
	}

	@Test(priority = 2)
	public void finalapproveformtest() throws InterruptedException {
		Caia2.finalapproveform();
	}
	@AfterMethod
	public void quit() {
		driver.quit();
	}

}
