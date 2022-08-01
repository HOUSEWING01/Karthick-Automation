package Admin.testcase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import IREL.Base.testbase;
import IREL.Pages.Loginpage;
import IREL.Pages.MaterialQuoteReceiptRequestorpage;
import IREL.Pages.MaterialpurchaseRequestorpage;

public class MaterialQuoteReceiptRequestortest  extends testbase{
	Loginpage lp;
	MaterialQuoteReceiptRequestorpage Mqrr;
	
	public MaterialQuoteReceiptRequestortest() {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		initilization();
		lp = new Loginpage();
		Mqrr = new MaterialQuoteReceiptRequestorpage();
		lp.applogin(prop.getProperty("UserName1"), prop.getProperty("Password1"));
		Mqrr.Materialclick();
	}
	@Test(priority = 1)
	public void  createQuoteReceipttest() throws InterruptedException {
	Mqrr.createQuoteReceipt();
	}
}
