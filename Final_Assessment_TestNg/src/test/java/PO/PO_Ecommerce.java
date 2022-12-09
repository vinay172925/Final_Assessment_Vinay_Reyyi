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

public class PO_Ecommerce {
	WebDriver driver;
	
	public PO_Ecommerce(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(how=How.XPATH, using="//input[@id='useremail']")
	WebElement username;
	
	@FindBy(how=How.XPATH, using="//input[@id='password']")
	WebElement password;
	
	@FindBy(how=How.XPATH, using="//*[@id='LoginForm']/button")
	WebElement login;
	
	@FindBy(how=How.XPATH, using="//div[@class='sidebar sidebar-hide-to-small sidebar-shrink sidebar-gestures']/div/div/ul/li[3]/a")
	WebElement product;
	
	@FindBy(how=How.XPATH, using="//div[@class='sidebar sidebar-hide-to-small sidebar-shrink sidebar-gestures']/div/div/ul/li[3]/ul/li[1]/a")
	WebElement category;
	
	@FindBy(how=How.XPATH, using="//*[@id='bootstrap-data-table-export']/tbody/tr[1]/td[6]/a[1]")
	WebElement clickchangename;
	
	@FindBy(how=How.XPATH, using="//*[@id='category_name']")
	WebElement changecategoryname;
	
	@FindBy(how=How.XPATH, using="//*[@id='editCategory']/div[2]/div/button")
	WebElement clickupdate;
	
	
	@FindBy(how=How.XPATH, using="//*[@id='bootstrap-data-table-export']/tbody/tr[1]/td[6]/a[2]")
	WebElement clickchangimage;
	
	@FindBy(how=How.XPATH, using="//input[@id='inputFile-2']")
	WebElement changeimage;
	
	@FindBy(how=How.XPATH, using="//*[@id='addSubcategory']/div/div[2]/div/div/button")
	WebElement clickimageupdate;
	
	@FindBy(how=How.XPATH, using="/html/body/div[2]/div[2]/ul/li/span")
	WebElement clickmainadmin;
	
	@FindBy(how=How.XPATH, using="/html/body/div[2]/div[2]/ul/li/div/div/ul/li[3]/a")
	WebElement cliclogout;
	
	
	public void userName(String un) {
		username.sendKeys(un);
	}
	
	public void passWord(String pass) {
		password.sendKeys(pass);
	}
	
	public void clickLogin() {
		login.click();
	}
	
	public void clickProduct() {
		product.click();
	}
	
	public void clickCategory() {
		category.click();
	}
	
	public void clickEditName() {
		clickchangename.click();
	}
	
	public void editCateName(String cname) {
		try {
			changecategoryname.clear();
			Thread.sleep(500);
			changecategoryname.sendKeys(cname);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void clickTextUpdate() {
		clickupdate.click();
	}
	public void clickEditImage() {
		clickchangimage.click();
	}
	
	public void editImage(String imagepath) {
		changeimage.sendKeys(imagepath);
	}
	
	public void clickImageUpdate() {
		clickimageupdate.click();
	}
	
	public void clickMainAdmin() {
		clickmainadmin.click();
	}
	
	public void clickLogOut() {
		cliclogout.click();
	}
	

	public void valid(String un,String pass,String cname, String imagepath)
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
        	clickProduct();
        	Thread.sleep(1000);
        	clickCategory();
        	Thread.sleep(1000);
        	clickEditName();
        	Thread.sleep(1000);
        	editCateName(cname);
        	Thread.sleep(2000);
        	clickTextUpdate();
        	Thread.sleep(4000);
        	clickEditImage();
        	Thread.sleep(2000);
        	editImage(imagepath);
        	Thread.sleep(2000);
        	clickImageUpdate();
        	Thread.sleep(2000);
        	clickMainAdmin();
        	Thread.sleep(2000);
        	clickLogOut();
        
        	//Assert.assertEquals(true,title.isDisplayed());
        	
        	
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
       }
	
	public void blank_name(String un,String pass,String cname, String imagepath)
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
        	clickProduct();
        	Thread.sleep(1000);
        	clickCategory();
        	Thread.sleep(1000);
        	clickEditName();
        	Thread.sleep(1000);
        	editCateName(cname);
        	Thread.sleep(2000);
        	clickTextUpdate();
        	Thread.sleep(4000);
        	clickEditImage();
        	Thread.sleep(2000);
        	editImage(imagepath);
        	Thread.sleep(2000);
        	clickImageUpdate();
        	Thread.sleep(2000);
        	clickMainAdmin();
        	Thread.sleep(2000);
        	clickLogOut();
        
        	//Assert.assertEquals(true,title.isDisplayed());
        	
        	
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
       }
	
	public void only_numbers(String un,String pass,String cname, String imagepath)
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
        	clickProduct();
        	Thread.sleep(1000);
        	clickCategory();
        	Thread.sleep(1000);
        	clickEditName();
        	Thread.sleep(1000);
        	editCateName(cname);
        	Thread.sleep(2000);
        	clickTextUpdate();
        	Thread.sleep(4000);
        	clickEditImage();
        	Thread.sleep(2000);
        	editImage(imagepath);
        	Thread.sleep(2000);
        	clickImageUpdate();
        	Thread.sleep(2000);
        	clickMainAdmin();
        	Thread.sleep(2000);
        	clickLogOut();
        
        	//Assert.assertEquals(true,title.isDisplayed());
        	
        	
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
       }
	
