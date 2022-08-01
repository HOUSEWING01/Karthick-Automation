package Admin.testcase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import IREL.Base.testbase;
import IREL.Commonutility.Actionscreenshot;
import IREL.Commonutility.ReadExcel;
import IREL.Pages.Loginpage;
import IREL.Pages.TelephoneApproverpage2;
import IREL.Pages.Telephoneapproverpage;

public class TelephoneApprovertest2 extends testbase {
	Loginpage lp;
	TelephoneApproverpage2 Ta2;
	Actionscreenshot As;

	public TelephoneApprovertest2() {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		initilization();
		lp = new Loginpage();
		Ta2 = new TelephoneApproverpage2();
		Thread.sleep(3000);
		lp.applogin(prop.getProperty("UserName2"), prop.getProperty("Password2"));
		Ta2.reimbclick();
	}
	@DataProvider
	public Object[][] gettestdata()  {
		Object[][] data=ReadExcel.getTestData("Tele");

		return data;
	}

	@Test(dataProvider = "gettestdata")
	public void accepttheform(String args[]) throws InterruptedException {
		Ta2.pendingclick();
		Ta2.showclick();
		Ta2.accepttheform(args);
	}
	
	
	
//	@Test(priority = 1)
//	public void accepttheform() throws InterruptedException {
//		Ta2.accepttheform();
//
//	}

}
