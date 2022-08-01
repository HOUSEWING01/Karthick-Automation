package IREL.Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import IREL.Base.testbase;

public class ClaimapplicationIPDRequestorpage extends testbase {
	JavascriptExecutor js;
	@FindBy(xpath = "//a[contains(text(),' Reimbursement')]")
	WebElement reimb;
	@FindBy(linkText = "Medical")
	WebElement medical;
	@FindBy(linkText = "Claim Application")
	WebElement ClaimApplication;
	@FindBy(xpath = "//a[contains(text(),'Create')]")
	WebElement crtnew;
	@FindBy(xpath = "//input[@name='RecognizedHospital']")
	WebElement recognizedHospital;
	@FindBy(css = "select#nameOfPatient")
	WebElement selectpatient;
	@FindBy(xpath = "//input[@name='nameOfHospital']")
	WebElement nameofhospital;
	@FindBy(xpath = "//textarea[@name='AddressOfHospital']")
	WebElement address;
	@FindBy(xpath = "//textarea[@name='DetailsOfIllness']")
	WebElement illness;
	@FindBy(xpath = "//input[@name='StartDateForHospitalize']")
	WebElement StartDateForHospitalize;
	@FindBy(xpath = "//input[@name='endDateOfHospital']")
	WebElement endDateOfHospital;
	@FindBy(xpath = "//input[@name='DateOfClaim']")
	WebElement DateOfClaim;
	@FindBy(xpath = "//input[@name='amountOfClaim']")
	WebElement amountclaim;
	@FindBy(xpath = "//input[@name='recognizedHospitalOrNot' and @value='Y']")
	WebElement recognizedHospitalOrNot;
	@FindBy(xpath = "//input[@name='UnrecognizedHospital']")
	WebElement UnrecognizedHospital;
	@FindBy(xpath = "//input[@name='MCBILLS' and @value='Y']")
	WebElement MCBILLS;
	@FindBy(xpath = "//input[@name='hospitalTaxExempted' and @value='Y']")
	WebElement hospitalTaxExempted;
	@FindBy(xpath = "//input[@name='bedcharges']")
	WebElement bedcharges;
	@FindBy(xpath = "//input[@id='consulationchargesId']")
	WebElement consulationcharges;
	@FindBy(xpath = "//input[@id='doctorchargesId']")
	WebElement doctorchargesID;
	@FindBy(xpath = "//input[@id='surgeonchargesId']")
	WebElement surgeonchargesId;
	@FindBy(xpath = "//input[@id='anesthetistchargesId']")
	WebElement anesthetistchargesId;
	@FindBy(xpath = "//input[@name='operationcharges']")
	WebElement operationcharges;
	@FindBy(xpath = "//input[@name='otherHospChargesName']")
	WebElement otherHospChargesName;
	@FindBy(xpath = "//input[@name='othercharges']")
	WebElement othercharges;
	@FindBy(xpath = "//input[@name='Laborterytestcharges']")
	WebElement Laborterytestcharges;
	@FindBy(xpath = "//input[@name='radiologycharges']")
	WebElement radiologycharges;
	@FindBy(xpath = "//input[@name='scanningcharges']")
	WebElement scanningcharges;
	@FindBy(xpath = "//input[@name='transfusioncharges']")
	WebElement transfusioncharges;
	@FindBy(xpath = "//input[@name='nursingcharges']")
	WebElement nursingcharges;
	@FindBy(xpath = "//input[@name='Injectioncharges']")
	WebElement Injectioncharges;
	@FindBy(xpath = "//input[@name='injectionOutsideCharges']")
	WebElement injectionOutsideCharges;
	@FindBy(xpath = "//input[@name='Ambulancecharges']")
	WebElement Ambulancecharges;
	@FindBy(xpath = "//input[@name='Servicecharges']")
	WebElement Servicecharges;
	@FindBy(xpath = "//input[@name='Registraioncharges']")
	WebElement Registraioncharges;
	@FindBy(xpath = "//input[@name='anyOthercharges']")
	WebElement anyOthercharges;
	
