package Admin.testcase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import IREL.Base.testbase;
import IREL.Commonutility.Actionscreenshot;
import IREL.Pages.CasualleaveRequestorpage;
import IREL.Pages.LeaveencashmentRequestorpage;
import IREL.Pages.Loginpage;

public class LeaveencashmentRequestortest extends testbase {
	Loginpage lp;
	LeaveencashmentRequestorpage Ler;
	Actionscreenshot as;

	public LeaveencashmentRequestortest() {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		initilization();
		lp = new Loginpage();
		Ler = new LeaveencashmentRequestorpage();
		as = new Actionscreenshot();
		lp.applogin(prop.getProperty("UserName1"), prop.getProperty("Password1"));
		Ler.Leaveclick();
	}

	@Test(priority = 1)
	public void Encashmentdaystest() throws InterruptedException {
		Ler.Encashmentdays();
	}

	@Test(priority = 2)
	public void Deletetest() throws InterruptedException {
		Ler.Delete();
	}

	@Test(priority = 3)
	public void Finalencashmentsubmittest() throws InterruptedException {
		Ler.Finalencashmentsubmit();
	}

	@Test(priority = 4)
	public void  viewpagetest() throws InterruptedException {
		Ler.viewpage();
	}


}
