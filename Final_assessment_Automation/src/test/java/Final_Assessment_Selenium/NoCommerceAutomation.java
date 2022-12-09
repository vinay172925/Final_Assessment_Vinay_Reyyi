package Final_Assessment_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NoCommerceAutomation {
	WebDriver driver;
	//WebDriverManager.chromedriver.setup();
	public void registerPage(){
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\AN69831\\selenium-sample-project\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		try{
		
	
		driver.get("https://www.nopcommerce.com/en"); 
		
		//http://www.tms.pisystindia.com/siteengineer.com
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		

		WebElement userIcon = driver.findElement(By.xpath("(//ul[@class='navigation-top-menu navigation-top-menu-user-actions'])/li[3]"));
		WebElement registerLink = driver.findElement(By.xpath("((//ul[@class='navigation-top-menu-sublist'])[6]/li)[2]"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(userIcon); // this is hovering operation
		Thread.sleep(3000);
		action.click(registerLink).build().perform(); // checking everything and performing action
		Thread.sleep(3000);
		/*
		WebElement userIcon=driver.findElement(By.xpath("(//ul[@class=\"navigation-top-menu navigation-top-menu-user-actions\"]/li)[3]"));
		WebElement registerLink=driver.findElement(By.xpath("(((//ul[@class=\"navigation-top-menu-sublist\"])[6])/li[2])"));
		Actions action=new Actions(driver);
		action.moveToElement(userIcon);
		Thread.sleep(1000);
		
		action.click(registerLink).build().perform();
		Thread.sleep(1000);
		*/
			
		WebElement register = driver.findElement(By.name("register-button"));
		// Assert.assertEquals("Register - nopCommerce",VerifyTitle());
	
	
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		//(//div[@class='section-title']/strong)[1]
		
		NoCommerceAutomation obj = new NoCommerceAutomation();
		obj.registerPage();
		
		
		
	}

}

