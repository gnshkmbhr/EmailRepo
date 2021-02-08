package stepDefinationFiles;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Search {
	
	@Given("^I visit the Amazon website as guest user$")
	public void I_visit_the_Amazon_website_as_guest_user()
	{
		System.out.println(">> I visit the Amazon website as guest user");
	}
	
	@When("^I select the books category by selecting dropdown window$")
	public void I_select_the_books_category_by_selecting_dropdown_window()
	{
		System.out.println(">> I select the books category by selecting dropdown window");
	}

	@And("^I click on the search option$")
	public void I_click_on_the_search_option()
	{
		//int a = 10/0; //test will failed coz of exception
		System.out.println(">> I click on the search option");
	}
	
	@Then("^I should see the books page is loading$")
	public void I_should_see_the_books_page_is_loading()
	{
		System.out.println(">>I should see the books page is loading ");
	}

	@And("^I should see the Books page heading$")
	public void I_should_see_the_Books_page_heading()
	{
		System.out.println(">> I should see the Books page heading");
	}
	
	@But("^I should not see the other category products$")
	public void I_should_not_see_the_other_category_products()
	{
		System.out.println(">> I should not see the other category prducts");
	}
	
	@When("^I select the baby category by selecting dropdown window$")
	public void I_select_the_baby_category_by_selecting_dropdown_window()
	{
		System.out.println(">> I select the baby category by selecting dropdown window");
	}
	
	@Then("^I should see the baby page is loading$")
	public void I_should_see_the_baby_page_is_loading()
	{
		System.out.println(">> I should see the baby page is loading");
	}
	
	@And("^I should see the Baby Products page heading$")
	public void I_should_see_the_Baby_Products_page_heading()
	{
		System.out.println(">> I should see the Baby Products page heading");
	}
	
}
