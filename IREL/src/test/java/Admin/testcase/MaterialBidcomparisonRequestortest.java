package Admin.testcase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import IREL.Base.testbase;
import IREL.Pages.Loginpage;
import IREL.Pages.MaterialBidcomparisonRequestorpage;
import IREL.Pages.MaterialBidopeningRequestorpage;

public class MaterialBidcomparisonRequestortest extends testbase {
	Loginpage lp;
	MaterialBidcomparisonRequestorpage Mbcr;
	
	public MaterialBidcomparisonRequestortest() {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		initilization();
		lp = new Loginpage();
		Mbcr = new MaterialBidcomparisonRequestorpage();
		lp.applogin(prop.getProperty("UserName1"), prop.getProperty("Password1"));
		Mbcr.Materialclick();
	}
	@Test(priority = 1)
	public void  selectBidcompsrisontest() throws InterruptedException {
	Mbcr.selectBidcompsrison();
	}
}
