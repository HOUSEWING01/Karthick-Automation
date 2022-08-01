package Admin.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import IREL.Base.testbase;
import IREL.Commonutility.Actionscreenshot;
import IREL.Pages.ClaimintimationApproverpage;
import IREL.Pages.Loginpage;
import IREL.Pages.MedicaladdingApproverpage;

public class ClaimintimationApprovertest extends testbase {
	Loginpage lp;
	ClaimintimationApproverpage Cia;
	Actionscreenshot As;

	public ClaimintimationApprovertest() {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		initilization();
		lp = new Loginpage();
		Cia = new ClaimintimationApproverpage();
		Thread.sleep(3000);
		lp.applogin(prop.getProperty("UserName2"), prop.getProperty("Password2"));
		Cia.reimbclick();
	}

	@Test(priority = 1)
	public void approverhistorytest() throws InterruptedException {
		Cia.approverhistory();
	}

	@Test(priority = 2)
	public void remarktest() throws InterruptedException {
		Cia.remark();

	}

	@Test(priority = 3)
	public void rejectformtest() throws InterruptedException {
		Cia.rejectform();

	}

	@Test(priority = 4)
	public void resetformtest() throws InterruptedException {
		Cia.reset();

	}

	@Test(priority = 5)
	public void finalrejectformtest() throws InterruptedException {
		Cia.finalrejectform();
	}

	@AfterMethod
	public void quit() {
		driver.quit();
	}

}
