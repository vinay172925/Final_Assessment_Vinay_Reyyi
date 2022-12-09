package PO;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import com.relevantcodes.extentreports.*;

public class PO_Xlogist {
	WebDriver driver;
	
	public PO_Xlogist(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(how=How.XPATH, using="//input[@id='useremail']")
	WebElement username;
	
	@FindBy(how=How.XPATH, using="//input[@id='password']")
	WebElement password;
	
	@FindBy(how=How.XPATH, using="//*[@id='LoginForm']/button")
	WebElement login;
	
	@FindBy(how=How.XPATH, using="//div[@class='sidebar sidebar-hide-to-small sidebar-shrink sidebar-gestures']/div/div/ul/li[8]/a")
	WebElement copunbutton;
	
	@FindBy(how=How.XPATH, using="//div[@class='main-content']/div/div/div/div[1]/a")
	WebElement addcopon;
	
	@FindBy(how=How.XPATH, using="//*[@id='coupon_name']")
	WebElement entercopon;
	
	@FindBy(how=How.XPATH, using="//*[@id='addcategory']/div/div[2]/div/div/button")
	WebElement clickadd;
	
	
	public void userName(String un) {
		username.sendKeys(un);
	}
	
	public void passWord(String pass) {
		password.sendKeys(pass);
	}
	
	public void clickLogin() {
		login.click();
	}
	
	public void coponButtonClick() {
		copunbutton.click();
	}
	
	public void addCoupon() {
		addcopon.click();
	}
	
	public void enterCoupon(String cpname) {
		entercopon.sendKeys(cpname);
	}
	
	public void clickAdd() {
		clickadd.click();
	}
	

	public void valid(String un,String pass,String cpname)
    {
        try
        {
        	Thread.sleep(2000);
        	userName(un);
        	Thread.sleep(1000);
        	passWord(pass);
        	Thread.sleep(1000);
        	clickLogin();
        	Thread.sleep(1000);
        	coponButtonClick();
        	Thread.sleep(1000);
        	addCoupon();
        	Thread.sleep(1000);
        	enterCoupon(cpname);
        	Thread.sleep(1000);
        	clickAdd();
        
        	//Assert.assertEquals(true,title.isDisplayed());
        	
        	
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
       }
	
	public void invalid(String un,String pass,String cpname)
    {
        try
        {
        	Thread.sleep(2000);
        	userName(un);
        	Thread.sleep(1000);
        	passWord(pass);
        	Thread.sleep(1000);
        	clickLogin();
        	Thread.sleep(1000);
        	coponButtonClick();
        	Thread.sleep(1000);
        	addCoupon();
        	Thread.sleep(1000);
        	enterCoupon(cpname);
        	Thread.sleep(1000);
        	clickAdd();
        
        	//Assert.assertEquals(true,title.isDisplayed());
        	
        	
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
       }
	
	public void blank_data(String un,String pass,String cpname)
    {
        try
        {
        	Thread.sleep(2000);
        	userName(un);
        	Thread.sleep(1000);
        	passWord(pass);
        	Thread.sleep(1000);
        	clickLogin();
        	Thread.sleep(1000);
        	coponButtonClick();
        	Thread.sleep(1000);
        	addCoupon();
        	Thread.sleep(1000);
        	enterCoupon(cpname);
        	Thread.sleep(1000);
        	clickAdd();
        
        	//Assert.assertEquals(true,title.isDisplayed());
        	
        	
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
       }
	
	public void only_numbers(String un,String pass,String cpname)
    {
        try
        {
        	Thread.sleep(2000);
        	userName(un);
        	Thread.sleep(1000);
        	passWord(pass);
        	Thread.sleep(1000);
        	clickLogin();
        	Thread.sleep(1000);
        	coponButtonClick();
        	Thread.sleep(1000);
        	addCoupon();
        	Thread.sleep(1000);
        	enterCoupon(cpname);
        	Thread.sleep(1000);
        	clickAdd();
        
        	//Assert.assertEquals(true,title.isDisplayed());
        	
        	
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
       }
	
	public void only_specials(String un,String pass,String cpname)
    {
        try
        {
        	Thread.sleep(2000);
        	userName(un);
        	Thread.sleep(1000);
        	passWord(pass);
        	Thread.sleep(1000);
        	clickLogin();
        	Thread.sleep(1000);
        	coponButtonClick();
        	Thread.sleep(1000);
        	addCoupon();
        	Thread.sleep(1000);
        	enterCoupon(cpname);
        	Thread.sleep(1000);
        	clickAdd();
        
        	//Assert.assertEquals(true,title.isDisplayed());
        	
        	
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
       }
	
	public void only_chars(String un,String pass,String cpname)
    {
        try
        {
        	Thread.sleep(2000);
        	userName(un);
        	Thread.sleep(1000);
        	passWord(pass);
        	Thread.sleep(1000);
        	clickLogin();
        	Thread.sleep(1000);
        	coponButtonClick();
        	Thread.sleep(1000);
        	addCoupon();
        	Thread.sleep(1000);
        	enterCoupon(cpname);
        	Thread.sleep(1000);
        	clickAdd();
        
        	//Assert.assertEquals(true,title.isDisplayed());
        	
        	
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
       }
	public void special_and_num(String un,String pass,String cpname)
    {
        try
        {
        	Thread.sleep(2000);
        	userName(un);
        	Thread.sleep(1000);
        	passWord(pass);
        	Thread.sleep(1000);
        	clickLogin();
        	Thread.sleep(1000);
        	coponButtonClick();
        	Thread.sleep(1000);
        	addCoupon();
        	Thread.sleep(1000);
        	enterCoupon(cpname);
        	Thread.sleep(1000);
        	clickAdd();
        
        	//Assert.assertEquals(true,title.isDisplayed());
        	
        	
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
       }
      
}
