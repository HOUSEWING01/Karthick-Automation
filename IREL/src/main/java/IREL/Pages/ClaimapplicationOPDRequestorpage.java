package IREL.Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import IREL.Base.testbase;

public class ClaimapplicationOPDRequestorpage extends testbase {
	JavascriptExecutor js;
	@FindBy(xpath = "//a[contains(text(),' Reimbursement')]")
	WebElement reimb;
	@FindBy(linkText = "Medical")
	WebElement medical;
	@FindBy(linkText = "Claim Application")
	WebElement ClaimApplication;
	@FindBy(xpath = "//a[contains(text(),'Create')]")
	WebElement crtnew;
	@FindBy(xpath = "//input[@value='OPD']")
	WebElement OPD;
	@FindBy(css = "select#nameOfPatient")
	WebElement selectpatient;
	@FindBy(xpath = "//*[@id=\"nameOfPatient\"]/option[2]")
	WebElement names;
	@FindBy(xpath = "//input[@name='doctorsPrescription' and @value='Y']")
	WebElement companydoctor;
	@FindBy(xpath = "//input[@name='doctorsPrescriptionHospName' and @value='N']")
	WebElement referredcompanydoctor;
	@FindBy(xpath = "")
	WebElement RecognizedHospital;
	@FindBy(name = "billNo1")
	WebElement PrescriptionBill;
	@FindBy(name = "billNo2")
	WebElement Medicinebill;
	@FindBy(name = "billNo3")
	WebElement Testbills;
	@FindBy(name = "billDate1")
	WebElement Prescriptiondate;
	@FindBy(name = "billDate2")
	WebElement Medicinebilldate;
	@FindBy(name = "billDate3")
	WebElement Testbillsdate;
	@FindBy(xpath = "//input[@name='claimedAmount1']")
	WebElement Amount;
	@FindBy(xpath = "//input[@name='claimedAmount2']")
	WebElement Medicinebillamount;
	@FindBy(xpath = "//input[@name='claimedAmount3']")
	WebElement Testbillsamount;
	@FindBy(xpath = "//input[@name='isChecklifeDis']")
	WebElement Consultation;
	@FindBy(xpath = "//input[@value='1st']")
	WebElement Consultationselection;
	@FindBy(xpath = "//button[@value='Add']")
	WebElement add;
	@FindBy(xpath = "//button[@value='Add Row']")
	WebElement addrow;
	@FindBy(xpath = "//button[@value='Delete']")
	WebElement delete;
	@FindBy(xpath = "//button[@value='Delete Row']")
	WebElement deleterow;
	@FindBy(xpath = "/html/body/div[2]/div[5]/div/div[1]/div[2]/div[2]/form/div[4]/table[2]/tbody/tr/td[2]/input")
	WebElement medicinedescription;
	@FindBy(xpath = "/html/body/div[2]/div[5]/div/div[1]/div[2]/div[2]/form/div[4]/table[2]/tbody/tr/td[3]/input")
	WebElement descriptionamount;
	@FindBy(css = "#appendfilerow > tr:nth-child(1) > td:nth-child(3) > input")
	WebElement fileupload1;
	@FindBy(css = "#rowFileAdd2 > td:nth-child(3) > input")
	WebElement fileupload2;
	@FindBy(css = "#rowFileAdd3 > td:nth-child(3) > input")
	WebElement fileupload3;
	@FindBy(css = "#rowFileAdd4 > td:nth-child(3) > input")
	WebElement fileupload4;
	@FindBy(css = "#rowFileAdd5 > td:nth-child(3) > input")
	WebElement fileupload5;
	@FindBy(xpath = "//*[@id=\"myform\"]/div[8]/input")
	WebElement acceptandagree;
	@FindBy(xpath = "//*[@id=\"claimApplicationForm\"]/div[8]/input")
	WebElement acceptclaim;
	@FindBy(xpath = "//input[@value='Save']")
	WebElement save;
	@FindBy(xpath = "//input[@value='Submit']")
	WebElement Sumit;
	@FindBy(xpath = "//input[@value='Cancel']")
	WebElement exit;
	@FindBy(xpath = "//a[contains(text(),'Go Back')]")
	WebElement Goback;
	@FindBy(xpath = "//a[contains(text(),'Edit')]")
	WebElement edit;
	@FindBy(xpath = "//a[contains(text(),'Delete')]")
	WebElement delete1;
	@FindBy(xpath = "//a[contains(text(),'Quit')]")
	WebElement Quit;
	
