package Admin.testcase;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import IREL.Base.testbase;
import IREL.Pages.Loginpage;


public class Logintest extends testbase {
	
    Loginpage objlog;
    
    public Logintest() {
    	super();
    }
    
   @Test
    public void logintest() {
    	String expectedpagetitle="IREL: Login";
    	Assert.assertEquals(objlog.getpagetitle(), expectedpagetitle);
    	Assert.assertTrue(objlog.logo());
    	String expectedformtitle="Login";
    	Assert.assertEquals(objlog.getformtext(), expectedformtitle);
    	try {
			objlog.applogin(prop.getProperty("UserName"),prop.getProperty("Password"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	   }
    
    @AfterClass
    public void teardown()
    {
    	
    }
	@BeforeClass 
	public void setup() 
	{
		initilization();
		
		objlog=new Loginpage();
		
	}
    
    
    
   
    
}
