package Admin.testcase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import IREL.Base.testbase;
import IREL.Commonutility.Actionscreenshot;
import IREL.Pages.ClaimintimationRequestorpage;
import IREL.Pages.Loginpage;
import IREL.Pages.MedicalchangeRequestpage;

public class ClaimintimationRequestortest extends testbase {

	Loginpage lp;
	ClaimintimationRequestorpage Cir;
	Actionscreenshot as;

	public ClaimintimationRequestortest() {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		initilization();
		lp = new Loginpage();
		Cir = new ClaimintimationRequestorpage();
		as = new Actionscreenshot();
		lp.applogin(prop.getProperty("UserName1"), prop.getProperty("Password1"));
		Cir.reimbclick();
	}
	@Test(priority = 1)
	public void  Creatnewgobacktest() throws InterruptedException {
	Cir.Creatnewgoback();
	}
	
	@Test(priority=2)
	public void  Allmandatoryfieldtest() throws InterruptedException{
		Cir.Allmandatoryfield();	
	}
	
	@Test(priority=3)
	public void dateofadmissiontest() throws InterruptedException {
		Cir.dateofadmission();	
	}
	
	@Test(priority=4)
	public void Nameofhospitaltest() throws InterruptedException{
		Cir.Nameofhospital();
		}
	
	@Test(priority=5)
	public void locationofhospitaltest() throws InterruptedException {
		Cir.locationofhospital();
		}
	
	@Test(priority=6)
	public void advanceselectiontest() throws InterruptedException {
		Cir.advanceselection();	
	}
	@Test(priority=7)
	public void advanceamounttest() throws InterruptedException {
		Cir.advanceamount();
	}
	
	@Test(priority=8)
	public void nameofpatienttest() throws InterruptedException {
		Cir.nameofpatient();
		}
	
	@Test(priority=9)
	public void agetest() throws InterruptedException{
		Cir.age();	
	}
	
	
	@Test(priority=10)
	public void relationtest() throws InterruptedException {
		Cir.relation();
	}
	
	@Test(priority=11)
	public void natureofillnesstest() throws InterruptedException {
		Cir.natureofillness();
	}
	
	
	@Test(priority=12)
	public void dischargedatetest() throws InterruptedException {
		Cir.dischargedate();
	}
	
	@Test(priority=13)
	public void canceladdingmemeberstest() throws InterruptedException {
		Cir.canceladdingmemebers();
	}
	
	@Test(priority=12)
	public void savetest() throws InterruptedException {
 Cir.save();
	}
	
	@Test(priority=13)
    public void sumbit() throws InterruptedException {
		Cir.sumbit();	
	}
	
	@Test(priority=13)
    public void quittest() throws InterruptedException {
		Cir.quit();	
	}
	
	@Test(priority=14)
    public void deletetest() throws InterruptedException {
		Cir.delete();	
	}
	
	@Test(priority=14)
    public void submitformtest() throws InterruptedException {
		Cir.submitform();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
