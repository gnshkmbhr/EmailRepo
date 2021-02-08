package stepDefinationFiles;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Omayo {
	
	WebDriver driver;

	@Given("^I open the omayo blogspot website$")
	public void i_open_the_omayo_blogspot_website()  {
	    
		System.setProperty("webdriver.chrome.driver", "Driver//chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://omayo.blogspot.com/");
	}
	
	@When("^I navigate to Username and Password fields$")
	public void i_navigate_to_Username_and_Password_fields() {
	    
		driver.findElement(By.name("userid"));
		
		driver.findElement(By.name("pswrd"));	
	}

	@Then("^I Enter Username as \"([^\"]*)\" field$")
	public void i_Enter_Username_as__field(String Username)  {
		
		driver.findElement(By.name("userid")).sendKeys(Username);
	   
	}

	@And("^I Enter Password as \"([^\"]*)\" field$")
	public void i_Enter_Password_as_field(String Password)  {
	   
		driver.findElement(By.name("pswrd")).sendKeys(Password);
	}
	
	@Then("^I clicked on Login button$")
	public void i_clicked_on_Login_button() throws InterruptedException {
	   
		driver.findElement(By.cssSelector("input[type='button'][value='Login']")).click();
		
		//Thread.sleep(5000);
	}
	
	
	@And("^LoginStatus \"([^\"]*)\" should show$")
	public void loginstatus_should_show(String expectedStatus) {
	   
		String expectLoginStatus = expectedStatus;

		String actualLoginStatus = null;
		
		try
		{
			Alert alert = driver.switchTo().alert();
		
			String testOnThealert = alert.getText();
			
			if(testOnThealert.equals("Error Password or Username"))
			{
				actualLoginStatus = "Failure";
			}
		}
		catch(Exception e)
		{
			actualLoginStatus = "Success";
		}
		if(actualLoginStatus.equals(expectLoginStatus))
		{
			//test case will pass here
		}
		else
		{
			Assert.fail("Omayo login test case will fail");
		}
		driver.quit();
	}
}