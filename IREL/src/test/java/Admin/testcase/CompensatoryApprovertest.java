package Admin.testcase;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import IREL.Base.testbase;
import IREL.Commonutility.Actionscreenshot;
import IREL.Pages.AnnualleaveApproverpage;
import IREL.Pages.AnnualleaveRequestorpage;
import IREL.Pages.CompensatoryApproverpage;
import IREL.Pages.CompensatoryRequestorpage;
import IREL.Pages.Loginpage;

public class CompensatoryApprovertest extends testbase {
	Loginpage lp;
	CompensatoryApproverpage Ca;
	Actionscreenshot as;

	public CompensatoryApprovertest() {
		super();
	}

	@BeforeMethod
	public void setup() throws InterruptedException {
		initilization();
		lp = new Loginpage();
		Ca = new CompensatoryApproverpage();
		as = new Actionscreenshot();
		lp.applogin(prop.getProperty("UserName2"), prop.getProperty("Password2"));
		Ca.Leaveclick();
	}
	

@Test(priority = 1)
public void  rejectformrresettest() throws InterruptedException {
	Ca.rejectformreset();
}


@Test(priority = 2)
public void  finalrejectformtest() throws InterruptedException {
	Ca.finalrejectedform();
}


}