	@FindBy(xpath = "//input[@id='travelExpense']")
	WebElement travelExpense;
	@FindBy(xpath = "//input[@id='hospitalTaxAmount']")
	WebElement hospitalTaxAmount;
	@FindBy(xpath = "//input[@name='DiscountCharges']")
	WebElement DiscountCharges;
	@FindBy(xpath = "//input[@name='Totalcharges']")
	WebElement Totalcharges;
	@FindBy(xpath = "//input[@name='AdvanceTaken']")
	WebElement AdvanceTaken;
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
	@FindBy(xpath = "//button[@value='Add Row']")
	WebElement add;
	@FindBy(xpath = "//button[@value='Add Row']")
	WebElement addrow;
	@FindBy(xpath = "//button[@value='Delete Row']")
	WebElement delete;
	@FindBy(xpath = "//input[@type='checkbox']")
	WebElement agreeandaccept;
	@FindBy(xpath = "//input[@value='Save']")
	WebElement save;
	@FindBy(xpath = "//input[@value='Submit']")
	WebElement submit;
	@FindBy(xpath = "//input[@value='Cancel']")
	WebElement cancel;
	@FindBy(xpath = "//a[contains(text(),'Go Back')]")
	WebElement Goback;
	@FindBy(xpath = "//a[contains(text(),'Edit')]")
	WebElement edit;
	@FindBy(xpath = "//input[@type='checkbox']")
	WebElement acceptclaim;
	@FindBy(xpath = "//a[contains(text(),'Quit')]")
	WebElement Quit;
	@FindBy(xpath = "//a[contains(text(),'Show')]")
	WebElement Show;
	@FindBy(xpath = "//a[contains(text(),'Delete')]")
	WebElement delete1;

	public ClaimapplicationIPDRequestorpage() {
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
		submit.click();
		Thread.sleep(3000);
		Alert simple = driver.switchTo().alert();
		Thread.sleep(3000);
		simple.accept();
	}

	public void Ipdandnameofpatient() throws InterruptedException {
		Thread.sleep(3000);
		crtnew.click();
		Thread.sleep(3000);
		recognizedHospital.sendKeys("ganga");
		Thread.sleep(3000);
		select(selectpatient, prop.getProperty("familyname1"));
		Thread.sleep(3000);
		nameofhospital.sendKeys("ABIRAMI HOSPITAL");
		Thread.sleep(3000);
		address.sendKeys("43/12 MRT street banglore");
		Thread.sleep(3000);
		illness.sendKeys("fever");
		Thread.sleep(3000);
		StartDateForHospitalize.sendKeys("04/15/2022");
		Thread.sleep(3000);
		// endDateOfHospital.sendKeys("05/04/2022");
		Thread.sleep(3000);
		DateOfClaim.sendKeys("04/22/2022");
		Thread.sleep(3000);
		amountclaim.sendKeys("45000");
		Thread.sleep(3000);
		recognizedHospitalOrNot.click();
		Thread.sleep(3000);
		MCBILLS.click();
		Thread.sleep(3000);
		hospitalTaxExempted.click();
		Thread.sleep(3000);
		bedcharges.sendKeys("100");
		Thread.sleep(3000);
		consulationcharges.sendKeys("50");
		Thread.sleep(3000);
		doctorchargesID.sendKeys("100");
		Thread.sleep(3000);
		surgeonchargesId.sendKeys("1000");
		Thread.sleep(3000);
		otherHospChargesName.sendKeys("1000");
		anesthetistchargesId.sendKeys("1250");
		Thread.sleep(3000);
		operationcharges.sendKeys("1000");
		Thread.sleep(3000);
		othercharges.sendKeys("130");
		Thread.sleep(3000);
		otherHospChargesName.sendKeys("1450");
		Thread.sleep(3000);
		Laborterytestcharges.sendKeys("3200");
		Thread.sleep(3000);
		radiologycharges.sendKeys("2340");
		Thread.sleep(3000);
		scanningcharges.sendKeys("1244");
		Thread.sleep(3000);
		transfusioncharges.sendKeys("3000");
		Thread.sleep(3000);
		nursingcharges.sendKeys("430");
		Thread.sleep(3000);
		Injectioncharges.sendKeys("650");
		Thread.sleep(3000);
		injectionOutsideCharges.sendKeys("543");
		Thread.sleep(3000);
		Ambulancecharges.sendKeys("400");
		Thread.sleep(3000);
		Servicecharges.sendKeys("340");
		Thread.sleep(3000);
		Registraioncharges.sendKeys("100");
		Thread.sleep(3000);
		anyOthercharges.sendKeys("210");
		Thread.sleep(3000);
		travelExpense.sendKeys("178");
		Thread.sleep(3000);
		// hospitalTaxAmount.sendKeys("82");
		Thread.sleep(3000);
		DiscountCharges.sendKeys("220");
		Thread.sleep(3000);
		Totalcharges.sendKeys("2500");
		Thread.sleep(3000);
		AdvanceTaken.sendKeys("4000");
		Thread.sleep(3000);
		add.click();
		Thread.sleep(3000);
		add.click();
		Thread.sleep(3000);
		add.click();
		Thread.sleep(3000);
		add.click();
		Thread.sleep(3000);
		add.click();
		Thread.sleep(3000);
		delete.click();
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
		agreeandaccept.click();
		Thread.sleep(3000);
	}

