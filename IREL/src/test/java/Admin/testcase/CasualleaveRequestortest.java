package Admin.testcase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import IREL.Base.testbase;
import IREL.Commonutility.Actionscreenshot;
import IREL.Pages.AnnualleaveRequestorpage;
import IREL.Pages.CasualleaveRequestorpage;
import IREL.Pages.Loginpage;

public class CasualleaveRequestortest extends testbase {
	Loginpage lp;
	CasualleaveRequestorpage Crr;
	Actionscreenshot as;

	public CasualleaveRequestortest() {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		initilization();
		lp = new Loginpage();
		Crr = new CasualleaveRequestorpage();
		as = new Actionscreenshot();
		lp.applogin(prop.getProperty("UserName1"), prop.getProperty("Password1"));
		Crr.Leaveclick();
	}

	@Test(priority = 1)
	public void applycasualleaveresettest() throws InterruptedException {
		Crr.applycasualleavereset();
	}

	@Test(priority = 2)
	public void applycasualsubmittest() throws InterruptedException {
		Crr.applycasualsubmit();
	}

	@Test(priority = 3)
	public void quittest() throws InterruptedException {
		Crr.quit();
	}

	@Test(priority = 4)
	public void finalsubmittest() throws InterruptedException {
		Crr.finalsubmit();
	}

	@Test(priority = 5)
	public void viewsubmittedapgetest() throws InterruptedException {
		Crr.viewsubmitpageend();
	}

}
