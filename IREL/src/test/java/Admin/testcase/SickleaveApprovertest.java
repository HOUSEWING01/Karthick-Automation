package Admin.testcase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import IREL.Base.testbase;
import IREL.Commonutility.Actionscreenshot;
import IREL.Pages.HalfPayLeaveApproverpage;
import IREL.Pages.Loginpage;
import IREL.Pages.SickleaveApproverpage;

public class SickleaveApprovertest  extends testbase{
	Loginpage lp;
	SickleaveApproverpage Sla;
	Actionscreenshot as;

	public SickleaveApprovertest() {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		initilization();
		lp = new Loginpage();
		Sla = new SickleaveApproverpage();
		as = new Actionscreenshot();
		lp.applogin(prop.getProperty("UserName2"), prop.getProperty("Password2"));
		Sla.Leaveclick();
	}
	

@Test(priority = 1)
public void  rejectformrresettest() throws InterruptedException {
	Sla.rejectformreset();
}


@Test(priority = 2)
public void  finalrejectformtest() throws InterruptedException {
	Sla.finalrejectedform();
}

}
