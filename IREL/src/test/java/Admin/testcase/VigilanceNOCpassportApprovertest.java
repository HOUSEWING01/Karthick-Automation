package Admin.testcase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import IREL.Base.testbase;
import IREL.Pages.Loginpage;
import IREL.Pages.VigilanceNOCpassportApproverpage;
import IREL.Pages.VigilanceNOCpassportRequestorpage;

public class VigilanceNOCpassportApprovertest extends testbase {
	Loginpage lp;
	VigilanceNOCpassportApproverpage Vnpa;

	public VigilanceNOCpassportApprovertest() {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		initilization();
		lp = new Loginpage();
		Vnpa = new VigilanceNOCpassportApproverpage();

		lp.applogin(prop.getProperty("UserName2"), prop.getProperty("Password2"));
		Vnpa.Vigilanceclick();
	}

	@Test(priority = 1)
	public void clickviewformtest() throws InterruptedException {
		Vnpa.clickviewform();
	}

	@Test(priority = 2)
	public void remarkandalldetailstest() throws InterruptedException {
		Vnpa.remarkandalldetails();
	}

	@Test(priority = 3)
	public void Resettest() throws InterruptedException {
		Vnpa.Reset();
	}

	@Test(priority = 4)
	public void Submittest() throws InterruptedException {
		Vnpa.Submit();
	}
}
