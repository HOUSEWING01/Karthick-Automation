package Admin.testcase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import IREL.Base.testbase;
import IREL.Pages.Loginpage;
import IREL.Pages.MaterialBidopeningRequestorpage;
import IREL.Pages.MaterialFloatingEnquiryRequestorpage;

public class MaterialBidopeningRequestortest extends testbase {
	Loginpage lp;
	MaterialBidopeningRequestorpage Mbor;
	
	public MaterialBidopeningRequestortest() {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		initilization();
		lp = new Loginpage();
		Mbor = new MaterialBidopeningRequestorpage();
		lp.applogin(prop.getProperty("UserName1"), prop.getProperty("Password1"));
		Mbor.Materialclick();
	}
	@Test(priority = 1)
	public void  createBidopeningtest() throws InterruptedException {
	Mbor.createBidopening();
	}


}
