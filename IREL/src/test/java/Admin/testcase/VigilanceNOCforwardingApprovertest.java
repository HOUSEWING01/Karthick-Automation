package Admin.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import IREL.Base.testbase;
import IREL.Pages.Loginpage;
import IREL.Pages.VigilanceNOCforwardingApproverpage;
import IREL.Pages.VigilanceNOCpassportApproverpage;

public class VigilanceNOCforwardingApprovertest extends testbase {
	Loginpage lp;
	VigilanceNOCforwardingApproverpage Vnfa;

	public VigilanceNOCforwardingApprovertest() {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		initilization();
		lp = new Loginpage();
		Vnfa = new VigilanceNOCforwardingApproverpage();

		lp.applogin(prop.getProperty("UserName2"), prop.getProperty("Password2"));
		Vnfa.Vigilanceclick();
	}

	@Test(priority = 1)
	public void clickviewformtest() throws InterruptedException {
		Vnfa.clickviewform();
	}

	@Test(priority = 2)
	public void remarkandalldetailstest() throws InterruptedException {
		Vnfa.remarkandalldetails();
	}

	@Test(priority = 3)
	public void Resettest() throws InterruptedException {
		Vnfa.Reset();
	}

	@Test(priority = 4)
	public void Submittest() throws InterruptedException {
		Vnfa.Submit();
	}
	
	@AfterMethod
	public void delete() {
		driver.quit();
	}
	
	
	
}
