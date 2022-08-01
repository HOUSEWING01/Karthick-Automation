package Admin.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import IREL.Base.testbase;
import IREL.Pages.Loginpage;
import IREL.Pages.VigilanceclearanceProApproverpage;
import IREL.Pages.VigilanceclearanceRetiApproverpage;


public class VigilanceclearanceRetiApprovertest extends testbase {
	Loginpage lp;
	VigilanceclearanceRetiApproverpage VcRa;

	public VigilanceclearanceRetiApprovertest() {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		initilization();
		lp = new Loginpage();
		VcRa = new VigilanceclearanceRetiApproverpage();

		lp.applogin(prop.getProperty("UserName2"), prop.getProperty("Password2"));
		VcRa.Vigilanceclick();
	}

	@Test(priority = 1)
	public void clickviewformtest() throws InterruptedException {
		VcRa.clickviewform();
	}

	@Test(priority = 2)
	public void remarkandalldetailstest() throws InterruptedException {
		VcRa.remarkandalldetails();
	}

	@Test(priority = 4)
	public void Submittest() throws InterruptedException {
		VcRa.Submit();
	}
	@AfterMethod
	public void quit() {
	driver.quit();
	}

}