	@FindBy(xpath = "//input[@value='Update']")
	WebElement Update;
	@FindBy(xpath = "//a[contains(text(),'Show')]")
	WebElement Show;

	public ClaimapplicationOPDRequestorpage() {
		PageFactory.initElements(driver, this);
	}

	public void reimbclick() throws InterruptedException {
		js = (JavascriptExecutor) driver;
		// as = new Actionscreenshot();
		js.executeScript("arguments[0].click()", reimb);
		Thread.sleep(3000);
		medical.click();
		Thread.sleep(3000);
		ClaimApplication.click();
		Thread.sleep(3000);
	}

	public void Creatnewgoback() throws InterruptedException {
		Thread.sleep(3000);
		crtnew.click();
		Thread.sleep(3000);
		Goback.click();
		Thread.sleep(3000);
	}

	public void Allmandatoryfield() throws InterruptedException {
		Thread.sleep(3000);
		crtnew.click();
		Thread.sleep(3000);
		Sumit.click();
		Thread.sleep(3000);
		Alert simple = driver.switchTo().alert();
		Thread.sleep(3000);
		simple.accept();
	}

	public void opdandnameofpatient() throws InterruptedException {
		Thread.sleep(3000);
		crtnew.click();
		Thread.sleep(3000);
		OPD.click();
		Thread.sleep(3000);
		select(selectpatient, prop.getProperty("familyname1"));
		Thread.sleep(3000);
		companydoctor.click();
		Thread.sleep(3000);
		referredcompanydoctor.click();
		Thread.sleep(3000);
		Sumit.click();
		Thread.sleep(3000);
		Alert simple = driver.switchTo().alert();
		Thread.sleep(3000);
		simple.accept();
		Thread.sleep(3000);
	}
	

	public void Prescriptiondetails() throws InterruptedException {
		Thread.sleep(3000);
		crtnew.click();
		Thread.sleep(3000);
		OPD.click();
		Thread.sleep(3000);
		select(selectpatient, prop.getProperty("familyname1"));
		Thread.sleep(3000);
		companydoctor.click();
		Thread.sleep(3000);
		referredcompanydoctor.click();
		Thread.sleep(3000);
		PrescriptionBill.sendKeys("DHRE  473");
		Thread.sleep(3000);
		PrescriptionBill.clear();
		Thread.sleep(3000);
		PrescriptionBill.sendKeys("DHRE473");
		Thread.sleep(3000);
		Prescriptiondate.sendKeys("03/11/2021");
		Thread.sleep(3000);
		Amount.sendKeys("895405895942.4");// 14values
		Thread.sleep(3000);
		Amount.clear();
		Thread.sleep(3000);
		Amount.sendKeys("389443905782.74");// 15values
		Thread.sleep(3000);
		Amount.clear();
		Thread.sleep(3000);
		Amount.sendKeys("1000");
		Thread.sleep(3000);
		Medicinebill.sendKeys("DRAR567");
		Thread.sleep(3000);
		Medicinebilldate.sendKeys("04/04/2022");
		Thread.sleep(3000);
		Medicinebillamount.sendKeys("400");
		Thread.sleep(3000);
		Testbills.sendKeys("FWDT456");
		Thread.sleep(3000);
		Testbillsdate.sendKeys("05/03/2021");
		Thread.sleep(3000);
		Testbillsamount.sendKeys("650");
		Thread.sleep(3000);
	}

