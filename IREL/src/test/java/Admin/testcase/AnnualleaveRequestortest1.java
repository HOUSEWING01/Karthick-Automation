package Admin.testcase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import IREL.Base.testbase;
import IREL.Commonutility.Actionscreenshot;
import IREL.Pages.AnnualleaveRequestorpage;
import IREL.Pages.ClaimapplicationOPDRequestorpage;

import IREL.Pages.Loginpage;

public class AnnualleaveRequestortest1 extends testbase {
	Loginpage lp;
	AnnualleaveRequestorpage Alr;
	Actionscreenshot as;

	public AnnualleaveRequestortest1() {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		initilization();
		lp = new Loginpage();
		Alr = new AnnualleaveRequestorpage();
		as = new Actionscreenshot();
		lp.applogin(prop.getProperty("UserName1"), prop.getProperty("Password1"));
		Alr.Leaveclick();
	}
	

@Test(priority = 1)
public void  applyannualleaveresettest() throws InterruptedException {
	Alr.applyannualleavereset();
}

@Test(priority=2)
public void  applyannuallsubmittest() throws InterruptedException{
	Alr.applyannuallsubmit();	
}
@Test(priority=3)
public void quittest() throws InterruptedException{
	Alr.viewandquit();	
}


@Test(priority=4)
public void finalsubmittest() throws InterruptedException {
	Alr.finalsubmit();	
}
@Test (priority=5)
public void viewsubmittedapgetest() throws InterruptedException {
	Alr.viewsubmitpageend();	
}


	
	
	

}
