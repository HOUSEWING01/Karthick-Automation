package IREL.Commonutility;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;



public class importexcel{

	static WebDriver d;
	static WebDriverWait wait;
	static Actions action;
	static String startdate, enddate;
	static XSSFWorkbook excel_wb;
	static String billablecode, date1, date2, date3, date4, date5, date6, date7, total;
	//static List<String> billable = new ArrayList<>();
//	static List<String> nonbillable = new ArrayList<>();

	public static void main(String args[]) throws IOException, InterruptedException

	{

		// Opening website
		WebDriverManager.chromedriver().setup();
		d = new ChromeDriver();
		d.get("https://fieldglass.net");
		d.manage().window().maximize();

		// Logging in

		// Getting Username
		String Username = JOptionPane.showInputDialog("Enter Username");
		// Getting Masked Password
		JPanel panel = new JPanel();
		JLabel label = new JLabel("Enter a password:");
		JPasswordField pass = new JPasswordField(20);
		panel.add(label);
		panel.add(pass);
		String[] options = new String[] { "OK", "Cancel" };
		int option = JOptionPane.showOptionDialog(null, panel, "The title", JOptionPane.NO_OPTION,
				JOptionPane.PLAIN_MESSAGE, null, options, options[1]);
		if (option == 0) // pressing OK button
		{
			char[] password = pass.getPassword();

			d.findElement(By.id("usernameId_new")).sendKeys(Username);
			d.findElement(By.id("passwordId_new")).sendKeys(new String(password));
		}
		d.findElement(By.className("entryLoginInput_button")).click();

		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		/*
		 * d.findElement(By.className("userMenuControl")).click();
		 * 
		 * //clicking on linked accounts
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(
		 * "linkedAccountUserName_1")));
		 * wait.until(ExpectedConditions.elementToBeClickable(By.id(
		 * "linkedAccountUserName_1"))); List<WebElement>listofaccounts =
		 * d.findElements(By.className("linkedAccountUserName")); for(WebElement
		 * linkedaccount : listofaccounts) { String linktext= linkedaccount.getText();
		 * System.out.println(linktext);
		 * 
		 * }
		 */

		// Getting Start and End Date
		JOptionPane.showMessageDialog(null, "Welcome to Field Glass. Please enter the date range to pull the report");
		startdate = JOptionPane.showInputDialog("Enter Start Date in MM/DD/YYYY Format");
		enddate = JOptionPane.showInputDialog("Enter End Date in MM/DD/YYYY Format");
		excel_wb = new XSSFWorkbook();
		excel_wb.createSheet();
		// clicking on user names
		action = new Actions(d);
		WebElement nameList = d.findElement(By.xpath("//*[@id=\"accountMenu\"]/ul/ul[2]"));
		List<WebElement> totalHC = nameList.findElements(By.tagName("li"));
		int totalC = totalHC.size();
		for (int j = 0; j <= totalC; j++) {
			// Skip Anjali, Muthu, Anusha MAry, TC Anusha, Joyce. Lokesh, Yokhashri
			if (j == 2 || j == 19 || j == 4 || j == 5 || j == 12 || j == 17 || j == 34)
				continue;
			loop(j);
		}

		d.quit();

		FileOutputStream fileOut;
		try {

			String ts = new SimpleDateFormat("yyyyMMddHHmm").format(new Date());
			fileOut = new FileOutputStream(new File("D:\\" + ts + ".xlsx"));
			// fileOut = new FileOutputStream(new File("D:\\tweek.xlsx"));
			excel_wb.write(fileOut);
			fileOut.close();
			System.out.println("File Completed");
		} catch (Exception e) {
			System.out.println("File not Completed");
			throw new RuntimeException("failure", e);
		} finally {
			excel_wb.close();
			// System.out.print(name+"\t"+status1+"\n");
		}
	}