	public void DiseaseConsultation() throws InterruptedException {
		Thread.sleep(3000);
		crtnew.click();
		Thread.sleep(3000);
		OPD.click();
		Thread.sleep(3000);
		select(selectpatient, prop.getProperty("familyname1"));
		Thread.sleep(3000);
		companydoctor.click();
		Thread.sleep(3000);
		referredcompanydoctor.click();
		Thread.sleep(3000);
		PrescriptionBill.sendKeys("DHRE473");
		Thread.sleep(3000);
		Prescriptiondate.sendKeys("03/11/2021");
		Thread.sleep(3000);
		Amount.sendKeys("1000");
		Thread.sleep(3000);
		Medicinebill.sendKeys("DRAR567");
		Thread.sleep(3000);
		Medicinebilldate.sendKeys("04/04/2022");
		Thread.sleep(3000);
		Medicinebillamount.sendKeys("400");
		Thread.sleep(3000);
		Testbills.sendKeys("FWDT456");
		Thread.sleep(3000);
		Testbillsdate.sendKeys("05/03/2021");
		Thread.sleep(3000);
		Testbillsamount.sendKeys("650");
		Thread.sleep(3000);
		Consultation.click();
		Thread.sleep(3000);
		Consultationselection.click();
		Thread.sleep(3000);
	}

	public void Prescriptionsbillsadding() throws InterruptedException {
		Thread.sleep(3000);
		crtnew.click();
		Thread.sleep(3000);
		OPD.click();
		Thread.sleep(3000);
		select(selectpatient, prop.getProperty("familyname1"));
		Thread.sleep(3000);
		companydoctor.click();
		Thread.sleep(3000);
		referredcompanydoctor.click();
		Thread.sleep(3000);
		PrescriptionBill.sendKeys("DHRE473");
		Thread.sleep(3000);
		Prescriptiondate.sendKeys("03/11/2021");
		Thread.sleep(3000);
		Amount.sendKeys("1000");
		Thread.sleep(3000);
		Medicinebill.sendKeys("DRAR567");
		Thread.sleep(3000);
		Medicinebilldate.sendKeys("04/04/2022");
		Thread.sleep(3000);
		Medicinebillamount.sendKeys("400");
		Thread.sleep(3000);
		Testbills.sendKeys("FWDT456");
		Thread.sleep(3000);
		Testbillsdate.sendKeys("05/03/2021");
		Thread.sleep(3000);
		Testbillsamount.sendKeys("650");
		Thread.sleep(3000);
		Consultation.click();
		Thread.sleep(3000);
		Consultationselection.click();
		Thread.sleep(3000);
		add.click();
		Thread.sleep(3000);
		delete.click();
		Thread.sleep(3000);
		add.click();
		Thread.sleep(3000);
		add.click();
		Thread.sleep(3000);
		delete.click();
		Thread.sleep(3000);
		delete.click();
		Thread.sleep(3000);
		medicinedescription.sendKeys("bill");
		Thread.sleep(3000);
		descriptionamount.sendKeys("200");
		Thread.sleep(3000);
	}

