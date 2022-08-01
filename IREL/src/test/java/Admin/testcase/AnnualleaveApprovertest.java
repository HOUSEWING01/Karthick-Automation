package Admin.testcase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import IREL.Base.testbase;
import IREL.Commonutility.Actionscreenshot;
import IREL.Pages.AnnualleaveApproverpage;
import IREL.Pages.AnnualleaveRequestorpage;
import IREL.Pages.Loginpage;

public class AnnualleaveApprovertest extends testbase {
	Loginpage lp;
	AnnualleaveApproverpage Aar;
	Actionscreenshot as;

	public AnnualleaveApprovertest() {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		initilization();
		lp = new Loginpage();
		Aar = new AnnualleaveApproverpage();
		as = new Actionscreenshot();
		lp.applogin(prop.getProperty("UserName2"), prop.getProperty("Password2"));
		Aar.Leaveclick();
	}
	

@Test(priority = 1)
public void  rejectformrresettest() throws InterruptedException {
	Aar.rejectformreset();
}


@Test(priority = 2)
public void  finalrejectformtest() throws InterruptedException {
	Aar.finalrejectedform();
}
}
