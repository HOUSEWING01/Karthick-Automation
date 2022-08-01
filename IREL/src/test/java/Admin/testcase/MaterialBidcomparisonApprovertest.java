package Admin.testcase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import IREL.Base.testbase;
import IREL.Pages.Loginpage;
import IREL.Pages.MaterialBidcomparisonApproverpage;
import IREL.Pages.MaterialBidopeningApproverpage;

public class MaterialBidcomparisonApprovertest extends testbase {
	Loginpage lp;
	MaterialBidcomparisonApproverpage Mbca;
	 

	public MaterialBidcomparisonApprovertest() {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		initilization();
		lp = new Loginpage();
		Mbca= new MaterialBidcomparisonApproverpage();
		Thread.sleep(3000);
		lp.applogin(prop.getProperty("UserName2"), prop.getProperty("Password2"));
		Mbca.Materialclick();
	}

	@Test(priority = 1)
	public void approveBidcomparisontest() throws InterruptedException {
		Mbca.approveBidcomparison();
	}
}