	public void documentuploadAccept() throws InterruptedException {
		Thread.sleep(3000);
		crtnew.click();
		Thread.sleep(3000);
		OPD.click();
		Thread.sleep(3000);
		select(selectpatient, prop.getProperty("familyname1"));
		Thread.sleep(3000);
		companydoctor.click();
		Thread.sleep(3000);
		referredcompanydoctor.click();
		Thread.sleep(3000);
		PrescriptionBill.sendKeys("DHRE473");
		Thread.sleep(3000);
		Prescriptiondate.sendKeys("03/11/2021");
		Thread.sleep(3000);
		Amount.sendKeys("1000");
		Thread.sleep(3000);
		Medicinebill.sendKeys("DRAR567");
		Thread.sleep(3000);
		Medicinebilldate.sendKeys("04/04/2022");
		Thread.sleep(3000);
		Medicinebillamount.sendKeys("400");
		Thread.sleep(3000);
		Testbills.sendKeys("FWDT456");
		Thread.sleep(3000);
		Testbillsdate.sendKeys("05/03/2021");
		Thread.sleep(3000);
		Testbillsamount.sendKeys("650");
		Thread.sleep(3000);
		Consultation.click();
		Thread.sleep(3000);
		Consultationselection.click();
		Thread.sleep(3000);
		add.click();
		Thread.sleep(3000);
		delete.click();
		Thread.sleep(3000);
		add.click();
		Thread.sleep(3000);
		add.click();
		Thread.sleep(3000);
		delete.click();
		Thread.sleep(3000);
		delete.click();
		Thread.sleep(3000);
		medicinedescription.sendKeys("bill");
		Thread.sleep(3000);
		descriptionamount.sendKeys("200");
		Thread.sleep(3000);
		addrow.click();
		Thread.sleep(3000);
		addrow.click();
		Thread.sleep(3000);
		addrow.click();
		Thread.sleep(3000);
		addrow.click();
		Thread.sleep(3000);
		addrow.click();
		Thread.sleep(3000);
		deleterow.click();
		Thread.sleep(3000);
		fileupload1.sendKeys("C:\\Users\\soumya_hugar\\Desktop\\Upload files\\File1.pdf");
		Thread.sleep(3000);
		fileupload2.sendKeys("C:\\Users\\soumya_hugar\\Desktop\\Upload files\\File2.jpg");
		Thread.sleep(3000);
		fileupload3.sendKeys("C:\\Users\\soumya_hugar\\Desktop\\Upload files\\File3.docx");
		Thread.sleep(3000);
		fileupload4.sendKeys("C:\\Users\\soumya_hugar\\Desktop\\Upload files\\File4.xlsx");
		Thread.sleep(3000);
		fileupload5.sendKeys("C:\\Users\\soumya_hugar\\Desktop\\Upload files\\File5.png");
		Thread.sleep(3000);
		acceptandagree.click();
		Thread.sleep(3000);
	}

	public void canceladddetails() throws InterruptedException {
		Thread.sleep(3000);
		crtnew.click();
		Thread.sleep(3000);
		OPD.click();
		Thread.sleep(3000);
		select(selectpatient, prop.getProperty("familyname1"));
		Thread.sleep(3000);
		companydoctor.click();
		Thread.sleep(3000);
		referredcompanydoctor.click();
		Thread.sleep(3000);
		PrescriptionBill.sendKeys("DHRE473");
		Thread.sleep(3000);
		Prescriptiondate.sendKeys("03/11/2021");
		Thread.sleep(3000);
		Amount.sendKeys("1000");
		Thread.sleep(3000);
		Medicinebill.sendKeys("DRAR567");
		Thread.sleep(3000);
		Medicinebilldate.sendKeys("04/04/2022");
		Thread.sleep(3000);
		Medicinebillamount.sendKeys("400");
		Thread.sleep(3000);
		Testbills.sendKeys("FWDT456");
		Thread.sleep(3000);
		Testbillsdate.sendKeys("05/03/2021");
		Thread.sleep(3000);
		Testbillsamount.sendKeys("650");
		Thread.sleep(3000);
		Consultation.click();
		Thread.sleep(3000);
		Consultationselection.click();
		Thread.sleep(3000);
		add.click();
		Thread.sleep(3000);
		delete.click();
		Thread.sleep(3000);
		add.click();
		Thread.sleep(3000);
		add.click();
		Thread.sleep(3000);
		delete.click();
		Thread.sleep(3000);
		delete.click();
		Thread.sleep(3000);
		medicinedescription.sendKeys("bill");
		Thread.sleep(3000);
		descriptionamount.sendKeys("200");
		Thread.sleep(3000);
		addrow.click();
		Thread.sleep(3000);
		addrow.click();
		Thread.sleep(3000);
		addrow.click();
		Thread.sleep(3000);
		addrow.click();
		Thread.sleep(3000);
		fileupload1.sendKeys("C:\\Users\\soumya_hugar\\Desktop\\Upload files\\File1.pdf");
		Thread.sleep(3000);
		fileupload2.sendKeys("C:\\Users\\soumya_hugar\\Desktop\\Upload files\\File2.jpg");
		Thread.sleep(3000);
		fileupload3.sendKeys("C:\\Users\\soumya_hugar\\Desktop\\Upload files\\File3.docx");
		Thread.sleep(3000);
		fileupload4.sendKeys("C:\\Users\\soumya_hugar\\Desktop\\Upload files\\File4.xlsx");
		Thread.sleep(3000);
		fileupload5.sendKeys("C:\\Users\\soumya_hugar\\Desktop\\Upload files\\File5.png");
		Thread.sleep(3000);
		acceptandagree.click();
		Thread.sleep(3000);
		exit.click();
		Thread.sleep(3000);
	}

