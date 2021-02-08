package stepDefinationFiles;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

							//Multiple Regular Expressions

public class SoftwareTester {

	@Given("^I am a ([^\"]*) software tester$")	//can use this Reguler Expressions
	public void i_am_a_good_software_tester(String testerType)  {
	    
		System.out.println(">> Given - I am a "+testerType+" software tester");
	}
	
	@When("^I go to work$")
	public void i_go_to_work() {
	    
		System.out.println(">> When - I go to work");
	}

	@And("^I ([a-zA-Z]{1,}) with it$")
	public void i_involes_with_it(String itype) {
		
		System.out.println(">> And - I "+itype+" in it");
	    
	}
	
	@Then("^My boss (.*) me$")
	public void my_boss_loves_me(String bossreaction) {
		
		System.out.println(">> Then - My boss "+bossreaction+" me");
	   
	}
	
}
