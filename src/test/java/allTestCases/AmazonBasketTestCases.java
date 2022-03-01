package allTestCases;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import browser_Initialization.Base;
import pageObjectRepository.LoginPageObjects;

public class AmazonBasketTestCases extends Base {

	public WebDriver driver;
	public LoginPageObjects lpo;
	
	
	
	@Test
	public void loginValidation() throws IOException, InterruptedException {
		
		
		driver=browser_Initialization();
		driver.get(prop.getProperty("url"));
		lpo=new LoginPageObjects(driver);
		lpo.acceptCookies().click();
		lpo.loginOption().click();
		lpo.enterEmailAddress().sendKeys(prop.getProperty("email"));
		lpo.continueButton().click();
		lpo.enterPassword().sendKeys(prop.getProperty("password"));
		lpo.signInButton().click();
		lpo.searchTextBox().sendKeys("airpods");
		lpo.submit_SearchText().click();
		
		lpo.choose_AirPods().click();
		lpo.iteam_addToBasket().click();
		lpo.no_Protection_For_Iteam().click();
		Thread.sleep(1000L);
		lpo.go_To_Basket().click();
		lpo.delete_Iteam_From_Basket().click();
		lpo.searchTextBox().click();
		lpo.searchTextBox().sendKeys("Apple MacBook");
		lpo.submit_SearchText().click();
		lpo.choose_MacBook().click();
		lpo.iteam_addToBasket().click();
		lpo.no_Protection_For_Iteam().click();
		lpo.check_Basket().click();
		
		Thread.sleep(2000L);
		lpo.delete_Iteam2_From_Basket().click();
		Assert.assertTrue(driver.findElement(By.cssSelector("h1.a-spacing-mini.a-spacing-top-base")).isDisplayed());
		
		lpo.all_Option().click();
		Thread.sleep(2000L);
		lpo.signOut_Option().click();
		
		driver.quit();
		
		
		
	}
	
	
	
}