	public void filesave() throws InterruptedException {
		Thread.sleep(3000);
		crtnew.click();
		Thread.sleep(3000);
		OPD.click();
		Thread.sleep(3000);
		select(selectpatient, prop.getProperty("familyname1"));
		Thread.sleep(3000);
		companydoctor.click();
		Thread.sleep(3000);
		referredcompanydoctor.click();
		Thread.sleep(3000);
		PrescriptionBill.sendKeys("DHRE473");
		Thread.sleep(3000);
		Prescriptiondate.sendKeys("03/11/2021");
		Thread.sleep(3000);
		Amount.sendKeys("1000");
		Thread.sleep(3000);
		Medicinebill.sendKeys("DRAR567");
		Thread.sleep(3000);
		Medicinebilldate.sendKeys("04/04/2022");
		Thread.sleep(3000);
		Medicinebillamount.sendKeys("400");
		Thread.sleep(3000);
		Testbills.sendKeys("FWDT456");
		Thread.sleep(3000);
		Testbillsdate.sendKeys("05/03/2021");
		Thread.sleep(3000);
		Testbillsamount.sendKeys("650");
		Thread.sleep(3000);
		Consultation.click();
		Thread.sleep(3000);
		Consultationselection.click();
		Thread.sleep(3000);
		add.click();
		Thread.sleep(3000);
		delete.click();
		Thread.sleep(3000);
		add.click();
		Thread.sleep(3000);
		add.click();
		Thread.sleep(3000);
		delete.click();
		Thread.sleep(3000);
		delete.click();
		Thread.sleep(3000);
		medicinedescription.sendKeys("bill");
		Thread.sleep(3000);
		descriptionamount.sendKeys("200");
		Thread.sleep(3000);
		addrow.click();
		Thread.sleep(3000);
		addrow.click();
		Thread.sleep(3000);
		addrow.click();
		Thread.sleep(3000);
		addrow.click();
		Thread.sleep(3000);
		fileupload1.sendKeys("C:\\Users\\soumya_hugar\\Desktop\\Upload files\\File1.pdf");
		Thread.sleep(3000);
		fileupload2.sendKeys("C:\\Users\\soumya_hugar\\Desktop\\Upload files\\File2.jpg");
		Thread.sleep(3000);
		fileupload3.sendKeys("C:\\Users\\soumya_hugar\\Desktop\\Upload files\\File3.docx");
		Thread.sleep(3000);
		fileupload4.sendKeys("C:\\Users\\soumya_hugar\\Desktop\\Upload files\\File4.xlsx");
		Thread.sleep(3000);
		fileupload5.sendKeys("C:\\Users\\soumya_hugar\\Desktop\\Upload files\\File5.png");
		Thread.sleep(3000);
		acceptandagree.click();
		Thread.sleep(3000);
		save.click();
		Thread.sleep(3000);
		Alert simple = driver.switchTo().alert();
		Thread.sleep(3000);
		simple.accept();
		Thread.sleep(3000);
	}

