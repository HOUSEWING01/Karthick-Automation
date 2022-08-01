package Admin.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import IREL.Base.testbase;
import IREL.Commonutility.Actionscreenshot;
import IREL.Pages.ClaimapplicationOPDApproverpage;
import IREL.Pages.ClaimintimationApproverpage;
import IREL.Pages.Loginpage;

public class ClaimapplicationOPDApprovertest extends testbase {
	Loginpage lp;
	ClaimapplicationOPDApproverpage Caa;
	Actionscreenshot As;

	public ClaimapplicationOPDApprovertest() {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		initilization();
		lp = new Loginpage();
		Caa = new ClaimapplicationOPDApproverpage();
		Thread.sleep(3000);
		lp.applogin(prop.getProperty("UserName2"), prop.getProperty("Password2"));
		Caa.reimbclick();
	}

	@Test(priority = 1)
	public void approverhistorytest() throws InterruptedException {
		Caa.approverhistory();
	}

	@Test(priority = 2)
	public void remarktest() throws InterruptedException {
		Caa.remark();

	}

	@Test(priority = 3)
	public void rejectformtest() throws InterruptedException {
		Caa.rejectform();

	}

	@Test(priority = 4)
	public void resetformtest() throws InterruptedException {
		Caa.reset();

	}

	@Test(priority = 5)
	public void finalrejectformtest() throws InterruptedException {
		Caa.finalrejectform();
	}

	@AfterMethod
	public void quit() {
		driver.quit();
	}


}
