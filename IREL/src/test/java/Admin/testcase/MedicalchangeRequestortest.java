package Admin.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import IREL.Base.testbase;
import IREL.Commonutility.Actionscreenshot;
import IREL.Pages.Loginpage;
import IREL.Pages.MedicaladdingRequestorpage;
import IREL.Pages.MedicalchangeRequestpage;

public class MedicalchangeRequestortest  extends testbase{
	
	
	Loginpage lp;
	MedicalchangeRequestpage Mcr;
	Actionscreenshot as;

	public MedicalchangeRequestortest() {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		initilization();
		lp = new Loginpage();
		Mcr = new MedicalchangeRequestpage();
		as = new Actionscreenshot();
		lp.applogin(prop.getProperty("UserName1"), prop.getProperty("Password1"));
		Mcr.reimbclick();

	}
	
	@Test(priority = 1)
	public void  Creatnewgobacktest() throws InterruptedException {
	Mcr.Creatnewgoback();
	}
	

	@Test(priority = 2)
	public void Viewfamilymembertest() throws InterruptedException {
		Mcr.Viewfamilymember();
    }
	@Test(priority = 3)
	public void addingmembertest() throws InterruptedException {
		Mcr.addingmember();
       
    }
	@Test(priority = 4)
	public void canceladdingmemeberstest() throws InterruptedException {
		Mcr.canceladdingmemebers();
      
    }
	@Test(priority = 5)
	public void savetest() throws InterruptedException {
		Mcr.save();
      
    }

	@Test(priority = 6)
	public void  sumbittest() throws InterruptedException {
		Mcr.sumbit();
      
    }
	@Test(priority = 7)
	public void quittest() throws InterruptedException{
		Mcr.quit();
       
    }
	@Test(priority = 8)
	public void deletetest() throws InterruptedException {
		Mcr.delete();
        }
	@Test(priority = 9)
	public void submitformtest() throws InterruptedException {
		Mcr.submitform();
        }
	@AfterMethod
	public void quit() {
		driver.quit();
	}

}
