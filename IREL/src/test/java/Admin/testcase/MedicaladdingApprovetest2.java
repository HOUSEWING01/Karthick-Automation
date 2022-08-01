package Admin.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import IREL.Base.testbase;
import IREL.Commonutility.Actionscreenshot;
import IREL.Pages.Loginpage;
import IREL.Pages.MedicaladdingApproverpage;
import IREL.Pages.MedicaladdingApproverpage2;

public class MedicaladdingApprovetest2 extends testbase {
	Loginpage lp;
	MedicaladdingApproverpage2 Ma2;
	Actionscreenshot As;

	public MedicaladdingApprovetest2() {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		initilization();
		lp = new Loginpage();
		Ma2 = new MedicaladdingApproverpage2();
		Thread.sleep(3000);
		lp.applogin(prop.getProperty("UserName2"), prop.getProperty("Password2"));
		Ma2.reimbclick();

	}

	@Test(priority = 1)
	public void approverhistorytest() throws InterruptedException {
		Ma2.approverhistory();
	}

	@Test(priority = 2)
	public void finalapproveformtest() throws InterruptedException {
		Ma2.finalapproveform();
	}
	@AfterMethod
	public void quit() {
		driver.quit();
	}

}
