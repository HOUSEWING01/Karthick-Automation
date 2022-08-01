package Admin.testcase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import IREL.Base.testbase;
import IREL.Commonutility.Actionscreenshot;
import IREL.Pages.CasualleaveRequestorpage;
import IREL.Pages.HalfPayLeaveRequestorpage;
import IREL.Pages.Loginpage;

public class HalfPayLeaveRequestortest extends testbase {
	Loginpage lp;
	HalfPayLeaveRequestorpage Hlr;
	Actionscreenshot as;

	public HalfPayLeaveRequestortest() {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		initilization();
		lp = new Loginpage();
		Hlr = new HalfPayLeaveRequestorpage();
		as = new Actionscreenshot();
		lp.applogin(prop.getProperty("UserName1"), prop.getProperty("Password1"));
		Hlr.Leaveclick();
	}

	@Test(priority = 1)
	public void HalfPayleaveresettest() throws InterruptedException {
		Hlr.HalfPayleavereset();;
	}

	@Test(priority = 2)
	public void HalfPaysubmittest() throws InterruptedException {
		Hlr.HalfPaysubmit();
	}

	@Test(priority = 3)
	public void quittest() throws InterruptedException {
		Hlr.quit();
	}

	@Test(priority = 4)
	public void finalsubmittest() throws InterruptedException {
		Hlr.finalsubmit();
	}

	@Test(priority = 5)
	public void viewsubmittedapgetest() throws InterruptedException {
		Hlr.viewsubmitpageend();
	}

}
