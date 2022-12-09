package TestCase;

import java.io.InputStream;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import PO.PO_Xlogist;
import Utility.BrowserManager;

public class Xlogist_testcase {
	WebDriver driver;
	JSONObject xlogist;
	
	@BeforeClass
	public void beforeClass() throws Exception{
		InputStream datais=null;
		try {
			String FileName="data/xlogist.json";//location of the file where //same
			datais=getClass().getClassLoader().getResourceAsStream(FileName);
			JSONTokener tokener=new JSONTokener(datais);
			xlogist=new JSONObject(tokener);//same
			//System.out.println("data is:"+nopcommerce.toString());
			
			//ExtentReportManager.createReport("registration_Report");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			if(datais!=null) {
				datais.close();
			}
		}
		
//		Date date=new Date();
//		String time=date.getTime()+"";//converting milliseconds to string
//		extentReport=new ExtentReports(System.getProperty("user.dir")+"/target/data-output/register_report_"+time+".html");
		
	}
	
	@BeforeMethod
	@Parameters({"browser","url"})//get these from user
	public void setup(String browser, String url) throws InterruptedException{
		driver=BrowserManager.getDriver(browser);
		Thread.sleep(3000);
		driver.get(url);
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		Thread.sleep(3000);
		//driver.quit();
		
		
		
	}
	/*@Test(testName="valid",description="Testing nopcommerce with valid data")
	public void test_registration_with_valid_data() {
		PO_NopCommerce obj=new PO_NopCommerce(driver);
		PageFactory.initElements(driver, obj);//assigning all pagee objects to driver object
		//String fn,String ln,String email,String un,String country,String time,String str,String pass,String cpass
		obj.valid("vinay", "reyyi", "vinay.reyyi@gmail.com", "vinay_reyyi", "India", "india +5:30 GMH", "student", "123456", "123456");
	}*/
	
	//Almost done! To complete your nopCommerce registration, we just need to verify your email address. You have just been sent an email to confirm your email address. Open the email, and click the link to confirm your address.
	
	@Test(description="trying add coupon",priority = 1)
	public void test_validData() {
		//ExtentReportManager.startTest("TestCase_for_valid_data");
		//String fn,String ln,String email,String un,String country,String time,String str,String pass,String cpass
		String un=xlogist.getJSONObject("valid").getString("USERNAME");
		String pass=xlogist.getJSONObject("valid").getString("PASSWORD");
		String cpname=xlogist.getJSONObject("valid").getString("COUPON");
		
		PO_Xlogist obj=PageFactory.initElements(driver, PO_Xlogist.class);
		//extentTest=obj.valid(fn, ln, email,confirmemail, un, country, time, str, pass, cpass, extentTest);
		obj.valid(un, pass, cpname);
	}
	
	@Test(priority = 2)
	public void test_invalidData() {
		//ExtentReportManager.startTest("TestCase_for_valid_data");
		//String fn,String ln,String email,String un,String country,String time,String str,String pass,String cpass
		String un=xlogist.getJSONObject("invalid").getString("USERNAME");
		String pass=xlogist.getJSONObject("invalid").getString("PASSWORD");
		String cpname=xlogist.getJSONObject("invalid").getString("COUPON");
		
		PO_Xlogist obj2=PageFactory.initElements(driver, PO_Xlogist.class);
		//extentTest=obj.valid(fn, ln, email,confirmemail, un, country, time, str, pass, cpass, extentTest);
		obj2.invalid(un, pass, cpname);
	}
	
	@Test(priority = 3)
	public void test_blankData() {
		//ExtentReportManager.startTest("TestCase_for_valid_data");
		//String fn,String ln,String email,String un,String country,String time,String str,String pass,String cpass
		String un=xlogist.getJSONObject("blank").getString("USERNAME");
		String pass=xlogist.getJSONObject("blank").getString("PASSWORD");
		String cpname=xlogist.getJSONObject("blank").getString("COUPON");
		
		PO_Xlogist obj3=PageFactory.initElements(driver, PO_Xlogist.class);
		//extentTest=obj.valid(fn, ln, email,confirmemail, un, country, time, str, pass, cpass, extentTest);
		obj3.blank_data(un, pass, cpname);
	}
	
	@Test(priority = 4)
	public void test_numbersData() {
		//ExtentReportManager.startTest("TestCase_for_valid_data");
		//String fn,String ln,String email,String un,String country,String time,String str,String pass,String cpass
		String un=xlogist.getJSONObject("onlyNumbers").getString("USERNAME");
		String pass=xlogist.getJSONObject("onlyNumbers").getString("PASSWORD");
		String cpname=xlogist.getJSONObject("onlyNumbers").getString("COUPON");
		
		PO_Xlogist obj4=PageFactory.initElements(driver, PO_Xlogist.class);
		//extentTest=obj.valid(fn, ln, email,confirmemail, un, country, time, str, pass, cpass, extentTest);
		obj4.only_numbers(un, pass, cpname);
	}
	
	@Test(priority = 5)
	public void test_specialsData() {
		//ExtentReportManager.startTest("TestCase_for_valid_data");
		//String fn,String ln,String email,String un,String country,String time,String str,String pass,String cpass
		String un=xlogist.getJSONObject("onlySpecial").getString("USERNAME");
		String pass=xlogist.getJSONObject("onlySpecial").getString("PASSWORD");
		String cpname=xlogist.getJSONObject("onlySpecial").getString("COUPON");
		
		PO_Xlogist obj5=PageFactory.initElements(driver, PO_Xlogist.class);
		//extentTest=obj.valid(fn, ln, email,confirmemail, un, country, time, str, pass, cpass, extentTest);
		obj5.only_specials(un, pass, cpname);
	}
	
	@Test(priority = 6)
	public void test_charsData() {
		//ExtentReportManager.startTest("TestCase_for_valid_data");
		//String fn,String ln,String email,String un,String country,String time,String str,String pass,String cpass
		String un=xlogist.getJSONObject("onlyChars").getString("USERNAME");
		String pass=xlogist.getJSONObject("onlyChars").getString("PASSWORD");
		String cpname=xlogist.getJSONObject("onlyChars").getString("COUPON");
		
		PO_Xlogist obj6=PageFactory.initElements(driver, PO_Xlogist.class);
		//extentTest=obj.valid(fn, ln, email,confirmemail, un, country, time, str, pass, cpass, extentTest);
		obj6.only_chars(un, pass, cpname);
	}
	
	@Test(priority = 7)
	public void test_specandnumData() {
		//ExtentReportManager.startTest("TestCase_for_valid_data");
		//String fn,String ln,String email,String un,String country,String time,String str,String pass,String cpass
		String un=xlogist.getJSONObject("SpecialAndNum").getString("USERNAME");
		String pass=xlogist.getJSONObject("SpecialAndNum").getString("PASSWORD");
		String cpname=xlogist.getJSONObject("SpecialAndNum").getString("COUPON");
		
		PO_Xlogist obj7=PageFactory.initElements(driver, PO_Xlogist.class);
		//extentTest=obj.valid(fn, ln, email,confirmemail, un, country, time, str, pass, cpass, extentTest);
		obj7.special_and_num(un, pass, cpname);
	}
	
	/*
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	*/
	@AfterMethod
	public void tearDown() {
		//extentReport.endTest(extentTest);
		driver.close();
		//ExtentReportManager.extentReport.endTest(ExtentReportManager.extentTest);
	}
	
	@AfterClass
	public void stopReport() {
		//extentReport.flush();//if we dont use this we can't genterate html report 
		//ExtentReportManager.extentReport.flush();
	}
}
