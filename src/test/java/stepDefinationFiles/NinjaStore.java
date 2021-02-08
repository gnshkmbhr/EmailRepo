package stepDefinationFiles;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

							//Assertion in cucumber

public class NinjaStore {
	
	WebDriver driver;
	
	//Given keyword
	@Given("^Navigate to tutorialsninja website$")
	public void navigatetotutorialsninjawebsite()  {
		
		System.setProperty("webdriver.chrome.driver", "Driver//chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");
	    
	}

	@When("^Enter the valid Username (.*) and Password (.*) into the login fields$")
	public void enterthevalidLoginDetails(String Username, String Password)  {
		
		driver.findElement(By.id("input-email")).sendKeys(Username);
		
		driver.findElement(By.id("input-password")).sendKeys(Password);
	    
	}

	@Then("^I clicks on Login button$")
	public void clicksonLoginbutton()  {
	
		driver.findElement(By.cssSelector("input[type='submit'][value='LoginGanesh']")).click();
	    
	}

	@And("^User should login successfully$")
	public void usershouldloginsuccessfully() {
		
		WebElement element = null;
		
		try {
			
		element = driver.findElement(By.linkText(""));
		}
		catch(Exception e)
		{
			System.out.println("User has not logged in");
		}
		Assert.assertNotNull("User has not logged in", element);
	}
}
