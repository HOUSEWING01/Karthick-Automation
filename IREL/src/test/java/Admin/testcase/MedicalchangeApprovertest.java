package Admin.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import IREL.Base.testbase;
import IREL.Commonutility.Actionscreenshot;
import IREL.Pages.Loginpage;
import IREL.Pages.MedicaladdingApproverpage;
import IREL.Pages.MedicalchangeApproverpage;

public class MedicalchangeApprovertest extends testbase{
	

	Loginpage lp;
	MedicalchangeApproverpage Mca;
	Actionscreenshot As;

	public MedicalchangeApprovertest() {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		initilization();
		lp = new Loginpage();
		Mca = new MedicalchangeApproverpage();
		Thread.sleep(3000);
		lp.applogin(prop.getProperty("UserName2"), prop.getProperty("Password2"));
		Mca.reimbclick();

	}

	@Test(priority = 1)
	public void approverhistorytest() throws InterruptedException {
		Mca.approverhistory();
	}

	@Test(priority = 2)
	public void remarktest() throws InterruptedException {
		Mca.remark();

	}

	@Test(priority = 3)
	public void rejectformtest() throws InterruptedException {
		Mca.rejectform();

	}

	@Test(priority = 4)
	public void resetformtest() throws InterruptedException {
		Mca.reset();

	}

	@Test(priority = 5)
	public void finalrejectformtest() throws InterruptedException {
		Mca.finalrejectform();
	}
	@AfterMethod
	public void quit() {
		driver.quit();
	}
	
	

}
