package Admin.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import IREL.Base.testbase;
import IREL.Commonutility.Actionscreenshot;
import IREL.Pages.ClaimapplicationIPDRequestorpage;
import IREL.Pages.ClaimapplicationOPDRequestorpage;
import IREL.Pages.Loginpage;

public class ClaimapplicationIPDRequestortest extends testbase {
	
		Loginpage lp;
		ClaimapplicationIPDRequestorpage Cair;
	

		public ClaimapplicationIPDRequestortest() {
			super();
		}

		@BeforeMethod
		public void setup() throws InterruptedException {
			initilization();
			lp = new Loginpage();
			Cair = new ClaimapplicationIPDRequestorpage();
			
			lp.applogin(prop.getProperty("UserName1"), prop.getProperty("Password1"));
			Cair.reimbclick();
		}
		

	@Test(priority = 1)
	public void  Creatnewgobacktest() throws InterruptedException {
	Cair.Creatnewgoback();
	}

	@Test(priority=2)
	public void  Allmandatoryfieldtest() throws InterruptedException{
		Cair.Allmandatoryfield();	
	}
	@Test(priority=3)
	public void  Ipdandnameofpatienttest() throws InterruptedException{
		Cair.Ipdandnameofpatient();	
	}

	@Test(priority=4)
	public void canceladddetailstest() throws InterruptedException {
		Cair.canceladddetails();
	}
	@Test(priority=9)
	public void filesavetest() throws InterruptedException {
		Cair.filesave();
	}
	@Test(priority=10)
	public void finalsumittest() throws InterruptedException {
		Cair.finalsumit();
	}
	@Test(priority=11)
	public void viewthepagetest() throws InterruptedException {
		Cair.viewthepage();
	}
	@Test(priority=12)
	public void quitformpagetest() throws InterruptedException {
		Cair.quitformpage();
	}
	@Test(priority=13)
	public void againcreateform() throws InterruptedException {
		Cair.againcreateform();
	}



	
	

}
