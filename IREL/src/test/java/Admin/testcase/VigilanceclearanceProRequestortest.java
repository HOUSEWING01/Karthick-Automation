package Admin.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import IREL.Base.testbase;
import IREL.Pages.Loginpage;
import IREL.Pages.VigilanceNocforeignvisitRequestorpage;
import IREL.Pages.VigilanceclearanceProRequestorpage;

public class VigilanceclearanceProRequestortest extends testbase {
	Loginpage lp;
	VigilanceclearanceProRequestorpage Vcpr;

	public VigilanceclearanceProRequestortest() {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		initilization();
		lp = new Loginpage();
		Vcpr = new VigilanceclearanceProRequestorpage();

		lp.applogin(prop.getProperty("UserName1"), prop.getProperty("Password1"));
		Vcpr.Vigilanceclick();
	}

	@Test(priority = 1)
	public void Gobacktest() throws InterruptedException {
		Vcpr.Goback();
	}
	@Test(priority = 2)
	public void clearanceProcanceltest() throws InterruptedException {
		Vcpr.clearanceProcancel();
	}

	@Test(priority = 3)
	public void submittest() throws InterruptedException {
		Vcpr.clearanceProsubmit();
	}

	@Test(priority = 4)
	public void ViewandQuittest() throws InterruptedException {
		Vcpr.ViewandQuit();
	}

	@Test(priority = 5)
	public void deletetherecordtest() throws InterruptedException {
		Vcpr.deletetherecord();
	}

	@Test(priority = 6)
	public void Finalsubmittest() throws InterruptedException {
		Vcpr.Finalsubmit();

	}

	@AfterMethod
	public void quit() {
		driver.quit();
	}
	
	

}
