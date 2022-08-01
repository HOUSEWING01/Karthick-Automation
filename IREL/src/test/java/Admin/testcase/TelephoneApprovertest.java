package Admin.testcase;

import org.openqa.selenium.Keys;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import IREL.Base.testbase;
import IREL.Commonutility.Actionscreenshot;
import IREL.Pages.Loginpage;
import IREL.Pages.Telephoneapproverpage;

@RunAll
public class TelephoneApprovertest extends testbase {

	Loginpage lp;
	Telephoneapproverpage lp3;
	Actionscreenshot As;

	public TelephoneApprovertest() {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		initilization();
		lp = new Loginpage();
		lp3 = new Telephoneapproverpage();
		Thread.sleep(3000);
		lp.applogin(prop.getProperty("UserName2"), prop.getProperty("Password2"));
		lp3.reimbclick();

	}

	@Test(priority = 1)
	public void  clickshowformtest() throws InterruptedException {
		lp3.clickshowform();	
	}

	
		
	

	@Test(priority = 2)
	public void payvaluetest() throws InterruptedException {
		lp3.payvalue();
	
	}

	
	@Test(priority = 3)
	public void remarkpage() throws InterruptedException {
		lp3.remark();
		
	}

	@Test(priority = 4)
	public void filepage() throws InterruptedException {
		lp3.file();
		
	}

	@Test(priority = 5)
	public void adddeletepagetest() throws InterruptedException {
		lp3.adddeletepage();
	}

	@Test(priority = 6)
	public void descriptionpage() throws InterruptedException {
		lp3.descriptio();
		
	}

	@Test(priority = 7)
	public void Resetpagetest() throws InterruptedException {
		lp3.Reset();
		
	}

	@Test(priority = 8)
	public void ActionRejectsumitpagetest() throws InterruptedException {
		lp3.ActionRejectsumit();
		
	}

	@Test(priority = 9)
	public void pendingapproverpagetest() throws InterruptedException {
		Thread.sleep(3000);
		lp3.pendingapproverpageview();
	}

	@Test(priority = 10)
	public void pendingapproverhistorypagetest() throws InterruptedException {
		Thread.sleep(3000);
		lp3.pendingapproverhistorypage();
		Thread.sleep(3000);
	}

	@AfterMethod

	public void teardown() {
		driver.quit();
	}
}