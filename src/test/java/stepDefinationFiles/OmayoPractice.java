package stepDefinationFiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OmayoPractice {
	
	WebDriver driver;
	
	@Given("^Search for omayo blogspot website$")
	public void search_for_omayo_blogspot_website()  {
	    	
		System.setProperty("webdriver.chrome.driver", "Driver//chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://omayo.blogspot.com/");
		
		//Thread.sleep(5000);
		
	}
	
	@When("^I click on compendiumdev hyperlink then link should open$")
	public void i_click_on_compendiumdev_hyperlink_then_link_should_open()  {
		
		driver.findElement(By.linkText("compendiumdev")).click();
		
		System.out.println(">> I click on compendiumdev hyperlink then link should open");
		
		//Thread.sleep(5000);
	    
	}
	
	@Then("^Some text need to select$")
	public void some_text_need_to_select()   {
		
		driver.findElement(By.id("para1")).getText();
		
		System.out.println(">> Some text need to select");
	    
		//Thread.sleep(5000);
	}
	
	@When("^I search for table in website$")
	public void i_search_for_table_in_website()  {
		
		driver.findElement(By.id("table1"));
		
		System.out.println(">> I search for table in website");
		
		//Thread.sleep(5000);
	    
	}

	@Then("^Values of the table should print$")
	public void values_of_the_table_should_print()  {
		
		driver.findElement(By.id("table1")).getText();
		
		System.out.println(">> Values of the table should print");
	    
	}
	
}
