package seleniumgluecode;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class test {
    public static WebDriver driver;
    @Given("^user is  on homepage$")
    public void user_is_on_homepage() throws Throwable {     
System.out.println("ARKA");    }
    
    @When("^user navigates to Login Page$")
    public void user_navigates_to_Login_Page() throws Throwable {
    	System.out.println("ARKA");    

    }
    
    @When("^user enters username and Password$")
    public void user_enters_username_and_Password() throws Throwable {
    	System.out.println("ARKA");    

    }
    
    @Then("^success message is displayed$")
    public void success_message_is_displayed() throws Throwable {
    	System.out.println("ARKA");    

    }      
}
