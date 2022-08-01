package Admin.testcase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import IREL.Base.testbase;
import IREL.Commonutility.Actionscreenshot;
import IREL.Pages.HalfPayLeaveRequestorpage;
import IREL.Pages.Loginpage;
import IREL.Pages.SickleaveRequestorpage;

public class SickleaveRequestortest extends testbase {
	Loginpage lp;
	SickleaveRequestorpage Slr;
	Actionscreenshot as;

	public SickleaveRequestortest() {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		initilization();
		lp = new Loginpage();
		Slr = new SickleaveRequestorpage();
		as = new Actionscreenshot();
		lp.applogin(prop.getProperty("UserName1"), prop.getProperty("Password1"));
		Slr.Leaveclick();
	}

	@Test(priority = 1)
	public void Sickleaveresettest() throws InterruptedException {
		Slr.Sickleavereset();;
	}

	@Test(priority = 2)
	public void Sickleavesubmittest() throws InterruptedException {
		Slr.Sickleavesubmit();
	}

	@Test(priority = 3)
	public void quittest() throws InterruptedException {
		Slr.quit();
	}

	@Test(priority = 4)
	public void finalsubmittest() throws InterruptedException {
		Slr.finalsubmit();
	}

	@Test(priority = 5)
	public void viewsubmittedapgetest() throws InterruptedException {
		Slr.viewsubmitpageend();
	}


}
