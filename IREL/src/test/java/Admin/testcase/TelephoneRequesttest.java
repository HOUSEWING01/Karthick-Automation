package Admin.testcase;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import IREL.Base.testbase;
import IREL.Commonutility.Actionscreenshot;
import IREL.Commonutility.ReadExcel;
import IREL.Pages.TelephoneRequestorpage;
import IREL.Pages.Loginpage;

public class TelephoneRequesttest extends testbase {
	Loginpage lp;
	TelephoneRequestorpage lp2;
	Actionscreenshot as;  

	public TelephoneRequesttest() {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		initilization();
		lp = new Loginpage();
		lp2 = new TelephoneRequestorpage();
		as = new Actionscreenshot();
		lp.applogin(prop.getProperty("UserName1"), prop.getProperty("Password1"));
		lp2.reimbclick();
	}

	
	/*
	 * @DataProvider public Object[][] gettelephonedata() throws
	 * InvalidFormatException{ Object[][] data=ReadExcel.getTestData("Telephone");
	 * return data;
	 */
	 
//}
	/*
	 * @Test public void dropdownpage() throws InterruptedException {
	 * lp2.dropdown(); }
	 */
	
	@Test(priority =1) 
	public void Reimbursementallflowtest() throws InterruptedException {
	   lp2.Reimbursementallflow();
	}
	
	@Test(priority =2) 
	public void Basicbuttionpagetestt() throws InterruptedException {
	   lp2.basicbuttontpage();
	}
	
	
	
	@Test(priority = 3) 
	public void Allmandatorypagetest() throws InterruptedException {
	   lp2.Allmandatoryfield();
		//as.GetScreenshot();
	}
	
	@Test(priority = 4)
	public void yearpage() throws InterruptedException {
		lp2.year();
     
    }
	@Test(priority = 5)
	public void applicablepage() throws InterruptedException {
		lp2.applicable();
     //  as.GetScreenshot();
    }
	@Test(priority = 6)
	public void timepage() throws InterruptedException {
		lp2.time();
       //as.GetScreenshot();
    }
	@Test(priority = 7)
	public void invoicepage() throws InterruptedException {
		
		lp2.invoice();
		 
	}
	
	@Test(priority = 8)
	public void datespage() throws InterruptedException {
		lp2.dates();
       
    }
	@Test(priority = 9)
	public void amountpage() throws InterruptedException {
		lp2.amount();
     
    }
	@Test(priority = 10)
	public void addpage() throws InterruptedException {
		lp2.add();
     
    }
	@Test(priority = 11)
	public void deletepage() throws InterruptedException {
		lp2.delete();
       
    }
	@Test(priority = 12)
	public void description() throws InterruptedException {
		lp2.descriptio();
      
    }
	@Test(priority = 13)
	public void fileuploadtest() throws InterruptedException {
		lp2.Fileupload();
      // as.GetScreenshot();
    }
	@Test(priority = 14)
	public void totaldetailcanceltest() throws InterruptedException {
	lp2.totaldetailscancel();
	}
	
	
	@Test(priority = 15)
	public void filesavetest() throws InterruptedException {
		lp2.filesave();
      
  }
	@Test(priority= 16)
	public void editupload() throws InterruptedException{
	lp2.editupload();
	}
	@Test(priority= 17)
	public void finalsumit() throws InterruptedException{
	lp2.finalsumit();
	}
	@Test(priority= 18  )
	public void viewpagetest() throws InterruptedException {
		lp2.viewthepage();
	}
	
	@Test(priority= 19  )
	public void quitformtest() throws InterruptedException {
		lp2.quitformpage();
	}
	@Test(priority= 20  )
	public void Frontdeletetest() throws InterruptedException {
		lp2.frontdelete1();
	}	
	
	 @Test(priority= 21  )
		public void  againcreateformtest() throws InterruptedException {
			lp2.againcreateform();
		}	
	
@AfterMethod
public void quit(){
	driver.quit();
}
	
}
