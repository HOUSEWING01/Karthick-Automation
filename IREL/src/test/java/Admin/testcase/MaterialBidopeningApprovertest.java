package Admin.testcase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import IREL.Base.testbase;
import IREL.Pages.Loginpage;
import IREL.Pages.MaterialBidopeningApproverpage;
import IREL.Pages.MaterialFloatingEnquiryApproverpage;

public class MaterialBidopeningApprovertest  extends testbase{
	Loginpage lp;
	MaterialBidopeningApproverpage Mboa;
	 

	public MaterialBidopeningApprovertest() {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		initilization();
		lp = new Loginpage();
		Mboa= new MaterialBidopeningApproverpage();
		Thread.sleep(3000);
		lp.applogin(prop.getProperty("UserName2"), prop.getProperty("Password2"));
		Mboa.Materialclick();
	}

	@Test(priority = 1)
	public void approveBidopeningtest() throws InterruptedException {
		Mboa.approveBidopening();
	}

}
