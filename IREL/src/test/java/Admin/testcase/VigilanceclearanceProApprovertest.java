package Admin.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import IREL.Base.testbase;
import IREL.Pages.Loginpage;
import IREL.Pages.VigilanceclearanceOtherApproverpage;
import IREL.Pages.VigilanceclearanceProApproverpage;

public class VigilanceclearanceProApprovertest  extends testbase{
	
		Loginpage lp;
		VigilanceclearanceProApproverpage Vcpa;

		public VigilanceclearanceProApprovertest() {
			super();
		}

		@BeforeMethod
		public void setup() throws InterruptedException {
			initilization();
			lp = new Loginpage();
			Vcpa = new VigilanceclearanceProApproverpage();

			lp.applogin(prop.getProperty("UserName2"), prop.getProperty("Password2"));
			Vcpa.Vigilanceclick();
		}

		@Test(priority = 1)
		public void clickviewformtest() throws InterruptedException {
			Vcpa.clickviewform();
		}

		@Test(priority = 2)
		public void remarkandalldetailstest() throws InterruptedException {
			Vcpa.remarkandalldetails();
		}

		@Test(priority = 4)
		public void Submittest() throws InterruptedException {
			Vcpa.Submit();
		}
		@AfterMethod
		public void quit() {
		driver.quit();
		}

	}

