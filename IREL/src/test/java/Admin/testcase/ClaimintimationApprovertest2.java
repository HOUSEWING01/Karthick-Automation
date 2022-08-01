package Admin.testcase;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import IREL.Base.testbase;
import IREL.Commonutility.Actionscreenshot;
import IREL.Pages.ClaimintimationApproverpage;
import IREL.Pages.ClaimintimationApproverpage2;
import IREL.Pages.Loginpage;

public class ClaimintimationApprovertest2 extends testbase {
	
	Loginpage lp;
	ClaimintimationApproverpage2 Cia2;
	Actionscreenshot As;

	public ClaimintimationApprovertest2() {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		initilization();
		lp = new Loginpage();
		Cia2 = new ClaimintimationApproverpage2();
		Thread.sleep(3000);
		lp.applogin(prop.getProperty("UserName2"), prop.getProperty("Password2"));
		Cia2.reimbclick();
	}
	@Test(priority = 1)
	public void approverhistorytest() throws InterruptedException {
		Cia2.approverhistory();
	}

	@Test(priority = 2)
	public void finalapproveformtest() throws InterruptedException {
		Cia2.finalapproveform();
	}
	@AfterMethod
	public void quit() {
		driver.quit();
	}



	
	
	
	
	
	
	}
	
	
	


