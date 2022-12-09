package Utility;

import java.util.Date;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class ExtentReportManager {
	public static ExtentReports extentReport;
	public static ExtentTest extentTest;
	
	public static void createReport(String reportName) {
		Date date=new Date();
		String time=date.getTime()+"";//converting milliseconds to string
		extentReport=new ExtentReports(System.getProperty("user.dir")+"/target/api-output/"+reportName+"_"+time+".html");
	}
	
	public static void startTest(String testName) {
		extentTest=extentReport.startTest(testName);
	}
}
