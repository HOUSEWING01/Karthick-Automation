package Admin.testcase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import IREL.Base.testbase;
import IREL.Commonutility.Actionscreenshot;
import IREL.Pages.CasualleaveApproverpage;
import IREL.Pages.LeaveencashmentApproverpage;
import IREL.Pages.Loginpage;

public class LeaveencashmentApprovertest extends testbase {
	Loginpage lp;
	LeaveencashmentApproverpage Lea;
	Actionscreenshot as;

	public LeaveencashmentApprovertest() {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		initilization();
		lp = new Loginpage();
		Lea = new LeaveencashmentApproverpage();
		as = new Actionscreenshot();
		lp.applogin(prop.getProperty("UserName2"), prop.getProperty("Password2"));
		Lea.Leaveclick();
	}
	

@Test(priority = 1)
public void  Acceptformtest() throws InterruptedException {
Lea.Acceptform();
}




}
