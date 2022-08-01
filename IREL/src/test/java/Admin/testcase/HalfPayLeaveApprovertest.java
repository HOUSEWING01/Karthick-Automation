package Admin.testcase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import IREL.Base.testbase;
import IREL.Commonutility.Actionscreenshot;
import IREL.Pages.CasualleaveApproverpage;
import IREL.Pages.HalfPayLeaveApproverpage;
import IREL.Pages.Loginpage;

public class HalfPayLeaveApprovertest extends testbase {
	Loginpage lp;
	HalfPayLeaveApproverpage Hla;
	Actionscreenshot as;

	public HalfPayLeaveApprovertest() {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		initilization();
		lp = new Loginpage();
		Hla = new HalfPayLeaveApproverpage();
		as = new Actionscreenshot();
		lp.applogin(prop.getProperty("UserName2"), prop.getProperty("Password2"));
		Hla.Leaveclick();
	}
	

@Test(priority = 1)
public void  rejectformrresettest() throws InterruptedException {
	Hla.rejectformreset();
}


@Test(priority = 2)
public void  finalrejectformtest() throws InterruptedException {
	Hla.finalrejectedform();
}
}
