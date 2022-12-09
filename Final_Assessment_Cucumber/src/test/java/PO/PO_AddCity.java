package PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class PO_AddCity {
    
    public WebDriver ldriver;
    
    public PO_AddCity(WebDriver ldriver)
    {
        PageFactory.initElements(ldriver, this);
    }
    
    @FindBy(xpath="//input[@id='useremail']")
    @CacheLookup
    WebElement emailinput;
    public void email1(String mail)
    {    
        emailinput.sendKeys(mail);
    }
    
    @FindBy(xpath="//input[@id='password']")
    @CacheLookup
    WebElement password;
    public void password1(String pass)
    {
        password.sendKeys(pass);
    }
    
    @FindBy(xpath="//*[@id='LoginForm']/button")
    @CacheLookup
    WebElement submit;
    public void submit1()
    {
        submit.click();
    }
    
    
    
    @FindBy(xpath="/html/body/div[1]/div/div[1]/ul/li[2]/a")
    @CacheLookup
    WebElement clicklocation;
    public void Locations()
    {
    	clicklocation.click();
    }
    public void clickLocations()
    {
    	Locations();
    }
    
    @FindBy(xpath="/html/body/div[1]/div/div[1]/ul/li[2]/ul/li[3]/a")
    @CacheLookup
    WebElement clickcity;
    public void City()
    {
    	clickcity.click();
    }
    public void clickCity()
    {
    	City();
    }
    
    
    @FindBy(xpath="/html/body/div[3]/div/div/div[2]/div/div/div/div[1]/a")
    @CacheLookup
    WebElement addcity;
    public void addcity()
    {
    	addcity.click();
    }
    public void addCity()
    {
    	addcity();
    }
    
    
    
    
    @FindBy(xpath="//*[@id='city']")
    @CacheLookup
    WebElement entercity;
    public void entercityName(String cname)
    {    
    	entercity.sendKeys(cname);
    }
    public void enterCity(String cname)
    {
    	entercityName(cname);
    }
    
    
    @FindBy(xpath="//*[@id='addCity']/div/div[2]/div/div/button")
    @CacheLookup
    WebElement clickadd;
    public void clickAdd()
    {
    	clickadd.click();
    }
    public void addClick()
    {
    	clickAdd();
    }
    
    
    
    
    public void valid(String mail,String pass)
    {
        email1(mail);
        password1(pass);
    }
    
    public void Clicklogin()
    {
        submit1();
    }
    
    @FindBy(xpath="/html/body/div[2]/div[2]/ul/li/span")
    @CacheLookup
    WebElement mainAdmin;
    public void MainAdmin()
    {
    	mainAdmin.click();
    }
    public void clickAdmin()
    {
    	MainAdmin();
    }
    
    @FindBy(xpath="/html/body/div[2]/div[2]/ul/li/div/div/ul/li[3]/a")
    @CacheLookup
    WebElement logout;
    public void LogOut()
    {
    	logout.click();
    }
    public void clickLogOut() {
    	LogOut();
    }
}