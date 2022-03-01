package stepDefinations;

import java.io.IOException;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import browser_Initialization.Base;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import pageObjectRepository.LoginPageObjects;

@RunWith(Cucumber.class)
public class StepDefinationFile extends Base{
		
		public WebDriver driver;
		public LoginPageObjects lpo;
	
	
		@Given("^User initialised the browser$")
	    public void user_initialised_the_browser() throws IOException{
			
			
			driver=browser_Initialization();
	    }
		
		@When("^User triggred the browser$")
		public void user_triggred_the_browser(){
			
			
		}
		

	    @Then("^User make sure that bowser is invoking succesfully$")
	    public void user_make_sure_that_bowser_is_invoking_succesfully() throws Throwable {
	    	
	    	
	    }
		
		
	    @Given("^User Landed on Amazon home Page$")
	    public void user_landed_on_amazon_home_page() throws Throwable {
	    	
	    	driver.get(prop.getProperty("url"));
	    }

	   
	    @And("^Click on Signin Option$")
	    public void click_on_signin_option(){
	    	
	    	lpo=new LoginPageObjects(driver);
			lpo.acceptCookies().click();
			lpo.loginOption().click();
	    	
	    }

	    @When("^Signin page is displayed User enter email \"([^\"]*)\" and password \"([^\"]*)\"$")
	    public void signin_page_is_displayed_user_enter_email_something_and_password_something(String email, String password){
	    	
	    	lpo.enterEmailAddress().sendKeys(email);
			lpo.continueButton().click();
			lpo.enterPassword().sendKeys(password);
	    	
	    }


	    @And("^Click on Signin button$")
	    public void click_on_signin_button(){
	    	
	    	
	    	lpo.signInButton().click();
	    }
	    
	    @Then("^Amazon account is displayed for the user$")
	    public void amazon_account_is_displayed_for_the_user(){
	    	
	    	// validate deliver postcode for the user
	    	
	    	
	    	Assert.assertTrue(driver.findElement(By.cssSelector("a#nav-global-location-popover-link")).isDisplayed());
	    }
	
	    @And("^Search iteam box is also displayed$")
	    public void search_iteam_box_is_also_displayed(){
	    	
	    	// validate searchBox
	    	
	    	Assert.assertTrue(driver.findElement(By.cssSelector("input#twotabsearchtextbox")).isDisplayed());
	    	
	    	
	    }
	    
	    @When("^User enter Airpods in the search box$")
	    public void user_enter_airpods_in_the_search_box(){
	    	
	    	lpo.searchTextBox().sendKeys("airpods");	
	    	
	    }
	    
	    @And("^click on search icon$")
	    public void click_on_search_icon(){
	    	
	    	lpo.submit_SearchText().click();
	    }
	    
	    
	    @Then("^Aipods list displayed for the user$")
	    public void aipods_list_displayed_for_the_user(){
	    	
	    	Assert.assertTrue(driver.findElement(By.cssSelector("div.a-section.a-spacing-small.a-spacing-top-small")).isDisplayed());
	    	
	    }
	    
	    @When("^User choose the Airpods and add to the basket$")
	    public void user_choose_the_airpods_and_add_to_the_basket(){
	    	
	    	lpo.choose_AirPods().click();
			lpo.iteam_addToBasket().click();
			lpo.no_Protection_For_Iteam().click();	
	    	
	    }
	    
	    @Then("^iteam is added in to the basket$")
	    public void iteam_is_added_in_to_the_basket(){
	    	
	    	Assert.assertTrue(driver.findElement(By.cssSelector("div.a-section.a-padding-medium.sw-atc-message-section")).isDisplayed());
	    	
	    }
	    @But("^User choosed the wrong iteam so he delete the iteam from the basket$")
	    public void user_choosed_the_wrong_iteam_so_he_delete_the_iteam_from_the_basket() throws InterruptedException{
	    	
	    	Thread.sleep(1000L);
			lpo.go_To_Basket().click();
			lpo.delete_Iteam_From_Basket().click();
	    }

	    @When("^User enter MacBook in to the search box$")
	    public void user_enter_macbook_in_to_the_search_box(){
	    	
	    	
	    	lpo.searchTextBox().click();
			lpo.searchTextBox().sendKeys("Apple MacBook");
	    	
	    }
	    
	    
	    @Then("^Macbook list is displayed on the page$")
	    public void macbook_list_is_displayed_on_the_page(){
	    	
	    	Assert.assertTrue(driver.findElement(By.cssSelector("div.a-section.a-spacing-small.a-spacing-top-small")).isDisplayed());
	    	
	    }
	    @And("^User choose his Macbook from the list$")
	    public void user_choose_his_macbook_from_the_list(){
	    	
	    	lpo.choose_MacBook().click();
	    	
	    }
	    
	    @When("^User click add iteam to basket button$")
	    public void user_click_add_iteam_to_basket_button(){
	    	
	    	lpo.iteam_addToBasket().click();
			lpo.no_Protection_For_Iteam().click();	
			lpo.check_Basket().click();
			
	    }
	    @Then("^MacBook is added in to the basket$")
	    public void macbook_is_added_in_to_the_basket() throws InterruptedException{
	    	
	    	Thread.sleep(2000L);
	    	Assert.assertTrue(driver.findElement(By.cssSelector("div#nav-cart-count-container")).isDisplayed());
	    }

	    @But("^User choosed the wrong MacBook so he delete the iteam from the basket$")
	    public void user_choosed_the_wrong_macbook_so_he_delete_the_iteam_from_the_basket(){
	    	
	    	lpo.delete_Iteam2_From_Basket().click();
	    }
	    
	    @And("^User validate basket is empty$")
	    public void user_validate_basket_is_empty(){
	    	
	    	Assert.assertTrue(driver.findElement(By.cssSelector("h1.a-spacing-mini.a-spacing-top-base")).isDisplayed());
	    }
	    
	    @And("^User click alloption for signout and close the browser$")
	    public void user_click_alloption_for_signout_and_close_the_browser(){
	    	
	    	

			lpo.all_Option().click();
			lpo.signOut_Option().click();
	    	driver.quit();
	    	
	    }
	
}
