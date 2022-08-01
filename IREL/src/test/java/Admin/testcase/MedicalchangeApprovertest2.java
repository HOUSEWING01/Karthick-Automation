package Admin.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import IREL.Base.testbase;
import IREL.Commonutility.Actionscreenshot;
import IREL.Pages.Loginpage;
import IREL.Pages.MedicaladdingApproverpage2;
import IREL.Pages.MedicalchangeApproverpage2;

public class MedicalchangeApprovertest2  extends testbase{
	Loginpage lp;
	MedicalchangeApproverpage2 Mca2;
	Actionscreenshot As;

	public  MedicalchangeApprovertest2() {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		initilization();
		lp = new Loginpage();
		Mca2 = new  MedicalchangeApproverpage2 ();
		Thread.sleep(3000);
		lp.applogin(prop.getProperty("UserName2"), prop.getProperty("Password2"));
		Mca2.reimbclick();

	}

	@Test(priority = 1)
	public void approverhistorytest() throws InterruptedException {
		Mca2.approverhistory();
	}

	@Test(priority = 2)
	public void finalapproveformtest() throws InterruptedException {
		Mca2.finalapproveform();
	}
	@AfterMethod
	public void quit() {
		driver.quit();
	}


}
