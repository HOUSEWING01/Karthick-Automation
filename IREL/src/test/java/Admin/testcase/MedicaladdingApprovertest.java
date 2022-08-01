package Admin.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import IREL.Base.testbase;
import IREL.Commonutility.Actionscreenshot;
import IREL.Pages.Loginpage;
import IREL.Pages.MedicaladdingApproverpage;
import IREL.Pages.Telephoneapproverpage;

public class MedicaladdingApprovertest extends testbase {
	@RunAll

	Loginpage lp;
	MedicaladdingApproverpage Ma;
	Actionscreenshot As;

	public MedicaladdingApprovertest() {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		initilization();
		lp = new Loginpage();
		Ma = new MedicaladdingApproverpage();
		Thread.sleep(3000);
		lp.applogin(prop.getProperty("UserName2"), prop.getProperty("Password2"));
		Ma.reimbclick();

	}

	@Test(priority = 1)
	public void approverhistorytest() throws InterruptedException {
		Ma.approverhistory();
	}

	@Test(priority = 2)
	public void remarktest() throws InterruptedException {
		Ma.remark();

	}

	@Test(priority = 3)
	public void rejectformtest() throws InterruptedException {
		Ma.rejectform();

	}

	@Test(priority = 4)
	public void resetformtest() throws InterruptedException {
		Ma.reset();

	}

	@Test(priority = 5)
	public void finalrejectformtest() throws InterruptedException {
		Ma.finalrejectform();
	}
	@AfterMethod
	public void quit() {
		driver.quit();
	}
}
