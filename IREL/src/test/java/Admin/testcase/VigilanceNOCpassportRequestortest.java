package Admin.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import IREL.Base.testbase;
import IREL.Commonutility.Actionscreenshot;
import IREL.Pages.Loginpage;
import IREL.Pages.SickleaveRequestorpage;
import IREL.Pages.VigilanceNOCpassportRequestorpage;

public class VigilanceNOCpassportRequestortest extends testbase {
	Loginpage lp;
	VigilanceNOCpassportRequestorpage Vnpr;

	public VigilanceNOCpassportRequestortest() {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		initilization();
		lp = new Loginpage();
		Vnpr = new VigilanceNOCpassportRequestorpage();

		lp.applogin(prop.getProperty("UserName1"), prop.getProperty("Password1"));
		Vnpr.Vigilanceclick();
	}

	@Test(priority = 1)
	public void Gobacktest() throws InterruptedException {
		Vnpr.Goback();
	}

	@Test(priority = 2)
	public void Nocpassportcanceltest() throws InterruptedException {
		Vnpr.Nocpassportcancel();
	}

	@Test(priority = 3)
	public void Nocpassportsubmittest() throws InterruptedException {
		Vnpr.Nocpassportsubmit();
	}

	@Test(priority = 4)
	public void ViewandQuittest() throws InterruptedException {
		Vnpr.ViewandQuit();
	}

	@Test(priority = 5)
	public void deletetherecordtest() throws InterruptedException {
		Vnpr.deletetherecord();
	}

	@Test(priority = 6)
	public void Finalsubmittest() throws InterruptedException {
		Vnpr.Finalsubmit();

	}

	@AfterMethod
	public void quit() {
		driver.quit();
	}
	
}
