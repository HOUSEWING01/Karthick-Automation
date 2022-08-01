package Admin.testcase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import IREL.Base.testbase;
import IREL.Commonutility.Actionscreenshot;
import IREL.Pages.ClaimintimationRequestorpage;
import IREL.Pages.Loginpage;
import IREL.Pages.MaterialpurchaseRequestorpage;

public class MaterialpurchaseRequestortest extends testbase {
	Loginpage lp;
	MaterialpurchaseRequestorpage Mpr;
	
	public MaterialpurchaseRequestortest() {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		initilization();
		lp = new Loginpage();
		Mpr = new MaterialpurchaseRequestorpage();
		lp.applogin(prop.getProperty("UserName1"), prop.getProperty("Password1"));
		Mpr.Materialclick();
	}
	@Test(priority = 1)
	public void  Creatnewtest() throws InterruptedException {
	Mpr.createnew();
	}
	
}
