package Admin.testcase;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import IREL.Base.testbase;
import IREL.Pages.Loginpage;
import IREL.Pages.VigilanceNOCpassportApproverpage;
import IREL.Pages.VigilancePropertySMDApproverpage;
import IREL.Pages.VigilanceclearanceOtherApproverpage;

public class VigilancePropertySMDApprovertest  extends testbase{
	Loginpage lp;
	VigilanceclearanceOtherApproverpage Vcoa;

	public VigilancePropertySMDApprovertest() {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		initilization();
		lp = new Loginpage();
		Vcoa = new VigilanceclearanceOtherApproverpage();

		lp.applogin(prop.getProperty("UserName2"), prop.getProperty("Password2"));
		Vcoa.Vigilanceclick();
	}

	@Test(priority = 1)
	public void clickviewformtest() throws InterruptedException {
		Vcoa.clickviewform();
	}

	@Test(priority = 2)
	public void remarkandalldetailstest() throws InterruptedException {
		Vcoa.remarkandalldetails();
	}

	

	@Test(priority = 3)
	public void Submittest() throws InterruptedException {
		Vcoa.Submit();
	}
	@BeforeMethod
	public void quit() {
		driver.quit();
	}
}
