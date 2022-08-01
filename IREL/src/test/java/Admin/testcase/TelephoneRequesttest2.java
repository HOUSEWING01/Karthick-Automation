package Admin.testcase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import IREL.Base.testbase;
import IREL.Commonutility.Actionscreenshot;
import IREL.Pages.Loginpage;
import IREL.Pages.TelephoneRequestorepage2;
import IREL.Pages.TelephoneRequestorpage;

public class TelephoneRequesttest2 extends testbase {
	
	
		Loginpage lp;
		TelephoneRequestorepage2 Tr2;
		Actionscreenshot as;  

		public TelephoneRequesttest2()
		{
			super();
		}

		@BeforeMethod
		public void setup() throws InterruptedException {
			initilization();
			lp = new Loginpage();
			Tr2 = new TelephoneRequestorepage2();
			as = new Actionscreenshot();
			lp.applogin(prop.getProperty("UserName1"), prop.getProperty("Password1"));
			Tr2.reimbclick();	
		}
		
		@Test(priority =1) 
		public void editclicktest() throws InterruptedException {
			Thread.sleep(3000);
		   Tr2.editclick();
		   Thread.sleep(3000);
		}
		
		@Test(priority =2) 
		public void fieldfilled() throws InterruptedException {
			Thread.sleep(3000);
		   Tr2.fieldfilled();
		   Thread.sleep(3000);
		}
		
		
		
		@Test(priority = 3) 
		public void sumitformafterrejection() throws InterruptedException {
		   Thread.sleep(3000);
			Tr2.sumitformafterrejection();
			Thread.sleep(3000);
		}
		
		
		

}
