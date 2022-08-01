package Admin.testcase;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.mongodb.operation.CreateCollectionOperation;

import IREL.Base.testbase;
import IREL.Commonutility.Actionscreenshot;
import IREL.Commonutility.ReadExcel;
import IREL.Pages.HalfPayLeaveRequestorpage;
import IREL.Pages.Loginpage;
import IREL.Pages.MarketingDomesticRequestorpage;

public class MarketingDomesticRequestortest extends testbase {
	Loginpage lp;
	MarketingDomesticRequestorpage Mdr;
	Actionscreenshot as;
	

	public MarketingDomesticRequestortest() {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		initilization();
		lp = new Loginpage();
		Mdr = new MarketingDomesticRequestorpage();
		as = new Actionscreenshot();
		lp.applogin(prop.getProperty("UserName1"), prop.getProperty("Password1"));
		Mdr.Marketingclick();
	}

	@DataProvider
	public Object[][] gettestdata()  {
		Object[][] data=ReadExcel.getTestData("Name");

		return data;
	}
	
	@Test(dataProvider = "gettestdata")
	public void Gobacktest(String args[])  {
		Mdr.createnew();
		
		Mdr.Goback(args);
	}
	@AfterMethod 
	public void teardown() {
		driver.close();
	}
	 
	
//	@Test(priority = 1)
//	public void Gobacktest() throws InterruptedException {
//		Mdr.Goback();
//	}

}
