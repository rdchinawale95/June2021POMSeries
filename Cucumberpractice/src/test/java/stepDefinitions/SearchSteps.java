package stepDefinitions;

import amazonimplementation.Product;
import amazonimplementation.Search;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class SearchSteps {
	Product product;
	Search search;
	
	@Given("I have search field on amazon page")
	public void i_have_search_field_on_amazon_page() {
	   System.out.println("I am on first page");
	}
//"\" is an escape character here
	@When("^I search for a product with name \"([^\"]+)\" and price (\\d+)$")
	public void i_search_for_a_product_with_name_and_price(String productname, Integer price) {
		  System.out.println("Search for the product with name: "+productname+"and price: "+price );
		  
		  product = new Product(productname, price);
		  }

	@Then("Product with name {string} should be displayed")
	public void product_with_name_should_be_displayed(String productname) {
	   System.out.println("Product name "+productname+"should eb displayed");
	   search = new Search();
	   String name=search.displayProduct(product);
	   System.out.println("Searched product is: "+name);
	   Assert.assertEquals(product.getProductname(), name);
	}
	
	@Then("Order id is {int} and username is {string}")
	public void order_id_is_and_username_is(Integer int1, String string) {
	  
	}
}
