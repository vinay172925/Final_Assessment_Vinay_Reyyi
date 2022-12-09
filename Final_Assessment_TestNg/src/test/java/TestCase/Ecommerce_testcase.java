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

import PO.PO_Ecommerce;
import Utility.BrowserManager;

public class Ecommerce_testcase {
	WebDriver driver;
	JSONObject ecommerce;
	
	@BeforeClass
	public void beforeClass() throws Exception{
		InputStream datais=null;
		try {
			String FileName="data/ecommerce.json";//location of the file where //same
			datais=getClass().getClassLoader().getResourceAsStream(FileName);
			JSONTokener tokener=new JSONTokener(datais);
			ecommerce=new JSONObject(tokener);//same
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
	
	@Test(priority = 1)
	public void test_validData() {
		//ExtentReportManager.startTest("TestCase_for_valid_data");
		//String fn,String ln,String email,String un,String country,String time,String str,String pass,String cpass
		String un=ecommerce.getJSONObject("valid").getString("USERNAME");
		String pass=ecommerce.getJSONObject("valid").getString("PASSWORD");
		String cname=ecommerce.getJSONObject("valid").getString("CATEGORYNAME");
		String imagepath=ecommerce.getJSONObject("valid").getString("img1");
		
		PO_Ecommerce obj=PageFactory.initElements(driver, PO_Ecommerce.class);
		//extentTest=obj.valid(fn, ln, email,confirmemail, un, country, time, str, pass, cpass, extentTest);
		obj.valid(un, pass, cname, imagepath);
	}
	
	@Test(priority = 2)
	public void test_blank_name() {
		//ExtentReportManager.startTest("TestCase_for_valid_data");
		//String fn,String ln,String email,String un,String country,String time,String str,String pass,String cpass
		String un=ecommerce.getJSONObject("blankname").getString("USERNAME");
		String pass=ecommerce.getJSONObject("blankname").getString("PASSWORD");
		String cname=ecommerce.getJSONObject("blankname").getString("CATEGORYNAME");
		String imagepath=ecommerce.getJSONObject("blankname").getString("img1");
		
		PO_Ecommerce obj=PageFactory.initElements(driver, PO_Ecommerce.class);
		//extentTest=obj.valid(fn, ln, email,confirmemail, un, country, time, str, pass, cpass, extentTest);
		obj.blank_name(un, pass, cname, imagepath);
	}
	
	@Test(priority = 3)
	public void test_numbers_only() {
		//ExtentReportManager.startTest("TestCase_for_valid_data");
		//String fn,String ln,String email,String un,String country,String time,String str,String pass,String cpass
		String un=ecommerce.getJSONObject("numbers").getString("USERNAME");
		String pass=ecommerce.getJSONObject("numbers").getString("PASSWORD");
		String cname=ecommerce.getJSONObject("numbers").getString("CATEGORYNAME");
		String imagepath=ecommerce.getJSONObject("numbers").getString("img1");
		
		PO_Ecommerce obj=PageFactory.initElements(driver, PO_Ecommerce.class);
		//extentTest=obj.valid(fn, ln, email,confirmemail, un, country, time, str, pass, cpass, extentTest);
		obj.only_numbers(un, pass, cname, imagepath);
	}
	
	@Test(priority = 4)
	public void test_without_img() {
		//ExtentReportManager.startTest("TestCase_for_valid_data");
		//String fn,String ln,String email,String un,String country,String time,String str,String pass,String cpass
		String un=ecommerce.getJSONObject("withoutimage").getString("USERNAME");
		String pass=ecommerce.getJSONObject("withoutimage").getString("PASSWORD");
		String cname=ecommerce.getJSONObject("withoutimage").getString("CATEGORYNAME");
		String imagepath=ecommerce.getJSONObject("withoutimage").getString("img1");
		
		PO_Ecommerce obj=PageFactory.initElements(driver, PO_Ecommerce.class);
		//extentTest=obj.valid(fn, ln, email,confirmemail, un, country, time, str, pass, cpass, extentTest);
		obj.without_image(un, pass, cname, imagepath);
	}
	
	@Test(priority = 5)
	public void test_withoutNameAndimage() {
		//ExtentReportManager.startTest("TestCase_for_valid_data");
		//String fn,String ln,String email,String un,String country,String time,String str,String pass,String cpass
		String un=ecommerce.getJSONObject("withoutNameAndimage").getString("USERNAME");
		String pass=ecommerce.getJSONObject("withoutNameAndimage").getString("PASSWORD");
		String cname=ecommerce.getJSONObject("withoutNameAndimage").getString("CATEGORYNAME");
		String imagepath=ecommerce.getJSONObject("withoutNameAndimage").getString("img1");
		
		PO_Ecommerce obj=PageFactory.initElements(driver, PO_Ecommerce.class);
		//extentTest=obj.valid(fn, ln, email,confirmemail, un, country, time, str, pass, cpass, extentTest);
		obj.without_NameAnd_image(un, pass, cname, imagepath);
	}
	
	@Test(priority = 6)
	public void test_specials() {
		//ExtentReportManager.startTest("TestCase_for_valid_data");
		//String fn,String ln,String email,String un,String country,String time,String str,String pass,String cpass
		String un=ecommerce.getJSONObject("specials").getString("USERNAME");
		String pass=ecommerce.getJSONObject("specials").getString("PASSWORD");
		String cname=ecommerce.getJSONObject("specials").getString("CATEGORYNAME");
		String imagepath=ecommerce.getJSONObject("specials").getString("img1");
		
		PO_Ecommerce obj=PageFactory.initElements(driver, PO_Ecommerce.class);
		//extentTest=obj.valid(fn, ln, email,confirmemail, un, country, time, str, pass, cpass, extentTest);
		obj.specials_demo(un, pass, cname, imagepath);
	}
	
	@Test(priority = 7)
	public void test_charandspec() {
		//ExtentReportManager.startTest("TestCase_for_valid_data");
		//String fn,String ln,String email,String un,String country,String time,String str,String pass,String cpass
		String un=ecommerce.getJSONObject("charandspec").getString("USERNAME");
		String pass=ecommerce.getJSONObject("charandspec").getString("PASSWORD");
		String cname=ecommerce.getJSONObject("charandspec").getString("CATEGORYNAME");
		String imagepath=ecommerce.getJSONObject("charandspec").getString("img1");
		
		PO_Ecommerce obj=PageFactory.initElements(driver, PO_Ecommerce.class);
		//extentTest=obj.valid(fn, ln, email,confirmemail, un, country, time, str, pass, cpass, extentTest);
		obj.charandspec_demo(un, pass, cname, imagepath);
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