	public void without_image(String un,String pass,String cname, String imagepath)
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
        	clickProduct();
        	Thread.sleep(1000);
        	clickCategory();
        	Thread.sleep(1000);
        	clickEditName();
        	Thread.sleep(1000);
        	editCateName(cname);
        	Thread.sleep(2000);
        	clickTextUpdate();
        	Thread.sleep(4000);
        	clickEditImage();
        	Thread.sleep(2000);
        	editImage(imagepath);
        	Thread.sleep(2000);
        	clickImageUpdate();
        	Thread.sleep(2000);
        	clickMainAdmin();
        	Thread.sleep(2000);
        	clickLogOut();
        
        	//Assert.assertEquals(true,title.isDisplayed());
        	
        	
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
       }
      
	public void without_NameAnd_image(String un,String pass,String cname, String imagepath)
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
        	clickProduct();
        	Thread.sleep(1000);
        	clickCategory();
        	Thread.sleep(1000);
        	clickEditName();
        	Thread.sleep(1000);
        	editCateName(cname);
        	Thread.sleep(2000);
        	clickTextUpdate();
        	Thread.sleep(4000);
        	clickEditImage();
        	Thread.sleep(2000);
        	editImage(imagepath);
        	Thread.sleep(2000);
        	clickImageUpdate();
        	Thread.sleep(2000);
        	clickMainAdmin();
        	Thread.sleep(2000);
        	clickLogOut();
        
        	//Assert.assertEquals(true,title.isDisplayed());
        	
        	
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
       }
	
	public void specials_demo(String un,String pass,String cname, String imagepath)
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
        	clickProduct();
        	Thread.sleep(1000);
        	clickCategory();
        	Thread.sleep(1000);
        	clickEditName();
        	Thread.sleep(1000);
        	editCateName(cname);
        	Thread.sleep(2000);
        	clickTextUpdate();
        	Thread.sleep(4000);
        	clickEditImage();
        	Thread.sleep(2000);
        	editImage(imagepath);
        	Thread.sleep(2000);
        	clickImageUpdate();
        	Thread.sleep(2000);
        	clickMainAdmin();
        	Thread.sleep(2000);
        	clickLogOut();
        
        	//Assert.assertEquals(true,title.isDisplayed());
        	
        	
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
       }
	public void charandspec_demo(String un,String pass,String cname, String imagepath)
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
        	clickProduct();
        	Thread.sleep(1000);
        	clickCategory();
        	Thread.sleep(1000);
        	clickEditName();
        	Thread.sleep(1000);
        	editCateName(cname);
        	Thread.sleep(2000);
        	clickTextUpdate();
        	Thread.sleep(4000);
        	clickEditImage();
        	Thread.sleep(2000);
        	editImage(imagepath);
        	Thread.sleep(2000);
        	clickImageUpdate();
        	Thread.sleep(2000);
        	clickMainAdmin();
        	Thread.sleep(2000);
        	clickLogOut();
        
        	//Assert.assertEquals(true,title.isDisplayed());
        	
        	
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
       }
}
