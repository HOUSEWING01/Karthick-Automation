package Admin.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import IREL.Base.testbase;
import IREL.Pages.Loginpage;
import IREL.Pages.VigilanceNOCforwardingRequestorpage;
import IREL.Pages.VigilanceNOCpassportRequestorpage;

public class VigilanceNOCforwardingRequestortest extends testbase {
	Loginpage lp;
	VigilanceNOCforwardingRequestorpage Vnfr;

	public VigilanceNOCforwardingRequestortest() {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		initilization();
		lp = new Loginpage();
		Vnfr = new VigilanceNOCforwardingRequestorpage();

		lp.applogin(prop.getProperty("UserName1"), prop.getProperty("Password1"));
		Vnfr.Vigilanceclick();
	}

	@Test(priority = 1)
	public void Gobacktest() throws InterruptedException {
		Vnfr.Goback();
	}

	@Test(priority = 2)
	public void Nocforwardingcanceltest() throws InterruptedException {
		Vnfr.Nocforwardingcancel();
	}

	@Test(priority = 3)
	public void Nocforwardingsubmittest() throws InterruptedException {
		Vnfr.Nocforwardingsubmit();
	}

	@Test(priority = 4)
	public void ViewandQuittest() throws InterruptedException {
		Vnfr.ViewandQuit();
	}

	@Test(priority = 5)
	public void deletetherecordtest() throws InterruptedException {
		Vnfr.deletetherecord();
	}

	@Test(priority = 6)
	public void Finalsubmittest() throws InterruptedException {
		Vnfr.Finalsubmit();

	}

	@AfterMethod
	public void quit() {
		driver.quit();
	}
}
