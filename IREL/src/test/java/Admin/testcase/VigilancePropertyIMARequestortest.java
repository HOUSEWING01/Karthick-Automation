package Admin.testcase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import IREL.Base.testbase;
import IREL.Pages.Loginpage;
import IREL.Pages.VigilanceNOCpassportApproverpage;
import IREL.Pages.VigilancePropertyIMARequestorpage;

public class VigilancePropertyIMARequestortest extends testbase {
	Loginpage lp;
	VigilancePropertyIMARequestorpage VpIMAr;

	public  VigilancePropertyIMARequestortest() {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		initilization();
		lp = new Loginpage();
		VpIMAr = new VigilancePropertyIMARequestorpage();

		lp.applogin(prop.getProperty("UserName1"), prop.getProperty("Password1"));
		VpIMAr.Vigilanceclick();
	}
	@Test(priority = 1)
	public void Gobacktest() throws InterruptedException {
		VpIMAr.Goback();
	}

	@Test(priority = 2)
	public void  NocpropertyIMAcanceltest() throws InterruptedException {
		VpIMAr.NocpropertyIMAcancel();
	}

	@Test(priority = 3)
	public void  NocpropertyIMAsubmittest() throws InterruptedException {
		VpIMAr.NocpropertyIMAsubmit();
	}

	@Test(priority = 4)
	public void ViewandQuittest() throws InterruptedException {
		VpIMAr.ViewandQuit();
	}

	@Test(priority = 5)
	public void deletetherecordtest() throws InterruptedException {
		VpIMAr.deletetherecord();
	}

	@Test(priority = 6)
	public void Finalsubmittest() throws InterruptedException {
		VpIMAr.Finalsubmit();

	}
}
