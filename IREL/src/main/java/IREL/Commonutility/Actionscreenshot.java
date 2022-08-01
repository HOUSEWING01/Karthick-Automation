package IREL.Commonutility;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import IREL.Base.testbase;

public class Actionscreenshot extends testbase
{
	public static void uploadoc(WebElement el, String loc) {
		Actions act = new Actions(driver);
		act.click(el).perform();
		StringSelection str = new StringSelection(loc);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		Robot rb;
		try {
			rb = new Robot();

			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_ENTER);

			rb.keyPress(KeyEvent.VK_CONTROL); 
			rb.keyPress(KeyEvent.VK_V);

			rb.keyRelease(KeyEvent.VK_CONTROL);
			rb.keyRelease(KeyEvent.VK_V);

			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_ENTER);
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// Screenshot requestor
	public static void GetScreenshot()  {

		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File desig=new File(System.getProperty("user.dir")+"./Requestorscreenshot/"+System.currentTimeMillis()+".png");
		try {
			FileHandler.copy(source, desig);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//Screenshot1 approver
	public static void GetScreenshot1()  {

		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File desig=new File(System.getProperty("user.dir")+"./Approverscreenshot/"+System.currentTimeMillis()+".png");
		try {
			FileHandler.copy(source, desig);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		


	}


