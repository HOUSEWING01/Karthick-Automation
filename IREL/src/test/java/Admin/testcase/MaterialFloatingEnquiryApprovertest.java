package Admin.testcase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import IREL.Base.testbase;
import IREL.Pages.Loginpage;
import IREL.Pages.MaterialFloatingEnquiryApproverpage;
import IREL.Pages.MaterialpurchaseApproverpage;

public class MaterialFloatingEnquiryApprovertest  extends testbase{
	Loginpage lp;
	MaterialFloatingEnquiryApproverpage Mfa;
	 

	public MaterialFloatingEnquiryApprovertest() {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		initilization();
		lp = new Loginpage();
		Mfa= new MaterialFloatingEnquiryApproverpage();
		Thread.sleep(3000);
		lp.applogin(prop.getProperty("UserName2"), prop.getProperty("Password2"));
		Mfa.Materialclick();
	}

	@Test(priority = 1)
	public void approvetest() throws InterruptedException {
		Mfa.approve();
	}
}
