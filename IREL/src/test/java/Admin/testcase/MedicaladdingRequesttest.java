package Admin.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import IREL.Base.testbase;
import IREL.Commonutility.Actionscreenshot;
import IREL.Pages.Loginpage;
import IREL.Pages.MedicaladdingRequestorpage;

public class MedicaladdingRequesttest extends testbase {

	Loginpage lp;
	MedicaladdingRequestorpage Mar;
	Actionscreenshot as;

	public MedicaladdingRequesttest() {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		initilization();
		lp = new Loginpage();
		Mar = new MedicaladdingRequestorpage();
		as = new Actionscreenshot();
		lp.applogin(prop.getProperty("UserName1"), prop.getProperty("Password1"));
		Mar.reimbclick();

	}

	@Test(priority = 1)
	public void Creatnewgobacktest() throws InterruptedException {
		Mar.Creatnewgoback();
	}

	@Test(priority = 2)
	public void Viewfamilymembertest() throws InterruptedException {
		Mar.Viewfamilymember();
	}

	@Test(priority = 3)
	public void addingmembertest() throws InterruptedException {
		Mar.addingmember();

	}

	@Test(priority = 4)
	public void canceladdingmemeberstest() throws InterruptedException {
		Mar.canceladdingmemebers();

	}

	@Test(priority = 5)
	public void savetest() throws InterruptedException {
		Mar.save();

	}

	@Test(priority = 6)
	public void sumbittest() throws InterruptedException {
		Mar.sumbit();

	}

	@Test(priority = 7)
	public void quittest() throws InterruptedException {
		Mar.quit();

	}

	@Test(priority = 8)
	public void deletetest() throws InterruptedException {
		Mar.delete();
	}

	@Test(priority = 9)
	public void submitformtest() throws InterruptedException {
		Mar.submitform();
	}

	@AfterMethod
	public void quit() {
		driver.quit();
	}

}
