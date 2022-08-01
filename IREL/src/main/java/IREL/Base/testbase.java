package IREL.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import IREL.Commonutility.WebEventListener;
import IREL.Pages.Loginpage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class testbase {
	public static WebDriver driver;
	public static Properties prop;
	public static Select sel;
    public static  WebDriverWait wt;
    public  static EventFiringWebDriver e_driver;
	public static WebEventListener eventListener;
	public testbase() {
		try {
			FileInputStream ipconfig = new FileInputStream("./src/main/java/IREL/Config/appconfig.properties");
			prop = new Properties();
			prop.load(ipconfig);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void initilization() {

		String browser = prop.getProperty("Browser");
		if (browser.equals("chrome")) {
			ChromeOptions handlingSSL = new ChromeOptions();
			handlingSSL.setAcceptInsecureCerts(true);
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(handlingSSL);
		}
		
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("URL"));
		e_driver = new EventFiringWebDriver(driver);
		// Now create object of EventListerHandler to register it with EventFiringWebDriver
		eventListener = new WebEventListener();
		e_driver.register(eventListener);
		driver = e_driver;
	}
	
	
	
	public void select(WebElement selec, String txt) {
		sel = new Select(selec);
		sel.selectByVisibleText(txt);
	}
	public  void wait(WebElement el) {
		wt = new WebDriverWait(driver, 40);
		wt.until(ExpectedConditions.visibilityOf(el));
	}
	
	public  void alert(Alert simple) throws InterruptedException {
		Thread.sleep(3000);
		 simple = driver.switchTo().alert();
		Thread.sleep(3000);
		simple.accept();
		Thread.sleep(3000);
		
	}
	
}
