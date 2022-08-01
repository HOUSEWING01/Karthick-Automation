package Admin.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import IREL.Base.testbase;
import IREL.Commonutility.Actionscreenshot;
import IREL.Pages.ClaimapplicationIPDApproverpage;
import IREL.Pages.ClaimapplicationOPDApproverpage;
import IREL.Pages.Loginpage;

public class ClaimapplicationIPDApprovertest extends testbase {
	Loginpage lp;
	ClaimapplicationIPDApproverpage Caia;
	Actionscreenshot As;

	public ClaimapplicationIPDApprovertest() {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		initilization();
		lp = new Loginpage();
		Caia = new ClaimapplicationIPDApproverpage();
		Thread.sleep(3000);
		lp.applogin(prop.getProperty("UserName2"), prop.getProperty("Password2"));
		Caia.reimbclick();
	}

	@Test(priority = 1)
	public void approverhistorytest() throws InterruptedException {
		Caia.approverhistory();
	}

	@Test(priority = 2)
	public void remarktest() throws InterruptedException {
		Caia.remark();

	}

	@Test(priority = 3)
	public void rejectformtest() throws InterruptedException {
		Caia.rejectform();

	}

	@Test(priority = 4)
	public void resetformtest() throws InterruptedException {
		Caia.reset();

	}

	@Test(priority = 5)
	public void finalrejectformtest() throws InterruptedException {
		Caia.finalrejectform();
	}

	@AfterMethod
	public void quit() {
		driver.quit();
	}


}
