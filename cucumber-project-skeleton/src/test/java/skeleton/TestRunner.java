package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestRunner {
	WebDriver driver;
	
	@Given("user is on testmeapp home page")
	public void user_is_on_testmeapp_home_page() throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:\\Ankita\\geckodriver-v0.23.0-win32\\geckodriver.exe");
		driver= new FirefoxDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
		Thread.sleep(500);
		
	}
	
	/*@Given("signin page is displayed")
	public void signin_page_is_displayed() throws Exception {
		
		Thread.sleep(500);
	}*/

	@When("user enters {string} and {string}")
	public void user_enters_and(String Username,String password) {
		driver.findElement(By.name("userName")).sendKeys(Username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("Login")).click();
		
	}
	
	@Then("login is successful")
	public void login_is_successful() {
		driver.findElement(By .linkText("SignOut")).click();
		
		
		
	}
}
