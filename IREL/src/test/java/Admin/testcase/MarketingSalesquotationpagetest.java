package Admin.testcase;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import IREL.Base.testbase;
import IREL.Commonutility.Actionscreenshot;
import IREL.Commonutility.ReadExcel;
import IREL.Pages.Loginpage;
import IREL.Pages.MarketingDomesticRequestorpage;
import IREL.Pages.MarketingSalesquotation;

public class MarketingSalesquotationpagetest extends testbase {
	Loginpage lp;
	MarketingSalesquotation Msq;
	Actionscreenshot as;

	public MarketingSalesquotationpagetest() {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		initilization();
		lp = new Loginpage();
		Msq = new MarketingSalesquotation();
		as = new Actionscreenshot();
		lp.applogin(prop.getProperty("UserName1"), prop.getProperty("Password1"));
		Msq.Marketingclick();
	}

	
	@Test(priority = 1)
	public void Gobacktest() throws InterruptedException {
		Msq.Goback();
	}

	
	@Test(priority = 2)
	public void proformaapprovertest() throws InterruptedException {
		Msq.proformaapprover();
	}
	@Test(priority = 3)
	public void Recepittest() throws InterruptedException {
		Msq.Recepit();
	}
	@Test(priority = 4)
	public void Deliveryordertest() throws InterruptedException {
		Msq.Deliveryorder();
	}
	@Test(priority = 5)
	public void Deliveryorderapprovertest() throws InterruptedException {
		Msq.Deliveryorderapprover();
		
	}
	@Test(priority = 6)
	public void productloadingHeadertest() throws InterruptedException {
		Msq.productloadingHeader();
	}
	
//	@Test(priority = 7)
//	public void warehousetest() throws InterruptedException {
//		Msq.warehouse();
//		
//   }
	
	
	
	
	
	
    }
