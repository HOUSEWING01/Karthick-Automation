package Admin.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import IREL.Base.testbase;
import IREL.Pages.Loginpage;
import IREL.Pages.VigilanceclearanceProRequestorpage;
import IREL.Pages.VigilanceclearanceRetiRequestorpage;

public class VigilanceclearanceRetiRequestortest  extends testbase{
	Loginpage lp;
	VigilanceclearanceRetiRequestorpage Vcrr;

	public VigilanceclearanceRetiRequestortest() {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		initilization();
		lp = new Loginpage();
		Vcrr = new VigilanceclearanceRetiRequestorpage();

		lp.applogin(prop.getProperty("UserName1"), prop.getProperty("Password1"));
		Vcrr.Vigilanceclick();
	}

	@Test(priority = 1)
	public void Gobacktest() throws InterruptedException {
		Vcrr.Goback();
	}
	@Test(priority = 2)
	public void clearanceProcanceltest() throws InterruptedException {
		Vcrr.clearanceProcancel();
	}

	@Test(priority = 3)
	public void submittest() throws InterruptedException {
		Vcrr.clearanceProsubmit();
	}

	@Test(priority = 4)
	public void ViewandQuittest() throws InterruptedException {
		Vcrr.ViewandQuit();
	}

	@Test(priority = 5)
	public void deletetherecordtest() throws InterruptedException {
		Vcrr.deletetherecord();
	}

	@Test(priority = 6)
	public void Finalsubmittest() throws InterruptedException {
		Vcrr.Finalsubmit();

	}

	@AfterMethod
	public void quit() {
		driver.quit();
	}
	
	

}
