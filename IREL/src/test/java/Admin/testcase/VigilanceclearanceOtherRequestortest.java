package Admin.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import IREL.Base.testbase;
import IREL.Pages.Loginpage;
import IREL.Pages.VigilanceclearanceOtherRequestorpage;
import IREL.Pages.VigilanceclearanceRetiRequestorpage;

public class VigilanceclearanceOtherRequestortest extends testbase {
	Loginpage lp;
	VigilanceclearanceOtherRequestorpage Vcor;

	public VigilanceclearanceOtherRequestortest() {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		initilization();
		lp = new Loginpage();
		 Vcor = new VigilanceclearanceOtherRequestorpage();

		lp.applogin(prop.getProperty("UserName1"), prop.getProperty("Password1"));
		 Vcor.Vigilanceclick();
	}

	@Test(priority = 1)
	public void Gobacktest() throws InterruptedException {
		 Vcor.Goback();
	}
	@Test(priority = 2)
	public void clearanceProcanceltest() throws InterruptedException {
		 Vcor.clearanceProcancel();
	}

	@Test(priority = 3)
	public void submittest() throws InterruptedException {
		 Vcor.clearanceProsubmit();
	}

	@Test(priority = 4)
	public void ViewandQuittest() throws InterruptedException {
		 Vcor.ViewandQuit();
	}

	@Test(priority = 5)
	public void deletetherecordtest() throws InterruptedException {
		Vcor.deletetherecord();
	}

	@Test(priority = 6)
	public void Finalsubmittest() throws InterruptedException {
		Vcor.Finalsubmit();

	}

	@AfterMethod
	public void quit() {
		driver.quit();
	}
	
	

}
