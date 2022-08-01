package Admin.testcase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import IREL.Base.testbase;
import IREL.Commonutility.Actionscreenshot;
import IREL.Pages.AnnualleaveApproverpage;
import IREL.Pages.CasualleaveApproverpage;
import IREL.Pages.Loginpage;

public class CasualleaveApprovertest extends testbase {
	Loginpage lp;
	CasualleaveApproverpage Car;
	Actionscreenshot as;

	public CasualleaveApprovertest() {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		initilization();
		lp = new Loginpage();
		Car = new CasualleaveApproverpage();
		as = new Actionscreenshot();
		lp.applogin(prop.getProperty("UserName2"), prop.getProperty("Password2"));
		Car.Leaveclick();
	}
	

@Test(priority = 1)
public void  rejectformrresettest() throws InterruptedException {
	Car.rejectformreset();
}


@Test(priority = 2)
public void  finalrejectformtest() throws InterruptedException {
	Car.finalrejectedform();
}
}