	public void finalsumit() throws InterruptedException {
		Thread.sleep(3000);
		edit.click();
		Thread.sleep(3000);
		acceptclaim.click();
		Thread.sleep(3000);
		Sumit.click();
		Thread.sleep(3000);
		Alert simple = driver.switchTo().alert();
		Thread.sleep(3000);
		simple.accept();
		Thread.sleep(3000);
	}

	public void viewthepage() throws InterruptedException {
		Thread.sleep(3000);
		Show.click();
		Thread.sleep(3000);
	}

	public void quitformpage() throws InterruptedException {
		Thread.sleep(3000);
		Quit.click();
		Thread.sleep(3000);
		Alert simple = driver.switchTo().alert();
		Thread.sleep(3000);
		simple.accept();
		Thread.sleep(3000);
		delete1.click();
		Thread.sleep(3000);
		Alert simple1 = driver.switchTo().alert();
		Thread.sleep(3000);
		simple1.accept();
		
	}

	public void againcreateform() throws InterruptedException {
		Thread.sleep(3000);
		crtnew.click();
		Thread.sleep(3000);
		OPD.click();
		Thread.sleep(3000);
		select(selectpatient, prop.getProperty("familyname1"));
		Thread.sleep(3000);
		companydoctor.click();
		Thread.sleep(3000);
		referredcompanydoctor.click();
		Thread.sleep(3000);
		PrescriptionBill.sendKeys("DHRE473");
		Thread.sleep(3000);
		Prescriptiondate.sendKeys("03/11/2021");
		Thread.sleep(3000);
		Amount.sendKeys("1000");
		Thread.sleep(3000);
		Medicinebill.sendKeys("DRAR567");
		Thread.sleep(3000);
		Medicinebilldate.sendKeys("04/04/2022");
		Thread.sleep(3000);
		Medicinebillamount.sendKeys("400");
		Thread.sleep(3000);
		Testbills.sendKeys("FWDT456");
		Thread.sleep(3000);
		Testbillsdate.sendKeys("05/03/2021");
		Thread.sleep(3000);
		Testbillsamount.sendKeys("650");
		Thread.sleep(6000);
		Consultation.click();
		Thread.sleep(6000);
		Consultationselection.click();
		Thread.sleep(3000);
		add.click();
		Thread.sleep(3000);
		delete.click();
		Thread.sleep(3000);
		add.click();
		Thread.sleep(3000);
		add.click();
		Thread.sleep(3000);
		delete.click();
		Thread.sleep(3000);
		delete.click();
		Thread.sleep(3000);
		medicinedescription.sendKeys("bill");
		Thread.sleep(3000);
		descriptionamount.sendKeys("200");
		Thread.sleep(3000);
		addrow.click();
		Thread.sleep(3000);
		addrow.click();
		Thread.sleep(3000);
		addrow.click();
		Thread.sleep(3000);
		addrow.click();
		Thread.sleep(3000);
		fileupload1.sendKeys("C:\\Users\\soumya_hugar\\Desktop\\Upload files\\File1.pdf");
		Thread.sleep(3000);
		fileupload2.sendKeys("C:\\Users\\soumya_hugar\\Desktop\\Upload files\\File2.jpg");
		Thread.sleep(3000);
		fileupload3.sendKeys("C:\\Users\\soumya_hugar\\Desktop\\Upload files\\File3.docx");
		Thread.sleep(3000);
		fileupload4.sendKeys("C:\\Users\\soumya_hugar\\Desktop\\Upload files\\File4.xlsx");
		Thread.sleep(3000);
		fileupload5.sendKeys("C:\\Users\\soumya_hugar\\Desktop\\Upload files\\File5.png");
		Thread.sleep(3000);
		acceptandagree.click();
		Thread.sleep(3000);
		Sumit.click();
		Alert simple = driver.switchTo().alert();
		Thread.sleep(3000);
		simple.accept();
		Thread.sleep(3000);
		
	}

}
