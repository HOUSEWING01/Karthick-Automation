package Admin.testcase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import IREL.Base.testbase;
import IREL.Commonutility.Actionscreenshot;
import IREL.Pages.CompensatoryRequestorpage;
import IREL.Pages.Loginpage;

public class CompensatoryRequestortest extends testbase {
	Loginpage lp;
	CompensatoryRequestorpage Cr;
	Actionscreenshot as;

	public CompensatoryRequestortest() {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		initilization();
		lp = new Loginpage();
		Cr = new CompensatoryRequestorpage();
		as = new Actionscreenshot();
		lp.applogin(prop.getProperty("UserName1"), prop.getProperty("Password1"));
		Cr.Leaveclick();
	}
	

@Test(priority = 1)
public void Compensatoryleaveresettest() throws InterruptedException {
	Cr.applycompensatoryleavereset();
}

@Test(priority=2)
public void  Compensatorysubmittest() throws InterruptedException{
	Cr.applycompensatorysubmit();
}
@Test(priority=3)
public void quittest() throws InterruptedException{
	Cr.quit();	
}


@Test(priority=4)
public void finalsubmittest() throws InterruptedException {
	Cr.finalsubmit();	
}
@Test (priority=5)
public void viewsubmittedapgetest() throws InterruptedException {
	Cr.viewsubmitpageend();	
}
}
