package Admin.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import IREL.Base.testbase;
import IREL.Commonutility.Actionscreenshot;
import IREL.Pages.ClaimapplicationOPDRequestorpage;
import IREL.Pages.ClaimintimationRequestorpage;
import IREL.Pages.Loginpage;

public class ClaimapplicationOPDRequestortest extends testbase{
	Loginpage lp;
	ClaimapplicationOPDRequestorpage Car;
	Actionscreenshot as;

	public ClaimapplicationOPDRequestortest() {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		initilization();
		lp = new Loginpage();
		Car = new ClaimapplicationOPDRequestorpage();
		as = new Actionscreenshot();
		lp.applogin(prop.getProperty("UserName1"), prop.getProperty("Password1"));
		Car.reimbclick();
	}
	

@Test(priority = 1)
public void  Creatnewgobacktest() throws InterruptedException {
Car.Creatnewgoback();
}

@Test(priority=2)
public void  Allmandatoryfieldtest() throws InterruptedException{
	Car.Allmandatoryfield();	
}
@Test(priority=3)
public void  opdandnameofpatienttest() throws InterruptedException{
	Car.opdandnameofpatient();	
}


@Test(priority=4)
public void Prescriptiondetailstest() throws InterruptedException {
	Car.Prescriptiondetails();	
}
@Test(priority=5)
public void DiseaseConsultationtest() throws InterruptedException {
	Car.DiseaseConsultation();
}
@Test(priority=6)
public void Prescriptionsbillsaddingtest() throws InterruptedException {
	Car.Prescriptionsbillsadding();
}
@Test(priority=7)
public void documentuploadAccepttest() throws InterruptedException {
	Car.documentuploadAccept();
}
@Test(priority=8)
public void canceladddetailstest() throws InterruptedException {
	Car.canceladddetails();
}
@Test(priority=9)
public void filesavetest() throws InterruptedException {
	Car.filesave();
}
@Test(priority=10)
public void finalsumittest() throws InterruptedException {
	Car.finalsumit();
}
@Test(priority=11)
public void viewthepagetest() throws InterruptedException {
	Car.viewthepage();
}
@Test(priority=12)
public void quitformpagetest() throws InterruptedException {
	Car.quitformpage();
}
@Test(priority=13)
public void againcreateform() throws InterruptedException {
	Car.againcreateform();
}




	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
