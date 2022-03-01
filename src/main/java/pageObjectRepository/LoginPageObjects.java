package pageObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import browser_Initialization.Base;

public class LoginPageObjects extends Base{
	
	public WebDriver driver;
	
	public LoginPageObjects(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	
	private By cookies=By.id("sp-cc-accept");
	private By loginoption=By.id("nav-link-accountList");
	private By emailtext=By.xpath("//*[@name='email']");
	private By continuebtn=By.xpath("//*[@type='submit']");
	private By passwordtext=By.xpath("//*[@type='password']");
	private By signinbtn=By.id("signInSubmit");
	private By searchbox=By.id("twotabsearchtextbox");
	private By searchicon=By.id("nav-search-submit-button");
	private By airpods=By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small'] //span[contains(text(),'Apple AirPods Pro with MagSafe charging case (2021)')]");
	private By iteam1addtobasket=By.id("add-to-cart-button");
	private By noprotection=By.cssSelector("span[id='attachSiNoCoverage']");
	private By gotobasket=By.cssSelector("span#sw-gtc a.a-button-text");
	private By macbook=By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small'] //span[contains(text(),'2021 Apple MacBook Pro (16-inch, Apple M1')]");
	private By checkbasket=By.cssSelector("span[id='attach-sidesheet-view-cart-button']");
	private By deleteiteam=By.xpath("//input[@value='Delete']");
	private By deleteiteam2=By.cssSelector("input.a-color-link");
	private By alloption=By.xpath("//a[@id='nav-hamburger-menu']");
	private By signout=By.xpath("//a[text()='Sign Out']");
	
	public WebElement acceptCookies() {
		
		return driver.findElement(cookies);
	}
	public WebElement loginOption(){
		
		
		return driver.findElement(loginoption);
	}
	public WebElement enterEmailAddress(){
		
		
		return driver.findElement(emailtext);
	}
	public WebElement continueButton(){
		
		
		return driver.findElement(continuebtn);
	}
	public WebElement enterPassword(){
		
		
		return driver.findElement(passwordtext);
	}
	
	public WebElement signInButton(){
		
		
		return driver.findElement(signinbtn);
	}
	public WebElement searchTextBox() {
		
		return driver.findElement(searchbox);
	}
	
	public WebElement submit_SearchText() {
		
		return driver.findElement(searchicon);
	}
	
	public WebElement choose_AirPods() {
		
		return driver.findElement(airpods);
	}
	
	public WebElement iteam_addToBasket() {
		
		return driver.findElement(iteam1addtobasket);
	}
	
	public WebElement no_Protection_For_Iteam() {
		
		return driver.findElement(noprotection);
	}

	public WebElement go_To_Basket() {
		
		
		return driver.findElement(gotobasket);
	}
	public WebElement choose_MacBook() {
		
		return driver.findElement(macbook);
	}
	
	public WebElement check_Basket() {
		
		return driver.findElement(checkbasket);
	}

	public WebElement delete_Iteam_From_Basket() {
		
		return driver.findElement(deleteiteam);
	}	
	public WebElement delete_Iteam2_From_Basket() {
		
		return driver.findElement(deleteiteam2);
	}	
	
	public WebElement all_Option() {
		
		return driver.findElement(alloption);
	}	
	public WebElement signOut_Option() {
	
	return driver.findElement(signout);
}	
}