	public void canceladddetails() throws InterruptedException {
		Thread.sleep(3000);
		crtnew.click();
		Thread.sleep(3000);
		recognizedHospital.sendKeys("ganga");
		Thread.sleep(3000);
		select(selectpatient, prop.getProperty("familyname1"));
		Thread.sleep(3000);
		nameofhospital.sendKeys("ABIRAMI HOSPITAL");
		Thread.sleep(3000);
		address.sendKeys("43/12 MRT street banglore");
		Thread.sleep(3000);
		illness.sendKeys("fever");
		Thread.sleep(3000);
		StartDateForHospitalize.sendKeys("04/15/2021");
		Thread.sleep(3000);
		// endDateOfHospital.sendKeys("04/21/2022");
		Thread.sleep(3000);
		DateOfClaim.sendKeys("04/22/2022");
		Thread.sleep(3000);
		amountclaim.sendKeys("45000");
		Thread.sleep(3000);
		recognizedHospitalOrNot.click();
		Thread.sleep(3000);
		MCBILLS.click();
		Thread.sleep(3000);
		hospitalTaxExempted.click();
		Thread.sleep(3000);
		bedcharges.sendKeys("100");
		Thread.sleep(3000);
		consulationcharges.sendKeys("50");
		Thread.sleep(3000);
		doctorchargesID.sendKeys("100");
		Thread.sleep(3000);
		surgeonchargesId.sendKeys("1000");
		Thread.sleep(3000);
		othercharges.sendKeys("1000");
		Thread.sleep(3000);
		anesthetistchargesId.sendKeys("1250");
		Thread.sleep(3000);
		operationcharges.sendKeys("1000");
		Thread.sleep(3000);
		othercharges.sendKeys("130");
		Thread.sleep(3000);
		otherHospChargesName.sendKeys("1450");
		Thread.sleep(3000);
		Laborterytestcharges.sendKeys("3200");
		Thread.sleep(3000);
		radiologycharges.sendKeys("2340");
		Thread.sleep(3000);
		scanningcharges.sendKeys("1244");
		Thread.sleep(3000);
		transfusioncharges.sendKeys("3000");
		Thread.sleep(3000);
		nursingcharges.sendKeys("430");
		Thread.sleep(3000);
		Injectioncharges.sendKeys("650");
		Thread.sleep(3000);
		injectionOutsideCharges.sendKeys("543");
		Thread.sleep(3000);
		Ambulancecharges.sendKeys("400");
		Thread.sleep(3000);
		Servicecharges.sendKeys("340");
		Thread.sleep(3000);
		Registraioncharges.sendKeys("100");
		Thread.sleep(3000);
		othercharges.sendKeys("210");
		Thread.sleep(3000);
		travelExpense.sendKeys("178");
		Thread.sleep(3000);
		// hospitalTaxAmount.sendKeys("82");
		Thread.sleep(3000);
		DiscountCharges.sendKeys("220");
		Thread.sleep(3000);
		Totalcharges.sendKeys("2500");
		Thread.sleep(3000);
		AdvanceTaken.sendKeys("4000");
		Thread.sleep(3000);
		add.click();
		Thread.sleep(3000);
		add.click();
		Thread.sleep(3000);
		add.click();
		Thread.sleep(3000);
		add.click();
		Thread.sleep(3000);
		add.click();
		Thread.sleep(3000);
		delete.click();
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
		agreeandaccept.click();
		Thread.sleep(3000);
		cancel.click();
	}

