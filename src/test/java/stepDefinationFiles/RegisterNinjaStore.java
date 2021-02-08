package stepDefinationFiles;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

							//Using DataTable

public class RegisterNinjaStore {
	
	WebDriver driver = null;
	
	@Given("^User should Navigate to the tutorialsninja registration web page$")
	public void navigate_to_the_tutorialsninja_registration_web_page() {
	   
		System.setProperty("webdriver.chrome.driver", "Driver//chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");
		
	}

	@When("^User should provides following details to the fields$")
	public void user_should_provides_following_details_to_the_fields(DataTable datatables)  {
	   
		Map<String, String> map = datatables.asMap(String.class, String.class);
		
		driver.findElement(By.id("input-firstname")).sendKeys(map.get("firstname"));
		driver.findElement(By.id("input-lastname")).sendKeys(map.get("Lastname"));
		driver.findElement(By.id("input-email")).sendKeys(map.get("emailID"));
		driver.findElement(By.id("input-telephone")).sendKeys(map.get("telephone"));
		driver.findElement(By.id("input-password")).sendKeys(map.get("password"));
		driver.findElement(By.id("input-confirm")).sendKeys(map.get("password"));
		
		
	}

	@And("^User should click on agree the policy$")
	public void user_should_click_on_agree_the_policy()  {
	   
		driver.findElement(By.name("agree")).click();
	}

	@And("^User should click on Continue button$")
	public void user_should_click_on_Continue_button() {
	    
		driver.findElement(By.cssSelector("input[type='submit'][value='Continue']")).click();
	}

	@Then("^User should registered successfully$")
	public void user_should_registered_successfully()  {
	   
		System.out.println(">> Your Account Has Been Created!");
		
	}

}
