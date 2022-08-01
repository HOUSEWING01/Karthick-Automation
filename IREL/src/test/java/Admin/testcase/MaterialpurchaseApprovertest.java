package Admin.testcase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import IREL.Base.testbase;
import IREL.Commonutility.Actionscreenshot;
import IREL.Pages.ClaimapplicationOPDApproverpage;
import IREL.Pages.Loginpage;
import IREL.Pages.MaterialpurchaseApproverpage;

public class MaterialpurchaseApprovertest extends testbase {
	Loginpage lp;
	MaterialpurchaseApproverpage Mpa;
	 

	public MaterialpurchaseApprovertest() {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		initilization();
		lp = new Loginpage();
		Mpa= new MaterialpurchaseApproverpage();
		Thread.sleep(3000);
		lp.applogin(prop.getProperty("UserName2"), prop.getProperty("Password2"));
		Mpa.Materialclick();
	}

	@Test(priority = 1)
	public void approvetest() throws InterruptedException {
		Mpa.approve();
	}
}