	public void filesave() throws InterruptedException {
		Thread.sleep(3000);
		crtnew.click();
		Thread.sleep(3000);
		recognizedHospital.sendKeys("ganga");
		Thread.sleep(3000);
		select(selectpatient, prop.getProperty("familyname1"));
		Thread.sleep(3000);
		nameofhospital.sendKeys("ABIRAMI HOSPITAL");
		Thread.sleep(3000);
		address.sendKeys("43/12 MRT street banglore");
		Thread.sleep(3000);
		illness.sendKeys("fever");
		Thread.sleep(3000);
		StartDateForHospitalize.sendKeys("04/15/2022");
		Thread.sleep(3000);
		// endDateOfHospital.sendKeys("05/04/2022");
		Thread.sleep(3000);
		DateOfClaim.sendKeys("04/22/2022");
		Thread.sleep(3000);
		amountclaim.sendKeys("45000");
		Thread.sleep(3000);
		recognizedHospitalOrNot.click();
		Thread.sleep(3000);
		MCBILLS.click();
		Thread.sleep(3000);
		hospitalTaxExempted.click();
		Thread.sleep(3000);
		bedcharges.sendKeys("100");
		Thread.sleep(3000);
		consulationcharges.sendKeys("50");
		Thread.sleep(3000);
		doctorchargesID.sendKeys("100");
		Thread.sleep(3000);
		surgeonchargesId.sendKeys("1000");
		Thread.sleep(3000);
		anesthetistchargesId.sendKeys("1250");
		Thread.sleep(3000);
		operationcharges.sendKeys("1000");
		Thread.sleep(3000);
		othercharges.sendKeys("1000");
		Thread.sleep(3000);
		
		Thread.sleep(3000);
		otherHospChargesName.sendKeys("BILLS");
		Thread.sleep(3000);
		Laborterytestcharges.sendKeys("3200");
		Thread.sleep(3000);
		radiologycharges.sendKeys("2340");
		Thread.sleep(3000);
		scanningcharges.sendKeys("1244");
		Thread.sleep(3000);
		transfusioncharges.sendKeys("3000");
		Thread.sleep(3000);
		nursingcharges.sendKeys("430");
		Thread.sleep(3000);
		Injectioncharges.sendKeys("650");
		Thread.sleep(3000);
		injectionOutsideCharges.sendKeys("543");
		Thread.sleep(3000);
		Ambulancecharges.sendKeys("400");
		Thread.sleep(3000);
		Servicecharges.sendKeys("340");
		Thread.sleep(3000);
		Registraioncharges.sendKeys("100");
		Thread.sleep(3000);
		anyOthercharges.sendKeys("210");
		Thread.sleep(3000);
		travelExpense.sendKeys("178");
		Thread.sleep(3000);
		// hospitalTaxAmount.sendKeys("82");
		Thread.sleep(3000);
		DiscountCharges.sendKeys("220");
		Thread.sleep(3000);
		Totalcharges.sendKeys("2500");
		Thread.sleep(3000);
		AdvanceTaken.sendKeys("4000");
		Thread.sleep(3000);
		add.click();
		Thread.sleep(3000);
		add.click();
		Thread.sleep(3000);
		add.click();
		Thread.sleep(3000);
		add.click();
		Thread.sleep(3000);
		add.click();
		Thread.sleep(3000);
		delete.click();
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
		agreeandaccept.click();
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
		submit.click();
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
		recognizedHospital.sendKeys("ganga");
		Thread.sleep(3000);
		select(selectpatient, prop.getProperty("familyname1"));
		Thread.sleep(3000);
		nameofhospital.sendKeys("ABIRAMI HOSPITAL");
		Thread.sleep(3000);
		address.sendKeys("43/12 MRT street banglore");
		Thread.sleep(3000);
		illness.sendKeys("fever");
		Thread.sleep(3000);
		StartDateForHospitalize.sendKeys("04/15/2022");
		Thread.sleep(3000);
		// endDateOfHospital.sendKeys("05/04/2022");
		Thread.sleep(3000);
		DateOfClaim.sendKeys("04/22/2022");
		Thread.sleep(3000);
		amountclaim.sendKeys("45000");
		Thread.sleep(3000);
		recognizedHospitalOrNot.click();
		Thread.sleep(3000);
		MCBILLS.click();
		Thread.sleep(3000);
		hospitalTaxExempted.click();
		Thread.sleep(3000);
		bedcharges.sendKeys("100");
		Thread.sleep(3000);
		consulationcharges.sendKeys("50");
		Thread.sleep(3000);
		doctorchargesID.sendKeys("100");
		Thread.sleep(3000);
		surgeonchargesId.sendKeys("1000");
		Thread.sleep(3000);
		anesthetistchargesId.sendKeys("1250");
		Thread.sleep(3000);
		operationcharges.sendKeys("1000");
		Thread.sleep(3000);
		othercharges.sendKeys("1000");
		Thread.sleep(3000);
		
		Thread.sleep(3000);
		otherHospChargesName.sendKeys("BILLS");
		Thread.sleep(3000);
		Laborterytestcharges.sendKeys("3200");
		Thread.sleep(3000);
		radiologycharges.sendKeys("2340");
		Thread.sleep(3000);
		scanningcharges.sendKeys("1244");
		Thread.sleep(3000);
		transfusioncharges.sendKeys("3000");
		Thread.sleep(3000);
		nursingcharges.sendKeys("430");
		Thread.sleep(3000);
		Injectioncharges.sendKeys("650");
		Thread.sleep(3000);
		injectionOutsideCharges.sendKeys("543");
		Thread.sleep(3000);
		Ambulancecharges.sendKeys("400");
		Thread.sleep(3000);
		Servicecharges.sendKeys("340");
		Thread.sleep(3000);
		Registraioncharges.sendKeys("100");
		Thread.sleep(3000);
		anyOthercharges.sendKeys("210");
		Thread.sleep(3000);
		travelExpense.sendKeys("178");
		Thread.sleep(3000);
		// hospitalTaxAmount.sendKeys("82");
		Thread.sleep(3000);
		DiscountCharges.sendKeys("220");
		Thread.sleep(3000);
		Totalcharges.sendKeys("2500");
		Thread.sleep(3000);
		AdvanceTaken.sendKeys("4000");
		Thread.sleep(3000);
		add.click();
		Thread.sleep(3000);
		add.click();
		Thread.sleep(3000);
		add.click();
		Thread.sleep(3000);
		add.click();
		Thread.sleep(3000);
		add.click();
		Thread.sleep(3000);
		delete.click();
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
		agreeandaccept.click();
		Thread.sleep(3000);
		submit.click();
		Thread.sleep(3000);
		Alert simple = driver.switchTo().alert();
		Thread.sleep(3000);
		simple.accept();
		Thread.sleep(3000);
	}

}
