package Final_Assessment_Selenium;
import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

//import com.gargoylesoftware.htmlunit.javascript.host.file.File;


import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.OutputType;

public class ScreenShotFile {
  
	public static void main(String[] args) {
		try {
			//WebDriverManager.chromedriver().setup();
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.nopcommerce.com/en");
			Thread.sleep(3000);
			
			
			WebElement userIcon=driver.findElement(By.xpath("(//ul[@class=\"navigation-top-menu navigation-top-menu-user-actions\"]/li)[3]"));
			WebElement registerLink=driver.findElement(By.xpath("(((//ul[@class=\"navigation-top-menu-sublist\"])[6])/li[2])"));
			Actions action=new Actions(driver);
			action.moveToElement(userIcon);
			Thread.sleep(1000);
			
			action.click(registerLink).build().perform();
			Thread.sleep(1000);
			
			WebElement fn=driver.findElement(By.xpath("//input[@id='FirstName']"));
			WebElement ln=driver.findElement(By.xpath("(//input)[2]"));
			WebElement email=driver.findElement(By.xpath("(//input)[3]"));
			WebElement cemail=driver.findElement(By.id("ConfirmEmail"));////input[@id='ConfirmEmail']
			WebElement username=driver.findElement(By.id("Username"));
			Select sel=new Select(driver.findElement(By.xpath("//select[@id='CountryId']")));
			WebElement checkAvailability=driver.findElement(By.id("check-availability-button"));
			WebElement check1=driver.findElement(By.xpath("//label[@class='custom-control-label']"));
			fn.sendKeys("Vinaykumar123");
			Thread.sleep(1000);
			ln.sendKeys("Reyyi");
			Thread.sleep(1000);
			email.sendKeys("vinay0345@gmail.com");
			Thread.sleep(1000);
			cemail.sendKeys("vinay0345@gmail.com");
			Thread.sleep(1000);
			username.sendKeys("vinay_kumar_123");
			Thread.sleep(1000);
			checkAvailability.click();
			Thread.sleep(1000);
			sel.selectByVisibleText("India");
			Thread.sleep(1000);
			if(check1.isEnabled()) {
				Thread.sleep(1000);
				check1.click();
				Thread.sleep(1000);
			}
			Thread.sleep(2000);
			Select sel2=new Select(driver.findElement(By.xpath("//select[@id='TimeZoneId']")));
			sel2.selectByVisibleText("(UTC-10:00) Hawaii");
			Thread.sleep(1000);
			WebElement password=driver.findElement(By.xpath("//input[@id='Password']"));
			password.sendKeys("abcdefgh");
			Thread.sleep(1000);
			WebElement cpassword=driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
			cpassword.sendKeys("abcdefgh");
			Thread.sleep(1000);
		
			Select sel3=new Select(driver.findElement(By.xpath("//select[@id='Details_CompanyIndustryId']")));
			sel3.selectByVisibleText("I am student");
			Thread.sleep(1000);
			
			
			WebElement register=driver.findElement(By.xpath("//input[@id='register-button']"));
			register.click();
			Thread.sleep(1000);
			
			File screenshotFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshotFile, new File(".//ScreenShots/screen.png"));
			Thread.sleep(3000);
			//driver.quit();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}
}
