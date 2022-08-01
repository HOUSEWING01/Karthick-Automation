package Admin.testcase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import IREL.Base.testbase;
import IREL.Pages.Loginpage;
import IREL.Pages.MaterialFloatingEnquiryRequestorpage;
import IREL.Pages.MaterialpurchaseRequestorpage;

public class MaterialFloatingEnquiryRequestortest extends testbase {
	Loginpage lp;
	MaterialFloatingEnquiryRequestorpage Mfr;
	
	public MaterialFloatingEnquiryRequestortest() {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		initilization();
		lp = new Loginpage();
		Mfr = new MaterialFloatingEnquiryRequestorpage();
		lp.applogin(prop.getProperty("UserName1"), prop.getProperty("Password1"));
		Mfr.Materialclick();
	}
	@Test(priority = 1)
	public void  Creatnewtest() throws InterruptedException {
	Mfr.createFloatingenquiry();
	}
}
