package step_definitionpack;

import org.apache.logging.log4j.core.util.WatchManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PO.PO_AddCountry;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;



public class AddCountry_def {
    public WebDriver driver;
    public PO_AddCountry lp;
    
    @Given("User Launches Chrome browser")
    public void user_launch_chrome_browser() throws InterruptedException  {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    	WebDriverManager.chromedriver().setup();
        Thread.sleep(2000);
        driver=new ChromeDriver();
        Thread.sleep(2000);
        driver.manage().window().maximize();
        lp = new PO_AddCountry(driver);
    }

    @When("User opens1 URL {string}")
    public void user_opens_url(String string) {
    	driver.get(string);
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }

    @When("User enters Emails1 as {string} and password1 as {string}")
    public void user_enters_emails_as_and_password_as(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    	try {
            lp.valid(string,string2);
            lp.Clicklogin();
           }catch(Exception ex)
           {
               ex.printStackTrace();
           }
    }

    @When("click on locations1")
    public void click_on_locations() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    	try {
    		lp.clickLocations();
    		Thread.sleep(1000);
        	lp.clickCity();
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    	
    }

//    @Then("click on AddCity")
//    public void click_on_add_city() {
//        // Write code here that turns the phrase above into concrete actions
//        //throw new io.cucumber.java.PendingException();
//    	lp.addCity();
//    }

    @Then("User enters country as {string}")
    public void user_enters_city_as(String string) {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    	lp.enterCity(string);
    }

    @Then("click on Add1")
    public void click_on_add() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    	lp.addClick();
    }

    @Then("click on MainAdmin1")
    public void click_on_main_admin() {
        // Write code here that turns the phrase above into concrete actions
       // throw new io.cucumber.java.PendingException();
    	lp.clickAdmin();
    }

    @Then("click on Logout1")
    public void click_on_logout() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    	lp.clickLogOut();
    }

    @Then("close browser1")
    public void close_browser() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}