	public static void loop(int i) throws InterruptedException {

		if (i != 0) // to print the POCs details
		{
			d.findElement(By.className("userMenuControl")).click();
			wait = new WebDriverWait(d, 200);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("linkedAccountUserName_" + i)));
			wait.until(ExpectedConditions.elementToBeClickable(By.id("linkedAccountUserName_" + i)));
			WebElement menuOption = d.findElement(By.id("linkedAccountUserName_" + i));
			action.moveToElement(menuOption).build().perform();
			menuOption.click();
		}

		d.findElement(By.id("timeSheet")).click();

		// selecting start date

		d.findElement(By.id("filterStartDate")).clear();
		d.findElement(By.id("filterStartDate")).sendKeys(startdate);

		// selecting end date

		d.findElement(By.id("filterEndDate")).clear();
		d.findElement(By.id("filterEndDate")).sendKeys(enddate);

		// alternate method
		/*
		 * Select smonth = new Select(d.findElement(By.name("month")));
		 * smonth.selectByVisibleText("February"); Select syear = new
		 * Select(d.findElement(By.name("year"))); syear.selectByVisibleText("2020");
		 * d.findElement(By.id("dayNum_10")).click();
		 */

		// applying filter
		d.findElement(By.xpath("//input[@name='timeSheet_worker_list_search']")).click();

		// Enhancemnet opportunity - to take Billable and Non Billable hours and print
		// in same row
		/*
		 * String ST =
		 * d.findElement(By.xpath("//*[@id='row0timeSheet_worker_list']/div[8]")).
		 * getText(); String NB =
		 * d.findElement(By.xpath("//*[@id='row0timeSheet_worker_list']/div[12]")).
		 * getText(); System.out.println(ST); System.out.println(NB);
		 */
		// wait =new WebDriverWait(d, 2000);
		// wait.until(ExpectedConditions.refreshed(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='archiveLink']"))));

		Thread.sleep(2000);
		WebElement archivelink = d.findElement(By.xpath("//a[@class='archiveLink']"));
		action.moveToElement(archivelink).build().perform();
		archivelink.click();
		String name = d.findElement(By.className("secondaryTitle")).getText();
		String status1 = d.findElement(By.className("values")).getText();
		System.out.println(name);
		System.out.print("\t" + status1 + "\n");
		if (status1.equalsIgnoreCase("Draft")) {
			System.out.print("\t" + status1 + "\n");
		}

		else {
			billablecode = d.findElement(By.className("timeSheetTableSecondaryHeader")).getText();
			date1 = d.findElement(By.xpath("//*[@id='timeSheetMainTable']/tbody/tr[5]/td[1]")).getText();
			date2 = d.findElement(By.xpath("//*[@id='timeSheetMainTable']/tbody/tr[5]/td[2]")).getText();
			date3 = d.findElement(By.xpath("//*[@id='timeSheetMainTable']/tbody/tr[5]/td[3]")).getText();
			date4 = d.findElement(By.xpath("//*[@id='timeSheetMainTable']/tbody/tr[5]/td[4]")).getText();
			date5 = d.findElement(By.xpath("//*[@id='timeSheetMainTable']/tbody/tr[5]/td[5]")).getText();
			date6 = d.findElement(By.xpath("//*[@id='timeSheetMainTable']/tbody/tr[5]/td[6]")).getText();
			date7 = d.findElement(By.xpath("//*[@id='timeSheetMainTable']/tbody/tr[5]/td[7]")).getText();
			total = d.findElement(By.xpath("//*[@id='timeSheetMainTable']/tbody/tr[5]/td[8]")).getText();

		}

		// Referring to the sheet created above
		XSSFSheet excel_sheet = excel_wb.getSheetAt(0); // Excel sheet index starts from 0
		Row header = excel_sheet.createRow(0);
		header.createCell(0).setCellValue("Resource Name");

		// if((status1!="Draft") & (NB.equalsIgnoreCase("0.00")))
		// {
		// System.out.println("im here");
		// future enhancements : Can be converted to loop
		header.createCell(1)
				.setCellValue(d.findElement(By.xpath("//*[@id='timeSheetMainTable']/tbody/tr[2]/th[2]")).getText());
		header.createCell(2)
				.setCellValue(d.findElement(By.xpath("//*[@id='timeSheetMainTable']/tbody/tr[2]/th[3]")).getText());
		header.createCell(3)
				.setCellValue(d.findElement(By.xpath("//*[@id='timeSheetMainTable']/tbody/tr[2]/th[4]")).getText());
		header.createCell(4)
				.setCellValue(d.findElement(By.xpath("//*[@id='timeSheetMainTable']/tbody/tr[2]/th[5]")).getText());
		header.createCell(5)
				.setCellValue(d.findElement(By.xpath("//*[@id='timeSheetMainTable']/tbody/tr[2]/th[6]")).getText());
		header.createCell(6)
				.setCellValue(d.findElement(By.xpath("//*[@id='timeSheetMainTable']/tbody/tr[2]/th[7]")).getText());
		header.createCell(7)
				.setCellValue(d.findElement(By.xpath("//*[@id='timeSheetMainTable']/tbody/tr[2]/th[8]")).getText());
		header.createCell(8).setCellValue("Total");
		header.createCell(9).setCellValue("Billable Code");
		header.createCell(10).setCellValue("Status");
		// }
		//// ENHANCEMENT SCOPE : Read sheets of resources who have filled half billable
		// and non billable by reading the "Total" row in FG
		/*
		 * else { System.out.println("Inside new loop"); //String test =
		 * d.findElement(By.xpath("//*[@id='timeSheetMainTable']/tbody/tr[13]/td[1]")).
		 * getText(); //String test1 =
		 * d.findElement(By.xpath("//*[@id='timeSheetMainTable']/tbody/tr[13]/td[4]")).
		 * getText(); //System.out.println(test+ "\n"+test1);
		 * 
		 * for(int k=1; k<9; k++) {
		 * 
		 * billable.add(d.findElement(By.xpath(
		 * "//*[@id='timeSheetMainTable']/tbody/tr[13]/td["+k+"]")).getText());
		 * System.out.println(d.findElement(By.xpath(
		 * "//*[@id='timeSheetMainTable']/tbody/tr[13]/td["+k+"]")).getText()); }
		 * 
		 * for(int l=1;l<9;l++)
		 * 
		 * { nonbillable.add(d.findElement(By.xpath(
		 * "//*[@id='timeSheetMainTable']/tbody/tr[14]/td["+l+"]")).getText());
		 * System.out.println(d.findElement(By.xpath(
		 * "//*[@id='timeSheetMainTable']/tbody/tr[14]/td["+l+"]")).getText());
		 * 
		 * if(Integer.parseInt(billable.get(l)) > Integer.parseInt(nonbillable.get(l)))
		 * header.createCell(l).setCellValue(billable.get(l)); else
		 * header.createCell(l).setCellValue(nonbillable.get(l));
		 * 
		 * }
		 * 
		 * header.createCell(8).setCellValue(billable.get(7)+nonbillable.get(7)); }
		 * 
		 * header.createCell(10).setCellValue("Status");
		 */

		int row_count = excel_sheet.getLastRowNum();
		Iterator<Row> rowIterator = excel_sheet.iterator();
		rowIterator.next();

		Row row = excel_sheet.createRow(row_count + 1);

		if (status1.equalsIgnoreCase("Draft")) {
			Cell rname = row.createCell(0);
			Cell status = row.createCell(10);
			rname.setCellValue(name);
			status.setCellValue(status1);
		}

		else {
			Cell rname = row.createCell(0);
			Cell d1 = row.createCell(1);
			Cell d2 = row.createCell(2);
			Cell d3 = row.createCell(3);
			Cell d4 = row.createCell(4);
			Cell d5 = row.createCell(5);
			Cell d6 = row.createCell(6);
			Cell d7 = row.createCell(7);
			Cell sum = row.createCell(8);
			Cell bcode = row.createCell(9);
			Cell status = row.createCell(10);

			rname.setCellValue(name);
			d1.setCellValue(date1);
			d2.setCellValue(date2);
			d3.setCellValue(date3);
			d4.setCellValue(date4);
			d5.setCellValue(date5);
			d6.setCellValue(date6);
			d7.setCellValue(date7);
			sum.setCellValue(total);
			bcode.setCellValue(billablecode);
			status.setCellValue(status1);
			// }
			// rname.setCellValue(name);
			// status.setCellValue(status1);

			Thread.sleep(2000);
		}

	}
}
